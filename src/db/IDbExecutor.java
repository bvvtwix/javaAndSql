package db;

import java.sql.ResultSet;

public interface IDbExecutor {

    ResultSet execute(String sqlRequest);

//    void update(String sqlRequest);

    void close();

}
