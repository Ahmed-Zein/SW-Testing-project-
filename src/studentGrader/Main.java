package studentGrader;

import ulits.FileManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileManager file = new FileManager("src/New Text Document.txt");
        ArrayList<String> temp;
        Subject eng = file.parseSubjectFile();
        Grader grader = new Grader();
        grader.gradSubject(eng);
        eng.displayStudentGrades();
    }
}