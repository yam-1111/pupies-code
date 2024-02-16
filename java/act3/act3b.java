
package act3;

import javax.swing.*;

public class act3b {
    public static void main(String[] args) {

        /* data getters */
        String name = JOptionPane.showInputDialog(null, "Name");
        String course = JOptionPane.showInputDialog(null, "Course");

        String _quiz1 = JOptionPane.showInputDialog(null, "Quiz 1");
        String _quiz2 = JOptionPane.showInputDialog(null, "Quiz 2");

        String _recitation1 = JOptionPane.showInputDialog(null, "Recitation 1");
        String _recitation2 = JOptionPane.showInputDialog(null, "Recitation 2");

        String _project1 = JOptionPane.showInputDialog(null, "Project 1");
        String _project2 = JOptionPane.showInputDialog(null, "Project 2");

        String _exam_rating = JOptionPane.showInputDialog(null, "Score in exam");

        /* Data convert */

        double quiz1 = Double.parseDouble(_quiz1);
        double quiz2 = Double.parseDouble(_quiz2);
        double recitation1 = Double.parseDouble(_recitation1);
        double recitation2 = Double.parseDouble(_recitation2);
        double project1 = Double.parseDouble(_project1);
        double project2 = Double.parseDouble(_project2);
        double exam_rating = Double.parseDouble(_exam_rating);

        /* Computation */

        // averages
        double quiz_avg = (quiz1 + quiz2) / 2;
        double recitation_avg = (recitation1 + recitation2)/2;
        double project_avg = (project1 + project2) / 2;

        // grade standimg
        double class_standing = ((quiz_avg) + (recitation_avg) + (project_avg)) / 3;
        double prelim_grade = ((class_standing * 2) + exam_rating) / 3;

        /* Output */
        String result_msg = String.format( "Name : %4s Course : %4s\n\n--Average--\nQuiz Average: %.2f\nRecitation Average: %.2f\nProject Average: %.2f\n\nClass standing: %.2f\nPrelim grade: %.2f",
            name, course, quiz_avg, recitation_avg, project_avg, class_standing, prelim_grade
        );
        JOptionPane.showMessageDialog(null, result_msg);

    }
}
