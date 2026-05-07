package model;

public class Sessao {

    private int idSessao;
    private String data;
    private String horario;
    private int publico;
    private int idCinema;
    private int idFilme;

    public Sessao() {
    }

    public Sessao(int idSessao, String data,
                   String horario, int publico,
                   int idCinema, int idFilme) {
        this.idSessao = idSessao;
        this.data = data;
        this.horario = horario;
        this.publico = publico;
        this.idCinema = idCinema;
        this.idFilme = idFilme;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }
}