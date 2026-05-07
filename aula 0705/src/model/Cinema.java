package model;

public class Cinema {

    private int idCinema;
    private String nome;
    private String cidade;
    private String estado;
    private String endereco;
    private int capacidade;

    public Cinema() {
    }

    public Cinema(int idCinema, String nome, String cidade,
                  String estado, String endereco, int capacidade) {
        this.idCinema = idCinema;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.endereco = endereco;
        this.capacidade = capacidade;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}