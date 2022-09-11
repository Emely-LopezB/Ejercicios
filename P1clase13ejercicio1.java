package p1clase13ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Emely Sofia
 */
public class P1clase13ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int plato, cantidad;
    Scanner Entrada = new Scanner (System.in);
    System.out.println("Ingrese 1 o 2 segun el plato que desea: ");
    plato = Entrada.nextInt();
    System.out.println("numero de ordenes: ");
    cantidad = Entrada.nextInt();
    double totalInicial = 0, descuento, totalFinal = 0, precioPlato1 = 5, precioPlato2 = 7;
    if (plato == 1){
        if (cantidad >= 1 & cantidad <=5 ){
            descuento = 0.05;
            totalInicial = cantidad * precioPlato1;
            totalFinal = totalInicial - (totalInicial * descuento);
        } else if (cantidad >= 6 & cantidad <= 10 ) {
            totalInicial = cantidad * precioPlato1;
            descuento = 0.07;
            totalFinal = totalInicial - (totalInicial * descuento);
        } else if (cantidad >= 11){
            totalInicial = cantidad * precioPlato1;
            descuento = 0.09;
            totalFinal = totalInicial - (totalInicial * descuento);
        } else {
            System.out.println("Cantidad equivocada");
        }
    }else if ( plato == 2){
            
        }
    }
    }
    

