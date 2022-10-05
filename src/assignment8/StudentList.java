package assignment8;

public class StudentList {
     String sName;
     String sEmail;
     Integer sMark;

    public StudentList() {

    }

    public StudentList(String sName, String sEmail, Integer sMark) {
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

    public Integer getsMark() {
        return sMark;
    }

    public void setsMark(Integer sMark) {
        this.sMark = sMark;
    }

    public String toString(){
        return "Tên: "+getsName()+" --- Email: "+getsEmail()+" --- Điểm: "+getsMark()+"\n";
    }
}
