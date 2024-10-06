public class Reverse {
    public static String recursive (String word){
    if(word.isEmpty())return "";

    return recursive(word.substring(1)+word.charAt(0));
}
}
