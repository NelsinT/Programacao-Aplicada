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
}
