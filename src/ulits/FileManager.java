package ulits;


import studentGrader.Student;
import studentGrader.Subject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FileManager {
    File file;

    FileManager(File file) {
        this.file = file;
    }
    public FileManager(String path){
        this.file = new File(path);
    }

    private FileManager() {
    }

    public Subject parseSubjectFile() {
        return extract_subject_data(read_input());
    }

    private ArrayList<String> read_input() {
        ArrayList<String> b = new ArrayList<>();
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.isBlank()) {
                    b.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return b;
    }

    private Subject extract_subject_data(ArrayList<String> temp) {
        Subject sub = new Subject();
        String str = temp.get(0);   //temp might be empty cuz file was empty
        String[] arrOfStr = str.split(",");
        int count = 0;
        for (int i = 0; i < arrOfStr[0].length(); i++) {
            if (!Character.isDigit(arrOfStr[0].charAt(i))
                    && !Character.isLetter(arrOfStr[0].charAt(i))
                    && !Character.isWhitespace(arrOfStr[0].charAt(i))) {
                count++;
            }
        }
        if (arrOfStr[0].charAt(0) != ' ' && count == 0) {
            sub.setSubject_name(arrOfStr[0]);
        } else {
            throw new IllegalArgumentException("wrong name format");
        }

        int count1 = 0;
        for (int i = 0; i < arrOfStr[1].length(); i++) {
            if (i <= 2 && !Character.isLetter(arrOfStr[1].charAt(i))) {
                count1++;
            }
            if ((i >= 3 && i <= 5) && !Character.isDigit(arrOfStr[1].charAt(i))) {
                count1++;
            }
            if (i == 6 && arrOfStr[1].charAt(i) != 's') {
                count1++;
            }
            if (!Character.isDigit(arrOfStr[1].charAt(i)) && !Character.isLetter(arrOfStr[1].charAt(i))) {
                count1++;
            }
        }
        if (count1 == 0 && (arrOfStr[1].length() == 6 || arrOfStr[1].length() == 7)) {
            sub.setSubject_code(arrOfStr[1]);
        } else {
            throw new IllegalArgumentException("wrong subject code format");
        }

        if (!(arrOfStr[2].charAt(0) != '1' || arrOfStr[2].charAt(1) != '0' || arrOfStr[2].charAt(2) != '0')) {
            sub.setFull_mark(parseInt(arrOfStr[2]));
        } else {
            throw new IllegalArgumentException("wrong full-mark format");
        }

        for (int i = 1; i < temp.size(); i++) {
            Student s = new Student();
            String str1 = temp.get(i);
            String[] arrOfStr1 = str1.split(",");
            int count3 = 0;
            for (int j = 0; j < arrOfStr1[0].length(); j++) {
                if (!Character.isDigit(arrOfStr1[0].charAt(j))
                        && !Character.isLetter(arrOfStr1[0].charAt(j))
                        && !Character.isWhitespace(arrOfStr1[0].charAt(j))) {
                    count3++;
                }
            }
            if (arrOfStr1[0].charAt(0) != ' ' && count3 == 0 && arrOfStr1[0].contains(" ")) {
                s.setStudent_name(arrOfStr1[0]);
            } else {
                throw new IllegalArgumentException("wrong studentGrader.Student name format");
            }

            int count4 = 0;
            for (int k = 0; k < arrOfStr1[1].length(); k++) {
                if (k <= 6 && !Character.isDigit(arrOfStr1[1].charAt(k))) {
                    count4++;
                }
                if ((k == 7) && (!Character.isDigit(arrOfStr1[1].charAt(k))
                        && !Character.isLetter(arrOfStr1[1].charAt(k)))) {
                    count4++;
                }

            }
            if (count4 == 0 && arrOfStr1[1].length() == 8) {
                s.setStudent_number(arrOfStr1[1]);
            } else {
                throw new IllegalArgumentException("wrong studentGrader.Student number format");
            }
            int count5 = 0;
            for (int k = 0; k < arrOfStr1[2].length(); k++) {
                if (!Character.isDigit(arrOfStr1[2].charAt(k))) {
                    count5++;
                }

            }
            if (count5 == 0 && (parseInt(arrOfStr1[2]) >= 0 && parseInt(arrOfStr1[2]) <= 10)) {
                s.setActivities_mark(parseInt(arrOfStr1[2]));
            } else {
                throw new IllegalArgumentException("wrong Activities_mark format");
            }
            /********************************************************************/
            int count6 = 0;
            for (int k = 0; k < arrOfStr1[3].length(); k++) {
                if (!Character.isDigit(arrOfStr1[3].charAt(k))) {
                    count6++;
                }

            }
            if (count6 == 0 && (parseInt(arrOfStr1[3]) >= 0 && parseInt(arrOfStr1[3]) <= 10)) {
                s.setOral_Practical_mark(parseInt(arrOfStr1[3]));
            } else {
                throw new IllegalArgumentException("wrong Oral_Practical_mark format");
            }

            int count7 = 0;
            for (int k = 0; k < arrOfStr1[4].length(); k++) {
                if (!Character.isDigit(arrOfStr1[4].charAt(k))) {
                    count7++;
                }

            }
            if (count7 == 0 && (parseInt(arrOfStr1[4]) >= 0 && parseInt(arrOfStr1[4]) <= 20)) {
                s.setMidterm_mark(parseInt(arrOfStr1[4]));
            } else {
                throw new IllegalArgumentException("wrong Midterm mark format");
            }

            int count8 = 0;
            for (int k = 0; k < arrOfStr1[5].length(); k++) {
                if (!Character.isDigit(arrOfStr1[5].charAt(k))) {
                    count8++;
                }

            }
            if (count8 == 0 && (parseInt(arrOfStr1[5]) >= 0 && parseInt(arrOfStr1[5]) <= 60)) {
                s.setFinal_mark(parseInt(arrOfStr1[5]));
            } else {
                throw new IllegalArgumentException("wrong final exam mark format");
            }

            sub.addStudent(s);

        }
        return sub;
    }

}
