package controller;

import model.Sessao;
import service.SessaoService;

public class SessaoController {

    private SessaoService service;

    public SessaoController() {
        service = new SessaoService();
    }

    public void cadastrarSessao(String data,
                                String horario,
                                int publico,
                                int idCinema,
                                int idFilme) {

        Sessao sessao = new Sessao();

        sessao.setData(data);
        sessao.setHorario(horario);
        sessao.setPublico(publico);
        sessao.setIdCinema(idCinema);
        sessao.setIdFilme(idFilme);

        service.cadastrarSessao(sessao);
    }
}