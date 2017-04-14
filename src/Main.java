import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
      /* Square root
       double a = 0;
        double b = 0;
        double c = 0;
        double D = b*b -4*a*c;
        double  x1 = 0;
        double  x2 = 0;
        if (D>0 & a!=0){
                x1 = ((-b + Math.sqrt(D))/(2 * a));
                x2 = ((-b - Math.sqrt(D))/(2 * a));
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
          }
          else if (D>0 & a==0){
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }else if(D==0 & a!=0){
            x1 = ((-b )/(2 * a));
            x2 = x1;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        }
          else {
            System.out.println("x1=");
            System.out.println("x2=");
     }*/
      /*print Matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.printf("%2s ", "*");
                } else if (5 - i == j + 1) {
                    System.out.printf("%2s ", "*");
                } else {
                    System.out.printf("%2s ", (i * 5 + j + 1));
                }
            }
            System.out.println();
        }*/
      /* bubble sort
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        boolean swapped = true;
        int z = 0;
        while (swapped){
            swapped = false;
            for (int i = 0; i < array.length - 1 - z; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    swapped = true;
                }
            }
            z++;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
            */
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;


        for(int d = length/2; d >= 1; d /= 2) {
            for(int i = d; i < length; i++){
                for(int j = i; (j >= d) && array[j-d] > array[j]; j-=d){
                    int a = array[j];
                    array[j] = array[j-d];
                    array[j-d] = a;
                }
            }
        }
        for (int j = 0; j < length; j++) {
            System.out.print(array[j] + " ");}
        /*for(int d=N/2; d >= 1; d/=2)
            for(int i=d; i < N; i++)
                for(int j = i; j>=d && a[j - d] > a[j]; j -= d)
                    swap(a[j], a[j-d]);

        for (int j = 0; j < length; j++) {
            System.out.print(array[j] + " ");
        } */

    }
}
