package gui_patterns.model_view_controller;

public class Model {

    //Some attributes
    private String name;

    public Model(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
