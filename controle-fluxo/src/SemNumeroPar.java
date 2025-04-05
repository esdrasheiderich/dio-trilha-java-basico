public class SemNumeroPar {
    public static void main(String[] args) {
        int numeros = 100;

        for (int i = 0; i < numeros; i++) {
            int par = i % 2; 
            if ( par == 0)
                continue;
            
            System.out.println("O número impar do índice é: " + i);
            
        }
    }
    
}
