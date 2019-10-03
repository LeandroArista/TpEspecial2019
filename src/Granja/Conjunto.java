package Granja;

import java.util.ArrayList;

public class Conjunto extends ElemGranja {
	
	ArrayList<ElemGranja> animales;
	public Conjunto() {
		this.animales=new ArrayList<ElemGranja>();
	}
	
	public void add(ElemGranja e) {
		this.animales.add(e);
	}
	
	public int getCantidad() {
		int cont=0;
		for(int i=0;i<animales.size();i++) {
			cont+=animales.get(i).getCantidad();
		}
		
		return cont;
	}

	@Override
	public double getPromedio() {
		int cantidad=this.getCantidad();
		int cont=0;
		for(int i=0;i<animales.size();i++) {
			cont+=animales.get(i).getPromedio();
		}
		
		return cont/cantidad;
	}

	@Override
	public double getPromedioPeso() {
		int cantidad=this.getCantidad();
		double cont=this.getPeso();
		
		
		return cont/cantidad;
	}
	
	public double getPeso() {
		int cont=0;
		for(int i=0;i<animales.size();i++) {
			cont+=animales.get(i).getPeso();
		}
		return cont;
		
	}

	@Override
	public boolean sePuedeVender(Condicion c) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	

}
