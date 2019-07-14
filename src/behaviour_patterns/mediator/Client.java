package behaviour_patterns.mediator;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new ExplicitMediator();

        Colleague colleague1 = new ExplicitColleagueA(mediator, "SuperSecretData");
        colleague1.operation();

        Colleague colleague2 = new ExplicitColleagueB(mediator, "SecondSuperSecretData");
        colleague2.operation();
    }

}
