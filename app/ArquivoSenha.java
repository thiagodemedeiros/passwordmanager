import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoSenha {
  public static File arquivo = new File(".password");

  public static void VerificarExistencia() {
    try {
      if (arquivo.createNewFile()) {
        System.out.println("Arquivo criado");
      } 
      else {
        System.out.println("Arquivo já existe");
      }
    }
    catch (IOException e){
      System.out.println("Erro ao criar arquivo");
    }
  }
}