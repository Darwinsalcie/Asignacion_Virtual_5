
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica();

        
        ecuacionCuadratica.tomarEntradas(args);

        ecuacionCuadratica.calcularEcuacion(args);


    }
}
