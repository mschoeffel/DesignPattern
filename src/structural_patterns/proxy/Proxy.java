package structural_patterns.proxy;

public class Proxy extends Subject {

    private ExplicitSubject subject;

    public Proxy(ExplicitSubject subject){
        this.subject = subject;
    }

    @Override
    public void operation() {
        subject.operation();
    }
}
