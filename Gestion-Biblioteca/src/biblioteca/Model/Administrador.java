package biblioteca.Model;

public class Administrador extends Usuario{
    private String departamento;

    public Administrador() {
    }

    public Administrador(int idUsuario, String nombre, String apellido, String nombreUsuario, String contraseña, String rol, String departamento) {
        super(idUsuario, nombre, apellido, nombreUsuario, contraseña, rol, null);  // null en lugar de librosprestados
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
