package studentGrader;

import java.util.ArrayList;

public class Subject {
    private String subject_name;
    private String subject_code;
    private int full_mark;
    private ArrayList<Student> studentsList;

    public Subject() {
    }

    public void displayStudentGrades() {
        System.out.printf("NUMBER OF STUDENTS ENROLLED %s-(%s) = %d%n\n", subject_name, subject_code, studentsList.size());
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).getStudent_name() + "\t" + studentsList.get(i).getGpa());
        }
    }

    public void addStudent(Student student) {
        if (this.studentsList == null)
            this.studentsList = new ArrayList<>();
        this.studentsList.add(student);
    }

    public String getSubject_name() {
        return subject_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public int getFull_mark() {
        return full_mark;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public void setFull_mark(int full_mark) {
        this.full_mark = full_mark;
    }

    public void setStudentsList(ArrayList<Student> students) {
        this.studentsList = students;
    }


}
