import java.util.Arrays;

public class Project {

    public static void main(String[] args) {
        System.out.println(replace("Hello       my name is      Leo"));

        String text = "Hello       my name is      Leo";
        String[] words = text.split("\\s+");

        System.out.println("input string separated by tabs: " + text);
        System.out.println("output string: " + Arrays.toString(words));
    }

    public static String replace(String text){

        String sentenceWhiteOut = text.replaceAll("\\s{2,}",  " ").trim();
        return sentenceWhiteOut;
    }

}
