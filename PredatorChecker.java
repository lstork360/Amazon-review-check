import java.util.ArrayList;

public class PredatorChecker {
    public static void main(String[] args) {
        //Parse data and add to Profile objects for testing
        Profile p = new Profile("bob", "h e l l o i this am you");
        System.out.println(removeExtraSpaces(p.getText()));

        String text = p.getText();

        ArrayList<String> s = new ArrayList<>();

        s.


    }

    private static String removeExtraSpaces(String text) {
        text = text.trim().replaceAll(" +", " ");
        for (int i = 0; i < text.length() - 3; i++) {
            if(!text.substring(i, i+1).equals(" ") && text.substring(i+1, i+2).equals(" ") && !text.substring(i+2, i+3).equals(" ") && text.substring(i+3, i+4).equals(" ")) {
                    text = text.substring(0, i+1) + text.substring(i+2);
                // Make test for edge cases of "a" and "i" as singular words
            }
        }
        return text;
    }


}
