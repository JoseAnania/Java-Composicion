
package tareaguía3;

public class Libro {
    
    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[]prestamos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Libro(String titulo, int precio, int estado, int cantPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        this.prestamos = new Prestamo[cantPrestamos];
    }
    
    public void agregarPrestamo(Prestamo nuevoPrestamo)
    {
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i]==null)
            {
                prestamos[i]=nuevoPrestamo;
                break;
            }
        }
    }
    
    public String nombreSolicitantes()
    {
        String nombre="";
        
        
        for (int i = 0; i < prestamos.length; i++) {
            
            nombre+=prestamos[i].getSolicitante();
            
        }
        return nombre;
    }
    
    public int cantidadPrestamos()
    {
        int contPrestamos=0;
        
        contPrestamos++;
        
        return contPrestamos;
    }
}
