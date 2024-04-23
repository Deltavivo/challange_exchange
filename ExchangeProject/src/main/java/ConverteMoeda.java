import java.util.Scanner;

public class ConverteMoeda {
    public void converterValor(String moeda1, String moeda2, Double paridade) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor que deseja converter: ");
        var valor = leitura.nextLine();
        Double valorConvertido = Double.parseDouble(valor) * paridade;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("O valor de " + valor + " [" + moeda1 + "] corresponde ao valor final de >> " + valorConvertido + " [" + moeda2 + "]");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

    }
}
