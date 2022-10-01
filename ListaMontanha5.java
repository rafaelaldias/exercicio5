import java.util.Scanner;


public class ListaMontanha5 {

    
    public static void main(String[] args) {
      Scanner leia = new Scanner (System.in);
      double m, cm;
        System.out.println("Digite o valor em M para transformar em cm ");
        m = leia.nextDouble();
        cm = m * 100;
        if (m == 1){
            System.out.println(m + " Metro corresponde a " + cm + " Centimetros");
        }
        else {
        System.out.println(m + " Metros correspondem a " + cm + " Centimetros");
        }
    }
    
}