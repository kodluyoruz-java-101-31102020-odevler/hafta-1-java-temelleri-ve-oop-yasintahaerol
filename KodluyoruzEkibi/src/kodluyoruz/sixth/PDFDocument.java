package kodluyoruz.sixth;

public class PDFDocument {
    public String body = "";



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public PDFDocument(String document) {
        setBody(document);
    }

    @Override
    public String toString() {
        return "PDFDocument{" +
                "body='" + body + '\'' +
                '}';
    }
}
