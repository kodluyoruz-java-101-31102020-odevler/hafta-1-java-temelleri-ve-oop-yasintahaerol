package kodluyoruz.seventh.report;

import java.util.Date;

public class PersonelReport extends Report{

    public PersonelReport() {

    }
    public PersonelReport(String name) {
        super(name);
    }
    public PersonelReport(String name, String result) {
        super(name, result);
    }
    public PersonelReport(String name, String result, Date createDate) {
        super(name, result, createDate);
    }



    public String hashMD5Result() {

        return this.result;
    }


}
