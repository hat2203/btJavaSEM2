package session1;

public class PhanSo {
    int tuSo;
    int mauSo;

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

    public int UCLN(int a, int b){
        while (a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }

    public void toiGianPS(){
        int i = UCLN(this.getTuSo(),this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
}
