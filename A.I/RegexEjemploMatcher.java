
import java.util.regex.*;  
class RegexEjemploMatcher{  
public static void main(String args[]){  
  String contenido = "ZZZ JJ PP JJ QQQ JJJ ZZ";

  String cadena = "JJ";
  Pattern pattern1 = Pattern.compile(cadena);
  Matcher matcher1 = pattern1.matcher(contenido);

  while(matcher1.find()) {
     System.out.println("Encontrado en: "+ matcher1.start()
      + 
      " - " + matcher1.end());
  }
}
}