/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cexamenrec;

/**
 *
 * @author antares
 */
public class CExaRecursividad {
    public static int examPascal(int n, int r){
        return n == 0 || n==r || n==1 || r==0 ? 1 : examPascal(n-1,r) + examPascal(n-1,r-1);
    }
}
