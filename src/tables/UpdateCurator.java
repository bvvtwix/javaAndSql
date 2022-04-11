package tables;

import dbo.Curator;
import dbo.Student;
import dbo.Groups;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UpdateCurator extends TableAbs<Curator>{
    public UpdateCurator(String dbType) {
        super(dbType);
    }

//    public void updeteCurator() {
//        this.dbExecutor.update(String.format("update %s set id_curator = 4 where id = 1;", Groups.tableName));
//
//        System.out.println("Куратор успешно изменен");
//        try {
//            while (resultSet.next()){
//                ;
//            }
//        } catch (SQLException ex){
//            ex.printStackTrace();
//        } finally {
//
//            this.dbExecutor.close();
//        }

//    }
}
