public class BasicHashtags {
    private GenerateArrayLists lists = new GenerateArrayLists();
    String basicClothHashtag(String cloth){
        int i = 0;
        String basicClothHashtag = "";
        while (i < lists.clothsList(cloth).size()) {
            basicClothHashtag += lists.clothsList(cloth).get(i).toString() + " ";
            i++;
        }
        return basicClothHashtag;
    }

    String basicColorHashtag(String color){
        int i = 0;
        String basicColorHashtag = "";
        while (i < lists.colorsList(color).size()) {
            basicColorHashtag += lists.colorsList(color).get(i).toString() + " ";
            i++;
        }
        return basicColorHashtag;
    }

    String basicStyleHashtag(String style) {
        int i = 0;
        String basicStyleHashtag = "";
        while (i < lists.stylesList(style).size()) {
            basicStyleHashtag += lists.stylesList(style).get(i).toString() + " ";
            i++;
        }
        return basicStyleHashtag;
    }
}
