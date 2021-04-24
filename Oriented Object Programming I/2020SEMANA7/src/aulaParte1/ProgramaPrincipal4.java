package aulaParte1;

import java.awt.List;
import java.util.ArrayList;

public class ProgramaPrincipal4 {

	public static void main(String[] args) {
		java.util.List Lista = new ArrayList();
		Lista.add(1);
		Lista.add(2);
		Lista.add(3);
		
		int total = 0;
		for (int i = 0; i < Lista.size(); i++) {
			total += (int) Lista.get(i);
		}
		System.out.println("Total: "+total);
	}
}
