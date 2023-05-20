package tests;

import org.junit.jupiter.api.Test;
import studentGrader.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testTotalMark() {
        Student s = new Student();
        s.setActivities_mark(9);
        s.setOral_Practical_mark(8);
        s.setMidterm_mark(19);
        s.setFinal_mark(45);
        s.calcTotalMarks();
        assertEquals(81, s.getSTotalMarks());
    }

    @Test
    public void testGPA() {
        Student s = new Student();
        s.setActivities_mark(9);
        s.setOral_Practical_mark(8);
        s.setMidterm_mark(19);
        s.setFinal_mark(45);
        s.calcTotalMarks();
        s.calcGpa();
        assertEquals(3.0, s.getGpa());
    }

    @Test
    public void testFinalGrade() {
        Student s = new Student();
        s.setActivities_mark(9);
        s.setOral_Practical_mark(8);
        s.setMidterm_mark(19);
        s.setFinal_mark(45);
        s.calcTotalMarks();
        s.calcGpa();
        assertEquals("B", s.finalGrade());
    }

    @Test
    public void testFinalGrade1() {
        Student s = new Student();
        s.setSTotalMarks(99);
        s.setGpa(4);
        assertEquals("A+", s.finalGrade());
    }

    @Test
    public void testFinalGrade2() {
        Student s = new Student();
        s.setSTotalMarks(99);
        s.setGpa(4);
        assertEquals("A+", s.finalGrade());
    }

    @Test
    public void testFinalGrade3() {
        Student s = new Student();
        s.setSTotalMarks(96);
        s.setGpa(4);
        assertEquals("A", s.finalGrade());
    }

    @Test
    public void testFinalGrade4() {
        Student s = new Student();
        s.setGpa(3.7);
        assertEquals("A-", s.finalGrade());
    }

    @Test
    public void testFinalGrade5() {
        Student s = new Student();
        s.setGpa(3.3);
        assertEquals("B+", s.finalGrade());
    }

    @Test
    public void testFinalGrade6() {
        Student s = new Student();
        s.setGpa(3.0);
        assertEquals("B", s.finalGrade());
    }

    @Test
    public void testFinalGrade7() {
        Student s = new Student();
        s.setGpa(2.7);
        assertEquals("B-", s.finalGrade());
    }


    @Test
    public void testFinalGrade8() {
        Student s = new Student();
        s.setGpa(2.7);
        assertEquals("B-", s.finalGrade());
    }

    @Test
    public void testFinalGrade9() {
        Student s = new Student();
        s.setGpa(2.3);
        assertEquals("C+", s.finalGrade());
    }

    @Test
    public void testFinalGrade10() {
        Student s = new Student();
        s.setGpa(2.0);
        assertEquals("C", s.finalGrade());
    }

    @Test
    public void testFinalGrade11() {
        Student s = new Student();
        s.setGpa(1.7);
        assertEquals("C-", s.finalGrade());
    }


    @Test
    public void testFinalGrade12() {
        Student s = new Student();
        s.setGpa(1.3);
        assertEquals("D+", s.finalGrade());
    }

    @Test
    public void testFinalGrade13() {
        Student s = new Student();
        s.setGpa(1.0);
        assertEquals("D", s.finalGrade());
    }

    @Test
    public void testFinalGrade14() {
        Student s = new Student();
        s.setGpa(0.0);
        assertEquals("F", s.finalGrade());
    }
}