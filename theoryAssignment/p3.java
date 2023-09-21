import java.util.Scanner;
public class p3 {
    static double gpaFall2022(int noOfCourses, String[] grade)
    {
        double gpa=0;
        double totalGrade=0;
        double result;
        for(int i=0;i<noOfCourses;i++)
        {
            switch(grade[i])
            {
                case "A":
                {
                    gpa=4.0;
                    break;
                }
                case "A-":
                {
                    gpa=3.7;
                    break;
                }
                case "B+":
                {
                    gpa=3.3;
                    break;
                }
                case "B":
                {
                    gpa=3.0;
                    break;
                }
                case "B-":
                {
                    gpa=2.7;
                    break;
                }
                case "C+":
                {
                    gpa=2.3;
                    break;
                }
                case "C":
                {
                    gpa=2.0;
                    break;
                }
                case "C-":
                {
                    gpa=1.7;
                    break;
                }
                case "D+":
                {
                    gpa=1.3;
                    break;
                }
                case "D":
                {
                    gpa=1.0;
                    break;
                }
                case "F":
                {
                    gpa=0.0;
                    break;
                }
                case "I":
                {
                    gpa=0.0;
                    break;
                }
                case "W":
                {
                    gpa=0.0;
                    break;
                }
                default:
                {
                    System.out.println("Invalid grade.");
                    break;
                }
            }
            totalGrade=totalGrade+gpa;
        }
        result = totalGrade/noOfCourses;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numebr of courses: ");
        int noOfCourse = sc.nextInt();
        System.out.println("Enter your grade: ");
        String [] grade = new String [noOfCourse];
        for(int i=0;i<noOfCourse;i++)
        {
            grade[i]=sc.next();
        }
        double gpa = gpaFall2022(noOfCourse, grade);
        System.out.println("Your GPA for FALL is: "+gpa);
    }
}
