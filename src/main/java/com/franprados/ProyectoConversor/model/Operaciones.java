package com.franprados.ProyectoConversor.model;

public class Operaciones {

	private double valor;
	private double resultado;
	private String tm;
	private String tmd;
	
	public Operaciones() {}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getResultado() {
		return resultado;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public String getTm() {
		return tm;
	}
	
	public void setTm(String tm) {
		this.tm = tm;
	}
	
	public String getTmd() {
		return tmd;
	}
	
	public void setTmd(String tmd) {
		this.tmd = tmd;
	}
	
	public double convertir() {
		if (tm == "Euro" && tmd == "Dólar") {
			resultado = valor * 1.08;
			
		}else if (tm == "Euro" && tmd == "Rublo") {
			resultado = valor * 87.50;
			
		}else if (tm == "Boliviano" && tmd == "Dólar") {
			resultado = valor * 0.14;
			
		}else if (tm == "Boliviano" && tmd == "Rublo") {
			resultado = valor * 11.68;
			
		}
		return resultado;
	}
}
