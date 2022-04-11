package tables;

import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentWoman extends TableAbs<Student>{
    public StudentWoman(String dbType) {
        super(dbType);
    }

    public List<Student> list() {
        ResultSet resultSet = this.dbExecutor.execute(String.format("select fio from %s where sex = 'w'", Student.tableName));
        List<Student> students = new ArrayList<>();

        try {
            while (resultSet.next()){
                students.add(new Student(
                        resultSet.getString(1)

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
