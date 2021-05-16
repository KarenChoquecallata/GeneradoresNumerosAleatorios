package Generadores;

public class MainClass {

	public static void main(String[] args) {
		 GeneradorCongruencialMixto g = new GeneradorCongruencialMixto(50,8,9,13,32);
         g.generarTabla();
         g.verificarPropiedades();
	      
	     GeneradorCongruencialMltiplicativo mul= new GeneradorCongruencialMltiplicativo(500,221,3,1000);
	      mul.generarTabla();

	}

}
