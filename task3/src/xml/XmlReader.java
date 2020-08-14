package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import domain.*;
public class XmlReader {
    public List<Gun> read(String fileName) throws FileNotFoundException {
        XMLStreamReader reader = null;
        try {
            List<Gun> guns = new ArrayList<Gun>();
            Gun gun = null;
            //Price price = null;
            Chars chars = null;
            //Ammunition ammunition = null;
            //Parameters parameters = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while(reader.hasNext()) {
                int types = reader.next();
                switch(types) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("gun".equals(tagName)) {
                            gun = new Gun();
                            gun.setIdentity(reader.getAttributeValue(null, "id"));
                        } else if ("model".equals(tagName)) {
                            gun.setModel(reader.getElementText());
                        } else if ("origin".equals(tagName)) {
                            gun.setOrigin(reader.getElementText());
                        } else if ("handy".equals(tagName)) {
                            gun.setHandy(Boolean.parseBoolean(reader.getElementText()));
                        } else if ("distance".equals(tagName)) {
                            chars = new Chars();
                            chars.setDistance(reader.getElementText());
                            gun.setChars(chars);
                        } else if ("ontarget".equals(tagName)) {
                            chars.setOnTarget(Integer.parseInt(reader.getElementText()));
                            gun.setChars(chars);
                        } else if ("magazine".equals(tagName)) {
                            chars.setMagazine(Boolean.parseBoolean(reader.getElementText()));
                            gun.setChars(chars);
                        }else if ("optics".equals(tagName)) {
                            chars.setOptics(Boolean.parseBoolean(reader.getElementText()));
                            gun.setChars(chars);
                        } else if ("material".equals(tagName)) {
                            chars.setMaterial(reader.getElementText());
                            gun.setChars(chars);
                        }
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("plane".equals(tagName)) {
                            guns.add(gun);
                        }
                        break;
                    }
                }
            }
            return guns;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch(Exception e) {}
        }
    }
}
