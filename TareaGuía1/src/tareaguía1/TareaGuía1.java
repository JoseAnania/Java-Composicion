
package tareaguía1;

import java.util.Scanner;

public class TareaGuía1 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Clientes: ");
        int cantClientes=SC.nextInt();
        
        Veterinaria V=new Veterinaria(cantClientes);
        
        for (int i = 0; i < cantClientes; i++) {
            
            System.out.println("Número del Cliente: ");
            int numero=SC.nextInt();
            
            System.out.println("Nombre del Cliente Nº"+numero);
            String nombreCliente=SC.next();
            
            System.out.println("Antiguedad como cliente de "+nombreCliente);
            int antiguedad=SC.nextInt();
            
            System.out.println("Nombre de la Mascota de "+nombreCliente);
            String nombreMasc=SC.next();
            
            System.out.println("Edad de "+nombreMasc);
            int edad=SC.nextInt();
            
            Mascota M=new Mascota(nombreMasc, edad);
            Cliente C=new Cliente(numero, nombreCliente, antiguedad, M);
            V.agregarCliente(C);
        }
        
        System.out.println("Cantidad de Clientes: "+cantClientes);
        
        System.out.println("Promedio de Edad de las Mascotas: "+V.promEdadMascotas());
        
        System.out.println("Cantidad de Clientes con antiguedad de 5 años o más: "+V.antiguedadMayor());
    }
    
}
