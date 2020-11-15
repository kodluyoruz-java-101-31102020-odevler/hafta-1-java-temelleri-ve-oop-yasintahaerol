package kodluyoruz.seventh.report;

import java.util.Date;

public class SalesReport extends Report{

    public String authorizedDepartments;

    public String getAuthorizedDepartments() {
        return authorizedDepartments;
    }

    public void setAuthorizedDepartments(String authorizedDepartments) {
        this.authorizedDepartments = authorizedDepartments;
    }

    public SalesReport(String name) {
        super(name);
    }
    public SalesReport(String name, String result, Date createDate) {
        super(name, result, createDate);
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
