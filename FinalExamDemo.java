
package gradedactivty;
import javax.swing.JOptionPane;

public class FinalExamDemo {
    public static void main(String[] args) {
        String input;
        int qusetons;
        int missed;
        
        input = JOptionPane.showInputDialog("How many"  + " quesios are on the final exam?");
        qusetons = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("How many questions did the Student miss?");
        missed = Integer.parseInt(input);
        FinalExam exam = new FinalExam(qusetons,missed);
        JOptionPane.showMessageDialog(null, 
                "Each questions counts" + exam.getpointEach() + 
                "points.\nThe exam score is " +exam.getScore() + 
                " \nThe exam Grade is " + exam.getGrade());
        System.exit(0);
    }
   
}
