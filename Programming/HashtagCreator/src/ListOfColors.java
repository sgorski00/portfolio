import java.util.ArrayList;
import java.util.HashMap;

public class ListOfColors {
    public HashMap<String, ArrayList> mapOfColors = new HashMap<>();
    private ArrayList<String> red = new ArrayList<>();
    private ArrayList<String> blue = new ArrayList<>();
    private ArrayList<String> green = new ArrayList<>();
    private ArrayList<String> black = new ArrayList<>();
    private ArrayList<String> beige = new ArrayList<>();
    private ArrayList<String> white = new ArrayList<>();
    private ArrayList<String> brown = new ArrayList<>();
    private ArrayList<String> grey = new ArrayList<>();

    {
        mapOfColors.put("szary", grey);
        mapOfColors.put("brązowy", brown);
        mapOfColors.put("beżowy", beige);
        mapOfColors.put("biały", white);
        mapOfColors.put("czarny", black);
        mapOfColors.put("czerwony", red);
        mapOfColors.put("niebieski", blue);
        mapOfColors.put("zielony", green);

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
