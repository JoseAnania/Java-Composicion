
package tareaguía1;

public class Veterinaria {
    
    private Cliente[]clientes;

    public Veterinaria(int cantClientes) {
        this.clientes = new Cliente[cantClientes];
    }
    
    public void agregarCliente(Cliente nuevoCliente)
    {
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i]==null)
            {
                clientes[i]=nuevoCliente;
                break;
            }
        }
    }
    
    public float promEdadMascotas()
    {
        float acumEdad=0;
        float contEdad=0;
        
        for (int i = 0; i < clientes.length; i++) {
            
            acumEdad+=clientes[i].getMascota().getEdad();
            contEdad++;
        }
        return (acumEdad/contEdad);
    }
    
    public int antiguedadMayor()
    {
        int cont5=0;
        
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i].getAntiguedad()>=5)
            {
                cont5++;
            }
            
        }
        return cont5;
    }
}
