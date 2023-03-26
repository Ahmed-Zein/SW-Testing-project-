import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static ArrayList<String> read_input(){
        ArrayList<String> b = new ArrayList<>();
        try {
            File myObj = new File("D:\\3rd_year\\SW-Testing-project-\\out\\production\\SW-Testing-project-\\New Text Document.txt");
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
        int count=0;
        for (int i = 0; i < arrOfStr[0].length(); i++)
        {
            if (!Character.isDigit(arrOfStr[0].charAt(i))
                    && !Character.isLetter(arrOfStr[0].charAt(i))
                    && !Character.isWhitespace(arrOfStr[0].charAt(i)))
            {
                count++;
            }
        }
        if(arrOfStr[0].charAt(0)!=' ' && count==0 )
        {
            sub.subject_name=arrOfStr[0];
        }
        else
        {
            throw new IllegalArgumentException("wrong name format");
        }

        int count1=0;
        for (int i = 0; i < arrOfStr[1].length(); i++)
        {
            if ( i<=2 && !Character.isLetter(arrOfStr[1].charAt(i)))
            {
                count1++;
            }
            if ( (i>=3 && i<=5) && !Character.isDigit(arrOfStr[1].charAt(i)))
            {
                count1++;
            }
            if(i==6 && arrOfStr[1].charAt(i)!='s')
            {
                count1++;
            }
            if(!Character.isDigit(arrOfStr[1].charAt(i)) && !Character.isLetter(arrOfStr[1].charAt(i)))
            {
                count1++;
            }
        }
        if( count1==0 && (arrOfStr[1].length()==6 || arrOfStr[1].length()==7))
        {
            sub.subject_code=arrOfStr[1];
        }
        else
        {
            throw new IllegalArgumentException("wrong subject code format");
        }

        if(! (arrOfStr[2].charAt(0)!='1' || arrOfStr[2].charAt(1)!='0' || arrOfStr[2].charAt(2)!='0' ) )
        {
            sub.full_mark=parseInt(arrOfStr[2]);
        }
        else
        {
            throw new IllegalArgumentException("wrong fullmark format");
        }

        for(int i=1; i<temp.size();i++)
        {
            student s=new student();
            String str1= temp.get(i);
            String[] arrOfStr1 = str1.split(",");
            int count3=0;
            for (int j = 0; j < arrOfStr1[0].length(); j++)
            {
                if (!Character.isDigit(arrOfStr1[0].charAt(j))
                        && !Character.isLetter(arrOfStr1[0].charAt(j))
                        && !Character.isWhitespace(arrOfStr1[0].charAt(j)))
                {
                    count3++;
                }
            }
            if(arrOfStr1[0].charAt(0)!=' ' && count3==0 && arrOfStr1[0].contains(" "))
            {
                s.Student_name=arrOfStr1[0];
            }
            else
            {
                throw new IllegalArgumentException("wrong student name format");
            }

            int count4=0;
            for (int k = 0; k < arrOfStr1[1].length(); k++)
            {
                if ( k<=6 && !Character.isDigit(arrOfStr1[1].charAt(k)))
                {
                    count4++;
                }
                if ( (k==7) && (!Character.isDigit(arrOfStr1[1].charAt(k))
                        && !Character.isLetter(arrOfStr1[1].charAt(k))))
                {
                    count4++;
                }

            }
            if( count4==0 && arrOfStr1[1].length()==8)
            {
                s.Student_number=arrOfStr1[1];
            }
            else
            {
                throw new IllegalArgumentException("wrong student number format");
            }
            int count5=0;
            for (int k = 0; k < arrOfStr1[2].length(); k++)
            {
                if ( !Character.isDigit(arrOfStr1[2].charAt(k)) )
                {
                    count5++;
                }

            }
            if(count5==0 && (parseInt(arrOfStr1[2])>=0 && parseInt(arrOfStr1[2])<=10))
            {
                s.Activities_mark=parseInt(arrOfStr1[2]);
            }
            else
            {
                throw new IllegalArgumentException("wrong Activities_mark format");
            }
            /********************************************************************/
            int count6=0;
            for (int k = 0; k < arrOfStr1[3].length(); k++)
            {
                if ( !Character.isDigit(arrOfStr1[3].charAt(k)) )
                {
                    count6++;
                }

            }
            if(count6==0 && (parseInt(arrOfStr1[3])>=0 && parseInt(arrOfStr1[3])<=10))
            {
                s.Oral_Practical_mark=parseInt(arrOfStr1[3]);
            }
            else
            {
                throw new IllegalArgumentException("wrong Oral_Practical_mark format");
            }

            int count7=0;
            for (int k = 0; k < arrOfStr1[4].length(); k++)
            {
                if ( !Character.isDigit(arrOfStr1[4].charAt(k)) )
                {
                    count7++;
                }

            }
            if(count7==0 && (parseInt(arrOfStr1[4])>=0 && parseInt(arrOfStr1[4])<=20))
            {
                s.Midterm_mark=parseInt(arrOfStr1[4]);
            }
            else
            {
                throw new IllegalArgumentException("wrong Midterm mark format");
            }

            int count8=0;
            for (int k = 0; k < arrOfStr1[5].length(); k++)
            {
                if ( !Character.isDigit(arrOfStr1[5].charAt(k)) )
                {
                    count8++;
                }

            }
            if(count8==0 && (parseInt(arrOfStr1[5])>=0 && parseInt(arrOfStr1[5])<=60))
            {
                s.Final_mark=parseInt(arrOfStr1[5]);
            }
            else
            {
                throw new IllegalArgumentException("wrong final exam mark format");
            }

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