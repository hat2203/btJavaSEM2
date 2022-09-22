package assignment3;

public class KHVietNam extends Customer {
    public String doiTuong;

    public KHVietNam(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KHVietNam(int id, String fullName, String date, int quantity, String doiTuong) {
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
        if(quantity < 50)
            return quantity * 10000;
        else if (quantity < 100)
            return (quantity - 50)*1200 + 50*1000;
        else if (quantity <200)
            return (quantity - 100)*1500 + 50*1200 + 50*1000;
        else
            return (quantity - 200)*2000 + 100*1500 + 50*1200 + 50*1000;

    }

}
