import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Definicion de variables
        Persona[] pacientes = new Persona[3]; // Definicion de arreglo de tipo objeto
        Scanner input = new Scanner(System.in);
        int casilla = 0; // Variable que almacena la posicion del arreglo
        
        while (casilla < pacientes.length) {
            // Igreso de datos a las variables
            System.out.println("> Nombre");
            String nombre = input.next();
            System.out.println("> Año de nacimiento");
            int ano = input.nextInt();
            System.out.println("> Sexo");
            char sexo = input.next().charAt(0);
            System.out.println("> Peso");
            float peso = input.nextFloat();

            // Instanciacion del objeto persona e ingreso de datos al areglo
            pacientes[casilla] = new Persona();
            pacientes[casilla].setNombre(nombre);
            pacientes[casilla].setAnoNacimiento(ano);
            pacientes[casilla].setPeso(peso);
            pacientes[casilla].setSexo(sexo);

            casilla++;
        }
        // Recuperar los datos de los pacientes y mostrarlos
        String mostrar="";
        for (Persona p : pacientes) {
            mostrar += "> Nombre: " +p.getNombre() + "\n" + "Año de nacimiento: "+p.getAnoNacimiento() + "\n" + "Peso: "+ p.getPeso() + "\n" + "sexo: "+p.getSexo() + "\n";
        }
        System.out.println(mostrar);

        // Saber cual es el paciente de mayor edad
        Persona pacienteMayor;
        pacienteMayor = pacientes[0];
        for (Persona paciente : pacientes) {
            if (paciente.getAnoNacimiento() < pacienteMayor.getAnoNacimiento()) {
                pacienteMayor = paciente;
            }
        }

        System.out.println("El paciente de mayor edad es: "+pacienteMayor.getNombre());
        // Cerrar Instancia Scanner
        input.close();
    }
}

