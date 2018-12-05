package tema5_1;

public class Tema5_1 {

    private class Persona {

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
            double IMC = peso / (altura * altura);
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
            if (sexo != 'H' || sexo != 'M') {
                System.out.println("Sexo incorrecto");
            } else {
                sexo = 'H';
            }
        }

    }

    public static void main(String[] args) {

    }

}
