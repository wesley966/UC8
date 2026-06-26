package Modelo;


/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class Produto {

    private int ID;
    private String descricao;
    private double valor;
    private int quantidade;

    public Produto(){
    }
    

    public Produto(int id, String descricao, double valor, int quantidade) {
        this.ID = id;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

 
}

