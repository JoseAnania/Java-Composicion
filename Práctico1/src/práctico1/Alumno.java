package práctico1;

public class Alumno {
    
    private String nombreAlumno;
    private int legajo;
    private int[]notas;

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno() {
    }

    public Alumno(String nombreAlumno, int legajo, int cantNotas) {
        this.nombreAlumno = nombreAlumno;
        this.legajo = legajo;
        this.notas = new int [cantNotas];
    }
    
    public void agregarNota(int nuevaNota)
    {
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]==0)
            {
                notas[i]=nuevaNota;
                break;
            }
        }
    }
    
    public float calcularPromedio()
    {
        float promedio=0;
        float acumProm=0;
        for (int i = 0; i < notas.length; i++) {
            
            acumProm+=notas[i];
            
            promedio=acumProm/notas.length;
        }
        
        return promedio;
    }
}
