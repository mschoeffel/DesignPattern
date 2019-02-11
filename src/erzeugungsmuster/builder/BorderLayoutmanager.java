package erzeugungsmuster.builder;

public class BorderLayoutmanager extends LayoutManager{
    @Override
    public void addWidget(Widget widget) {
        getHtmlPage().getWidgets().add(widget);
    }

    @Override
    public void render() {
        getHtmlPage().setHtmlCode(renderHtmlFromWidgets());
    }

    private String renderHtmlFromWidgets(){
        return "HTML-Code für das Border Layout";
    }
}
