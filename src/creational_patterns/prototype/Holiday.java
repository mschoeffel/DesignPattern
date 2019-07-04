package creational_patterns.prototype;

import org.w3c.dom.Element;

public class Holiday extends RosterObjects {

    private boolean isPaid;

    private void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public boolean getPaid() {
        return isPaid;
    }

    @Override
    public Holiday cloneRoster() {
        return (Holiday) super.clone();
    }

    public static Holiday buildFromXML(Element element) {
        Holiday holiday = new Holiday();
        String name = element.getAttribute("name");
        holiday.setObjectName(name);
        holiday.setDuration(
                Float.parseFloat(element.getChildNodes().item(0).getNodeValue())
        );
        holiday.isPaid = Boolean.parseBoolean(element.getAttribute("paid"));
        return holiday;
    }
}
