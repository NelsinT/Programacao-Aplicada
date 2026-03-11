package src;

import src.modelo.Utilizador;

public class Main {
    public static void main() {
        Utilizador u = new Utilizador("John Doe", "johndoe", "password123", "johndoe@example.com");
        System.out.println("Bem-vindo " + u.getNome());
        System.out.println("Adeus, " + u.getNome());
    }
}
