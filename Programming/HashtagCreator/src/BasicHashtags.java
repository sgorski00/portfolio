public class BasicHashtags {
    String createBasicCLothsHashtags(String cloth){
        int i = 0;
        String listOfCloths = "";
        while (i < ListOfCloths.mapOfCloths.get(cloth).size()) {
            listOfCloths += String.valueOf(ListOfCloths.mapOfCloths.get(cloth).get(i) + " ");
            i++;
        }
        return listOfCloths;
    }
}
