package multipage.list;

public class BookList {
    String id;
    String name;
    String hour;

    public BookList() {
    }

    public BookList(String id, String name, String hour) {
        this.id = id;
        this.name = name;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return  "id: " + getId() + " -- " +"name" + getName() + " -- " + "hour:'" + getHour() ;
    }
}
