package biblioteca.Model;

import java.util.List;

public class Estudiante extends Usuario{

    private List<Libro> librosprestados;
    private String carrera;
    private String semestre;
    private String Direccion;

    public Estudiante() {
    }

    public Estudiante(int idUsuario, String nombre, String apellido, String nombreUsuario, String contraseña, String rol, List<Libro> librosprestados) {
        super(idUsuario, nombre, apellido, nombreUsuario, contraseña, rol, librosprestados);
    }

    public Estudiante(int idUsuario, String nombre, String apellido, String nombreUsuario, String contraseña, String rol, List<Libro> librosprestados, List<Libro> librosprestados1, String carrera, String semestre, String direccion) {
        super(idUsuario, nombre, apellido, nombreUsuario, contraseña, rol, librosprestados);
        this.librosprestados = librosprestados1;
        this.carrera = carrera;
        this.semestre = semestre;
        Direccion = direccion;
    }

    public List<Libro> getLibrosprestados() {
        return librosprestados;
    }

    public void setLibrosprestados(List<Libro> librosprestados) {
        this.librosprestados = librosprestados;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
