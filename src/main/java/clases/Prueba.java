package clases;

/**
 *
 * @author alvaro
 */
public class Prueba {

    public static void main(String[] args) {
        
        //CREACION DE UNA SERIE
        Serie juegoTronos = new Serie("Juego de tronos", "nose", 
                "dragones?", "DonaldTrump", 8, 1000);
        
        //PERSONA CREADO CON SERVICIO PERSONA
        Persona alvaro = ServicioPersona.leerTecladoPersona();
        System.out.println(alvaro + "\n");
        
        
        //PERSONA CREADA SIN CONSTRUCTOR
        Persona tioRandom = new Persona();
        System.out.println(tioRandom);
        
        System.out.println("\n-----------¿ES MAYOR DE EDAD?-----------\n");
        
        alvaro.esMayorEdad();
        tioRandom.esMayorEdad();
        
        System.out.println("\n-----------CALCULAR IMC-----------\n");
        
        alvaro.calcularIMC();
        
        System.out.println("\n-----------DAR ME GUSTA MOSTRAR-----------\n");
        
        alvaro.darLikeSerie(juegoTronos);
        System.out.println(juegoTronos);

    }
}
