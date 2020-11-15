package kodluyoruz.second;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Calculate cal = new Calculate(kb);
        cal.CalculateRun();
    }
}
