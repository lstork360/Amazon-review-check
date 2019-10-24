public class Profile {
    private String author;
    private String text;
    private boolean predator;
    private String time, message; // Optional, unsure if necessary yet

    public Profile(String a, String t) {
        this.author = a;
        this.text = t;
        this.predator = false;
    }

    public void isPredator() {
        this.predator = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setText(String t) {
        this.text = t;
    }
}
