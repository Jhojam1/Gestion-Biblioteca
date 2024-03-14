package biblioteca.OpcionesMenu;

import biblioteca.Controller.Controlador_Usuario;

public class OpcionesInicioSesion {
    public void OpcionesInicioSesion(int opcion){
        switch(opcion){
            case 1:
                System.out.println("Proximamente");
                break;
            case 2:
                Controlador_Usuario cu = new Controlador_Usuario();
                cu.crearUsuario();
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
    }
}
