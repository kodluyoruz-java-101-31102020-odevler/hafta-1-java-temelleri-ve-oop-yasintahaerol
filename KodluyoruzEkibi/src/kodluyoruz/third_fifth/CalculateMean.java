package kodluyoruz.third_fifth;


import java.util.Random;

public class CalculateMean {
    private Random r;
    private int[] randomArray;





    public CalculateMean(Random r)
    {
        setRandomArray(new int[100]);

        randomArray = fillArray(r, randomArray);

    }
    public void EvenOddNumbers() {

        System.out.println("Even Numbers");
        for(int i = 0; i < 100; i++)
        {
           if(this.randomArray[i] % 2 == 0)
                System.out.printf(randomArray[i] +" ");
        }
        System.out.println();
        System.out.println("Odd Numbers");
        for(int i = 0; i < 100; i++)
        {
            if(this.randomArray[i] % 2 != 0)
                System.out.printf(randomArray[i] + " ");
        }


    }
    private void show(int [] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void Mean() {
        int total = 0;
        int result;
        for (int i = 0; i < 100; i++) {
            total += this.randomArray[i];
        }
        result = total / 100;
        System.out.println("Dizinin ortalaması -> " + (double)result);
    }

    private int[] fillArray(Random r, int[] arr)
    {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }

    private int[] getRandomArray() {
        return randomArray;
    }

    private void setRandomArray(int[] randomArray) {
        this.randomArray = new int[100];
    }
}
