package creational_patterns.prototype;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class Roster {

    HashMap<String, Holiday> holidayObjects = new HashMap<>();

    public Roster() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document xml = dbBuilder.parse(new File(".\\src\\creational_patterns\\prototype\\rosterconfig.xml"));
            xml.getDocumentElement().normalize();

            NodeList holidayNodes = xml.getElementsByTagName("holidays").item(0).getChildNodes();
            for (int i = 0; i < ((NodeList) holidayNodes).getLength(); i++) {
                Node node = holidayNodes.item(i);
                if (((Node) node).getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    Holiday holiday = Holiday.buildFromXML(element);
                    holidayObjects.put(holiday.getObjectName(), holiday);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Holiday cloneHolidayObject(String key) {
        if (holidayObjects.containsKey(key)) {
            return holidayObjects.get(key).cloneRoster();
        } else {
            return null;
        }
    }
}
