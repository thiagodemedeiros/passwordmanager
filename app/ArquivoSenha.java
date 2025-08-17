import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ArquivoSenha {
  public static File arquivo = new File(".password");

  public static void verificarExistencia() {
    try {
      if (arquivo.createNewFile()) {
        System.out.println("Criando gerenciador");
      } 
      else {
        System.out.println("Verificando Senhas");
      }
    }
    catch (IOException e){
      System.out.println("Erro ao criar arquivo");
    }
  }

  public static void escreverNoArquivo(String texto) {
    try {
      FileWriter escritor = new FileWriter(arquivo, true);
      escritor.write(texto + System.lineSeparator());
      escritor.close();
    }
    catch (IOException e) {
      System.out.println("Não foi possível escrever no arquivo");
    }
  }

  public static void verificarSenha(String rede) {
    try {
      FileReader fr = new FileReader(arquivo);
      BufferedReader br = new BufferedReader(fr);
      String linha;
      int numeroLinha = 1;
      boolean achouRede = false;

      while((linha = br.readLine()) != null) {
        if (achouRede) {
          System.out.println("Senha"+ " : " + linha);
          break;
        }
        if (linha.equals(rede)){
          System.out.println("Login" + " : " + linha);
          achouRede = true;
        }
        numeroLinha++;
      }

      if (achouRede == false) {
        ArquivoSenha.escreverNoArquivo("");
        ArquivoSenha.escreverNoArquivo(rede);
        String gerarSenha = CriarSenha.criandoSenha();
        ArquivoSenha.escreverNoArquivo(gerarSenha);
        System.out.println("Sua nova senha: " + gerarSenha);
      }
    }
    catch (IOException e) {
      System.out.println("Não foi possível ler o arquivo");
    }
  }
}