import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static ArrayList<String> read_input(){
        ArrayList<String> b = new ArrayList<>();
        try {
            File myObj = new File("D:\\3rd year assigment files\\testing project\\src\\New Text Document.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                if(!data.isBlank())
                {
                    b.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return b;
    }

    public static Subject extract_subject_data(ArrayList<String> temp)
    {

        Subject sub= new Subject();
        sub.students=new ArrayList<>();
        String str= temp.get(0);
        String[] arrOfStr = str.split(",");
        sub.subject_name=arrOfStr[0];
        sub.subject_code=arrOfStr[1];
        sub.full_mark=parseInt(arrOfStr[2]);
        for(int i=1; i<temp.size();i++)
        {
            student s=new student();
            String str1= temp.get(i);
            String[] arrOfStr1 = str1.split(",");
            s.Student_name=arrOfStr1[0];
            s.Student_number=parseInt(arrOfStr1[1]);
            s.Activities_mark=parseInt(arrOfStr1[2]);
            s.Oral_Practical_mark=parseInt(arrOfStr1[3]);
            s.Midterm_mark=parseInt(arrOfStr1[4]);
            s.Final_mark=parseInt(arrOfStr1[5]);
            sub.students.add(s);

        }
            return sub;
    }
    public static void main(String[] args)
    {
        ArrayList<String> temp;
        temp=read_input();
        Subject s1=extract_subject_data( temp);
        System.out.println(s1.subject_name);
        System.out.println(s1.subject_code);
        System.out.println(s1.full_mark);
        System.out.println("**********************************");
        for(int i=0 ; i<s1.students.size(); i++)
        {
            System.out.println("STUDENT NAME:  "+s1.students.get(i).Student_name);
            System.out.println("STUDENT NUMBER :  "+s1.students.get(i).Student_number);
            System.out.println("STUDENT ACTIVITES:  "+s1.students.get(i).Activities_mark);
            System.out.println("STUDENT ORAL:  "+s1.students.get(i).Oral_Practical_mark);
            System.out.println("STUDENT MID:  "+s1.students.get(i).Midterm_mark);
            System.out.println("STUDENT FINAL:  "+s1.students.get(i).Final_mark);
            System.out.println("**********************************");
        }
    }
}