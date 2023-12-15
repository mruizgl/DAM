package ies.puerto;

public class domino {
    public static void main(String[] args) {
        String [] [] domino = new String[7][7];
        for (int i = 0; i < domino.length; i++) {
            for (int j = i; j < domino[0].length; j++) {
                domino[i][j] = i + ":" + j;
            }
        }
        for (int i = 0; i < domino.length; i++) {
            for (int j = 0; j < domino[0].length; j++) {
                System.out.print(domino[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
