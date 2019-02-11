package erzeugungsmuster.prototype;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class Dienstplan {

    HashMap<String, Urlaub> urlaubObjekte = new HashMap<>();
    /*Hier dann noch weitere HashMaps für Arbeit und Krankheit*/

    public Dienstplan(){
        try{
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document xml = dbBuilder.parse(new File(".\\src\\erzeugungsmuster\\prototype\\dienstplanobjekte.xml"));
            xml.getDocumentElement().normalize();

            NodeList urlaubNodes = xml.getElementsByTagName("urlaube").item(0).getChildNodes();
            for(int i = 0; i<((NodeList) urlaubNodes).getLength(); i++){
                Node node = urlaubNodes.item(i);
                if(((Node) node).getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element)node;
                    Urlaub urlaub = Urlaub.erzeugeVonXML(element);
                    urlaubObjekte.put(urlaub.getObjektName(), urlaub);
                }
            }
            /*Hier dann noch Arbeit und Krankheit erstellen*/
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public Urlaub kloneUrlaubObjekt(String key){
        if(urlaubObjekte.containsKey(key)){
            return urlaubObjekte.get(key).klone();
        } else{
            return null;
        }
    }
}
