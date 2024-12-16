public class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para retornar os dados como uma string
    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }
}