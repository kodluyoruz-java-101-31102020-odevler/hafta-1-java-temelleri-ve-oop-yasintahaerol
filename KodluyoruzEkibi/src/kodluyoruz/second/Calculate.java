package kodluyoruz.second;

import java.util.Scanner;

public class Calculate {

    public int first;
    public int second;
    public int option;
    public int result;
    private Scanner kb;

    public Calculate(Scanner xy) {
        this.kb = xy;
    }
    public void CalculateRun() {

        for (; ; ) {


            System.out.println("Hangi işlemi yapmak istersiniz ?");
            System.out.println("1 -> Toplama\n2 -> Çıkarma\n3 -> Çarpma\n4 -> Bolme");
            option = Integer.parseInt(kb.nextLine());
            System.out.println("Birinci sayiyi giriniz : ");
            this.first = Integer.parseInt(kb.nextLine());
            System.out.println("Ikinci sayiyi giriniz : ");
            this.second = Integer.parseInt(kb.nextLine());

            switch (option) {
                case 1:
                    this.result = addition(this.first, this.second);
                    break;
                case 2:
                    this.result = subsraction(this.first, this.second);
                    break;
                case 3:
                    this.result = multiply(this.first, this.second);
                    break;
                case 4:
                    this.result = division(this.first, this.second);
                    break;
            }
            System.out.println("Yapmış olduğunuz işlemin sonucu : " + result);

            System.out.println("Çıkmak isterseniz exit yaziniz!");
            if (kb.nextLine().equalsIgnoreCase("exit"))
                return;
            else
                continue;
        }
    }

    public int addition(int first, int second)
    {
      return first+second;
    }
    public int subsraction(int first, int second)
    {
        return first-second;
    }
    public int multiply(int first, int second)
    {
        return first*second;
    }
    public int division(int first, int second)
    {
        return first/second;
    }
}
