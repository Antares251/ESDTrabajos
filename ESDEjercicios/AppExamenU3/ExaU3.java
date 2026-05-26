public class ExaU3 {
    N ultimo;

    public ExaU3() {
        ultimo = null;
    }

    public void m1(int v) {
        N nuevo = new N(v, ultimo);
        ultimo = nuevo;
    }

    public int m2() {
        N naux;
        int val;
        if (ultimo == null) {
            return -1;
        }
        naux = ultimo;
        ultimo = naux.sig;
        val = naux.valor;
        return val;
    }
}
