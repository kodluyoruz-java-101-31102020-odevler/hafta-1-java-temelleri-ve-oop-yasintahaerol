package kodluyoruz.seventh;

import kodluyoruz.seventh.report.Report;

public class Printer {



    public Report report;

    public Printer() {

    }

    public Printer(Report report) {
        this.report = report;
        System.out.println(report.toString());
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }


    public void print(Report r) {
        System.out.println(r.toString());
    }
}
