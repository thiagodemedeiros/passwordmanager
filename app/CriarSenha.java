import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CriarSenha {
  public static List<String> listaLetraMinusculaOriginal = List.of(
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
        "u", "v", "w", "x", "y", "z"
  );

  public static List<String> listaLetraMinuscula = new ArrayList<>(listaLetraMinusculaOriginal);

  public static List<String> listaLetrasMaiusculasOriginal = List.of(
        "A","B","C","D","E","F","G","H","I","J",
        "K","L","M","N","O","P","Q","R","S","T",
        "U","V","W","X","Y","Z"
  );

  public static List<String> listaLetrasMaiusculas = new ArrayList<>(listaLetrasMaiusculasOriginal);

  public static List<String> listaNumerosOriginal = List.of(
      "0","1","2","3","4","5","6","7","8","9"
  );

  public static List<String> listaNumeros = new ArrayList<>(listaNumerosOriginal);

  public static List<String> listaCaracteresEspeciaisOriginal = List.of(
      "!","@","#","$","%","&","*","(",")","-","_","+","=",
      "{","}","[","]",":",";","<",">","?",",",".","/"
  );

  public static List<String> listaCaracteresEspeciais = new ArrayList<>(listaCaracteresEspeciaisOriginal);

  public static String criandoSenha(){
    Collections.shuffle(listaLetraMinuscula);
    Collections.shuffle(listaLetrasMaiusculas);
    Collections.shuffle(listaNumeros);
    Collections.shuffle(listaCaracteresEspeciais);

    List<String> listaLetraMinusculaEmbaralhada = listaLetraMinuscula.subList(0,4);
    List<String> listaLetrasMaiusculasEmbaralhada = listaLetrasMaiusculas.subList(0,4);
    List<String> listaNumerosEmbaralhada = listaNumeros.subList(0,4);
    List<String> listaCaracteresEspeciaisEmbaralhada = listaCaracteresEspeciais.subList(0,4);

    String senha = "";

    for (int i=0; i<4; i++) {
      senha = senha + listaLetraMinusculaEmbaralhada.get(i);
      senha = senha + listaLetrasMaiusculasEmbaralhada.get(i);
      senha = senha + listaNumerosEmbaralhada.get(i);
      senha = senha + listaCaracteresEspeciaisEmbaralhada.get(i);
    }
    return senha;
  }
}