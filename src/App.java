import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Definicion de variables
        Persona[] pacientes = new Persona[3]; // Definicion de arreglo de tipo objeto
        Scanner input = new Scanner(System.in);
        int casilla = 0;
        
        while (casilla < pacientes.length) {
            System.out.println("> Nombre");
            String nombre = input.nextLine();
            System.out.println("> Ano de nacimiento");
            int ano = input.nextInt();
            System.out.println("> Sexo");
            char sexo = input.next().charAt(0);
            System.out.println("> Peso");
            float peso = input.nextFloat();

            pacientes[casilla] = new Persona();
            pacientes[casilla].setNombre(nombre);
            pacientes[casilla].setAnoNacimiento(ano);
            pacientes[casilla].setPeso(peso);
            pacientes[casilla].setSexo(sexo);

            casilla++;
            break;
        }
    }
}

