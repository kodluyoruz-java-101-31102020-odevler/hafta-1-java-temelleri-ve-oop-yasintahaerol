package kodluyoruz.seventh.dao;

import kodluyoruz.seventh.report.Report;

public class DatabaseOperations {

    public Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
    public DatabaseOperations() {

    }
    public DatabaseOperations(Report report) {
        setReport(report);
    }

    public void open() {
        System.out.println("Connection Closed");

    }

    public Report runQuery(String q) {
        return this.report;
    }
    public void close() {
        System.out.println("Connection Closed");
    }

}
