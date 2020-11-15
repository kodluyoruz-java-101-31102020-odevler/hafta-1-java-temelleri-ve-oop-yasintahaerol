package kodluyoruz.seventh.report;

import java.util.Date;

public class Report {

    public String name;
    public String result;
    public Date createDate;

    public Report() {

    }

    public Report(String name) {
        this.name = name;
    }

    public Report(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public Report(String name, String result, Date createDate) {
        this.name = name;
        this.result = result;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
