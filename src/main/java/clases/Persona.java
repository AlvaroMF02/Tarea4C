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

    public Persona(String nombre, int edad, double peso, char sexo, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nif = generaNIF();

        //SI EL FILTRO DE SEXO SALE NEGATIVO ES 'O'
        if (filtrarSexo(sexo)) {
            this.sexo = sexo;
        }else{
            this.sexo = 'O';
        }

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

    @Override
    public String toString() {
        return "Persona ->" + "\nNOMBRE:" + nombre + "\nEDAD=" + edad + "\nNIF=" + nif + "\nSEXO=" + sexo + "\nPESO=" + peso + "\nALTURA=" + altura;
    }

    //GENERAR NIF ALEATORIOS
    public static String generaNIF() {
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

    //SI NO SE INTRODUCE NI H NI M NI O SE CONSIDERA O
    public static boolean filtrarSexo(char sexo) {

        boolean sex = false;

        if (sexo =='H' || sexo == 'M') {

            sex = true;
        }

        return sex;
    }

    //SI EDAD ES MAYOR O IGUAL QUE 18 ES TRUE
    public boolean esMayorEdad() {
        boolean mayorEdad = false;

        if (this.edad >= 18) {
            
            mayorEdad = true;
            System.out.println(this.nombre + " es mayor de edad");
            
        }else{
            
            System.out.println(this.nombre + " es menor de edad");
        }

        return mayorEdad;
    }

    //CALCULAR IMC DE LA PERSONA
    public float calcularIMC() {
        float imc;

        imc = (float) (this.peso / Math.pow(this.altura / 100, 2));

        //INDICAR SI SU PESO ES NORMAL O LO OTRO
        if (imc < 18.5) {
            System.out.println("Peso inferior al normal");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Peso superior al normal");
        }else{
            System.out.println("Obeso");
        }
       
        
        
        
        
        return imc;
    }

    //DAR ME GUSTA A UNA SERIE
    public void darLikeSerie(Serie serie) {
        serie.darLike();
    }
}
