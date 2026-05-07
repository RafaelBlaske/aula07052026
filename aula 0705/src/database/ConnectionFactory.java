package database;
                CREATE TABLE IF NOT EXISTS filme (
                    idFilme INTEGER PRIMARY KEY AUTOINCREMENT,
                    titulo TEXT NOT NULL,
                    duracao INTEGER NOT NULL,
                    genero TEXT NOT NULL,
                    diretor TEXT NOT NULL,
                    elenco TEXT NOT NULL,
                    classificacao TEXT NOT NULL
                );
                """;

        String sqlSessao = """
                CREATE TABLE IF NOT EXISTS sessao (
                    idSessao INTEGER PRIMARY KEY AUTOINCREMENT,
                    data TEXT NOT NULL,
                    horario TEXT NOT NULL,
                    publico INTEGER NOT NULL,
                    idCinema INTEGER NOT NULL,
                    idFilme INTEGER NOT NULL,

                    FOREIGN KEY(idCinema) REFERENCES cinema(idCinema),
                    FOREIGN KEY(idFilme) REFERENCES filme(idFilme)
                );
                """;

        try (Statement stmt = connection.createStatement()) {

            stmt.execute(sqlCinema);
            stmt.execute(sqlFilme);
            stmt.execute(sqlSessao);

            System.out.println("Banco SQLite conectado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabelas: " + e.getMessage());
        }
    }
}
```java
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:sqlite:cinema.db";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com banco", e);
        }
    }
}

    private static void inserirDadosTeste(Connection connection) {

        String sqlCinema = """
                INSERT OR IGNORE INTO cinema
                (idCinema, nome, cidade, estado, endereco, capacidade)
                VALUES
                (1, 'Cinema Center', 'São Paulo', 'SP', 'Rua A, 100', 300);
                """;

        String sqlFilme = """
                INSERT OR IGNORE INTO filme
                (idFilme, titulo, duracao, genero, diretor, elenco, classificacao)
                VALUES
                (1, 'Vingadores', 180, 'Ação', 'Marvel Studios', 'Robert Downey Jr.', '14 anos');
                """;

        try (Statement stmt = connection.createStatement()) {

            stmt.execute(sqlCinema);
            stmt.execute(sqlFilme);

            System.out.println("Dados iniciais carregados!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}