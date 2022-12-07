import java.util.Scanner;

public class Atv1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double dinheiro = 0.0;
        double cambio = 0.0;
        int resultado = 0;

        do{
            System.out.println("-------------=== Menu ===------------- \n" +
                    "1 - Converção para Yen \n" +
                    "2 - Converção para Dolar \n" +
                    "0 - Sair \n" +
                    "-------------============-------------");
            resultado = sc.nextInt();
            switch (resultado){

                case 1:

                    System.out.println("Informe quanto quer converter: ");
                    dinheiro = sc.nextDouble();
                    cambio = yen(dinheiro);
                    System.out.println("Resultado: ¥"+cambio);



                    break;

                case 2:

                    System.out.println("Informe quanto quer converter: ");
                    dinheiro = sc.nextDouble();
                    cambio = dolar(dinheiro);
                    System.out.println("Resultado: US$"+cambio);



                    break;

            }
        }while (resultado!=0);
    }

    public static double yen (double dinheiro){

        double cambio=0.0;

        cambio = dinheiro * 30.0;

        return cambio;


    }
    public static double dolar (double dinheiro){

        double cambio=0.0;

        cambio = dinheiro * 0.3;

        return cambio;


    }

}
