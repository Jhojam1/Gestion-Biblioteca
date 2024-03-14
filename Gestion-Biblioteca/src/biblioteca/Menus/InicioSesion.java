package biblioteca.Menus;

import biblioteca.OpcionesMenu.OpcionesInicioSesion;

import java.util.Scanner;

public class InicioSesion {

    public void inicioSesion(){
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("""
                =======================================================================
                ***************+* BIENVENIDO A LA LIBRERIA LOS SANTOS ***************+*
                =======================================================================
                
                1.Iniciar Sesion
                2.Registrarse
                
                Ingrese su opcion:
                """);
            opcion = sc.nextInt();
            OpcionesInicioSesion oi = new OpcionesInicioSesion();
            oi.OpcionesInicioSesion(opcion);
        }while (opcion>2);
    }
}
