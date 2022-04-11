package dbo;

public class StudentCuratorGroup {

    private String studentFio;
    private String curatorFio;
    private String group;

    public StudentCuratorGroup(String studentFio, String curatorFio, String group){
        this.studentFio = studentFio;
        this.curatorFio = curatorFio;
        this.group = group;
    }

    public String getStudentFio() {
        return studentFio;
    }

    public String getCuratorFio() {
        return curatorFio;
    }

    public String getGroup() {
        return group;
    }
}
