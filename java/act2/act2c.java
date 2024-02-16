/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
package act2;

/**
 *
 * @author Anthony John Hinay
 */
public class act2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*VARIABLES*/
        String name = "Anthony John Hinay"; //1
        String nickname = "Aj / Hinay / Anthony";//2
        String bday = "8/20/2004";//3
        int age = 19;//3
        String address = "City of Antipolo, Rizal, 1870";//4
        String course = "BSCS (Bachelor of Science in Computer Science";//5
        String mbti = "ISTP"; //6
        String zodiac = "Leo"; //7
        String section = "BSCS 2-1"; //8
        String color = "Purple"; //9
        String favorite_book_in_bible = "Revelation"; //10
        double weight_in_kg = 95.5; //11
        String aspiration = "Dev-ops engineer, ML engineer"; //12
        String birth_address = "Quezon City, NCR"; //13
        String random_hobbies = "Train, cooking"; //14
        String totga_course = "BSCE / BSRE"; //15
        double favorite_radio_station = 96.3; //16
        
        /*SCHOOLS*/
        String curr_school = "Polytechnic University of the Philippines"; //17
        String shs_school = "Our Lady of Fatima University"; //18
        String high_school = "St. Pascual Baylon Academy Inc."; //19
        String elem_school = "GALMI Christian Academy"; //20
        
        
        System.out.println("\t\t\t\t \033[1;33m   ______________________");
        System.out.println("\t\t\t-----------/                      \\----------");
        System.out.println("\t\t\t\t  /                        \\");
        System.out.println("\t\t\t\t /   \033[1;33mHi I'm Anthony John!   \\\033[1;0m");
        System.out.println("\t\t\t\t/    \033[1;36mHere's are my 20 fun    \033[1;0m\\\033[1;33m");
        System.out.println("\t\t\t\t\\     \033[1;33mfacts About me ><      /");
        System.out.println("\t\t\t\t \\                          /");
        System.out.println("\t\t\t\t  \\                        /");
        System.out.println("\t\t\t-----------\\______________________/----------\033[1;0m");
        
        System.out.println("\t\t\t--------------------------------------------");
        System.out.printf("\t\t\t|%2s\033[1;33mName : \033[1;0m\033[1;37m%s\t\t   |\n","", name);
        System.out.printf("\t\t\t|%2s\033[1;34mNickname : \033[1;0m\033[1;36m%s\t   |\n","", nickname);
        System.out.printf("\t\t\t|%2s\033[1;31mFavorite Color: \033[1;0m\033[1;35m%s\033[1;0m\t\t   |\n","", color);
        System.out.printf("\t\t\t|%2s\033[1;37mMBTI: \033[1;0m\033[1;33m%s\033[1;0m\t\t\t\t   |\n","", mbti);
        System.out.printf("\t\t\t|%2s\033[1;36mAge : \033[1;0m\033[1;32m%d\033[1;0m\t\t\t\t   |\n","", age);
        System.out.println("\t\t\t--------------------------------------------\n");
        
        System.out.println("\t\t\t+++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.printf("\t\t\t\033[1;32mWeight  : \033[1;0m\033[1;36m%.2f kg\n", weight_in_kg);
        System.out.printf("\t\t\t\033[1;32mBirthday : \033[1;0m\033[1;36m%s\n", bday);
        System.out.printf("\t\t\t\033[1;32mBirthplace : \033[1;0m\033[1;36m%s\n", birth_address);
        System.out.printf("\t\t\t\033[1;32mAddress : \033[1;0m\033[1;36m%s\n", address);
        System.out.printf("\t\t\t\033[1;32mHobbies : \033[1;0m\033[1;36m%s\n", random_hobbies);
        
         System.out.printf("\t\t\t\033[1;32mZodiac : \033[1;0m\033[1;36m%s\n", zodiac);
         System.out.printf("\t\t\t\033[1;32mFavorite book in bible : \033[1;0m\033[1;36m%s\n", favorite_book_in_bible);
         System.out.printf("\t\t\t\033[1;32mSection : \033[1;0m\033[1;36m%s\n", section);
         System.out.printf("\t\t\t\033[1;32mCurrent School : \033[1;0m\033[1;36m%s\n", curr_school);
         System.out.printf("\t\t\t\033[1;32mI want to be : \033[1;0m\033[1;36m%s in future\n", aspiration);
         System.out.printf("\t\t\t\033[1;32mThe one that got away course : \033[1;0m\033[1;36m%s\n", totga_course);
         System.out.printf("\t\t\t\033[1;32mFavorite Radio Station : \033[1;0m\033[1;36m%.1f\n", favorite_radio_station);
         System.out.printf("\t\t\t\033[1;32mSenior Highschool : \033[1;0m\033[1;36m%s\n", shs_school);
         System.out.printf("\t\t\t\033[1;32mHighschool : \033[1;0m\033[1;36m%s\n", high_school);
         System.out.printf("\t\t\t\033[1;32mElementary School : \033[1;0m\033[1;36m%s\033[1;0m\n", elem_school);
         System.out.println("\n\t\t\t+++++++++++++++++++++++++++++++++++++++++++++\n");
         
          System.out.println("\t\t\t--------------------------------------------");
          System.out.printf("\t\t\t|%2s\033[0;32mThank you for viewing my fun facts!\033[0;0m\t   |\n", "");
          System.out.printf("\t\t\t|%8s\033[0;31mJava Version :\033[4;0m \033[4;37m%s\033[4;0m\t   |\n","", System.getProperty("java.version"));
     
    }
    
}
