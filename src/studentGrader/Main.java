package studentGrader;

import ulits.FileManager;

public class Main {

    public static void main(String[] args) {
        FileManager file = new FileManager("src/input.txt");
        try {
            Subject eng = file.parseSubjectFile();
            Grader.generateReport(eng);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
