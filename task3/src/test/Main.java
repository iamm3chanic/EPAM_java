package test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import comparator.*;

import domain.Gun;
import xml.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "./XMLGun/GunCatalogue.xml";
        XmlValidator validator = new XmlValidator(filename);
        if(validator.validate()) {
            XmlReader reader = new XmlReader();
            List<Gun> guns = reader.read(filename);
            Collections.sort(guns, new GunComparator());
            for(Gun gun : guns) {
                System.out.println(gun);
                System.out.println();
            }
        } else {
            System.out.println(validator.getError());
        }
    }
}
