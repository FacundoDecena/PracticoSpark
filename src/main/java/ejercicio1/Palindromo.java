package ejercicio1;

public class Palindromo {
    public boolean isPalindromo(String a){
        String reverseA = "";
        for (int i = a.length()-1; i >= 0 ; i--){
            reverseA = reverseA + a.charAt(i);
        }
        return a.equals(reverseA);
    }
}
