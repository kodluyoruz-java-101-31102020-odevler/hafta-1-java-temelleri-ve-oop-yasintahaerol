package kodluyoruz.fourth;

public class Application {
    public static void main(String[] args) {

        // Girdi değerlerine göre satır ve sutun sayısı degisebilir.
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }
}
