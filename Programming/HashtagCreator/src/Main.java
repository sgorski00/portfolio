public class Main {
    public static void main(String[] args) {
        UserChoiceOfItem choice = new UserChoiceOfItem();
        MakeColoursHashtag coloursHashtags = new MakeColoursHashtag();
        BasicHashtags basicHashtags = new BasicHashtags();

        String choosedCloth = choice.chooseCloth();
        String choosedColour = choice.chooseColour();
        String choosedStyles = choice.chooseStyle();

        System.out.print(coloursHashtags.createModifiedColourHashtags(choosedColour, choosedCloth));
        System.out.print(basicHashtags.createBasicCLothsHashtags(choosedCloth));
    }
}