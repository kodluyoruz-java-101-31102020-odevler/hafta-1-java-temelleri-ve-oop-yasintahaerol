package kodluyoruz.seventh;

import kodluyoruz.seventh.report.PersonelReport;
import kodluyoruz.seventh.report.Report;
import kodluyoruz.seventh.report.SalesReport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at'");
        Date date = new Date(System.currentTimeMillis());
        Printer pri = new Printer();

       // DatabaseOperations db = new DatabaseOperations();


        Report personelReport = new PersonelReport("erol", "erol", date);
        Report salesReport = new SalesReport("yasin", "erol", date);

        pri.print(personelReport);
        pri.print(salesReport);
    }
}
