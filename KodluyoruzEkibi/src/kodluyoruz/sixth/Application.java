package kodluyoruz.sixth;

public class Application {
    public static void main(String[] args) {
        PDFDocument pdf1 = new PDFDocument("Bu bir pdf dokumanidir");
        WordDocument word1 = new WordDocument("Bu bir word dokumanidir.");
        Printer.printPDFDocument(pdf1);
        Printer.printWordDocument(word1);
    }

}
