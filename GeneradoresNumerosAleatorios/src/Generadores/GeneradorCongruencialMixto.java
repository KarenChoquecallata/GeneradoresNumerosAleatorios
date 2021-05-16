package Generadores;

public class GeneradorCongruencialMixto{
    int repeticiones, semilla,a,c,m;



    public GeneradorCongruencialMixto(int repeticiones,int semilla,int a,int c,int m){
       this.repeticiones= repeticiones;
       this.semilla= semilla;
       this.a=a;
       this.c=c;
       this.m=m;
   }
   public void generarTabla(){
	   System.out.println("Generador Mixto --------------------------------------------------------------------------------------------------------------------------");
       System.out.println(" n   |   xn      |    axn  |   axn+c  |    xn+1     |   u=xn+1/m ");
       for(int i=1; i < repeticiones;i++){
           int x0= semilla;
           int suma = (a*semilla)+c;
           int modulo = suma % m;
           System.out.println(  i  +"     |     "+ semilla+"     |  "+a*semilla +"    |  "+suma+"      |      " +modulo+"     |      "+ "u="+(double)modulo/m );
           semilla = modulo;
       }
   }
   public void generarOperaciones(){
       for(int i=1; i < repeticiones;i++){
           int x0= semilla;
           int suma = (a*semilla)+c;
           int modulo = suma % m;
           System.out.println("x"+i+"=("+suma+")"+"mod"+m+"="+modulo);
           semilla = modulo;
       }

   }
   public void verificarPropiedades() {
	   int arrayPrimos[]=new int[10];
	   arrayPrimos[0] = 2;
	   arrayPrimos[1] = 3;
	   arrayPrimos[2] = 5;
	   arrayPrimos[3] = 7;
	   arrayPrimos[4] = 11;
	   arrayPrimos[5] = 13;
	   arrayPrimos[6] = 17;
	   arrayPrimos[7] = 19;
	   
	   //verificando propiedad 1
	   int primos=0;
	   int noprimos =0;
	  for(int i = 0 ; i< 10; i++) {
	   if(c % arrayPrimos[i]==0 && m % arrayPrimos[i]==0) {
		   noprimos ++;
	    }else {
	    	primos++;
	    }
	  }
	  if(primos==0 && noprimos>0) {
		   System.out.println("No son primos entre si");
	    }else {
	    	 System.out.println("Son primos entre si");
	    }
	 //propiedad 2
	  
	  for(int i=0;i<10;i++) {
		  if(m % arrayPrimos[i]==0 && (a-1)% arrayPrimos[i]==0) {
			  System.out.println("Exite un primo que divide a ambos es: "+ arrayPrimos[i]);
		    }
	  }
	//pripiedad 3
	  if(m%4 ==0 && (a-1)%4==0) {
		  System.out.println("Culple la propiedad 3, m y a-1 son multiplos de 4");
	  }else {
		  System.out.println("No Culple la propiedad 3");
	  }
   }
}
