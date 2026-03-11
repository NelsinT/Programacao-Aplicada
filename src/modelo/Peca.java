package src.modelo;

public class Peca {
    private int codigoInterno;
    private String designacao;
    private String fabricante;
    private int quantidade;

    public Peca(int aCodigoInterno, String aDesignacao, String aFabricante, int aQuantidade) {
        codigoInterno = aCodigoInterno;
        designacao = aDesignacao;
        fabricante = aFabricante;
        quantidade = aQuantidade;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
