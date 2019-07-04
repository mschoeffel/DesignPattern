package behaviour_patterns.visitor;

import java.util.ArrayList;

public class Chart {

    private ArrayList<Element> products;

    public Chart() {
        products = new ArrayList<>();
    }

    public float calculatePrice() {
        CalculatePriceVisitor priceVisitor = new CalculatePriceVisitor();

        for (Element element : products) {
            element.take(priceVisitor);
        }
        return priceVisitor.getPrice();
    }

    public String showHtml() {
        HtmlVisitor htmlVisitor = new HtmlVisitor();

        for (Element element : products) {
            element.take(htmlVisitor);
        }

        return htmlVisitor.getHtml();
    }

    public void add(Element element) {
        if (!products.contains(element))
            products.add(element);
    }

    public ArrayList<Element> getProducts() {
        return products;
    }
}
