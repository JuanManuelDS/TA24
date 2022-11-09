package main.utils;

public enum Trabajos {
	
	SOFTWAREARCHITECT ("Software Architect", 125000),
	JAVADEVJR ("Java Dev Jr", 21000),
	JAVADEVSR ("Java Dev Sr", 47000);
	
	private final String trabajo;
	private final int salario;
	
	Trabajos(String trabajo, int salario){
		this.trabajo = trabajo;
		this.salario = salario;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public int getSalario() {
		return salario;
	}

	
}
