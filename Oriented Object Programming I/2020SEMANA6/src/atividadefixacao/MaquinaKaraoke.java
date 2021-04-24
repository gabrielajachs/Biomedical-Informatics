package atividadefixacao;

import java.util.LinkedList;

public class MaquinaKaraoke {
	
	/*Exercicio 6) Escreva uma classe MaquinaDeKaraoke que encapsule o comportamento básico simulado de uma
	máquina de karaoke. Instâncias desta classe devem representar uma fila de músicas que serão tocadas
	na ordem que foram entradas na máquina (a primeira música a ser tocada deverá ter sido a primeira a
	ser entrada na fila). Músicas podem ser representadas pelos seus títulos, como strings. Escreva para
	esta classe métodos que permitem a adição de uma música na fila, listam a fila de músicas (na ordem
	que devem ser tocadas) e que simulem a execução de uma música (removendo-a do início da fila).
	Realize as operações utilizando a classe LinkedList.*/
	
	LinkedList<String> listamusica;
	
	public MaquinaKaraoke()
	{
		listamusica = new LinkedList<String>();
	}
	
	public void adiciona(String umamusica)
	{
		listamusica.addLast(umamusica);
	}
	
	public boolean remove(String umamusica)
	{
		return listamusica.remove(umamusica);
	}
	
	public void remove()
	{
		listamusica.removeFirst();
	}
	
	public int procura(String umamusica)
	{
		int indice = listamusica.indexOf(umamusica);
		if(indice == -1)
			return -1;
		else
			return indice+1;
	}
	
	public String toString()
	{
		StringBuffer lista= new StringBuffer(listamusica.size()*40);
		
		for (int i = 0; i < listamusica.size(); i++) {
			
			String musica= listamusica.get(i);
			lista.append((i+1)+ ": "+musica);
			lista.append("\n");
		}
		
		return lista.toString();
	}
	
	public static void main(String[] args) {
		
		MaquinaKaraoke maquina= new MaquinaKaraoke();
		
		maquina.adiciona("Musica 1");
		maquina.adiciona("Musica 2");
		maquina.adiciona("Musica 3");
		
		maquina.remove();
		
		System.out.println(maquina);
	}

}


