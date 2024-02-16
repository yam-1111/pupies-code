/*
 * @author Hinay, Anthony John C.
 */

 package act6;


class act6_1{
    public static void main(String[] args) {
        
        // Declare the variables
        int i =0;
        String[] names = {
            "Marygin",
            "Sammy",
            "CJay",             
            "CJoy",             
            "Christle"
        };
        
        // display the output
        for(String name : names){
            System.out.printf("%d. %s\n", i, name); i++;
        }          
    }
}