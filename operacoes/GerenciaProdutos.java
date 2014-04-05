package br.unb.cic.projeto.operacoes;

import java.util.ArrayList;

import br.unb.cic.projeto.dominio.Produto;

public class GerenciaProdutos extends Produto{

	public GerenciaProdutos(int codigo, double preco, String descricao,int quantidade) {
		super(codigo, preco, descricao, quantidade);
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Produto> Lista = new ArrayList<Produto>();
	
	public void InserirProduto(int codigo, double preco, String descricao,int quantidade){
		Produto p1 = new Produto (codigo,preco,descricao,quantidade);
		Lista.add(p1);
			//System.out.println(Lista.size());
			
	}
	
	
}
