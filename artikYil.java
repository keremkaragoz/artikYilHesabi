import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year,artikyil;
        Scanner inp =new Scanner(System.in);
        System.out.print("Y�l Giriniz :  ");
        year = inp.nextInt();

        if (year%4 == 0){
            System.out.print("Art�k Y�l'd�r.   ");}
        else {System.out.print("Art�k y�l de�il.   ");}
    }
}
