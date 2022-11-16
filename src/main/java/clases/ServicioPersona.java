package clases;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ServicioPersona {

    public static Scanner teclado = new Scanner(System.in);

    public static Persona leerTecladoPersona() {
        //CREO UN OBJETO PERSONA PERO NO LA INSTANCIO AUN
        Persona persona;

        //PIDO LOS ATRIBUTOS
        System.out.println("Indique su nombre");
        String nombre = teclado.nextLine();

        System.out.println("Indique su edad");
        int edad = teclado.nextInt();

        System.out.println("Indique su sexo (H) (M) (O)");
        String sexoS = teclado.nextLine();
        sexoS = sexoS.toUpperCase();
        //PASAR A CHAR SALTA UN ERROR
        char sexo = sexoS.charAt(0);

        System.out.println("Indique su peso");
        double peso = teclado.nextDouble();

        System.out.println("Indique su altura");
        double altura = teclado.nextDouble();
        
        
        //INSTANCIACION
        persona = new Persona(nombre, edad, peso, sexo, altura);
        
        return persona;

    }

}
