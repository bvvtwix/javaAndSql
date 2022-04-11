package tables;

import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountStudentsTable extends TableAbs<Student>{
    public CountStudentsTable(String dbType) {
        super(dbType);
    }

    public List<Student> list() {
        ResultSet resultSet = this.dbExecutor.execute(String.format("select count(id) from %s", Student.tableName));
        List<Student> students = new ArrayList<>();

        try {
            while (resultSet.next()){
                students.add(new Student(
                        resultSet.getInt(1)

                ));

            }
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {

            this.dbExecutor.close();
        }

        return students;
    }
}
