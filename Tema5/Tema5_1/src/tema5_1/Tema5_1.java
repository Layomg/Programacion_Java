package tema5_1;

import java.util.Scanner;

public class Tema5_1 {

    private static class Persona {

        String nombre, DNI;
        int edad;
        char sexo = 'H';
        double peso, altura;

        public Persona() {
            nombre = "";
            edad = 0;
            peso = 0;
            altura = 0;
        }

        public Persona(String name, int age, char sex) {
            nombre = name;
            edad = age;
            sexo = sex;
            peso = 0;
            altura = 0;
        }

        public Persona(String name, String document, int age, char sex, double weight, double height) {
            nombre = name;
            DNI = document;
            edad = age;
            sexo = sex;
            peso = weight;
            altura = height;
        }

        public int calcularIMC() {
            double alturas = altura * altura;
            double IMC = peso / alturas;
            int estado = 0;
            if (IMC < 18.50) {
                estado = -1;
            }
            if (IMC > 18.50 && IMC < 25) {
                estado = 0;
            }
            if (IMC > 25) {
                estado = 1;
            }
            return estado;
        }

        public boolean esMayorDeEdad() {
            boolean mayor_edad = false;
            if (edad >= 18) {
                mayor_edad = true;
            }
            return mayor_edad;
        }

        private void comprobarSexo(char sexo) {
            if (sexo == 'H' || sexo == 'M' || sexo == 'h' || sexo == 'm') {
                System.out.println("Sexo correcto");
            } else {
                sexo = 'H';
            }
        }

        private void generaDNI() {
            int numero = (int) (Math.random() * 10000000);
            char letra = CalcularLetra(numero);
            System.out.println("DNI: " + numero + letra);
        }

        private char CalcularLetra(int numero) {
            char letra = ' ';
            int resultado = numero % 23;
            switch (resultado) {
                case 0:
                    letra = 'T';
                case 1:
                    letra = 'R';
                case 2:
                    letra = 'W';
                case 3:
                    letra = 'A';
                case 4:
                    letra = 'G';
                case 5:
                    letra = 'M';
                case 6:
                    letra = 'Y';
                case 7:
                    letra = 'F';
                case 8:
                    letra = 'P';
                case 9:
                    letra = 'D';
                case 10:
                    letra = 'X';
                case 11:
                    letra = 'B';
                case 12:
                    letra = 'N';
                case 13:
                    letra = 'J';
                case 14:
                    letra = 'Z';
                case 15:
                    letra = 'S';
                case 16:
                    letra = 'Q';
                case 17:
                    letra = 'V';
                case 18:
                    letra = 'H';
                case 19:
                    letra = 'L';
                case 20:
                    letra = 'C';
                case 21:
                    letra = 'K';
                case 22:
                    letra = 'E';
            }
            return letra;
        }
    }

    public static String ObtenerNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    public static int ObtenerEdad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        return edad;
    }

    public static double ObtenerPeso() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su peso: ");
        double peso = entrada.nextDouble();
        return peso;
    }

    public static double ObtenerAltura() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();
        return altura;
    }

    public static void ComprobarEstadoSalud(int estado) {
        if (estado == -1) {
            System.out.println("Infrapeso");
        }
        if (estado == 0) {
            System.out.println("Peso ideal");
        }
        if (estado == 1) {
            System.out.println("Sobrepeso");
        }
    }

    public static void main(String[] args) {
        String nombre_1 = ObtenerNombre();
        int edad_1 = ObtenerEdad();
        double peso_1 = ObtenerPeso();
        double altura_1 = ObtenerAltura();

        Persona persona_1 = new Persona(nombre_1, "", edad_1, ' ', peso_1, altura_1);

        Persona persona_2 = new Persona(nombre_1, "", edad_1, ' ', 0, 0);

        Persona persona_3 = new Persona();
        persona_3.nombre = nombre_1;
        persona_3.edad = edad_1;
        persona_3.peso = peso_1;
        persona_3.altura = altura_1;

        int estado_1 = persona_1.calcularIMC();
        int estado_2 = persona_2.calcularIMC();
        int estado_3 = persona_3.calcularIMC();

        System.out.println("Persona 1: ");
        ComprobarEstadoSalud(estado_1);
        System.out.println("Persona 2: ");
        ComprobarEstadoSalud(estado_2);
        System.out.println("Persona 3: ");
        ComprobarEstadoSalud(estado_3);

        if (persona_1.esMayorDeEdad() == true) {
            System.out.println("Persona 1 es mayor de edad");
        } else {
            System.out.println("Persona 1 es menor de edad");
        }

        if (persona_2.esMayorDeEdad() == true) {
            System.out.println("Persona 2 es mayor de edad");
        } else {
            System.out.println("Persona 2 es menor de edad");
        }

        if (persona_3.esMayorDeEdad() == true) {
            System.out.println("Persona 3 es mayor de edad");
        } else {
            System.out.println("Persona 3 es menor de edad");
        }
    }

}
