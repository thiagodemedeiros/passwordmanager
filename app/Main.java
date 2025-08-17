public class Main {
  public static void main(String args[]){
    String rede = args[0];
    ArquivoSenha.verificarExistencia();
    ArquivoSenha.verificarSenha(rede);
  }
}