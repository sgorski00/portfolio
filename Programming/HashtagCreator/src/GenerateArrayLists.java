import java.util.ArrayList;

public class GenerateArrayLists {
    private final ListOfCloths cloths = new ListOfCloths();
    private final ListOfStyles styles = new ListOfStyles();
    private final ListOfColors colors = new ListOfColors();

    public ArrayList clothsList(String cloth){
        return cloths.mapOfCloths.get(cloth);
    }

    public ArrayList stylesList(String style){
        return styles.mapOfStyles.get(style);
    }

    public ArrayList colorsList(String color){
        return colors.mapOfColors.get(color);
    }
}
