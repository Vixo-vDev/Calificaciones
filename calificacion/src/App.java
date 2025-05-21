
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        float calificacion, suma = 0, promedio;
    
        for (int i = 1; i <= 3; i++) {
            calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion: "));
            suma = suma + calificacion;
        }

        promedio = (suma / 3);
        JOptionPane.showMessageDialog(null, "EL promedio es: "+ promedio);

    }
}
