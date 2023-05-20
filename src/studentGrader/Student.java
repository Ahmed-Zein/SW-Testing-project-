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
    private int totalMarks;

    public void calcTotalMarks() {
        totalMarks = this.activities_mark + this.final_mark + this.midterm_mark + this.Oral_Practical_mark;

    }

    public void calcGpa() {
        calcTotalMarks();
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

    public String finalGrade() {
        if (this.gpa == 4 && totalMarks >= 97) return "A+";
        else if (this.gpa == 4) return "A";
        else if (this.gpa == 3.7) return "A-";
        else if (this.gpa == 3.3) return "B+";
        else if (this.gpa == 3.0) return "B";
        else if (this.gpa == 2.7) return "B-";
        else if (this.gpa == 2.3) return "C+";
        else if (this.gpa == 2.0) return "C";
        else if (this.gpa == 1.7) return "C-";
        else if (this.gpa == 1.3) return "D+";
        else if (this.gpa == 1.0) return "D";
        else return "F";
    }

    public int getSTotalMarks() {
        return this.totalMarks;
    }

    public void setSTotalMarks(int t) {
        this.totalMarks = t;
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
