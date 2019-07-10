package structural_patterns.proxy;

public class ExplicitSubject extends Subject {
    @Override
    public void operation() {
        System.out.println("ExplicitSubject");
    }
}
