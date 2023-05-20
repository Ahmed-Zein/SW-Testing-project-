package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ulits.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    static Validator validator;

    @BeforeAll
    public static void setup() {
        validator = Validator.instance();
    }

    @Test
    void testAlphabetical() {
        assertEquals(false, validator.isAlphabetical("123"));
    }

    @Test
    void testAlphabetical2() {
        assertEquals(true, validator.isAlphabetical("qwerty"));
    }

    @Test
    void testValidatorClass() {
        assertNotEquals(validator, null);
    }

    @Test
    void testSubjectName() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateSubjectName("C123");
        });
        String expectedMessage = "wrong subject name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testSubjectName2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateSubjectName(" SW testing");
        });
        String expectedMessage = "wrong subject name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testSubjectCode() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateSubjectCode(" ");
        });
        String expectedMessage = "wrong subject code format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testSubjectMark() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateSubjectMark(101);
        });
        String expectedMessage = "wrong fullmark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testSubjectMark2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateSubjectMark(0);
        });
        String expectedMessage = "wrong fullmark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testStudentName() throws Exception {
        assertEquals(true, validator.validateStudentName("Brim stone"));
    }

    @Test
    void testStudentName2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateStudentName(" sage101");
        });
        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testStudentName3() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateStudentName("chamber 66");
        });
        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testStudentNumber() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateStudentNumber("1234567XX");
        });
        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testStudentNumber2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateStudentNumber("123456755");
        });
        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testStudentNumber3() throws Exception {
        assertEquals(true, validator.validateStudentNumber("12345678"));
    }

    @Test
    void testActivitiesMarks() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateActivitiesMarks(-1);
        });
        String expectedMessage = "wrong Activities_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testActivitiesMarks2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateActivitiesMarks(11);
        });
        String expectedMessage = "wrong Activities_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testOral() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateOralMarks(11);
        });
        String expectedMessage = "wrong Oral_Practical_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testOral2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateOralMarks(-10);
        });
        String expectedMessage = "wrong Oral_Practical_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testMidTermMarks() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateMidTermMarks(21);
        });
        String expectedMessage = "wrong Midterm mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void testMidTermMarks2() {
        Exception exception = assertThrows(Exception.class, () -> {
            validator.validateMidTermMarks(-1);
        });
        String expectedMessage = "wrong Midterm mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }


    // black box Boundary Value Analysis (BVA)

    // minvalue-1
    @Test
    void test_validateFinalMarks1() {
        Exception exception = assertThrows(Exception.class, () ->
        {
            validator.validateFinalMarks(-1);
        });
        String expectedMessage = "wrong final exam mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    //minvalue
    @Test
    void test_validateFinalMarks2() throws Exception {
        assertEquals(validator.validateFinalMarks(0), true);
    }

    //minvalue+1
    @Test
    void test_validateFinalMarks3() throws Exception {

        assertEquals(validator.validateFinalMarks(1), true);

    }

    //normal value
    @Test
    void test_validateFinalMarks4() throws Exception {
        assertEquals(validator.validateFinalMarks(59), true);
    }

    //max value -1
    @Test
    void test_validateFinalMarks5() throws Exception {
        assertEquals(validator.validateFinalMarks(59), true);
    }


    //max value
    @Test
    void test_validateFinalMarks6() throws Exception {

        assertEquals(validator.validateFinalMarks(60), true);

    }

    // max value + 1
    @Test
    void test_validateFinalMarks7() {
        Exception exception = assertThrows(Exception.class, () ->
        {
            validator.validateFinalMarks(61);
        });
        String expectedMessage = "wrong final exam mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }
}