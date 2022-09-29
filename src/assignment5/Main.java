package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        New n1 = new New(001,"Hello world","2022/02/12","Jonh","Hello every body");
        n1.RateList[0]= 1;
        n1.RateList[1]= 3;
        n1.RateList[2]= 4;
        n1.Calculate().Display();// chay ham Calculate chay tiep ham Display;



    }
}
