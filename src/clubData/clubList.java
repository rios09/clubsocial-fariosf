package clubData;

import gestiones.empleados;
import gestiones.miembros;
import java.util.ArrayList;
import java.util.Scanner;

public class clubList {

        ArrayList miembros = new ArrayList();
        clubData d = new clubData();
        Scanner scan = new Scanner(System.in);
        miembros member = new miembros();
        empleados employ = new empleados();
    public void miembrosData() {

        

        System.out.println("Ingrese el nombre del miembro");
        d.setNombre(scan.nextLine());
        miembros.add(d);
        System.out.println("Ingrese la fecha de nacimiento");
        d.setDob(scan.nextLine());
        miembros.add(d);
        System.out.println("Ingrese la edad");
        d.setEdad(scan.nextInt());
        miembros.add(d);
        System.out.println("Ingrese el genero indicando M para varon o F para Mujer");
        d.setGenero(scan.next());
        miembros.add(d);
        System.out.println("Ingrese el numero de membresia");    
        d.setMembresia(scan.nextDouble());
        miembros.add(d);
        System.out.println("Ingrese la fecha de emision de la membresia");
        d.setEmision(scan.nextLine());
        miembros.add(d);
        System.out.println("Ingrese la fecha de vencimiento de la membresia");
        d.setVencimiento(scan.nextLine());
        miembros.add(d);
        System.out.println("\n **Datos del miembro han sido guardados**");
        member.menuMiembros();
   }
    
        ArrayList empleados = new ArrayList();
        clubData da = new clubData();
        
    public void empleadosData() {

        

        System.out.println("Ingrese el nombre del Empleado");
        da.setNombre(scan.nextLine());
        empleados.add(da);
        System.out.println("Ingrese la fecha de nacimiento");
        da.setDob(scan.nextLine());
        empleados.add(da);
        System.out.println("Ingrese la edad");
        da.setEdad(scan.nextInt());
        empleados.add(da);
        System.out.println("Ingrese el genero");
        da.setGenero(scan.nextLine());
        empleados.add(da);
        System.out.println("Ingrese el Numero de empleado");
        da.setNumEmpleado(scan.nextDouble());
        empleados.add(da);
        System.out.println("Ingrese la fecha de ingreso");
        da.setIngreso(scan.nextLine());
        empleados.add(da);
        System.out.println("Ingrese el cargo");
        da.setPuesto(scan.nextLine());
        employ.menuEmpleados();
    }
}
