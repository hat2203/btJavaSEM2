package session2;

public class Human {
    //khac nhau ve so luong nhu (int x) # (int x, int y)
    //khac nhau ve chat luong nhu (int x, String y) # (String y,int x)
    String name;
    public Human(){

    }
    public Human(String name){
        this.name= name;
    }
    public void run(){
        System.out.println("Run: 5km/h");
    }

    public void run(int x){
        System.out.println("Run: 10km/h");
    }

    public void run(String y, int x){
        System.out.println("Run: 15km/h");
    }

    public void run(int x, String y){
        System.out.println("Run: 20km/h");
    }

}
