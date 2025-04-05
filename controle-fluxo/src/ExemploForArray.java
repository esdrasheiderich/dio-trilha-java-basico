public class ExemploForArray {
    public static void main(String[] args) {
        String familia[] = {"ESDRAS", "JOSI", "SAMUEL", "ANA JÚLIA"};

        for(int x = 0; x < familia.length; x++) {
            System.out.println("O nome no índice [" + x + "] é " + familia[x]);
        }
    }
}
