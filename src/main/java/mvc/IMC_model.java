package mvc;

public class IMC_model {
	private double altura;
	private double peso;
	private String sexo;
	
	public IMC_model(double altura, double peso, String sexo){
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	public String resultado_imc(){
		double imc = peso/(altura*altura);
		String resultado = "";
		if(sexo == "Masculino"){
	          if(imc < 20.7){
	         return  resultado = "Abaixo do peso";
	          }
	          else if(imc >= 20.7 && imc <=26.4){
	         return resultado = "Peso normal";
	          }
	          else if (imc >= 26.4 && imc <=27.8){
	         return resultado = "Marginalmente acima do peso";
	          }
	          else if(imc >= 27.8 && imc <=31.1){
	         return resultado = "Acima do peso";
	          }
	          else{
	         return resultado = "Obeso";
	          }
	    }
		if(sexo == "Feminino"){
	          if(imc < 19.1){
	         return resultado = "Abaixo do peso";
	          }
	          else if(imc >= 19.1 && imc <=25.8){
	         return resultado = "Peso normal";
	         
	          }
	          else if (imc >= 25.8 && imc <=27.3){
	         return resultado = "Marginalmente acima do peso";
	          }
	          else if(imc >= 27.3 && imc <=32.3){
	         return resultado = "Acima do peso";
	          }
	          else{
	         return resultado = "Obesa";
	          }
	    }
		return resultado;
	}
}

