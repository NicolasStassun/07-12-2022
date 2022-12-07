import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Atv2 {
    static Scanner sc = new Scanner(System.in);
    static  Integer value = 0,  soma = 0;
    public static void main(String[] args) {
        String teste;
        System.out.println("Escreva a data inicial:");
        value = sc.nextInt();
        System.out.println("Dias a serem somados: ");
        soma = sc.nextInt();
        teste= funcao();
        System.out.println(teste);
    }
    static String funcao(){

        value +=soma;
        int year = value / 10000;
        int month = (value % 10000) / 100;
        int day = value % 100;
        Date date = new GregorianCalendar(year, month-1, day).getTime();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy. EEEE");
        String stringDate = DateFor.format(date);
        return stringDate;

    }
}