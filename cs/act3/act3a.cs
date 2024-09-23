
/******** Grades Calculator ********
 * 
 * This program calculates the average of 3 grades
 * and displays the result.
 * 
 * *********************************/

using System;

class gradesA
{
    public static void Main(string[] args)
    {
        Console.WriteLine("=======================");
        Console.WriteLine("====== Grades Calculator =======");
        Console.WriteLine("=======================");

        string name, course;
        double q1, q2, rec1, rec2, proj1, proj2, exam_rating;
        double quiz_avg, rec_avg, proj_avg, class_standing, prelim_grade;

        //input
        Console.Write("Enter your name: ");
        name = Console.ReadLine();
        Console.Write("Enter your course: ");
        course = Console.ReadLine();
        Console.Write("Enter your quiz 1 grade: ");
        q1 = double.Parse(Console.ReadLine());
        Console.Write("Enter your quiz 2 grade: ");
        q2 = double.Parse(Console.ReadLine());
        Console.Write("Enter your recitation 1 grade: ");
        rec1 = double.Parse(Console.ReadLine());
        Console.Write("Enter your recitation 2 grade: ");
        rec2 = double.Parse(Console.ReadLine());
        Console.Write("Enter your project 1 grade: ");
        proj1 = double.Parse(Console.ReadLine());
        Console.Write("Enter your project 2 grade: ");
        proj2 = double.Parse(Console.ReadLine());
        Console.Write("Enter your exam rating: ");
        exam_rating = double.Parse(Console.ReadLine());

        // calculate the avg's
        quiz_avg = (q1 + q2) / 2;
        rec_avg = (rec1 + rec2) / 2;
        proj_avg = (proj1 + proj2) / 2;
        class_standing = (quiz_avg + rec_avg + proj_avg) / 4;
        prelim_grade = ((class_standing * 2) + (exam_rating)) / 3;

        //display the grade
        Console.WriteLine("---------------------");
        Console.Write($"\t\tName : {name}\t\tCourse : {course}\n");
        Console.Write($"\t\t-- Average -\n\t\tQuiz Average: {quiz_avg:F2}\n\t\tRecitation Average: {rec_avg:F2}\n\t\tProject Average: {proj_avg:F2}\n");
        Console.Write($"\n\t\tClass Standing: {class_standing:F2}\n\t\tPrelim Grade: {prelim_grade:F2}\n");

    }

}