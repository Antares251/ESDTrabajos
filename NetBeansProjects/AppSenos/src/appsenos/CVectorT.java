/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appsenos;

/**
 *
 * @author antares
 */
public class CVectorT <T>{
      Object [] vec;

    public CVectorT (){
        vec = new Object[5];
    }

    public CVectorT(int n){
        vec = new Object[n];
    }
    public CVectorT(CVectorT v){
        this.vec = new Object[v.tam()];
        for (int i=0; i<this.tam();i++){
            this.vec[i] = v.leer(i);
        }
    }
    int tam(){
        return vec.length;
    }

    public void asignar(T val, int pos){
        if(pos >= 0 && pos < vec.length) {
            vec[pos]=val;
        }
    }

    public T leer(int pos){
        if (pos >= 0 && pos < vec.length){
            return (T)vec[pos];
        }
        Object val = -1;
        return (T)val;
    }

    public double promedio(){
        if(vec.length == 0)return 0;

        double prom =0;
        for (int i=0; i < this.vec.length; i++){
            prom += (double)vec[i];
        }
        return (float)(prom/vec.length);
    }

    public Object[] getVec() {
        return vec;
    }

    public void setVec(Object[] vec) {
        this.vec = vec;
    }
    
    
}
