package studentGrader;

import java.io.File;
import java.io.PrintWriter;
import java.security.spec.ECField;

public class Grader {
    public Grader() {
    }

    public static void generateReport(Subject subject) throws Exception
    {
        File file = new File("src/Outputs/" + subject.getSubject_name() + "_report.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Subject Name: " + subject.getSubject_name() + "\tMax Mark: 100");
        pw.printf("%-20s | %-15s | %-5s | %s\n", "Student name", "Student number", "GPA", "GRADE");
        for (Student s : subject.getStudentsList())
        {
            s.calcGpa();
            pw.printf("%-20s | %-15s | %-5s | %s\n", s.getStudent_name(), s.getStudent_number(), s.getGpa(), s.finalGrade());
        }
        pw.close();
    }

}
