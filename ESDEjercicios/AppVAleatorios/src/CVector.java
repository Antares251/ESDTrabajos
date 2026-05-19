public class CVector {
     static int[] v;

    public CVector(CVector v){
        this.v = new int[v.tam()];
        //for (int i = 0; i < this.v.length; i++)
        for (int i = 0; i < v.tam(); i++){
            this.v[i] = v.leer(i);
        }
    }


    int tam (){
        return v.length;
    }

    public void asig (int val,int pos){
        if (pos >= 0 && pos < v.length)
            v[pos] = val;
    }

    public int leer (int pos){
        if (pos >= 0 && pos < v.length)
            return v[pos];
        return -1;
    }
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < this.v.length; i++) {
            suma += v[i];
        }
        return suma / v.length;
    }

    public CVector invertir1(){
        CVector vecAux = new CVector(this);
        for (int izq = 0, der = vecAux.tam() - 1; izq < vecAux.tam() / 2; izq++, der--){
            int aux = vecAux.leer(izq);
            vecAux.asig(vecAux.leer(der),izq);
            vecAux.asig(aux,der);
        }
        return vecAux;
    }

    public static void tablaDeMultiplicar(CVector vec, int n){
        for (int i = 1; i <= 10; i++){
            vec.asig(i*n,i-1);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(n + " x " + (i+1) + " = " + vec.leer(i));
        }

    }


}
