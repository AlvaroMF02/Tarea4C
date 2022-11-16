package clases;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Persona {

    public static Random alea = new Random();

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String nif;
    private char sexo;
    private double peso;
    private double altura;

    //CONSTRUCTOR
    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo;
    }

    //GETTER SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String generaNIF() {
        String nif = "";
        String numeros;
        int numerosInt;
        int resto;

        numeros = RandomStringUtils.randomNumeric(8);

        numerosInt = Integer.parseInt(numeros);

        resto = numerosInt % 23;

        switch (resto) {
            case 0 -> {
                nif = numeros + "T";
            }
            case 1 -> {
                nif = numeros + "R";
            }
            case 2 -> {
                nif = numeros + "W";
            }
            case 3 -> {
                nif = numeros + "A";
            }
            case 4 -> {
                nif = numeros + "G";
            }
            case 5 -> {
                nif = numeros + "M";
            }
            case 6 -> {
                nif = numeros + "Y";
            }
            case 7 -> {
                nif = numeros + "F";
            }
            case 8 -> {
                nif = numeros + "P";
            }
            case 9 -> {
                nif = numeros + "D";
            }
            case 10 -> {
                nif = numeros + "X";
            }
            case 11 -> {
                nif = numeros + "B";
            }
            case 12 -> {
                nif = numeros + "N";
            }
            case 13 -> {
                nif = numeros + "J";
            }
            case 14 -> {
                nif = numeros + "Z";
            }
            case 15 -> {
                nif = numeros + "S";
            }
            case 16 -> {
                nif = numeros + "Q";
            }
            case 17 -> {
                nif = numeros + "V";
            }
            case 18 -> {
                nif = numeros + "H";
            }
            case 19 -> {
                nif = numeros + "L";
            }
            case 20 -> {
                nif = numeros + "C";
            }
            case 21 -> {
                nif = numeros + "K";
            }
            case 22 -> {
                nif = numeros + "E";
            }
        }

        return nif;
    }
    
    public boolean filtrarSexo(char sexo){
        
    }
}
