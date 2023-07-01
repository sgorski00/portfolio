import java.util.ArrayList;
import java.util.HashMap;

public class ListOfCloths {
    static Main main = new Main();

    public static HashMap<String, ArrayList> mapOfCloths = new HashMap<>();
    public static ArrayList<String> top = new ArrayList<String>();
    public static ArrayList<String> pants = new ArrayList<String>();
    public static ArrayList<String> tshirt = new ArrayList<String>();
    public static ArrayList<String> shoes = new ArrayList<String>();
    public static ArrayList<String> shirt = new ArrayList<String>();
    public static ArrayList<String> skirt = new ArrayList<String>();
    public static ArrayList<String> shorts = new ArrayList<String>();
    public static ArrayList<String> jacket = new ArrayList<String>();
    public static ArrayList<String> hoodie = new ArrayList<String>();
    public static ArrayList<String> chain = new ArrayList<String>();

    static {
        mapOfCloths.put("koszula", shirt);
        mapOfCloths.put("buty", shoes);
        mapOfCloths.put("spódnica", skirt);
        mapOfCloths.put("spodenki", shorts);
        mapOfCloths.put("top", top);
        mapOfCloths.put("spodnie", pants);
        mapOfCloths.put("koszulka", tshirt);
        mapOfCloths.put("kurtka", jacket);
        mapOfCloths.put("bluza", hoodie);
        mapOfCloths.put("naszyjnik", chain);
        shirt.add("#koszula");  //a
        jacket.add("#kurtka");  //a
        hoodie.add("#bluza");  //a
        chain.add("#naszyjnik");  //y
        chain.add("#łańcuszek");  //y
        shorts.add("#spodenki");  //e
        shorts.add("#krókiespodenki");  //e
        skirt.add("#spódnica");  //a
        skirt.add("#spódniczka");  //a
        shoes.add("#buty");  //e
        top.add("#top");  //y
        pants.add("#spodnie"); //e
        tshirt.add("#koszulka"); //a
    }
}
