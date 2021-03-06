package structural_patterns.chained_proxy;

public class Proxy extends Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void operation() {
        subject.operation();
    }
}
