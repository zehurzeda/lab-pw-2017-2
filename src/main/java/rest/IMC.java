package rest;

public class IMC {

	private double peso;
	
	private double altura;
	
	private char sexo;
	
	private String resultado;
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public IMC() {
	}

	public IMC(int peso, int altura, char sexo) {
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	public void calcular() {
		double calculo = this.peso/(Math.pow(this.altura, 2));
		
		if(sexo == 'F') {
			resultado = imcFeminino(calculo);
		}else if(sexo == 'M') {
			resultado = imcMasculino(calculo);
		}
		
	}
	
	private String imcFeminino(double calculo) {
		String mensagem = new String();
		if(calculo < 19.1) {
			mensagem = "abaixo do peso";
		}else if(calculo > 19.1 && calculo <= 25.8) {
			mensagem = "no peso normal";
		}else if(calculo > 25.8 && calculo <= 27.3) {
			mensagem = "marginalmente acima do peso";
		}else if(calculo > 27.3 && calculo <= 32.3) {
			mensagem = "acima do peso ideal";
		}else if(calculo > 32.3) {
			mensagem = "obeso";
		}
		return mensagem;
	}
	
	private String imcMasculino(double calculo) {
		String mensagem = new String();
		if(calculo < 20.7) {
			mensagem = "abaixo do peso";
		}else if(calculo > 20.7 && calculo <= 26.4) {
			mensagem = "no peso normal";
		}else if(calculo > 26.4 && calculo <= 27.8) {
			mensagem = "marginalmente acima do peso";
		}else if(calculo > 27.8 && calculo <= 31.1) {
			mensagem = "acima do peso ideal";
		}else if(calculo > 31.1) {
			mensagem = "obeso";
		}
		return mensagem;
	}

}
