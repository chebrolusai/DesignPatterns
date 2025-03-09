import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note implements Cloneable{

    private String authorName;
    private Date date;
    private List<String> styling;
    private String text;

    // does something, takes time, adds elements
    private void getStylingInfo() {

        System.out.println("Fetching something from an external super complex time consuming system... (Not trolling)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

        styling = new ArrayList<>();
        styling.add("Bold");
        styling.add("Blue Highlight");
        styling.add("Cursive Font");
    }

    public Note(String author, String text) {
        this.authorName = author;
        this.text = text;
        this.date = new Date();
        getStylingInfo();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void renameAuthor(String author) {
        this.authorName = author;
    }


    public void render() {
        System.out.println("On: " + this.date);
        System.out.println("Author: " + this.authorName);
        System.out.println("Note: " + this.text + " {With styling as" + this.styling +"}\n");
    }

    @Override
    public Note clone() {
        try {
            Note clone = (Note) super.clone();
            clone.text = this.text;
            clone.styling = new ArrayList<>(this.styling);
            clone.date = this.date;
            clone.authorName = this.authorName;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
