package model;

public class Filme {

    private int idFilme;
    private String titulo;
    private int duracao;
    private String genero;
    private String diretor;
    private String elenco;
    private String classificacao;

    public Filme() {
    }

    public Filme(int idFilme, String titulo, int duracao,
                  String genero, String diretor,
                  String elenco, String classificacao) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.diretor = diretor;
        this.elenco = elenco;
        this.classificacao = classificacao;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}