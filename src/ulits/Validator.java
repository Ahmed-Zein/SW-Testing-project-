package ulits;

public class Validator {
    private static Validator validator;

    public Validator() {
    }

    public static Validator instance() {
        if (validator == null)
            validator = new Validator();
        return validator;
    }

    public boolean validateSubjectName(String sName) throws Exception {
        if (!(isAlphabetical(sName) && !sName.startsWith(" "))) {
            throw new Exception("wrong subject name format");
        }
        return true;
    }

    public boolean validateSubjectCode(String sCode) throws Exception {
        if (!(sCode.length() >= 6 && sCode.matches("[a-zA-Z]{3}[0-9]{3}(s)?"))) {
            throw new Exception("wrong subject code format");
        }
        return true;
    }

    public boolean validateSubjectMark(int mark) throws Exception {
        if (!(mark == 100)) {
            throw new Exception("wrong fullmark format");
        }
        return true;
    }

    public boolean validateStudentName(String sName) throws Exception {

        if (!(isAlphabetical(sName) && !sName.startsWith(" "))) {
            throw new Exception("wrong student name format");
        }
        return true;
    }

    public boolean validateStudentNumber(String sNumber) throws Exception {
        if (!(sNumber.length() == 8 && (sNumber.matches("^[0-9]{8}$") || sNumber.matches("^[0-9]{7}[a-zA-Z]$")) )) {
            throw new Exception("wrong student number format");
        }
        return true;
    }

    public boolean validateActivitiesMarks(int mark) throws Exception {
        if (!((mark >= 0) && (mark <= 10))) {
            throw new Exception("wrong Activities_mark format");
        }
        return true;
    }

    public boolean validateOralMarks(int mark) throws Exception {
        if (!((mark >= 0) && (mark <= 10))) {
            throw new Exception("wrong Oral_Practical_mark format");
        }
        return true;
    }

    public boolean validateMidTermMarks(int mark) throws Exception {
        if (!((mark >= 0) && (mark <= 20))) {
            throw new Exception("wrong Midterm mark format");
        }
        return true;
    }

    public boolean validateFinalMarks(int mark) throws Exception {
        if (!((mark >= 0) && (mark <= 60))) {
            throw new Exception("wrong final exam mark format");
        }
        return true;
    }

    public boolean isAlphabetical(String string) {
        return string.matches("^[a-zA-Z ]+$");

    }
}
