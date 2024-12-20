public class AlternateCase {
    public static String getAlternateCase(String sentence){
        String newSentence = "";
        Boolean capital = true;
        for(int i = 0 ; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(capital == true){
                newSentence += Character.toUpperCase(c);
                System.out.println(newSentence);
                capital = false;
            } else {
                newSentence += c;
                capital = true;
            }
        }
        return newSentence;
    }
}
