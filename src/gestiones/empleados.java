
package gestiones;

import clubData.clubList;
import clubData.mostrar;
import gui.mainMenu;
import java.util.Scanner;


public class empleados {
    
    public void menuEmpleados() {
        System.out.println("\nIngrese una opcion:\n");
        System.out.println("1. Agregar Empleados");
        System.out.println("2. Ver lista de Empleados\n");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        while (opcion > 2 || opcion < 1) {
            System.out.println("\n**Ingreso una opcion invalida, intente nuevamente!**\n");
            menuEmpleados();
        }
        
         
        switch (opcion) {
            case 1: clubList c = new clubList();
                    c.empleadosData();
                    
                break;
                
            case 2: mostrar m = new mostrar();
                    m.mostrarEmpleados();
                    
                break;

        }
    }
}
