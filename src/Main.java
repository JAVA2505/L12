import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://contac01.mysql.ukraine.com.ua:3306/contac01_prilosh",
                    "contac01_prilosh",
                    "4h57futz");
            Statement st = c.createStatement();
//            st.executeUpdate("INSERT INTO user1110 VALUES(2, 'Petr', 35)");
//            st.executeUpdate("UPDATE user1110 SET age=30 WHERE name='Alex'");
//            st.executeUpdate("DELETE FROM user1110 WHERE id=1");
            ResultSet rs = st.executeQuery("SELECT * FROM user1110");

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") + "; Age: " + rs.getInt("age") + ";");
            }

            st.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
