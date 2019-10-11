import java.util.ArrayList;

public class Document {

    private String text;
    private static ArrayList<String> sentences;

    public Document(String text) {
        this.text = text;
        sentences = TextLib.splitIntoSentences(text);
    }

    public static int getWordCount(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equals(" ")) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int getSentenceCount(){
        return sentences.size();
    }

    public static double getAverageWordPerSentence(String text){

        return getWordCount(text)*(1.0) / getSentenceCount();
    }

    public static double getAverageCharPerWord(String text) {
        char[] arr = text.toCharArray();
        return arr.length*1.0 / getSentenceCount();
    }

    public static int getVocabSize(ArrayList<String> text) {

        ArrayList<String> outPut = new ArrayList<>();

        for (String texts : text) {
            if (!outPut.contains(texts)) {
                outPut.add(texts);
            }
        }
        return outPut.size();
    }

    public static double getFKReadabilityScore(ArrayList<String> sentences) {
        double wordCount = 0;
        double syllableCount = 0;

        for (String sentence : sentences) {
            String[] words = Readability.getWords(sentence);
            wordCount += words.length;

            for (String word : words) {
                syllableCount += Readability.syllablesFor(word);
            }
        }
        return 206.835 - 1.01 * (wordCount / sentences.size()) - 84.6 * (syllableCount / wordCount);
    }

    public static int countOccurrences(ArrayList<String> arrayList, String target) {

        int count = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.contains(target)) {
                count++;
            }
        }

        return count;
    }

    public static boolean occurTogether(String text1, String text2) {

        ArrayList<String> outPut = sentences;

        for (String outPuts : outPut) {

            if (outPuts.contains(text1) && outPuts.contains(text2)) return true;
        }

        return false;
    }

    public static int countUnusualWords(String text) {
        return 0;
    }
}