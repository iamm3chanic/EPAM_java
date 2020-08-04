package domain;

import logic.*;

public class Aviacompany {
    public void print() {
        System.out.println("AVIACOMPANY IAMM3CHANIC");
        Summator.count();
        Sorting.sort();
        Browser browser = new Browser();
        browser.browse();
    }
}
