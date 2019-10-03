package Granja;

public class Condicion_Peso extends Condicion{

	double peso;
	
	public Condicion_Peso(double peso) {
		this.peso=peso;
		
	}
	@Override
	public boolean cumple(Animal a) {
		// TODO Auto-generated method stub
		return a.getPeso()>this.peso;
	}

}
