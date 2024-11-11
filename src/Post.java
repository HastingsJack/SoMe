public class Post {
    private String text;
    private String author;
    private int likes = 0;

    public Post(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public void like() {
        likes++;
    }

    public String toString() {
        return "Author: " + author + ", Text: " + text + ", Likes: " + likes;
    }
}
