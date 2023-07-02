public class RemoveChars {
    public String firstWord(String hashtag){
        String word = hashtag;
        word = word.replaceAll("\\[", "");
        word = word.replaceAll("]", "");
        word = word.replaceAll(",", "");
        word = word.replaceAll("#", "");
        word = word.replaceAll(" ", "");
        return word;
    }
}
