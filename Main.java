import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
public class Main{

public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int opc;
       ArrayList<Compra> compras = new ArrayList<>();

 System.out.print("Ingresa el numero de la cuenta: ");//rellenar datos
        String numero = sc.nextLine();

        System.out.print("Ingresa el tipo de cuenta (Ej: Debito, Ahorro): ");
        String tipo = sc.nextLine();

        System.out.print("Ingresa el saldo inicial: ");
        double saldo = sc.nextDouble();
      sc.nextLine();

        Cuenta cuenta = new Cuenta(numero, tipo, saldo);




do{//rellenar compras

      System.out.println( " Descripcion de la compra:");
      String descripcion =sc.nextLine();
      
      System.out.println("ingresa el costo de la compra");
      double costo = sc.nextDouble();
      sc.nextLine();
 Compra compra = new Compra(new Date(), descripcion, costo);//objeto tipo compra
 
 cuenta.agregarCompra(compra);//validar con el metodo de compra y se guardan aquii

      System.out.println("agregar otra compra 1(si),2(no)");
       opc = sc.nextInt();
}while(opc != 2);






System.out.println("\nResumen de compras:");
        for (Compra c : cuenta.getCompras()) {//las compras se guardan en cuenta que es por donde pasan para validarse
            System.out.println(c.getResumen());
        }

sc.close();

}
}
