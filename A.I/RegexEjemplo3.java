
import java.util.regex.*;  
class RegexEjemplo3{  
  public static void main(String args[]){  
    String texto1 = "EsteEsPedro.esteEsMiEjemplo";
    // Pattern for delimiter
    String patternCadena = "Es";
    Pattern pattern1 = Pattern.compile(patternCadena, Pattern.CASE_INSENSITIVE);
    String[] misCadenas = pattern1.split(texto1);
    for(String temp1: misCadenas)
        System.out.println(temp1);
    System.out.println("Cantidad de cadenas: "+((misCadenas.length)-1));
  }
}