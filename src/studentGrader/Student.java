package studentGrader;

public class Student {
    public Student() {
        this.gpa = 0;
    }

    private String student_name;
    private String student_number;
    private int activities_mark;
    private int Oral_Practical_mark;
    private int midterm_mark;
    private int final_mark;
    private double gpa;
    
    public void calcGpa() {
        int totalMarks = this.activities_mark + this.final_mark + this.midterm_mark + this.Oral_Practical_mark;
        if (totalMarks >= 93) this.gpa = 4;
        else if (totalMarks >= 89) this.gpa = 3.7;
        else if (totalMarks >= 84) this.gpa = 3.3;
        else if (totalMarks >= 80) this.gpa = 3.0;
        else if (totalMarks >= 76) this.gpa = 2.7;
        else if (totalMarks >= 73) this.gpa = 2.3;
        else if (totalMarks >= 70) this.gpa = 2.0;
        else if (totalMarks >= 67) this.gpa = 1.7;
        else if (totalMarks >= 64) this.gpa = 1.3;
        else if (totalMarks >= 60) this.gpa = 1.0;
        else this.gpa = 0.0;
    }
    // TODO: 4/7/2023
    public void displayStudentInfo(){
//        System.out.println(s1.getSubject_name());
//        System.out.println(s1.getSubject_code());
//        System.out.println(s1.getFull_mark());
//        System.out.println("**********************************");
//
//        ArrayList<Student> studentsList = s1.getStudentsList();
//        for (int i = 0; i < studentsList.size(); i++) {
//            System.out.println("STUDENT NAME:  " + studentsList.get(i).getStudent_name());
//            System.out.println("STUDENT NUMBER :  " + studentsList.get(i).getStudent_number());
//            System.out.println("STUDENT ACTIVITIES:  " + studentsList.get(i).getActivities_mark());
//            System.out.println("STUDENT ORAL:  " + studentsList.get(i).getOral_Practical_mark());
//            System.out.println("STUDENT MID:  " + studentsList.get(i).getMidterm_mark());
//            System.out.println("STUDENT FINAL:  " + studentsList.get(i).getFinal_mark());
//            System.out.println("**********************************");
//        }
        }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public int getActivities_mark() {
        return activities_mark;
    }

    public void setActivities_mark(int activities_mark) {
        this.activities_mark = activities_mark;
    }

    public int getOral_Practical_mark() {
        return Oral_Practical_mark;
    }

    public void setOral_Practical_mark(int oral_Practical_mark) {
        Oral_Practical_mark = oral_Practical_mark;
    }

    public int getMidterm_mark() {
        return midterm_mark;
    }

    public void setMidterm_mark(int midterm_mark) {
        this.midterm_mark = midterm_mark;
    }

    public int getFinal_mark() {
        return final_mark;
    }

    public void setFinal_mark(int final_mark) {
        this.final_mark = final_mark;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
