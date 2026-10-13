package course;

public class NewtonRaphson {

    // Función f(x)
    public static double f(double x) {
        return Math.sin(x) - (1.0 / Math.sin(x)) + 1.0;
    }

    // Primera derivada f'(x)
    public static double df(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        return cosX + (cosX / (sinX * sinX));
    }

    // Segunda derivada f''(x)
    public static double d2f(double x) {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        return -sinX - ((1.0 + cosX * cosX) / Math.pow(sinX, 3));
    }

    // Criterio de convergencia: |f(x) * f''(x) / [f'(x)]^2| < 1
    public static double criterioConvergencia(double x) {
        double fVal = f(x);
        double dfVal = df(x);
        double d2fVal = d2f(x);
        return Math.abs((fVal * d2fVal) / (dfVal * dfVal));
    }

    public static void main(String[] args) {
        double tol = 0.0001;
        int maxIter = 100;
        double x0 = 1.0; // Valor inicial positivo (en radianes)

        System.out.printf("Criterio en x0 = %.4f: %.4f ", x0, criterioConvergencia(x0));
        if (criterioConvergencia(x0) < 1.0) {
            System.out.println("(< 1 -> Convergencia garantizada)\n");
        } else {
            System.out.println("(>= 1 -> Seleccione otro punto inicial)\n");
        }

        System.out.printf("%-6s %-12s %-12s %-12s %-12s%n", "Iter", "x_k", "f(x_k)", "f'(x_k)", "Error");
        System.out.println("---------------------------------------------------------");

        double x = x0;
        for (int i = 0; i < maxIter; i++) {
            double fx = f(x);
            double dfx = df(x);

            if (Math.abs(dfx) < 1e-12) {
                System.out.println("Derivada cercana a cero. El método falla.");
                break;
            }

            double xNext = x - (fx / dfx);
            double error = Math.abs(xNext - x);

            System.out.printf("%-6d %-12.6f %-12.6f %-12.6f %-12.6f%n", i, x, fx, dfx, error);

            if (error <= tol || Math.abs(fx) <= tol) {
                System.out.println("---------------------------------------------------------");
                System.out.printf("Primera raíz positiva encontrada: x = %.6f rad (%.4f°) en %d iteraciones.%n", 
                                  xNext, Math.toDegrees(xNext), i + 1);
                break;
            }

            x = xNext;
        }
    }
}