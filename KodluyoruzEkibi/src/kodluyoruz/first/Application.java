package kodluyoruz.first;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String inputPass;
        String password = "12345";
        System.out.println("Şifre giriniz");
        inputPass = kb.nextLine();

        if(inputPass.equalsIgnoreCase(password))
            System.out.println("Girilen değer başarılı!");
        else
            System.out.println("Girilen değer başarısız!");

        kb.close();
    }
}
