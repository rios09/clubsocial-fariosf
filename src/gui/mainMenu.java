package gui;

import gestiones.empleados;
import gestiones.miembros;
import java.util.Scanner;

public class mainMenu {

    public void primerMenu() {
        System.out.println("(===BIENVENIDO A LA APLICACION DEL CLUB SOCIAL===)\n");
        System.out.println("Digite el numero de la opcion que desea ejecutar:");
        System.out.println("1. Miembros");
        System.out.println("2. Empleados");
        System.out.println("3. Salir de la aplicacion");

        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        while (opcion < 1 || opcion > 3) {
            System.out.println("\n *** La opcion ingresada no es valida, ingrese una correcta! *** \n");
            primerMenu();
        }

        switch (opcion) {
            case 1:
                miembros m = new miembros();
                m.menuMiembros();
                break;

            case 2:
                empleados e = new empleados();
                e.menuEmpleados();
                break;

            case 3:
                System.exit(0);
                break;
        }
    }
}
