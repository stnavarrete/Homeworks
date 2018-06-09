
public class PruebaApp {
 
    public static void main(String[] args) {
 
        String cadena="Solo se que no se nada";
        System.out.println(cadena);
        // ejemplo1: devolvera false, ya que la cadena tiene mas caracteres
        System.out.println("cadena.matches('Solo'): "+cadena.matches("Solo"));
 
        // ejemplo2: devolvera true, siempre y cuando no cambiemos la cadena Solo
        System.out.println("cadena.matches('Solo.*'): "+cadena.matches("Solo.*"));
 
        // ejemplo3: devolvera true, siempre que uno de los caracteres se cumpla
        System.out.println("cadena.matches('.*[qnd].*')): "+cadena.matches(".*[qnd].*"));
 
        // ejemplo3: devolvera false, ya que ninguno de esos caracteres estan
        System.out.println("cadena.matches('.*[xyz].*'): "+cadena.matches(".*[xyz].*"));
 
        // ejemplo4: devolvera true, ya que le indicamos que no incluya esos caracteres
        System.out.println("cadena.matches('.*[^xyz].*') "+cadena.matches(".*[^xyz].*"));
 
        // ejemplo5: devolvera true, si quitamos los caracteres delante de ? del STring original seguira devolviendo true
        System.out.println("cadena.matches('So?lo se qu?e no se na?da'): "+cadena.matches("So?lo se qu?e no se na?da"));
 
        // ejemplo6: devolvera false, ya que tenemos una S mayuscula empieza en el String
        System.out.println("cadena.matches('[a-z].*'): "+cadena.matches("[a-z].*"));
 
        // ejemplo7: devolvera true, ya que tenemos una S mayuscula empieza en el String
        System.out.println("cadena.matches('[A-Z].*'): "+cadena.matches("[A-Z].*"));
 
        String cadena2="abc1234";
        System.out.println(cadena2);
        // ejemplo8: devolvera true, ya que minimo debe repetirse alguno de los caracteres al menos una vez
        System.out.println("cadena2.matches('[abc]+.*'): "+cadena2.matches("[abc]+.*"));
 
        // ejemplo9: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico 4 veces
        System.out.println("cadena2.matches('[abc]+\\d{4}') "+cadena2.matches("[abc]+\\d{4}"));
 
        // ejemplo10: devolvera true, ya que, ademas del ejemplo anterior, indicamos que debe repetirse un valor numerico entre 1 y 10 veces
        System.out.println("cadena2.matches('[abc]+\\d{1,10}'): "+cadena2.matches("[abc]+\\d{1,10}"));
 
    }
}

