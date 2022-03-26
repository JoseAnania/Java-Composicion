
package tareaguía3;

import java.util.Scanner;

public class TareaGuía3 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Libros en la Biblioteca: ");
        int cantLibros=SC.nextInt();
        
        Biblioteca B=new Biblioteca(cantLibros);
        
        for (int i = 0; i < cantLibros; i++) {
            
            System.out.println("Título del Libro: ");
            String titulo=SC.next();
            
            System.out.println("Precio de Reposición del Libro: ");
            int precio=SC.nextInt();
            
            System.out.println("Estado del Libro: (1: Disponible / 2: Prestado / 3: Extraviado)");
            int estado=SC.nextInt();
            
            System.out.println("Cantidad de préstamos del Libro: ");
            int cantPrestamos=SC.nextInt();
            
            Libro L=new Libro(titulo, precio, estado, cantPrestamos);
            
            for (int j = 0; j < cantPrestamos; j++) {
                
                System.out.println("Nombre del Solicitante: ");
                String solicitante=SC.next();
                
                System.out.println("Cantidad de días del Préstamo: ");
                int dias=SC.nextInt();
                
                System.out.println("¿Fue devuelto el Libro?: (1: Sí / 2: No) ");
                int dev=SC.nextInt();
                boolean devuelto=false;
                if(dev==1)
                {
                    devuelto=true;
                }
                
                Prestamo P=new Prestamo(solicitante, dias, devuelto);
                
                L.agregarPrestamo(P);
            }
            
            B.agregarLibro(L);
        }
        
        System.out.println("Cantidad de Libros Disponibles: "+B.cantLibrosEstado(1));
        System.out.println("Cantidad de Libros Prestados: "+B.cantLibrosEstado(2));
        System.out.println("Cantidad de Libros Extraviados: "+B.cantLibrosEstado(3));
        
        System.out.println("Valor total de los Libros Extraviados: "+B.valorExtravios());
        
        System.out.println("Nombres de los Solicitantes del Libro 'Gorki' "+B.nombresSolic("Gorki"));
        
        System.out.println("Promedio de veces que fue prestado cada Libro: ");
    }
    
}
