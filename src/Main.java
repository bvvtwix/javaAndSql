import dbo.Student;
import dbo.StudentCuratorGroup;
import tables.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Student> students = new StudentTable("mysql").list();


        // Вывести на экран количество студентов
        List<Student> countStudents = new CountStudentsTable("mysql").list();
        for (Student student : countStudents) {
            System.out.println("Количество студентов: " + student.getCountStudent());
        }
//
//        // Вывести студенток
//        System.out.println("Студентки:");
//        List<Student> sexStudents = new StudentWoman("mysql").list();
//        for (Student student : sexStudents) {
//            System.out.println(student.getStudentsSex());
//        }
//
//        // Вывести на экран информацию о всех студентах включая название группы и имя куратора
//        System.out.println("Информация о студентах:");
//        System.out.println("Student_fio" + " | " + "Curator_fio" + " | " + "Group");
//        List<StudentCuratorGroup> joinAllTables = new JoinStudentCuratorGroups("mysql").list();
//        for (StudentCuratorGroup student : joinAllTables) {
//            System.out.println(student.getStudentFio() + " | " + student.getCuratorFio() + " | " + student.getGroup());
//        }

        // Обновить данные по группе сменив куратора
//        new UpdateCurator("mysql").updeteCurator();

    }



}
