 package act5;

/*
 * @author : Hinay, Anthony John C.
 */


import java.util.Scanner;

public class act5d {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         char is_loop, choice;
         
         /*Prelim grades */
         double pre_quiz, pre_rec, pre_proj, pre_exam, pre_cstandingG, pre_projG, pre_lecG,  pre_preG=0;
         /*Midterm grades */
         double mt_quiz, mt_rec, mt_proj, mt_exam, mt_cstandingG, mt_projG, mt_lecG, mt_aveG, mt_mtG=0;
         /*Finals grades */
         double fl_quiz, fl_rec, fl_proj, fl_exam, fl_cstandingG, fl_projG, fl_lecG, fl_aveG, fl_flG =0;
         /*grade equivalent output*/
         double _output_grade, output_grade; 

         do{
            // reset the value on each iter
            is_loop = ' ';
            choice = ' ';
            output_grade = 0; _output_grade = 0;

            System.out.println("[P] Prelim\n[M] Midterm\n[F] Final\n[E] Exit");
            System.out.printf("Enter your choice: ");
            String _choice = input.nextLine().toUpperCase();
            choice = _choice.charAt(0);
            // repeats  the choice if user inputs more than 1 character
            if(_choice.length() > 1){
                System.out.println("Input one character only!");
                continue;
            }
           

            switch (choice) {
                case 'P':
                case 'M':
                case 'F':
                    /*Prelim Grades*/
                    System.out.print("Please enter grade for Prelim quiz: "); pre_quiz = input.nextDouble();
                    System.out.print("Please enter grade for Prelim recitation: "); pre_rec = input.nextDouble();
                    System.out.print("Please enter grade for Prelim project: "); pre_proj = input.nextDouble();
                    System.out.print("Please enter grade for Prelim exam: "); pre_exam = input.nextDouble();

                    /*Compute the inputted score*/
                    pre_cstandingG = (pre_quiz + pre_rec) / 2;
                    pre_projG = (pre_proj * 0.4);
                    pre_lecG = ((2* pre_cstandingG + pre_exam)/3)*0.6;
                    pre_preG = pre_projG + pre_lecG; 
                    _output_grade = pre_preG;
                    
                    if(choice == 'P'){
                        /*Output the grades computed */
                        System.out.printf("The Prelim Class Standing grade is: %.1f\n", pre_cstandingG);
                        System.out.printf("The Prelim Project grade is : %.1f\n", pre_projG);
                        System.out.printf("The Prelim Lecture grade is : %.1f\n", pre_lecG);
                        System.out.printf("The Prelim grade is : %.1f\n", pre_preG);
                        break;
                    }

                    /*Midterm grades*/
                    System.out.print("Please enter grade for Midterm quiz: "); mt_quiz = input.nextDouble();
                    System.out.print("Please enter grade for Midterm recitation: "); mt_rec = input.nextDouble();
                    System.out.print("Please enter grade for Midterm project: "); mt_proj = input.nextDouble();
                    System.out.print("Please enter grade for Midterm exam: "); mt_exam = input.nextDouble();

                    /*Compute the inputted score*/
                    mt_cstandingG = (mt_quiz + mt_rec) / 2;
                    mt_projG = (mt_proj * 0.4);
                    mt_lecG = ((2* mt_cstandingG + mt_exam)/3)*0.6;
                    mt_aveG = mt_projG + mt_lecG; 
                    mt_mtG = (2 * mt_aveG + pre_preG) / 3;
                    _output_grade = mt_mtG; 

                    if(choice == 'M'){
                        /*Output the grades computed */
                        System.out.printf("The Midterm Class Standing grade is: %.1f\n", mt_cstandingG);
                        System.out.printf("The Midterm Project grade is : %.1f\n", mt_projG);
                        System.out.printf("The Midterm Lecture grade is : %.1f\n", mt_lecG);
                        System.out.printf("The Midterm grade is : %.1f\n", mt_mtG);
                        break;
                    }
                    System.out.print("Please enter grade for Finals quiz: "); fl_quiz = input.nextDouble();
                    System.out.print("Please enter grade for Finals recitation: "); fl_rec = input.nextDouble();
                    System.out.print("Please enter grade for Finals project: "); fl_proj = input.nextDouble();
                    System.out.print("Please enter grade for Finals exam: "); fl_exam = input.nextDouble();

                    /*Compute the inputted score*/
                    fl_cstandingG = (fl_quiz + fl_rec) / 2;
                    fl_projG = (fl_proj * 0.4);
                    fl_lecG = ((2* fl_cstandingG + fl_exam)/3)*0.6;
                    fl_aveG = fl_projG + fl_lecG; 
                    fl_flG = (2 * fl_aveG + mt_mtG) / 3;
                    _output_grade = fl_flG; 

                    if(choice == 'F'){
                        /*Output the grades computed */
                        System.out.printf("The Finals Class Standing grade is: %.1f\n", fl_cstandingG);
                        System.out.printf("The Finals Project grade is : %.1f\n", fl_projG);
                        System.out.printf("The Finals Lecture grade is : %.1f\n", fl_lecG);
                        System.out.printf("The Finals grade is : %.1f\n", fl_flG);
                        break;
                    }
                case 'E':
                    System.out.println("\nGoodbye!!!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            /*Converts the given output grade to equivalent rating */
            if(_output_grade != 0){
                if(_output_grade >= 99) {output_grade = 1;}
                else if(_output_grade >= 96) {output_grade = 1.25;}
                else if(_output_grade >= 93) {output_grade = 1.50;}
                else if(_output_grade >= 90) {output_grade = 1.75;}
                else if(_output_grade >= 87) {output_grade = 2;}
                else if(_output_grade >= 84) {output_grade = 2.25;}
                else if(_output_grade >= 81) {output_grade = 2.50;}
                else if(_output_grade >= 78) {output_grade = 2.75;}
                else if(_output_grade >= 75) {output_grade = 3;}
                else {output_grade = 5;}
                
                /*Output the answer */
                if (output_grade > 3)
                System.out.printf(
                    "Your equivalent grade is %.2f. You failed in this subject. Better luck next academic year.\n"
                    , output_grade );
                else
                    System.out.printf(
                    "Your equivalent grade is %.2f. You passed in this subject. Congratulations!!\n"
                    , output_grade ); 

            }

            while(is_loop != 'Y' && is_loop != 'N'){
                System.out.print("Do you want to try again? Y/N: ");
                String _is_loop = (input.next()).toUpperCase();
                is_loop = _is_loop.charAt(0);
                input.nextLine();
                
                // loops if user input more than one character
                if(_is_loop.length() > 1){
                    is_loop = ' ';
                    System.out.println("Input one character only!");
                }
            }
         }while(is_loop != 'N');
         input.close();
    }
}