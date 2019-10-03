package Granja;

import java.util.ArrayList;

public class Establecimiento extends ElemGranja {
	
	ArrayList<ElemGranja> lista;
	public Establecimiento() {
		this.lista=new ArrayList<ElemGranja>();
	}
	
	public void add(ElemGranja e) {
		this.lista.add(e);
	}
	
	public int getCantidad() {
		int cont=0;
		for(int i=0;i<lista.size();i++) {
			cont+=lista.get(i).getCantidad();
		}
		
		return cont;
	}
	
	public double getPromedio() {
		int cantidad=this.getCantidad();
		int cont=0;
		for(int i=0;i<lista.size();i++) {
			cont+=lista.get(i).getPromedio();
		}
		
		return cont/cantidad;
	}

	@Override
	public double getPromedioPeso() {
		int cantidad=this.getCantidad();
		double cont=this.getPeso();
		
		return cont/cantidad;
	}

	@Override
	public double getPeso() {
		int cont=0;
		for(int i=0;i<lista.size();i++) {
			cont+=lista.get(i).getPeso();
		}
		return cont;
	}

	@Override
	public boolean sePuedeVender(Condicion c) {
		// TODO Auto-generated method stub
		return false;
	}

}
