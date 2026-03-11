package src.modelo;

public class Cliente extends Utilizador {

    private String nif;
    private String morada;
    private String telefone;
    private String sector;
    private String escalao;

    public Cliente(String aUsername, String aPassword, String aNome, String aEmail,
            String aNif, String aMorada, String aTelefone, String aSector, String aEscalao) {

        super(aUsername, aPassword, aNome, aEmail);
        nif = aNif;
        morada = aMorada;
        telefone = aTelefone;
        sector = aSector;
        escalao = aEscalao;
    }

    public String getNif() {
        return nif;
    }

    public String getMorada() {
        return morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSector() {
        return sector;
    }

    public String getEscalao() {
        return escalao;
    }

    public void setMorada(String m) {
        morada = m;
    }

    public void setTelefone(String t) {
        telefone = t;
    }
}