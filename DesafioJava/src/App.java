import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitorDeEntrada = new Scanner(System.in);
        float valorSalario = leitorDeEntrada.nextFloat();
        float valorBeneficios = leitorDeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficios;

        System.out.println(String.format("%.2f", saida));
    }
}
