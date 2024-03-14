package biblioteca.Controller;

import biblioteca.Model.Estudiante;
import biblioteca.Model.Libro;
import biblioteca.Model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador_Usuario {

    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    int idUs;

    public void crearUsuario() {
        Estudiante user = new Estudiante();
        Scanner sc = new Scanner(System.in);
        //Se modifica la variable idUs que es un contador para el id Usuario
        //Y se modifica el parametro ID usuario del usuario
        user.setIdUsuario(idUs);
        idUs++;


        //Se pide por consola ingresar el nombre y se modifica el parametro nombre del usuario
        System.out.print("Ingrese su Nombre: ");
        String nombre = sc.nextLine();
        user.setNombre(nombre);

        //Se pide por consola ingresar el apellido y se modifica el parametro apellido del usuario
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        user.setApellido(apellido);

        // se pide por consola ingresar el usuario y se modifica el parametro nombreUsuario del usuario
        System.out.println("Ingrese su usuario");
        String usuario = sc.nextLine();
        user.setNombreUsuario(usuario);

        //Se pide por consola ingresar la contraseña y se modifica el parametro contraseña del usuario
        System.out.println("Ingrese su contraseña");
        String contraseña = sc.nextLine();
        user.setContraseña(contraseña);

        //Se coloca el rol manual automatico a estudiante en el parametro usuario
        user.setRol("Estudiante");

        //se llama el metodo agregarUsuario para guardarlo en la lista
        agregarEstudiante(user);
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
        getUsuarios().add(e);
    }


    public void agregarLibrosPrestados(Usuario u, Libro l) {

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}


