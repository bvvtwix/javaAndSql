package dbo;

public class Student{

    public final static String tableName = "Student";

    private String fio;
    private String sex;
    private int id;
    private int idGroup;

    private int countStudent;
    private String studentsSex;

    public Student(int id, int id_group, String fio, String sex){

        this.id = id;
        this.idGroup = id_group;
        this.fio = fio;
        this.sex = sex;

    }

    public Student(String studentsSex){
        this.studentsSex = studentsSex;
    }

    public Student(int countStudent){
        this.countStudent = countStudent;
    }

    public String getStudentsSex(){
        return this.studentsSex;
    }

    public int getCountStudent() {
        return this.countStudent;
    }

    public String getFio(){
        return this.fio;
    }

    public String getSex(){
        return this.sex;
    }

    public int getId(){
        return this.id;
    }

    public int getIdGroup(){
        return this.idGroup;
    }

}
