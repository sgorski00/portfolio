public class MakeColorsHashtag implements ChangeLastLetter{
    private RemoveChars removeChars = new RemoveChars();
    private GenerateArrayLists lists = new GenerateArrayLists();
    @Override
    public String lastChar(String input) {
        String userCloth = input;
        String lastLetter = "";
        if (userCloth.endsWith("a")){
            lastLetter = "a";
        } else if (userCloth.endsWith("e") || userCloth.endsWith("i") || userCloth.endsWith("y")) {
            lastLetter = "e";
        } else {
            lastLetter = "y";
        }
        return lastLetter;
    }

    @Override
    public String modifiedHashtag(String cloth, String attributeToChange) {
        String changedColoursHashtags = "";
        int i = 0;
        while (i < lists.colorsList(attributeToChange).size()) {
            changedColoursHashtags += lists.colorsList(attributeToChange).get(i);
            changedColoursHashtags = changedColoursHashtags.substring(0, changedColoursHashtags.length() - 1);
            changedColoursHashtags += lastChar(cloth);
            i++;
        }
        return changedColoursHashtags;
    }

    public String colorsHashtagsReadyToUse(String cloth, String color){
        String clothAndColoursHashtags = "";
        int i = 0;
        while (i < lists.clothsList(cloth).size()) {
            clothAndColoursHashtags += modifiedHashtag(cloth, color) + removeChars.clearWord(lists.clothsList(cloth).get(i).toString()) + " ";
            clothAndColoursHashtags += lists.clothsList(cloth).get(i).toString() + removeChars.clearWord(modifiedHashtag(cloth, color)) + " ";
            i++;
        }
        return clothAndColoursHashtags;
    }
}
