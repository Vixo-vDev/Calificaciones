
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        float calificacion, suma = 0, promedio;
    
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingresa Calificación "+i);
            calificacion = read.nextFloat();
            suma = suma + calificacion;
        }

        promedio = (suma / 3);
        System.out.println("EL promedio es: "+ promedio);

    }
}
