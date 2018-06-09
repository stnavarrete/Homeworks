import java.util.regex.*;
 public class Ejemplo { 
     public static void main(String[] args) {
         String expresionRegular = "[abc].*"; 
         String cadenaAEvaluar = "alfombra"; 
        
         boolean b = Pattern.matches(expresionRegular,cadenaAEvaluar); 
         
         if(b){ System.out.println("La expresion SI representa la cadena a evaluar"); 
            }
         else{ 
             System.out.println("La expresion NO representa la cadena a evaluar"); 
         } 
     } 
 } 