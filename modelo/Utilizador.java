package modelo;

public class Utilizador {
    private String nome;
    private String username;
    private String password;
    private String email;
    private boolean ativo;

    public Utilizador(String aNome, String aUsername, String aPassword, String aEmail) {

        nome = aNome;
        username = aUsername;
        password = aPassword;
        email = aEmail;
        ativo = true;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setPassword(String aPassword) {
        password = aPassword;
    }

    public void setNome(String aNome) {
        nome = aNome;
    }

    public void setEmail(String aEmail) {
        email = aEmail;
    }

    public void setActivo(boolean aAtivo) {
        ativo = aAtivo;
    }
}
