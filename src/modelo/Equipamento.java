package src.modelo;

import java.time.*;

public class Equipamento {
    private String marca;
    private String modelo;
    private int codigoSku;
    private LocalDateTime dataFabrico;
    private String lote;
    private LocalDate dataSubmissaoPedido;
    private LocalDate dataReparacao;

    public Equipamento(String aMarca, String aModelo, int aCodigoSku, LocalDateTime aDataFabrico, String aLote, LocalDate aDataSubmissaoPedido, LocalDate aDataReparacao) {
        marca = aMarca;
        modelo = aModelo;
        codigoSku = aCodigoSku;
        dataFabrico = aDataFabrico;
        lote = aLote;
        dataSubmissaoPedido = aDataSubmissaoPedido;
        dataReparacao = aDataReparacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCodigoSku() {
        return codigoSku;
    }

    public LocalDateTime getDataFabrico() {
        return dataFabrico;
    }

    public String getLote() {
        return lote;
    }

    public LocalDate getDataSubmissaoPedido() {
        return dataSubmissaoPedido;
    }

    public LocalDate getDataReparacao() {
        return dataReparacao;
    }

}
