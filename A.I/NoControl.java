import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoControl {

    static Scanner sc = new Scanner(System.in);
    static Pattern ER = Pattern.compile("1539[0-9]{4}");

    public static void main(String[]args){

        String numero;
        int continuar = 0;
        boolean error;

        System.out.println("Introducir Nombre");
        String nombre = sc.nextLine();

        do{

            System.out.println("Introducir Numero de Control");
            String noControl = sc.nextLine();
            Matcher m = ER.matcher(noControl);
            if(m.matches()){
                System.out.println("Introducir Numero a reemplazar");
                String Remplazar = sc.nextLine();
                Pattern p = Pattern.compile(Remplazar);
                Matcher e = p.matcher(noControl);
                String last = e.replaceAll("-");
                System.out.println("Resultado: "+last);
                String[] rCadena = p.split(noControl);
                for (String t1: rCadena){}

                if (rCadena.length != 1){
                    System.out.println("Fueron reemplazados "+(rCadena.length-1)+" digitos");
                } else{
                    System.out.println("Fueron reemplazados "+(rCadena.length)+" digitos");
                }

                do {

                    System.out.println("Continuar? S = 0  N = Cualquier otro numero");
                    numero = sc.nextLine();
                    error = validaEntero(numero);

                }while(!error);

                continuar = Integer.parseInt(numero);

            } else{
                System.out.println("Numero de Control inválido");
                continuar = 0;
            }
        }while(continuar==0);
    }

    public static boolean validaEntero(String str) {

        try {

            int i = Integer.parseInt(str);

        }
        catch (NumberFormatException nfe) {

            System.out.println("El elemento ingresado no es entero");

            return false;

        }

        return true;

    }

}