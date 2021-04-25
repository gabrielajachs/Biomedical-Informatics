package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.LivroDAO;
import modelo.Livro;
import visao.JanelaPrincipal;

public class LivroControle implements ActionListener {
	
	private JanelaPrincipal jan;
	private Livro li;
	private LivroDAO ldao;
	
	public LivroControle(JanelaPrincipal j, Livro l) {
		
		this.jan = j;
		this.li = l;
		this.jan.getBtnCadastrar().addActionListener(this);
		this.jan.getBtnConsultar().addActionListener(this);
		ldao = new LivroDAO();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Cadastrar")) {
			
			String isnbAux = this.jan.getFieldISBN().getText();
			String tituloAux = this.jan.getFieldTitulo().getText();
			String autorAux = this.jan.getFieldAutor().getText();
			
			li = new Livro(isnbAux, tituloAux, autorAux);
			ldao.cadastraLivro(li);
			this.jan.limparTela();
			
		}else if (e.getActionCommand().equals("Consultar")) {
			
			String isbnAux = this.jan.getFieldISBN().getText();
			
			li = new Livro(isbnAux, null, null);
			boolean flag = ldao.consultaLivro(li);
			
			if (flag) {
				this.jan.getFieldTitulo().setText(li.getTitulo());
				this.jan.getFieldAutor().setText(li.getAutor());
			}else {
				System.out.println("livro não encontrado");
			}
			
		}
		
		
	}

}
