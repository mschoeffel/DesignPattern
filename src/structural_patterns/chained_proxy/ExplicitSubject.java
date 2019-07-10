package structural_patterns.chained_proxy;

public class ExplicitSubject extends Subject {
    @Override
    public void operation() {
        System.out.println("ExplicitSubject");
    }
}
