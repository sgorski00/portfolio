import java.util.ArrayList;
import java.util.HashMap;

public class ListOfCloths {
    HashMap<String, ArrayList> mapOfCloths = new HashMap<>();
    private ArrayList<String> top = new ArrayList<>();
    private ArrayList<String> pants = new ArrayList<>();
    private ArrayList<String> tshirt = new ArrayList<>();
    private ArrayList<String> shoes = new ArrayList<>();
    private ArrayList<String> shirt = new ArrayList<>();
    private ArrayList<String> skirt = new ArrayList<>();
    private ArrayList<String> shorts = new ArrayList<>();
    private ArrayList<String> jacket = new ArrayList<>();
    private ArrayList<String> hoodie = new ArrayList<>();
    private ArrayList<String> chain = new ArrayList<>();

    {
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
