
import java.util.regex.*;  
class RegexEjemplo2{  
   public static void main(String args[]){  
      
      String content1 = "Este es un tutorial!";
      String patternCadena = ".*tutoRiAl.*";
      Pattern pattern1 = Pattern.compile(patternCadena, Pattern.CASE_INSENSITIVE);
      Matcher matcher1 = pattern1.matcher(content1);
      boolean esMatched = matcher1.matches();
      System.out.println("Este matchea?" + esMatched);
   }
}  