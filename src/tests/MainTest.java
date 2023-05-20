package tests;

import org.junit.jupiter.api.Test;
import studentGrader.Main;
import ulits.FileManager;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    public void mainTest() {
        Main.main(null);
        FileManager f = new FileManager("src/Outputs/English_report.txt");
        try {
            ArrayList<String> arr = f.readLines();
            assertEquals(arr.get(0), "Subject Name: English\tMax Mark: 100");
            assertEquals(arr.get(1), "Student name         | Student number  | GPA   | GRADE");
            assertEquals(arr.get(2), "Brim stone           | 1234568p        | 3.3   | B+");
            assertEquals(arr.get(3), "Jane Smith           | 1234568p        | 3.3   | B+");
            assertEquals(arr.get(4), "Bob Johnson          | 1234568p        | 4.0   | A");
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}