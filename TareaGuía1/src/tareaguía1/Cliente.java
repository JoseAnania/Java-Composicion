
package tareaguía1;

public class Cliente {
    
    private int numero;
    private String nombreCliente;
    private int antiguedad;
    private Mascota mascota;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente(int numero, String nombreCliente, int antiguedad, Mascota mascota) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }
    
}
