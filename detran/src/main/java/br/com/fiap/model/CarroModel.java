package br.com.fiap.model;

public class CarroModel {
	private int id;
	private String placa;
	private String modelo;
	private int ano;
	
	
	public CarroModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarroModel(int id, String placa, String modelo, int ano) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return ""+ modelo + " - " + placa + " - " + ano+"";
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

}
