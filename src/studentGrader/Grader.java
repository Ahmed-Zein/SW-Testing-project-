package studentGrader;

public class Grader {
    Grader() {
    }

    void gradSubject(Subject subject){
        for (int i = 0 ; i<subject.getStudentsList().size();i++){
            subject.getStudentsList().get(i).calcGpa();
        }
    }
}
