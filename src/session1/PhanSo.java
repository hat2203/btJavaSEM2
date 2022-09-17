package session1;

public class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo() {

    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo(){
        System.out.println(getTuSo()+"/"+getMauSo());
        // System.out.println(TuSo()+"/"+MauSo()); co the sd nhu vay nhung han che
    }
    public void rutGon(){
        //
        int ucln = 1;
        for(int i=Math.min(Math.abs(tuSo),Math.abs(mauSo));i>1; i--){
            if(tuSo%i==0 && mauSo%i==0){
                ucln = i;
                break;
            }
        }
        setTuSo(tuSo/ucln);
        setMauSo(mauSo/ucln);
    }
    public void nghichDao(){
        //su dung thuat toan dao nguoc
        int tmp = tuSo;
        tuSo = mauSo;
        mauSo = tmp;
    }
    public PhanSo add(PhanSo f){
        // cong hai phan so
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo*f.mauSo+ this.mauSo*f.tuSo;
        tong.mauSo = this.mauSo*f.mauSo;
        tong.rutGon();
        return tong;
    }
    public PhanSo sub(PhanSo f){
        // tru hai phan so
        PhanSo hieu = new PhanSo();
        hieu.tuSo = this.tuSo*f.mauSo - this.mauSo*f.tuSo;
        hieu.mauSo = this.mauSo*f.mauSo;
        hieu.rutGon();
        return hieu;
    }
    public PhanSo mul(PhanSo f){
        // nhan hai phan so
        PhanSo tich = new PhanSo();
        tich.tuSo = this.tuSo*f.tuSo;
        tich.mauSo = this.mauSo*f.mauSo;
        tich.rutGon();
        return tich;
    }
    public PhanSo div(PhanSo f){
        // chia hai phan so
        PhanSo thuong = new PhanSo();
        thuong.tuSo = this.tuSo*f.mauSo;
        thuong.mauSo = this.mauSo*f.tuSo;
        thuong.rutGon();
        return thuong;
    }



}
