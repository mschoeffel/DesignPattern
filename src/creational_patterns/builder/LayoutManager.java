package creational_patterns.builder;

public abstract class LayoutManager {

    private HtmlPage htmlPage;

    public abstract void addWidget(Widget widget);

    public HtmlPage getHtmlPage() {
        return htmlPage;
    }

    public abstract void render();

    public LayoutManager(){
        htmlPage = new HtmlPage();
    }
}
