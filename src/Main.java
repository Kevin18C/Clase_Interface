
public class Main {
    public static void main(String[] args) {
        CalculadoraUniversitaria KC = new CalculadoraUniversitaria();

        System.out.println("El resultado de la suma es:" + KC.Sumar(10, 5));
        System.out.println("El resultado de la resta es:" + KC.Restar(10, 5));
        System.out.println("El resultado de la Multiplicación es:" + KC.Multiplicar(10, 5));
        System.out.println("El resultado de la división es:" + KC.Dividir(10, 5));
        System.out.println("El resultado de la potencia es:" + KC.CalcularPotencia(10, 5));
        System.out.println("El resultado de la raiz es:" + KC.CalcularRaiz(10));
    }
}
