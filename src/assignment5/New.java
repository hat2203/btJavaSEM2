package assignment5;


import java.util.Scanner;

public class New implements INewInterface{

    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float  AverageRate;
    public int [] RateList;


    public New() {

    }

    public New(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = 0 ;
        RateList = new int[3];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public int[] getRateList() {
        return RateList;
    }

    public void setRateList(int[] rateList) {
        RateList = rateList;
    }

    @Override
    public void Display() {

        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Content);
        System.out.println(AverageRate);
    }

    public New Calculate(){
        float tong = 0;
        for(int i : RateList){
            tong += i;
        }
        AverageRate = tong/3;
        return this; // de tu dong chay ham Display
        // muon lam duoc dieu nay thi ham phai tra ve mot doi tuong ma ham o tren co (ham nao o giua can chay ham tiep theo thi can return this)
    }

}
