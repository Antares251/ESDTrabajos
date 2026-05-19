/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsenos;

/**
 *
 * @author antares
 */
public class CVector {
     double [] vec;

    public CVector (){
        vec = new double[5];
    }

    public CVector(int n){
        vec = new double[n];
    }
    public CVector(CVector v){
        this.vec = new double[v.tam()];
        for (int i=0; i<this.tam();i++){
            this.vec[i] = v.leer(i);
        }
    }
    int tam(){
        return vec.length;
    }

    public void asignar(int val, int pos){
        if(pos >= 0 && pos < vec.length) {
            vec[pos]=val;
        }
    }

    public double leer(int pos){
        if (pos >= 0 && pos < vec.length){
            return vec[pos];
        }
        return -1;
    }

    public float promedio(){
        if(vec.length == 0)return 0;

        double prom =0;
        for (int i=0; i < this.vec.length; i++){
            prom += vec[i];
        }
        return (float)(prom/vec.length);
    }

}
