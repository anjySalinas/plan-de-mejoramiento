package Daviplata;

import java.util.Scanner;

public class ejecucion {

    private static String usuario,usuarioo,operador;
    private static String contrasena,contrasenaa;
    private static double saldo,retiro, ingreso,recarga,telefono;
    private static int respuesta;
   
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido a Daviplata");

        // creamos un menu de opciones
        int opcion = 0;
        do {
            System.out.println("\nElija una opción:");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    registrarse();
                    break;
                case 3:
                    System.out.println("Gracias por usar Daviplata");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 1 );
        
    
}

 // creamos una funcion para iniciar sesión
 private static void iniciarSesion() {
    System.out.println("Ingrese su usuario:");
    usuario = scanner.next();
    System.out.println("Ingrese su contraseña:");
    contrasena = scanner.next();

    // Validación de usuario y contraseña
    if (usuario.equals(usuarioo) && contrasena.equals(contrasenaa)) {
        saldo = 0;
        System.out.println("Bienvenido a Daviplata, " + usuarioo);
        menuOperaciones();

    } else {
        System.out.println("Usuario o contraseña incorrectos");
    }
}

// creamos una funcion para registrarse
private static void registrarse() {
    System.out.println("Ingrese su nombre completo:");
    String nombre = scanner.next() + scanner.nextLine();
    System.out.println("Ingrese su usuario:");
    usuarioo = scanner.next();
    System.out.println("Ingrese su contraseña:");
    contrasenaa = scanner.next();
    saldo = 0;
    System.out.println("Registro exitoso");
    System.out.println("Bienvenido a Daviplata, " + nombre);
    
}


private static void menuOperaciones(){
    
    do {
       do {
        System.out.println("5. salir");
    System.out.println("6.consultar saldo");
    System.out.println("7.retirar");
    System.out.println("8.ingresar dinero");
    System.out.println("9. recargar a celular");
    
    respuesta = scanner.nextInt();

    switch (respuesta) {
        case 6:

System.out.println("su saldo es " + saldo);
            
            break;

        case 7: 
        System.out.println("cuando dinero desea retirar?");
        retiro = scanner.nextInt();
if (retiro<saldo) {
    

        saldo= saldo-retiro;

        System.out.println("retiro exitoso");
        System.out.println("hora su saldo es de: "+ saldo);
    }

    else {
        System.out.println("su saldo es insuficiente");
    }
        break;
   
        case 8:
        System.out.println("cuando dinero desea ingresar?");
        ingreso = scanner.nextInt();

        saldo=saldo+ingreso;

        System.out.println("ahora su saldo es de: "+ saldo);
        break;
    case 9:
    System.out.println("ingrese el numero de telefono");
    telefono = scanner.nextInt();

    System.out.println("ingrese el operador");
        operador = scanner.next();

        System.out.println("ingrese el valor de la recarga");
        recarga = scanner.nextInt();
case 5: 
System.out.println("gracias por usar nuestro programa");
break;
        default:
    System.out.println("ingresaste un numero incorrecto");
            break;
    }

    System.out.println("digite 1 si quiere volver atras o 2 si quiere salir");
    respuesta = scanner.nextInt(respuesta);
}while(respuesta==1);
} while (respuesta==5);
System.out.println("gracias por utilizar nuestro programa");
}

}
