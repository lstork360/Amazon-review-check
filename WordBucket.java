import java.util.ArrayList;

public class WordBucket {

    private ArrayList<String> wordBucket;
    private ArrayList<Word1> data;
    private ArrayList<String> noRepeats;

    public WordBucket(ArrayList wordBucket) {
        wordBucket = new ArrayList();
    }

    void add(String item) {
        for (int i = 0; i < ; i++) {

        }
    }

    void add2(String item, long count) {
        for (int i = 0; i < count; i++) {
            wordBucket.add(item);
        }
    }

    int getCountOf(String word) {

        int count = 0;

        for (int i = 0; i < wordBucket.size(); i++) {
            if (wordBucket.contains(word)) {
                count++;
            }
        }
        return count;
    }

    int size() {
        return wordBucket.size();
    }

    public String getMostFreq() {
        if(size() == 0) return "";
        String mostFreq = wordBucket.get(0);
        long largestCount = getCountOf(mostFreq);
        for (String words: wordBucket){
            long count =
        }

    }

    ArrayList getNumUnique() {
        for (String word: wordBucket) {
            if(!noRepeats.contains(word)){
                wordBucket.add(word);
            }

        }
        return wordBucket;
    }


}
