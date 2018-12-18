import java.util.Scanner;
 
public class Bai2 {
    public static void main (String[] args) {
         
        Scanner value = new Scanner (System.in);
         
        int number; //so nhap vao
        int digit1; //chu so thu nhat
        int digit2; //chu so thu hai
        int digit3; //chu so thu ba
        int digit4; //chu so thu tu
        int digit5; //chu so thu nam
          
         
        System.out.print ("Nhap vao mot so gom 5 chu so: ");
        number = value.nextInt();
         
        digit5 = number % 10;
        digit4 = (number % 100)/10;
        digit3 = (number % 1000)/100;
        digit2 = (number % 10000)/1000;
        digit1 = number / 10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", digit1, digit2, digit3, 
                digit4, digit5);
         
    }
}