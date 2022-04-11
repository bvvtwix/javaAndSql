package tables;

import dbo.Student;
import dbo.StudentCuratorGroup;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JoinStudentCuratorGroups extends TableAbs{
    public JoinStudentCuratorGroups(String dbType) {
        super(dbType);
    }
//select Student.fio, Curator.fio, groupss.name
// from Student
// inner join Curator on Student.id_group = Curator.id
// inner join groupss on Curator.id = groupss.id_curator;

    public List<StudentCuratorGroup> list() {
        ResultSet resultSet = this.dbExecutor.execute(
                "select Student.fio, Curator.fio, groupss.name " +
                        "from Student " +
                        "inner join Curator on Student.id_group = Curator.id " +
                        "inner join groupss on Curator.id = groupss.id_curator;");
        List<StudentCuratorGroup> students = new ArrayList<>();

        try {
            while (resultSet.next()){
                students.add(new StudentCuratorGroup(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)

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
