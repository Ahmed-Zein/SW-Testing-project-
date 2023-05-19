package ulits;

public class Validator {
    private static Validator validator;

    private Validator() {
    }

    public static Validator instance() {
        if (validator == null)
            validator = new Validator();
        return validator;
    }

    boolean validateSubjectName(String sName) {
        return isAlphabetical(sName) && !sName.startsWith(" ");
    }

    boolean validateSubjectCode(String sCode) {
        return sCode.length() >= 6 && sCode.matches("[a-zA-Z]{3}[0-9]{3}(s)?");
    }

    boolean validateSubjectMark(int mark) {
        return mark == 100;
    }

    boolean validateStudentName(String sName) {
        return isAlphabetical(sName) && !sName.startsWith(" ");
    }

    boolean validateStudentNumber(String sNumber) {
        return sNumber.length() == 8 && sNumber.matches("^[0-9]{7}[a-zA-Z]$");
    }

    boolean validateActivitiesMarks(int mark) {
        return (mark >= 0) && (mark <= 10);
    }

    boolean validateOralMarks(int mark) {
        return (mark >= 0) && (mark <= 10);
    }

    boolean validateMidTermMarks(int mark) {
        return (mark >= 0) && (mark <= 20);
    }

    boolean validateFinalMarks(int mark){
        return (mark >= 0) && (mark <= 60);
    }

    private   boolean isAlphabetical(String string) {
        return string.matches("^[a-zA-Z ]+$");

    }
}
