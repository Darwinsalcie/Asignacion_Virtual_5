import java.util.Scanner;

public class EcuacionCuadratica {
    
    Scanner scanner = new Scanner(System.in);

    double a = 0;
    double b = 0;
    double c = 0;

    public void tomarEntradas(String[] args) {

      do {

        System.out.print("Ingrese el coeficiente a: ");
        a = scanner.nextDouble();

        if (a == 0) {
          System.out.println("El coeficiente a no puede ser 0.");
        }

      } while (a == 0);  


        System.out.print("Ingrese el coeficiente b: ");
        b = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        c = scanner.nextDouble();

        scanner.close();
    }


    public void calcularEcuacion(String[] args) {

        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución de la ecuación es: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            if (Double.isNaN(x1) || Double.isNaN(x2)) {
                System.out.println("Una de las soluciones no es un número válido.");
            } else if (Double.isInfinite(x1) || Double.isInfinite(x2)) {
                System.out.println("Una de las soluciones es infinita.");
            } else {
                System.out.println("Las soluciones de la ecuación son:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }


}