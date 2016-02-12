package br.com.projetorh.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioView {
	
	private String genero;
	private List<String> generos;  
	
	public void init(){
		generos = new ArrayList<String>();
		generos.add("Masculino");
		generos.add("Feminino");
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	
	
	
}





