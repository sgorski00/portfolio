import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.String.*;

public class ListOfStyles {
    public static HashMap<String, ArrayList> mapOfStyles = new HashMap<>();
    public static ArrayList<String> ribbed = new ArrayList<>();
    public static ArrayList<String> oversize = new ArrayList<>();
    public static ArrayList<String> basic = new ArrayList<>();
    public static ArrayList<String> vintage = new ArrayList<>();
    public static ArrayList<String> baggy = new ArrayList<>();
    public static ArrayList<String> highwaist = new ArrayList<>();
    public static ArrayList<String> longsleeve = new ArrayList<>();
    public static ArrayList<String> shortsleeve = new ArrayList<>();

    static {
        mapOfStyles.put("wysoki stan", highwaist);
        mapOfStyles.put("baggy", baggy);
        mapOfStyles.put("vintage", vintage);
        mapOfStyles.put("basic", basic);
        mapOfStyles.put("oversize", oversize);
        mapOfStyles.put("długi rękaw", longsleeve);
        mapOfStyles.put("krótki rękaw", shortsleeve);
        mapOfStyles.put("prążkowany", ribbed);

        highwaist.add("#wysokistan");
        highwaist.add("#highwaist");
        longsleeve.add("#zdługimrękawem");
        longsleeve.add("#długirękaw");
        shortsleeve.add("#zkrókimrękawem");
        shortsleeve.add("#krókirękaw");
        baggy.add("#baggy");
        vintage.add("#vintage");
        basic.add("#basic");
        oversize.add("#oversize");
        oversize.add("#oversizowy");
        oversize.add("#oversizowe");
        oversize.add("#oversizowa");
        ribbed.add("#prążkowany");
    }

    static String printMapOfStyles(String style){
        String s = valueOf(mapOfStyles.get(style));
        s = s.replaceAll("\\[", "");
        s = s.replaceAll("]", "");
        s = s.replaceAll(",", "");
        return s;
    }
}
