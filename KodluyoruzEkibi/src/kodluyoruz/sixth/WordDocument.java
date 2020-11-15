package kodluyoruz.sixth;

public class WordDocument {
    public String body = "";

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public WordDocument(String document) {
        setBody(document);
    }

    @Override
    public String toString() {
        return "WordDocument{" +
                "body='" + body + '\'' +
                '}';
    }
}
