import database.ConnectionFactory;
import view.SessaoView;

public class Main {

    public static void main(String[] args) {

        // Iniciala banco SQLite automaticamente
        ConnectionFactory.getConnection();

        // Inicia sistema
        SessaoView view = new SessaoView();
        view.menu();
    }
}
```java
import view.SessaoView;

public class Main {
    public static void main(String[] args) {
        SessaoView view = new SessaoView();
        view.menu();
    }
}