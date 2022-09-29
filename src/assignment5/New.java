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

    public New(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
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

        System.out.println(getTitle());
        System.out.println(getPublishDate());
        System.out.println(getAuthor());
        System.out.println(getContent());
        System.out.println(getAverageRate());
    }

    public float Calculate(float averageRate){
        Scanner sc = new Scanner(System.in);
        System.out.println("vui lòng nhập số nguyên: ");



        int tong = 0;
        for(int i=0; i<RateList.length;i++){
            tong += i;
        }
           averageRate = tong/RateList.length;
        return averageRate ;
    }

}
