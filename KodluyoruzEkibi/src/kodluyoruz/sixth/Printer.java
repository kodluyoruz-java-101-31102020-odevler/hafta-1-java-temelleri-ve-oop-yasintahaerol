package kodluyoruz.sixth;

public class Printer {

    public static void printPDFDocument(PDFDocument pdf) {
        System.out.println(pdf.toString());
    }
    public static void printWordDocument(WordDocument word) {
        System.out.println(word.toString());
    }
}
