package data_patterns.unit_of_work;

public class Client {

    public static void main(String[] args){

        UnitOfWork unitOfWork = new UnitOfWork();

        Entity e1 = new Entity("Test1");
        Entity e2 = new Entity("Test2");
        Entity e3 = new Entity("Test3");
        Entity e4 = new Entity("Test4");
        Entity e5 = new Entity("Test5");

        unitOfWork.registerNew(e1);
        unitOfWork.registerNew(e2);
        unitOfWork.registerNew(e3);
        unitOfWork.registerDelete(e4);
        unitOfWork.registerDelete(e5);
        unitOfWork.commit();

        unitOfWork.registerNew(e1);
        unitOfWork.registerNew(e1);
        unitOfWork.rollback();
    }

}
