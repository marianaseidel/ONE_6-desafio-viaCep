import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String busca = " ";

        System.out.println("Digite o CEP:");
        busca = leitura.nextLine();


        try {
            ConsultaCep consultaCep = new ConsultaCep();
            Endereco novoEndereco = consultaCep.buscaEndereco(busca);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.geradorArquivoJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");

        }
    }}
