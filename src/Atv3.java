import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Locale;
import java.util.Scanner;

public class Atv3 {

    static Scanner sc = new Scanner(System.in);
    static Integer value = 0, soma = 0;

    public static void main(String[] args) {

        String teste;

        System.out.println("Escreva a data inicial:");
        value = sc.nextInt();
        System.out.println("Dias a serem somados: ");
        soma = sc.nextInt();
        teste = funcao();
        System.out.println(teste);

    }

    static String funcao() {
        int escolha = 0;
        String date1=null;
        System.out.println("Escolha linguagem:" +
                "\n1-US" +
                "\n2-FR" +
                "\n3-PT:");
        escolha = sc.nextInt();
        if (escolha == 1) {
            Locale locale = new Locale("en", "US");
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
            value += soma;
            int year = value / 10000;
            int month = (value % 10000) / 100;
            int day = value % 100;
            Date date = new GregorianCalendar(year, month - 1, day).getTime();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy. EEEE");

            date1 = dateFormat.format(date);
            return date1;
        } else if (escolha == 2) {
            Locale locale = new Locale("fr", "FR");
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
            value += soma;
            int year = value / 10000;
            int month = (value % 10000) / 100;
            int day = value % 100;
            Date date = new GregorianCalendar(year, month - 1, day).getTime();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy. EEEE");

            date1 = dateFormat.format(date);
            return date1;
        } else if (escolha == 3) {
            Locale locale = new Locale("pt", "BR");
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
            value += soma;
            int year = value / 10000;
            int month = (value % 10000) / 100;
            int day = value % 100;
            Date date = new GregorianCalendar(year, month - 1, day).getTime();
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy. EEEE");

            date1 = dateFormat.format(date);
            return date1;
        }
        return date1;


    }

}