package gestiones;

import clubData.clubList;
import clubData.mostrar;
import gui.mainMenu;
import java.util.Scanner;

public class miembros {

    public void menuMiembros() {
        System.out.println("\nIngrese una opcion:\n");
        System.out.println("1. Agregar miembros");
        System.out.println("2. Ver lista de miembros\n");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        while (opcion > 2 || opcion < 1) {
            System.out.println("\n**Ingreso una opcion invalida, intente nuevamente!**\n");
            menuMiembros();
        }
        
        
        switch (opcion) {
            case 1: clubList cl = new clubList();
                    cl.miembrosData();
                break;
                
            case 2: mostrar m = new mostrar();
                    m.mostrarMiembros();
        
                break;

        }
    }
}
