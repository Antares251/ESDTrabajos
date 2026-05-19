public class TablaMulti {
    public static void main(String[] args) {
        CVector vector = new CVector(9);
        for (int i = 0; i < 10; i++) {
            vector.asig(i+1, i);
        }

        vector.multiplicar();

        for (int i = 0; i < vector.tam(); i++) {
            System.out.println("Posición " + i + ": " + vector.leer(i));
        }
    }
}
