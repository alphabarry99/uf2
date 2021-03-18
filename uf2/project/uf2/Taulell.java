package project.uf2;

public class Taulell {

    private int files;
    private int columnes;
    private float[][] taulell;

    public Taulell(int f, int c) {
        this.files = f;
        this.columnes = c;
        this.taulell = new float[files][columnes];
    }

}
