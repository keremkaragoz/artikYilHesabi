import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year,artikyil;
        Scanner inp =new Scanner(System.in);
        System.out.print("Yýl Giriniz :  ");
        year = inp.nextInt();

        if (year%4 == 0){
            System.out.print("Artýk Yýl'dýr.   ");}
        else {System.out.print("Artýk yýl deðil.   ");}
    }
}
