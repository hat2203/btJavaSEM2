package session6;

public class Main {
    public static void main(String[] args){
        try {
            int x = 10;
            int y = 0;
            if( y == 0){
                throw new NullPointerException();
            }
            System.out.println(x + ":" + y + "=");
            int z = x / y;
            System.out.println(z);
        }catch (ArithmeticException ae) { //ArithmeticException là lỗi do tính toán
            System.out.println("Tính toán sai r tính lại đi");
        }catch (NullPointerException n){ // lỗi chưa cấp ô nhớ
            System.out.println("NULL....");
        }catch (Exception e){ // Exception là một lỗi tổng, e là biến Exception
            System.out.println("Lỗi rồi xem lại đi");
        }finally {
            // lúc nào cũng chạy qua đây
        }
    }
}
