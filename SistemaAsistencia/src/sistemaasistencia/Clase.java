/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaasistencia;

import java.util.ArrayList;

/**
 *
 * @author kelvin
 */
public class Clase {
    String nombre;

    public Clase(String nombre) {
        this.nombre = nombre;
    }
    Alumno[] alumnos = new Alumno[10];
    int ptr=0;
    ArrayList<RegistroDeAsistencia> asistencias = new ArrayList<RegistroDeAsistencia>();
    void ingresarRegistro(int ID,boolean a){
        Alumno al=this.obtenerAlumno(ID);
        asistencias.add(new RegistroDeAsistencia(al.nombre,al.ID,a));
    }
    void ingresarAlumno(Alumno a){
        this.alumnos[ptr]=a;
        this.ptr++;
    }   
    Alumno obtenerAlumno(int ID){
        for(int i = 0 ; i<ptr;i++){
            if(ID==this.alumnos[i].ID){
                return this.alumnos[i];
                
            }
        }
        return null;
    }    
            
}
