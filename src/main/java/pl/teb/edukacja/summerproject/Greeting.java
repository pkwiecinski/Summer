package pl.teb.edukacja.summerproject;

public class Greeting {
    public void setId(long id) {
        this.id = id;
    }

    private long id;

    public void setContent(String content) {
        this.content = content;
    }

    private String content;


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

