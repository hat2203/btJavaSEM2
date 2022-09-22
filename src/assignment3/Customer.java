package assignment3;

public class Customer {
    double soluong;
    double dongia;
    double dinhmuc;

    public Customer() {
    }

    public Customer(double sinhhoat, double kinhdoanh, double sanxuat) {
        this.soluong = sinhhoat;
        this.dongia = kinhdoanh;
        this.dinhmuc = sanxuat;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public void thanhtien(double billing){
        if (soluong<50){
            dongia=1000;
            billing=soluong*this.dongia;
        } else if (50<soluong && soluong<100) {
            double overUse;
            overUse = soluong-dinhmuc;
            dongia=1200;
            billing=this.dongia*dinhmuc+overUse*dongia;
        } else if (100<soluong && soluong<200) {
            double overUse;
            overUse = soluong-dinhmuc;
            dongia=1500;
            billing=this.dongia*dinhmuc+overUse*dongia;
        } else if (soluong>200) {
            double overUse;
            overUse = soluong-dinhmuc;
            dongia=2000;
            billing=this.dongia*dinhmuc+overUse*dongia;
        }
    }
}
