package Generadores;

public class GeneradorCongruencialMltiplicativo {
    int repeticiones, a, semilla, m;
    public GeneradorCongruencialMltiplicativo(int repeticiones, int a,int semilla, int m){
        this.repeticiones= repeticiones;
        this.a= a;
        this.semilla= semilla;
        this.m=m;
    }
    public void generarTabla(){
 	   System.out.println("Generador Multiplicativo --------------------------------------------------------------------------------------------------------------------------");
        for (int i=0; i < repeticiones; i++){
            int multi = a* semilla;
            int modulo = multi% m;
            System.out.println( i+"   |   "       + semilla +"   |   " + multi +"   |   "+ modulo );
            semilla =  modulo;
        }

    }
   
}