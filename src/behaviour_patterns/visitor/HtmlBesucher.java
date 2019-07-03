package behaviour_patterns.visitor;

public class HtmlBesucher extends Besucher {

    private String html;

    public HtmlBesucher(){
        html = "";
    }

    public String getHtml() {
        return html;
    }

    @Override
    public void besucheBuch(Buch buch) {
        html += "<b>" + buch.getTitel() + "</b><br>";
    }
}
