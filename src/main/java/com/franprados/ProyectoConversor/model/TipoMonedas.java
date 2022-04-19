package com.franprados.ProyectoConversor.model;

public enum TipoMonedas {
	
	EURO("Euro"),
	DOLAR("Dólar"),
	RUBLO("Rublo"),
	BOLIVIANO("Boliviano");
	
	private String type;
	private double valor;

    private TipoMonedas(String type) {
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    public double getValor() {
        return valor;
    }
}