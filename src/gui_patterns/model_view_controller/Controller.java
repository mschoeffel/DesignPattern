package gui_patterns.model_view_controller;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public void updateView(){
        view.displayModel(model);
    }


}
