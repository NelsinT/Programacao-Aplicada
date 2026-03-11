package src.modelo;

import java.time.*;
import java.util.List;
import java.util.Map;

public class Reparacao {
    private String numeroReparacao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataFimReparacao;
    private long tempoDecorrido;
    private double custo;
    private int estado;
    private String observacoes;
    private List<TesteOperacionalidade> testes;
    private Map<Peca, Integer> pecasUtilizadas;

    public Reparacao(String aNumeroReparacao, LocalDateTime aDataCriacao, LocalDateTime aDataFimReparacao, long aTempoDecorrido, double aCusto, int aEstado, String aObservacoes, List<TesteOperacionalidade> aTestes, Map<Peca, Integer> aPecasUtilizadas) {
        numeroReparacao = aNumeroReparacao;
        dataCriacao = aDataCriacao;
        dataFimReparacao = aDataFimReparacao;
        tempoDecorrido = aTempoDecorrido;
        custo = aCusto;
        estado = aEstado;
        observacoes = aObservacoes;
        testes = aTestes;
        pecasUtilizadas = aPecasUtilizadas;
    }

    public String getNumeroReparacao() {
        return numeroReparacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataFimReparacao() {
        return dataFimReparacao;
    }

    public long getTempoDecorrido() {
        return tempoDecorrido;
    }

    public double getCusto() {
        return custo;
    }

    public int getEstado() {
        return estado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public List<TesteOperacionalidade> getTestes() {
        return testes;
    }

    public Map<Peca, Integer> getPecasUtilizadas() {
        return pecasUtilizadas;
    }

}
