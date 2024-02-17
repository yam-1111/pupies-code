/*
* important notes:
  mut = used for declaring a variable
  import os {input} similar in py's from os import input
*/
import os {input}

fn main(){
	 println("\t############################################")
     println("\t\t GRADES CALCULATOR \n");
     println("\t############################################")

	 /* User Infos*/
	 
	 name := input("please enter your name: ")
	 course := input("please enter your course: ")

	 /*Grades on quiz*/
	 quiz1 := input("please enter your grade in quiz 1: ")
	 mut quiz1_int := quiz1.f32()
	 quiz2 := input("please enter your grade in quiz 1: ")
	 mut quiz2_int := quiz2.f32()

	 /*Grades on recitation*/
	 recitation1 := input("please enter your grade in recitation 1: ")
	 mut recitation1_int := recitation1.f32()
	 recitation2 := input("please enter your grade in recitation 2: ")
	 mut recitation2_int := recitation2.f32()

	  /*Grades on project*/
	 proj1 := input("please enter your grade in project 1: ")
	 mut proj1_int := proj1.f32()
	 proj2 := input("please enter your grade in project 2: ")
	 mut proj2_int := proj2.f32()

	  /*Grades on exam*/
	 exam_rating := input("please enter your grade in exam: ")
	 mut exam_rating_int := exam_rating.f32()

	 mut quiz_avg := (quiz1_int + quiz2_int) / 2
	 mut recitation_avg := (recitation1_int + recitation2_int)/2
	 mut project_avg := (proj1_int + proj2_int) / 2

	 mut class_standing := ((quiz_avg) + (recitation_avg) + (project_avg)) / 3
     mut prelim_grade := ((class_standing * 2) + exam_rating_int) / 3

	 /*Outputs*/
	
	// NOTE : vlang equivalent string format by adding : and formatter i.e %.2f = {$var:.2f}

	 println("\n\t\t----------------------------------------------")
	 println("\t\t\tName : $name\tCourse: $course")
	 println("\t\t\t\t----Average----\n\t\tQuiz Average: ${quiz_avg:.2f}\n\t\tRecitation Average: ${recitation_avg:.2f}\n\t\tProject Average: {${project_avg:.2f}")
	 println("\n\t\tClass Standing : ${class_standing:.2f}\tPrelim Grade: ${prelim_grade:.2f}")
	 println("\t\t----------------------------------------------");

}