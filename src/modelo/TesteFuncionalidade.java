package src.modelo;

import java.time.*;

public class TesteFuncionalidade {
    private String designacao;
    private String descricao;
    private LocalDate data;

    public TesteFuncionalidade(String aDesignacao, String aDescricao, LocalDate aData) {
        designacao = aDesignacao;
        descricao = aDescricao;
        data = aData;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }
}
