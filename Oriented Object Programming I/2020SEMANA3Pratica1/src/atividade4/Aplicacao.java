package atividade4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicacao {
	public static void main(String[] args) throws IOException {
		 String nome = null;
		 int idade = 0;
		 String endereco = null;
		 float altura = 0;
		 float peso = 0;
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Informe o nome: ");
				try {
					nome = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				System.out.println("Informe a idade: ");
				try {
					idade = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Informe o endereco: ");
				try {
					endereco = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Informe a altura: ");
				try {
					altura = Float.parseFloat(br.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Informe o peso: ");
				try {
					peso = Float.parseFloat(br.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
				
				Paciente p1 = new Paciente (nome, idade, endereco, altura, peso);
				System.out.println("Dados do paciente: " +p1.getNome() +" "+p1.getIdade() +" "+ p1.getEndereco() +" "+p1.getAltura()+" "+p1.getPeso());
				br.close();
				
	}
}
