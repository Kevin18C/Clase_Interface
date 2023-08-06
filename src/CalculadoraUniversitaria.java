public class CalculadoraUniversitaria implements CalculadoraBasica, CalculadoraAvanzada {

    @Override
    public double CalcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double CalcularRaiz(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double Sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double Restar(double a, double b) {
        return a - b;
    }

    @Override
    public double Multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double Dividir(double a, double b) {
        return a / b;
    }
}
