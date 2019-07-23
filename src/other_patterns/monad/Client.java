package other_patterns.monad;

import java.util.Objects;

public class Client {

    public static void main(String[] args){
        DataObject obj = new DataObject(-1, "TestName", "MyWrongMail.com");

            String result = Monad.of(obj)
                    .validate(DataObject::getId, id -> id <= 0, "Id must be bigger than 0")
                    .validate(DataObject::getName, Objects::isNull, "Name can't be null")
                    .validate(DataObject::getName, String::isEmpty, "Name can't be empty")
                    .validate(DataObject::getMail, mail -> !mail.contains("@"), "Mail needs to contain a '@'")
                    .get().toString();

            System.out.println(result);
    }

}
