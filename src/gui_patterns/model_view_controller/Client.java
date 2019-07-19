package gui_patterns.model_view_controller;

public class Client {

    public static void main(String[] args){
        Model model = new Model("MyTestModel");
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView();
        controller.setName("ModifiedModel");
        controller.updateView();
    }

}
