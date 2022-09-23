package lab1_tp3_directorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author GRUPO: 10.
 */
public class Lab1_TP3_Directorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;
        //Variables de Datos utiles
        Telefono tel;
        Cliente cli;
        Domicilio dire;
        long num;        
        int dni, altura; //altura y calle no figuran en el TP!!!!!
        String nombre, apellido, ciudad, calle;      
        
        DirectorioTelefonico guiaTel = new DirectorioTelefonico();
        //Guia Harcode:
        //DirectorioTelefonico guiaT = new DirectorioTelefonico();
        JOptionPane.showMessageDialog(null,"Bienvenido a nuestra guía telefónica.");                       
        guiaTel.agregarCliente(new Cliente(12345, "Maria", "Coria", new Domicilio("San Luis" , "asdfgh", 123)), new Telefono(2342342));
        guiaTel.agregarCliente(new Cliente(23456, "Felipe", "Gomez", new Domicilio("Trapiche" , "qwerty", 52)), new Telefono(4402525));
        guiaTel.agregarCliente(new Cliente(34567, "Juan", "Gauna", new Domicilio("La Punta" , "zxcvbn", 789)), new Telefono(5026987));
        guiaTel.agregarCliente(new Cliente(45678, "Lupe", "Loria", new Domicilio("Potrero" , "poiuyt", 654)), new Telefono(4425874));
        guiaTel.agregarCliente(new Cliente(56789, "Andrea", "Gomez", new Domicilio("Trapiche" , "mnbvcx", 45)), new Telefono(5036559));
        
          
        //MENU:
        System.out.println("\nIndique la opcion deseada: ");
        do {
            System.out.println("1 - para Agregar nuevo --> Cliente."
                    + "\n2 - para BUSCAR por LÍNEA telefónica a un --> cliente existente."
                    + "\n3 - para BUSCAR por APELLIDO todas las --> líneas de un cliente existente."
                    + "\n4 - para BUSCAR por CIUDAD todos los --> clientes."
                    + "\n5 - para ELIMINAR por LINEA telefónica a un --> cliente existente."
                    + "\n6 - para Ver Guía completa."                    
                    + "\n0 - para salir del menú.\n"
                    + "-  -  -  -  -  -  -  -  -  -  -");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println("-  -  -  -  -  -  -  -  -  -  -");
            
            switch (op) {
                case 1: //Menu input Cliente:
                    System.out.print("DNI: ");
                    dni = sc.nextInt();  
                    sc.nextLine();                  
                    System.out.print("APELLIDO: ");
                    apellido = sc.nextLine();
                    System.out.print("NOMBRE: ");
                    nombre = sc.nextLine();
                    System.out.print("CIUDAD: ");
                    ciudad = sc.nextLine();
                    System.out.print("LINEA TELEFONICA: ");                    
                    tel = new Telefono(sc.nextLong());
                    
                    
                    //Inicializar los elementos de cada obj (tel,cli)
                    dire = new Domicilio(ciudad , "Lavalle", 555);
                    cli = new Cliente(dni, nombre, apellido, dire);                    
                    guiaTel.agregarCliente(cli, tel);             
                    
                    break;                
                case 2: //EN obj cl se guarda el retorno del metodo, segun el tel dado
                        //If para corroborar si se pudo hacer y mostrar cliente. 
                        //Else: avisar q esta mal y salir al menu.
                    System.out.print("Busqueda de Cliente\nTelefono: ");  
                    Cliente cl = guiaTel.buscarCliente(new Telefono(sc.nextLong()));
                    if  (cl != null) {
                        System.out.println(cl.toString());
                    } else {
                    JOptionPane.showMessageDialog(null,"Linea no registrada");        }
                    break;    
                case 3: //If para corroborar si existe Apellido y mostrar lista. 
                        //Else: avisar q esta mal y salir al menu.                    
                    System.out.print("Busqueda de Lineas por Cliente\nApellido: ");  
                    String a = sc.nextLine();
                    List <Telefono> numList = guiaTel.buscarTelefono(a);
                    if (numList.size()>0) {
                        for (Telefono telefono : numList) {
                            System.out.println(telefono);
                        }
                    } else {System.out.println("Lista vacia");}
                    break;
                case 4: //If para corroborar si existe CIUDAD y mostrar CLientes de la Ciu. 
                        //Else: avisar q esta mal y salir al menu.
                    
                    break;
                case 5: //If para corroborar si existe el Numero TEl y mostrar CLiente a borrar.. 
                        //confirmar eliminacion y salir al menu.
                        //Else: avisar q esta mal y salir al menu.
                    System.out.print("Eliminar Cliente\nTelefono: ");  
                    
                    if  (guiaTel.borrarCliente(new Telefono(sc.nextLong()))) {
                        System.out.println("Cliente Borrado");
                    } else {
                    JOptionPane.showMessageDialog(null,"No se pudo realizar la operacion");        }
                    break; 
                case 6:
                    System.out.println(guiaTel);
                    
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestra guía Telefónica\n-     *GRUPO 10*     -");
                    
                    break;
            }          
            
        } while (op != 0);        
        
    }
    
}
