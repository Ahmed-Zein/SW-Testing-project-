package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import studentGrader.Student;
import studentGrader.Subject;
import ulits.FileManager;

import java.io.FileNotFoundException;

class FileManagerTest {

    @Test
    public void testReadLines1() {
        FileManager file = new FileManager("src/tests/testFiles/fileNotFound.txt");
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            file.parseSubjectFile();
        });

        assertEquals(exception.getClass(), new FileNotFoundException().getClass());
    }

    @Test
    public void testReadLines2() {
        FileManager file = new FileManager("src/tests/testFiles/emptyFile.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "File is empty";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);

    }

    @Test
    public void testcase1() {
        FileManager file = new FileManager("src/tests/testFiles/testcase1.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase2() {
        FileManager file = new FileManager("src/tests/testFiles/testcase2.txt");
        Exception exception = assertThrows(Exception.class, () -> file.parseSubjectFile());
        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase3() {
        FileManager file = new FileManager("src/tests/testFiles/testcase3.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase4() {
        FileManager file = new FileManager("src/tests/testFiles/testcase4.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase5() {
        FileManager file = new FileManager("src/tests/testFiles/testcase5.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong Activities_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }


    @Test
    public void testcase6() {
        FileManager file = new FileManager("src/tests/testFiles/testcase6.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }


    @Test
    public void testcase7() {
        FileManager file = new FileManager("src/tests/testFiles/testcase7.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong final exam mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase8() {

        FileManager file = new FileManager("src/tests/testFiles/testcase8.txt");
        Exception exception = assertThrows(Exception.class, () -> {
            file.parseSubjectFile();
        });
        String expectedMessage = "wrong subject code format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testCase9() {
        FileManager file = new FileManager("src/tests/testFiles/testcase9.txt");
        try {
            Subject subject = file.parseSubjectFile();
            assertEquals("English", subject.getSubject_name());
            assertEquals("ENG101", subject.getSubject_code());
            assertEquals(100, subject.getFull_mark());

            Student s = subject.getStudentsList().get(0);
            assertEquals("John Doe", s.getStudent_name());
            assertEquals("1234568p", s.getStudent_number());
            assertEquals(8, s.getActivities_mark());
            assertEquals(9, s.getOral_Practical_mark());
            assertEquals(18, s.getMidterm_mark());
            assertEquals(50, s.getFinal_mark());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}