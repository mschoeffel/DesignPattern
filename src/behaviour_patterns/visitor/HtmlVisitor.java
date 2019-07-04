package behaviour_patterns.visitor;

public class HtmlVisitor extends Visitor {

    private String html;

    public HtmlVisitor() {
        html = "";
    }

    public String getHtml() {
        return html;
    }

    @Override
    public void visitBook(Book book) {
        html += "<b>" + book.getTitle() + "</b><br>";
    }
}
