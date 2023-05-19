package studentGrader;

import ulits.FileManager;

public class Main {

    public static void main(String[] args) {
        FileManager file = new FileManager("src/input.txt");
        try {
            Subject eng = file.parseSubjectFile();
            Grader grader = new Grader();
            grader.gradSubject(eng);
            eng.displayStudentGrades();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/*
*
1.Subject name: [It must be Alphabetic characters and Spaces].
                [the name should not start with space]
2. Subject-code:   [It must be 6-7 Alphanumeric characters]
                   [The first 3 are Alphabetic followed by 3 numeric characters.]
                   [The sevens should be s if exists.]
3. Full mark:      [It is a numeric number of the value: 100]
*******************************************************************************************
4. Student name:   [It must be Alphabetic characters and Spaces.]
                   [the name should not start with space.]
5. Student number: [the length of this field must be Alphanumeric characters of exact length of 8 characters.]
                   [It should start with numbers and might End with only one Alphabetic character]
********************************************************************************************
6. Student Activities mark: [It is an integer of a value from 0 up to 10 of the full mark]
7. Oral/Practical mark:     [It is an integer of a value from 0 up to 10 of the full mark]
8. Midterm exam mark:       [It is an integer of a value from 0 up to 20 of the full mark]
9. Final exam mark:         [It is an integer of a value from 0 up to 60 of the full mark]
********************************************************************************************
*/
//  typical input file structure
//  courseName, courseCode, 100
//  studentName, ID, activities, oral, mt, final
