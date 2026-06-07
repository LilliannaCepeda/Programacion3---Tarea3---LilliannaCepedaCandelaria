import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{

            System.out.println("=========================");
            System.out.println("  REGISTRO DE USUARIO");
            System.out.println("=========================");

            System.out.println("1. Registrar usuario");
            System.out.println("2. Salir");

            System.out.print("Seleccione la opcion que desea realizar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


            switch(opcion) {

                case 1:

                    try{

                        System.out.printgit ("Digite el nombre: ");    
                        String nombre = scanner.nextLine();

                        System.out.print("Digite la edad: "); 
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite el correo: ");
                        String correo = scanner.nextLine();

                        System.out.print("Digite el salario: ");
                        double salario = scanner.nextDouble();

                        scanner.nextLine();

                        Validar.validarUsuario(nombre, edad, correo, salario);

                        Usuario usuario = new Usuario(nombre, edad, correo, salario);

                        System.out.println(
                                "Usuario registrado correctamente.");

                    } catch(NombreInvalidoException e) {

                        System.out.println(
                                "Error: " + e.getMessage());

                    } catch(EdadInvalidaException e) {

                        System.out.println(
                                "Error: " + e.getMessage());

                    } catch(CorreoInvalidoException e) {

                        System.out.println(
                                "Error: " + e.getMessage());

                    } catch(SalarioInvalidoException e) {

                        System.out.println(
                                "Error: " + e.getMessage());

                    } catch(InputMismatchException e) {

                        System.out.println(
                                "Error: Debe ingresar un numero valido.");

                        scanner.nextLine();

                    } catch(Exception e) {

                        System.out.println(
                        "Error: " + e.getMessage());

                    } finally {

                        System.out.println(
                                "Proceso finalizado.");
                    }      

                    break;

                case 2:

                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.print("Digite una opcion correcta");
            }

        }while(opcion != 2);

         scanner.close();

    }
}