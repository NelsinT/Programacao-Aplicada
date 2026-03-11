package src.modelo;

import java.time.*;

public class LogAccao {
    private String accao;
    private LocalDate data;
    private LocalTime hora;
    private Utilizador utilizador;

    public LogAccao(String aAccao, LocalDate aData, LocalTime aHora, Utilizador aUtilizador) {
        accao = aAccao;
        data = aData;
        hora = aHora;
        utilizador = aUtilizador;
    }

    public String getAccao() {
        return accao;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}
