
package gradedactivty;


public class FinalExam  extends GradedActivty{

    private int numQusetions;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam(int questios, int missed){
        
        double numericScore;
        numQusetions = questios; //จำนวนข้อสอบ
        numMissed = missed;   //จำนวนข้อที่ทำผิด
        pointsEach = 100.0 / questios; // ข้อที่ทำผิดหาร 100 จะได้จำนวนคะแนนต่อข้อ
        numericScore = 100.0 - (missed * pointsEach);
         setScore(numericScore);
        
    }
    public double getpointEach(){
    return pointsEach;
    }
    public int getNumMissed(){
        return numMissed;
    }
    
}
