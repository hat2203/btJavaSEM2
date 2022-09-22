package assignment3;

public class KHNgoaiQuoc extends Customer {
    public String doiTuong;

    public KHNgoaiQuoc(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KHNgoaiQuoc(int id, String fullName, String date, int quantity, String doiTuong) {
        super(id, fullName, date, quantity);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
