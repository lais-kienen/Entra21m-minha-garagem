package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 * @author (name=Laís Kienen, date=08-10-17)
 */
public class Conexao {

    private static Connection conexao;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost/minha_garagem";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    
  /*
    Quando o metodo nao é static, ou seja, ele pertence ao objeto
    Conexao conexao = new Conexao();
    conexao.conectar();
    
    
    Qaundo o metodo é static, ou seja, ele pertence à classe e nao ao objeto
    Conexao.conectar();
    */  
    
    
    public static Connection conectar() {
        try {
            Properties propriedades = new Properties();
            propriedades.setProperty("user", USUARIO);
            propriedades.setProperty("password", SENHA);

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(HOST, propriedades);
            return conexao;
        } catch (SQLException | ClassNotFoundException sqle) {
            JOptionPane.showMessageDialog(null, sqle.getMessage());
            return null;
        }
    }

    public static void desconectar() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException sqle) {
                System.out.println(sqle.getMessage());
            }
        }
    }

}
