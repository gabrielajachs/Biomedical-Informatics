package aulaParte1;

import java.awt.List;
import java.util.ArrayList;

public class ProgramaPrincipal5 {

	public static void main(String[] args) {
		ArrayList<Integer> Lista = new ArrayList<Integer>();
		Lista.add(1);
		Lista.add(2);
		Lista.add(3);
		
		int total = 0;
		for (Integer i : Lista) {
			total += i;
		}
		System.out.println("Total: "+total);
	}
}
