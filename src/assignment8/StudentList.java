package assignment8;

public class StudentList {
    public String sName;
    public String sEmail;
    public String sMark;

    public StudentList() {

    }

    public StudentList(String sName, String sEmail, String sMark) {
        this.sName = sName;
        this.sEmail = sEmail;
        this.sMark = sMark;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsMark() {
        return sMark;
    }

    public void setsMark(String sMark) {
        this.sMark = sMark;
    }

    public String toString(){
        return "Tên: "+getsName()+" --- Email: "+getsEmail()+" --- Điểm: "+getsMark()+"\n";
    }
}
