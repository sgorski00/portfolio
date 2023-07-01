import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.*;

public class ListOfColours {
    public static HashMap<String, ArrayList> mapOfColours = new HashMap<>();
    public static ArrayList<String> red = new ArrayList<>();
    public static ArrayList<String> blue = new ArrayList<>();
    public static ArrayList<String> green = new ArrayList<>();
    public static ArrayList<String> black = new ArrayList<>();
    public static ArrayList<String> beige = new ArrayList<>();
    public static ArrayList<String> white = new ArrayList<>();
    public static ArrayList<String> brown = new ArrayList<>();
    public static ArrayList<String> grey = new ArrayList<>();

    static{
        mapOfColours.put("szary", grey);
        mapOfColours.put("brązowy", brown);
        mapOfColours.put("beżowy", beige);
        mapOfColours.put("biały", white);
        mapOfColours.put("czarny", black);
        mapOfColours.put("czerwony", red);
        mapOfColours.put("niebieski", blue);
        mapOfColours.put("zielony", green);

        grey.add("#szary");
        brown.add("#brazowy");
        white.add("#biały");
        beige.add("#beżowy");
        black.add("#czarny");
        red.add("#czerwony");
        blue.add("#niebieski");
        green.add("#zielony");
    }
}
