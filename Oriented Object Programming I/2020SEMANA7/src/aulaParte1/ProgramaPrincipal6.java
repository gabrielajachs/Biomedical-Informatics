package aulaParte1;

public class ProgramaPrincipal6<E> implements Cont<E>{
	
	private E e;
	
	public E get() {
		return e;
	}
	
	public void Set(E e) {
		this.e = e;
	}

	public static void main(String[] args) {
		ProgramaPrincipal6<Integer> c = new ProgramaPrincipal6<Integer>();
		c.Set(2);
		System.out.println(c.get());
		
	}
}
