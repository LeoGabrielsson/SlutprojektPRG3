package Game.GameParts;

import javax.swing.*;
import java.sql.*;

public class Database {
        public Connection conn = null;
    public Database() {
    }

    public void getDB() {
        String user = "te20";
        JPasswordField pf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(pf.getPassword());

        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? " +
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", user, password);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }


        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM lg09Rougelike";
            ResultSet result = stmt.executeQuery(SQLQuery);

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + " || " +
                        result.getString("Chara") + " || " +
                        result.getInt("TimesPicked") + " || " +
                        result.getString("Winrate") + ".";
                System.out.println(output);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCharStats() {
        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM lg09Rougelike";
            ResultSet update = stmt.executeQuery(SQLQuery);

            int TimesPicked = update.getInt("id");
            TimesPicked +=1;
            String sql = "UPDATE lg09Rougelike" + TimesPicked + "WHERE id = 1;";
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}