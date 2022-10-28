/**
 * Guitar
 */
public class Guitar {

    private String serialNumber;
    double price;
    GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price,
            GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(int x) {
        price = x;
    }

    public String getPrice() {
        return serialNumber;
    }

    public GuitarSpec getSpec() {
        return guitarSpec;
    }

}
