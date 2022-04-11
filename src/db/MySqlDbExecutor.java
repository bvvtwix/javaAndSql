package db;

import utils.resources.IReadProps;
import utils.resources.ReadPropertiesFromPropsFile;

import java.sql.*;
import java.util.Properties;

public class MySqlDbExecutor implements IDbExecutor{

    private static Connection connect = null;
    private static Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public ResultSet execute(String sqlRequest) {
        IReadProps<Properties> readerProps = new ReadPropertiesFromPropsFile();
        Properties properties = readerProps.read();

        try {
             connect = DriverManager.getConnection(
                    properties.getProperty("url") + "/" +properties.getProperty("db_name"),
                    properties.getProperty("username"),
                    properties.getProperty("password")
            );

             statement = connect.createStatement();
             resultSet = statement.executeQuery(sqlRequest);

        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            try {
                assert connect != null: "Connect is null";
                connect.close();
                statement.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return resultSet;
    }

    @Override
    public void close(){
        try {
            connect.close();
            statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
