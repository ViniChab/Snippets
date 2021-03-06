package br.com.bytebank.Cliente;

public class Cliente {

	private String nome;
	private Double rendaMensal;
	private String emprego;
	private String enderešo;
	
	public Cliente(String nome, Double rendaMensal, String emprego, String enderešo) 
	{
		this.nome = nome;
		this.rendaMensal = rendaMensal;
		this.emprego = emprego;
		this.enderešo = enderešo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public String getEmprego() {
		return emprego;
	}
	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
}
