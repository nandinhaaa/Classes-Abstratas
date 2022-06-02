package view;

import model.Comissionado;
import model.Horista;

public class Main {

	public static void main(String[] args) {
		Comissionado comissionado = new Comissionado("Nanda ", "99...",5000, 50, 100);
		
		Horista horista = new Horista("Deyvison", "88..."); 
		horista.setValorHora(80);
		horista.setTotalHoras(200);
		
		System.out.println("Salário Comissionado");
		System.out.println(comissionado.getNome() + comissionado.salario());
		
		System.out.println("Salario Horista");
		System.out.println(horista.getNome() + " " + horista.salario()); 
	}
	

}
