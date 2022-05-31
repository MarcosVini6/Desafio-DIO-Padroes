package br.com.livraria.models;

public class Cliente {

    public Cliente(String nome, String telefone, String email, String cpf) throws Exception {
        this.nome = nome;
        this.telefone = telefone;
        setEmail(email);
        this.cpf = cpf;
    }

    String nome;
    String telefone;
    String email;
    String cpf;

    public void setEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("Email inválido");
        }
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "nome: " + nome + " cpf: " + cpf;

    }

}
