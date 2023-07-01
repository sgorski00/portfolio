public class MakeColoursHashtag {

    String createModifiedColourHashtags(String colourToChange, String cloth){
        String changedColoursHashtags = "";
        int i = 0;
        while (i< ListOfColours.mapOfColours.get(colourToChange).size()) {
            changedColoursHashtags += ListOfColours.mapOfColours.get(colourToChange).get(i);
            changedColoursHashtags = changedColoursHashtags.substring(0, changedColoursHashtags.length() - 1);
            changedColoursHashtags += lastCharOfCloth(cloth) + " ";
            i++;
        }
        return changedColoursHashtags;
    }

    private String lastCharOfCloth(String cloth){
        String userCloth = cloth;
        String lastLetter = "";
        if (userCloth.endsWith("a")){
            lastLetter = "a";
        } else if (userCloth.endsWith("e") || userCloth.endsWith("i") || userCloth.endsWith("y")) {
            lastLetter = "e";
        }
        return lastLetter;
    }
}
