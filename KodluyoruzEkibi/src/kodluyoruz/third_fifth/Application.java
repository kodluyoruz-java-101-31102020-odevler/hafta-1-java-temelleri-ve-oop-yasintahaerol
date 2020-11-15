package kodluyoruz.third_fifth;


import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random r = new Random();
        CalculateMean c = new CalculateMean(r);
        c.Mean();
        c.EvenOddNumbers();
    }




}
