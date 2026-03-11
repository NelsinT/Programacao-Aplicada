package src.modelo;

public class Funcionario extends Utilizador {

    private String nif;
    private String morada;
    private String telefone;
    private String especializacao;
    private String dataInicio;

    public Funcionario(String aUsername, String aPassword, String aNome, String aEmail,
            String aNif, String aMorada, String aTelefone, String aEspecializacao, String aDataInicio) {

        super(aUsername, aPassword, aNome, aEmail);
        nif = aNif;
        morada = aMorada;
        telefone = aTelefone;
        especializacao = aEspecializacao;
        dataInicio = aDataInicio;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setMorada(String m) {
        morada = m;
    }

    public void setTelefone(String t) {
        telefone = t;
    }
}