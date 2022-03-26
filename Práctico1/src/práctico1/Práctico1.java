
package práctico1;

import java.util.Scanner;

public class Práctico1 {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Nombre del Curso: ");
        String nombreCurso=SC.next();
        
        System.out.println("Cantidad de alumnos del curso "+nombreCurso);
        int cantAlumnos=SC.nextInt();
        
        Curso C=new Curso(nombreCurso, cantAlumnos);
        
        for (int i = 0; i < cantAlumnos; i++) {
            
            System.out.println("Nombre del Alumno "+(1+i));
            String nombreAlumno=SC.next();
            
            System.out.println("Legajo de "+nombreAlumno);
            int legajo=SC.nextInt();
            
            System.out.println("Cantidad de notas de "+nombreAlumno);
            int cantNotas=SC.nextInt();
            
            Alumno A=new Alumno(nombreAlumno, legajo, cantNotas);
            
            System.out.println("Ingrese las "+cantNotas+" de "+nombreAlumno);
            
            for (int j = 0; j < cantNotas; j++) {
                
                int nota=SC.nextInt();
                
                A.agregarNota(nota);
            }
            
            System.out.println("Promedio de "+nombreAlumno+" : "+A.calcularPromedio());
            C.agregarAlumno(A);
        }
        
        System.out.println("Listado de Inscriptos: "+C.listadoAlumnos());
        
        System.out.println("Promedio General: "+C.calularPromedioGeneral());
        
        System.out.println("Cantidad de Alumnos con Promedio mayor a 8= "+C.cantMayores8());
    }
    
}
