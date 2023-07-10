import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.String.*;

public class ListOfStyles {
    public HashMap<String, ArrayList> mapOfStyles = new HashMap<>();
    private ArrayList<String> ribbed = new ArrayList<>();
    private ArrayList<String> oversize = new ArrayList<>();
    private ArrayList<String> basic = new ArrayList<>();
    private ArrayList<String> vintage = new ArrayList<>();
    private ArrayList<String> baggy = new ArrayList<>();
    private ArrayList<String> highwaist = new ArrayList<>();
    private ArrayList<String> longsleeve = new ArrayList<>();
    private ArrayList<String> shortsleeve = new ArrayList<>();
    private ArrayList<String> sport = new ArrayList<>();

    {
        mapOfStyles.put("wysoki stan", highwaist);
        mapOfStyles.put("baggy", baggy);
        mapOfStyles.put("vintage", vintage);
        mapOfStyles.put("basic", basic);
        mapOfStyles.put("oversize", oversize);
        mapOfStyles.put("długi rękaw", longsleeve);
        mapOfStyles.put("krótki rękaw", shortsleeve);
        mapOfStyles.put("prążkowany", ribbed);
        mapOfStyles.put("sport", sport);

        highwaist.add("#wysokistan");
        highwaist.add("#highwaist");
        highwaist.add("#zwysokimstanem");
        longsleeve.add("#zdługimrękawem");
        longsleeve.add("#długirękaw");
        shortsleeve.add("#zkrókimrękawem");
        shortsleeve.add("#krókirękaw");
        baggy.add("#baggy");
        baggy.add("#sport");
        baggy.add("#sportowy");
        vintage.add("#vintage");
        basic.add("#basic");
        oversize.add("#oversize");
        oversize.add("#oversizowy");
        ribbed.add("#prążkowany");
    }
}
