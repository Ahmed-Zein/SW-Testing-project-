import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testcase1() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase1");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase2() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase2");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }


    @Test
    public void testcase3() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase3");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong student name format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase4() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase4");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase5() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase5");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong Activities_mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase6() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase6");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong student number format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase7() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase7");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong final exam mark format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testcase8() {
        ArrayList<String> temp=Main.read_input("D:\\3rd_year\\SW-Testing-project-\\src\\testcase8");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { Main.extract_subject_data(temp);}  );

        String expectedMessage = "wrong subject code format";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }

}