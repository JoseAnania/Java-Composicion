
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Producto: ");
        String nombre=SC.next();
        
        System.out.println("Cantidad de Materiales: ");
        int cantMateriales=SC.nextInt();
        
        Producto P=new Producto(nombre, cantMateriales);
        
        for (int i = 0; i < cantMateriales; i++) {
            
            System.out.println("Nombre del Material: ");
            String descripcion=SC.next();
            
            System.out.println("Código del Material: ");
            int codigo=SC.nextInt();
            
            System.out.println("Valor Unitario del Material: ");
            float valor=SC.nextFloat();
            
            Material M=new Material(descripcion, codigo, valor);
            
            P.agregarMaterial(M);
        }
        
        System.out.println("Costo total del Producto: "+P.costoTotal());
        
        System.out.println("Contiene el Producto el Material cuyo Código es 2? "+P.contieneMaterial(2));
        
        System.out.println("Materiales que componen el Producto cuyo valor es menor a $15: "+P.materialesMenores(15));
        
        System.out.println("Cantidad de Materiales del Producto menores a $10: "+P.cantidadMateriales(0, 10));
        
        System.out.println("Cantidad de Materiales del Producto entre $11 y $20: "+P.cantidadMateriales(10, 20));
        
        System.out.println("Cantidad de Materiales del Producto entre $21 y $30: "+P.cantidadMateriales(20, 30));
        
        System.out.println("Cantidad de Materiales del Producto mayores a $31: "+P.cantidadMateriales(30, 100000000));
    }
    
}
