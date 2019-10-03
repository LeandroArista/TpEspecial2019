package Granja;

import java.time.LocalDate;


public class Animal extends ElemGranja{
	int id;
	LocalDate edad;
	double peso;
	String raza;
	String sexo;
	boolean capado;
	int terneros;
	
	public Animal(int id, LocalDate edad, String raza, double peso, String sexo, boolean capado) {
		this.id=id;
		this.edad=edad;
		this.peso=peso;
		this.raza=raza;
		this.sexo=sexo;
		this.capado=capado;
		this.terneros=0;
	}
	
	public int getCantidad() {
		return 1;
	}
	
	public String toString() {
		return "id: "+id+" edad: "+edad+" peso: "+peso+" raza: "+raza+" sexo: "+sexo+" capado: "+capado+" cantidad terneros: "+terneros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		return this.edad.getMonthValue()+(this.edad.getYear()-hoy.getYear())*12;
	}

	public void setEdad(LocalDate edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isCapado() {
		return capado;
	}

	public void setCapado(boolean capado) {
		this.capado = capado;
	}

	public int getTerneros() {
		return terneros;
	}

	public void setTerneros(int terneros) {
		this.terneros = terneros;
	}

	@Override
	public double getPromedio() {
		// TODO Auto-generated method stub
		
		return this.getEdad();
	}

	@Override
	public double getPromedioPeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	@Override
	public boolean sePuedeVender(Condicion c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
