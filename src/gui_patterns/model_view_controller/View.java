package gui_patterns.model_view_controller;

public class View {

    public void displayModel(Model model){
        System.out.println("Model: " + model.getName() + " will be displayed by View: " + this);
    }

}
