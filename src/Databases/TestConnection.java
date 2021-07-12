package Databases;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String URL = "jdbc:mysql://localhost:3306/my_db?useSSL=false";
        String USER = "bestuser";
        String PASSWORD = "bestuser";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

//            String sql = "INSERT INTO employees (name, surname, department, salary VALUES (?, ?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, "Georgiy");
//            preparedStatement.setString(2,"Pelvic");
//            preparedStatement.setString(3,"IT");
//            preparedStatement.setInt(4, 900);
//            preparedStatement.executeUpdate();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int salary = resultSet.getInt(5);
                System.out.println("Id: " + id + "\n" +
                        "Name: " + name + "\n" +
                        "Salary: " + salary);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
