import java.util.Scanner;

class ConversorMoeda {
   protected double taxaDolar;
   protected double iof = 0.06; // 6% de IOF

   public ConversorMoeda(double taxaDolar) {
       this.taxaDolar = taxaDolar;
   }

   public double converter(double valorDolar) {
       double valorReal = valorDolar * taxaDolar;
       double valorIOF = valorReal * iof;
       return valorReal + valorIOF;
   }
}

