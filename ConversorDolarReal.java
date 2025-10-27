class ConversorDolarReal extends ConversorMoeda {
   public ConversorDolarReal(double taxaDolar) {
       super(taxaDolar);
   }
}

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useLocale(java.util.Locale.US); // Para aceitar ponto como separador decimal

       System.out.print("Qual é o preço do dólar? ");
       double taxaDolar = sc.nextDouble();

       System.out.print("Quantos dólares serão comprados? ");
       double valorDolar = sc.nextDouble();

       ConversorDolarReal conversor = new ConversorDolarReal(taxaDolar);
       double valorReal = conversor.converter(valorDolar);

       System.out.printf("Valor a pagar em reais = R$ %.2f%n", valorReal);

       sc.close();
   }
}
