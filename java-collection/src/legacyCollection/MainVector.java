package legacyCollection;

import model.Transport;

import java.util.List;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        List<String, Transport> factory = new Vector<>();
        factory.add("PT. Suka-suka", new Transport(8,"Private","Rose", 6));
    }
}
