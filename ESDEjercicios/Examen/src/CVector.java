public class CVector {
    static CVector []v;

    public CVector(CVector v){
        this.v = new CVector[v.tam()];
        for (int i = 0; i < v.tam(); i++){
            this.v[i] = v;
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
    public CVector multiplicar() {
        for (int i = 0; i < v.tam(); i++) {
            v[i] = v[i] * i+1;
        }
        return this;
    }
}
