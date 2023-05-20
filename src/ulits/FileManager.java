package ulits;


import studentGrader.Student;
import studentGrader.Subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FileManager {
    File file;
    Validator validator;

    FileManager(File file) {
        this.file = file;
        validator = Validator.instance();
    }

    public FileManager(String path) {
        this.file = new File(path);
        validator = Validator.instance();
    }

    private FileManager() {
    }

    public ArrayList<String> readLines() throws Exception {
        ArrayList<String> b = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.isBlank()) {
                    b.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw e;
        }
        if (b.isEmpty())
            throw new Exception("File is empty");
        return b;
    }

    public Subject parseSubjectFile() throws Exception {
        ArrayList<String> fileContents = readLines();
        Subject subject = new Subject();
        String[] subjectHeader = fileContents.get(0).split(",");

        String subjectName = subjectHeader[0];
        String subjectCode = subjectHeader[1];
        int subjectMarks = parseInt(subjectHeader[2]);

        validator.validateSubjectName(subjectName);
        validator.validateSubjectCode(subjectCode);
        validator.validateSubjectMark(subjectMarks);

        subject.setSubject_name(subjectName);
        subject.setSubject_code(subjectCode);
        subject.setFull_mark(subjectMarks);

        for (int i = 1; i < fileContents.size(); i++) {

            String[] studentData = fileContents.get(i).split(",");

            String studentName = studentData[0];
            String studentNumber = studentData[1];
            int activities = parseInt(studentData[2]);
            int oral = parseInt(studentData[3]);
            int midterm = parseInt(studentData[4]);
            int finals = parseInt(studentData[5]);

            validator.validateStudentName(studentName);
            validator.validateStudentNumber(studentNumber);
            validator.validateActivitiesMarks(activities);
            validator.validateOralMarks(oral);
            validator.validateMidTermMarks(midterm);
            validator.validateFinalMarks(finals);

            Student student = new Student();

            student.setStudent_name(studentName);
            student.setStudent_number(studentNumber);
            student.setActivities_mark(activities);
            student.setOral_Practical_mark(oral);
            student.setMidterm_mark(midterm);
            student.setFinal_mark(finals);

            subject.addStudent(student);

        }
        return subject;
    }
}
