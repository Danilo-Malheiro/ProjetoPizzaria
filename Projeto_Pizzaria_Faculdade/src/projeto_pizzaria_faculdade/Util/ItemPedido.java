package projeto_pizzaria_faculdade.Util;

public abstract class ItemPedido {
	
    private String nome;
    private double preco;
	
public ItemPedido() {}
	
public ItemPedido(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

}
