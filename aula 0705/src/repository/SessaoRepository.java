package repository;

import database.ConnectionFactory;
import model.Sessao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SessaoRepository {

    public void salvar(Sessao sessao) {

        String sql = "INSERT INTO sessao(data, horario, publico, idCinema, idFilme) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, sessao.getData());
            stmt.setString(2, sessao.getHorario());
            stmt.setInt(3, sessao.getPublico());
            stmt.setInt(4, sessao.getIdCinema());
            stmt.setInt(5, sessao.getIdFilme());

            stmt.executeUpdate();

            System.out.println("Sessão cadastrada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao salvar sessão: " + e.getMessage());
        }
    }
}