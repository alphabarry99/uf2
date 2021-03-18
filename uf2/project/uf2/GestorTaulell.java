package project.uf2;

import java.util.Random;

public class GestorTaulell {

    Taulell t;

    public GestorTaulell(int f, int c) {
      t = new Taulell(f,c);
    }

    public void carregarDades(float[][] t){
            int[][] matriuNumeros = new int[5][5];
            inicialitzar(matriuNumeros);
            visualitzar(matriuNumeros);
        }

        private static void visualitzar(int[][] matriu) {
            for(int i=0;i<matriu.length;i++){
                for(int j=0;j<matriu[i].length;j++){
                    System.out.print(matriu[i][j] + "\t");
                }
                System.out.println();
            }
        }

        private static void inicialitzar(int[][] matriu) {
            Random r = new Random();
            for(int i=0;i<matriu.length;i++){
                for(int j=0;j<matriu[i].length;j++){
                    matriu[i][j] = r.nextInt(25) + 1;
                }
            }
        }

    public void introduirMalalts(float[][] t){

    }


}
