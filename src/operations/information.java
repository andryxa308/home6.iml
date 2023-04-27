package operations;
import java.util.Scanner;
public class information {
    public static void main(String[] args) {
        String id;
        String date;
        int number;
        Scanner Sc = new  Scanner(System.in);
        System.out.print( "Номер счёта: " );
        number = Sc.nextInt();
        System.out.print( "Дата открытия: " );
        date = Sc.next();
        System.out.print( "Имя владельца: " );
        id = Sc.next();
        System.out.println( "Номер счёта: " + number);
        System.out.println( "Дата открытия: " + date);
        System.out.println( "Имя владельца: " + id);
    }
}










