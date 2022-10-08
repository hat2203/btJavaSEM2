package practiceExam.Ex2;

public class Flight {
    public int number;
    public String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display(){
        if (number <= 0 || destination.isEmpty()){
            System.out.println(0 +","+ "empty");
        }else {
            System.out.println(getNumber()+ ","+getDestination());
        }
    }
}
