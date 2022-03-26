
package tareaguía1;

public class Mascota {
    
    private String nombreMasc;
    private int edad;

    public String getNombreMasc() {
        return nombreMasc;
    }

    public void setNombreMasc(String nombreMasc) {
        this.nombreMasc = nombreMasc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota(String nombreMasc, int edad) {
        this.nombreMasc = nombreMasc;
        this.edad = edad;
    }
    
}
