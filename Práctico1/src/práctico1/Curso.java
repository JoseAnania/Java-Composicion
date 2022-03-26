
package práctico1;

public class Curso {
    
    private String nombreCurso;
    private Alumno[]alumnos;

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Curso() {
    }

    public Curso(String nombreCurso, int cantAlumnos) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new Alumno[cantAlumnos];
    }
    
    public void agregarAlumno(Alumno nuevoAlumno)
    {
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i]==null)
            {
                alumnos[i]=nuevoAlumno;
                break;
            }
        }
    }
    
    public String listadoAlumnos()
    {
        String listado="\n";
        for (int i = 0; i < alumnos.length; i++) {
            
            listado+=alumnos[i].getNombreAlumno()+"\n";
        }
        return listado;
    }
    
    public float calularPromedioGeneral()
    {
        float promedioGeneral=0;
        float acumPromG=0;
        for (int i = 0; i < alumnos.length; i++) {
            
            acumPromG+=alumnos[i].calcularPromedio();
            
            promedioGeneral=acumPromG/alumnos.length;
        }
        return promedioGeneral;
    }
    
    public int cantMayores8()
    {
        int contMas8=0;
        
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].calcularPromedio()>8)
            {
                contMas8++;
            }
        }
        return contMas8;
    }
    
}
