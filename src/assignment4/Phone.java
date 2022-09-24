package assignment4;

public abstract class Phone {
    public String name;
    public String phone;

    public Phone() {
    }

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract void insertPhone(String name, String phone);

    public abstract void removePhone(String name);
    public abstract void updatePone(String name, String oldPhone, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
