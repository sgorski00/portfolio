public class Main {
    public static void main(String[] args) {
        UserChoiceOfItem choice = new UserChoiceOfItem();
        MakeColorsHashtag coloursHashtags = new MakeColorsHashtag();
        BasicHashtags basicHashtags = new BasicHashtags();

        String choosedCloth = choice.chooseCloth();
        String choosedColor = choice.chooseColor();
        String choosedStyles = choice.chooseStyle();

        String officialHashtags = "#basic #y2k #shein #sinsay #promo ";
        officialHashtags += basicHashtags.basicClothHashtag(choosedCloth);
        officialHashtags += basicHashtags.basicColorHashtag(choosedColor);
        officialHashtags += basicHashtags.basicStyleHashtag(choosedStyles);
        officialHashtags += coloursHashtags.colorsHashtagsReadyToUse(choosedCloth, choosedColor);

        System.out.print(officialHashtags);
    }
}