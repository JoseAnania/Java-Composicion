
package tareaguía3;

public class Biblioteca {
    
    private Libro[]libros;

    public Biblioteca(int cantLibros) {
        this.libros = new Libro[cantLibros];
    }
    
    public void agregarLibro(Libro nuevoLibro)
    {
        for (int i = 0; i < libros.length; i++) {
            if(libros[i]==null)
            {
                libros[i]=nuevoLibro;
                break;
            }
            
        }
    }
    
    public int cantLibrosEstado(int estado)
    {
        int contEstados=0;
        
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].getEstado()==estado)
            {
                contEstados++;
            }
        }
        return contEstados;
    }
    
    public float valorExtravios()
    {
        float acumValor=0;
        
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].getEstado()==3)
            {
                acumValor+=libros[i].getPrecio();
            }
        }
        return acumValor;
    }
    
    public String nombresSolic(String titulo)
    {
        String nombres="\n";
        
        for (int i = 0; i < libros.length; i++) {
            if(libros[i].getTitulo().equalsIgnoreCase(titulo))
            {
                nombres+=libros[i].nombreSolicitantes()+"\n";
            }
        }
        return nombres;
    }
    
    public float promedioPrestados()
    {
        float acumPrest=0;
        int contPrest=0;
        
        for (int i = 0; i < libros.length; i++) {
            
            acumPrest+=libros[i].cantidadPrestamos();
            contPrest++;
        }
        return acumPrest/contPrest;
    }
}
