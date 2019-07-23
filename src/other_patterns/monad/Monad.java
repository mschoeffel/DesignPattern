package other_patterns.monad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Monad<T> {

    private final T object;

    private final List<Exception> exceptions = new ArrayList<>();

    private Monad(T object){
        this.object = object;
    }

    public static <T> Monad<T> of(T object){
        return new Monad<>(Objects.requireNonNull(object));
    }

    public Monad<T> validate(Predicate<T> validation, String msg){
        if (validation.test(object)) {
            exceptions.add(new IllegalStateException(msg));
        }
        return this;
    }

    public <U> Monad<T> validate(Function<T, U> projection, Predicate<U> validation, String message){
        return validate(projection.andThen(validation::test)::apply, message);
    }

    public T get() throws IllegalStateException {
        if (exceptions.isEmpty()) {
            return object;
        }
        IllegalStateException e = new IllegalStateException();
        exceptions.forEach(e::addSuppressed);
        throw e;
    }

}
