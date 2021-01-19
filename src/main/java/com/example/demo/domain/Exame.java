package com.example.demo.domain;

public class Exame {
	private String paciente;
	private String procedimento;
	private String dataColeta;
	private String dataResultado;

	public Exame() {

	}

	public Exame(String paciente, String procedimento, String dataColeta, String dataResultado) {
		super();
		this.paciente = paciente;
		this.procedimento = procedimento;
		this.dataColeta = dataColeta;
		this.dataResultado = dataResultado;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getDataColeta() {
		return dataColeta;
	}

	public void setDataColeta(String dataColeta) {
		this.dataColeta = dataColeta;
	}

	public String getDataResultado() {
		return dataResultado;
	}

	public void setDataResultado(String dataResultado) {
		this.dataResultado = dataResultado;
	}

}
