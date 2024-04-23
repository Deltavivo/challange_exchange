import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        RequestExchange request = new RequestExchange();
        ConverteMoeda converte = new ConverteMoeda();



        int i = -1;
        while(i != 0){

            MenuMoeda.print();
            System.out.println("Digite uma opção para busca: ");
            var opcao = leitura.nextLine();
            Double paridade = 0.0;

            switch(Integer.parseInt(opcao)) {
                case 0:
                    i = 0;
                    break;

                case 1:
                    paridade = request.retornaParidade("USD","ARS");
                    converte.converterValor("USD","ARS", paridade);
                    break;
                case 2:
                    paridade = request.retornaParidade("ARS","USD");
                    converte.converterValor("ARS","USD", paridade);
                    break;
                case 3:
                    paridade = request.retornaParidade("USD","BRL");
                    converte.converterValor("USD","BRL", paridade);
                    break;
                case 4:
                    paridade = request.retornaParidade("BRL","USD");
                    converte.converterValor("BRL","USD", paridade);
                    break;
                case 5:
                    paridade = request.retornaParidade("USD","COP");
                    converte.converterValor("USD","COP", paridade);
                    break;
                case 6:
                    paridade = request.retornaParidade("COP","USD");
                    converte.converterValor("COP","USD", paridade);
                    break;
                default:
                    break;
            }
        }
    }

}
