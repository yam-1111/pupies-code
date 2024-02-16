package act3;

    import java.util.Scanner;

    public class act3a
     {
        public static void main(String[] args){
            System.out.println("\t############################################");
            System.out.printf("\t\t%5sGRADES CALCULATOR \n", "");
            System.out.println("\t############################################");

            // scanner instance
            Scanner scan = new Scanner(System.in);

            /*User Information*/
            System.out.print("\t\t  please enter your name: ");
            String name = scan.nextLine();

            System.out.print("\t\t  please enter your course: ");
            String course = scan.nextLine();

            /*Grades on quiz */
            System.out.print("\t\t  please enter your grade in quiz 1: ");
            double quiz1 = scan.nextInt();

            System.out.print("\t\t  please enter your grade in quiz 2: ");
            double quiz2 = scan.nextInt();
            
            /*Grades on recitation */
            System.out.print("\t\t  please enter your grade in recitation 1: ");
            double recitation1 = scan.nextDouble();

            System.out.print("\t\t  please enter your grade in recitation 2: ");
            double recitation2 = scan.nextDouble();

            /*Grades on recitation */
            System.out.print("\t\t  please enter your grade in project 1: ");
            double project1 = scan.nextDouble();

            System.out.print("\t\t  please enter your grade in project 2: ");
            double project2= scan.nextDouble();

            /*Grades on exam */
            System.out.print("\t\t  please enter your grade in exam: ");
            double exam_rating = scan.nextDouble();


            scan.close();
            // averages
            double quiz_avg = (quiz1 + quiz2) / 2;
            double recitation_avg = (recitation1 + recitation2)/2;
            double project_avg = (project1 + project2) / 2;

            // grade standimg
            double class_standing = ((quiz_avg) + (recitation_avg) + (project_avg)) / 3;
            double prelim_grade = ((class_standing * 2) + exam_rating) / 3;
            
            // Display the grade
            System.out.println("\n\t\t----------------------------------------------");
            System.out.printf("\t\t%s Name : %s\t\tCourse : %s", "", name, course);

            // display the grades
            System.out.printf("\n\n\t\t-- Average --\n\t\tQuiz Average : %.2f\n\t\tRecitation Average: %.2f\n\t\tProject Average: %.2f\n",
            quiz_avg, recitation_avg, project_avg);
            System.out.printf("\n\t\tClass standing: %.2f\n\t\tPrelim grade: %.2f\n", class_standing, prelim_grade);

            System.out.printf("\t\t\t\t\t\t%13s\n", "");
            System.out.println("\t\t----------------------------------------------");
        }   
    }
    