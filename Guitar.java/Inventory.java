import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();

    }

    public void addGuitar(String serialNumber, double price, int numStrings,

            Builder builder, String model, Type type, Wood backWood,
            Wood topWood) {
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();// delegation
            if (guitarSpec.matches(searchGuitar))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}