package erzeugungsmuster.builder;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args){
        String widgetHtmlCode = "Widget HTML Code";
        ArrayList<Widget> widgets = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            widgets.add(new Widget(widgetHtmlCode));
        }
        Layouter layouter = new Layouter(widgets);

        layouter.doLayout(new BorderLayoutmanager());
        layouter.printLayoutedHtmlCode();

        layouter.doLayout(new BoxLayoutmanager());
        layouter.printLayoutedHtmlCode();

        layouter.doLayout(new FlowLayoutmanager());
        layouter.printLayoutedHtmlCode();
    }
}
