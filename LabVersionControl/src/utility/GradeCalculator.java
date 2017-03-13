/**
 * Created by CAMT on 3/13/2017.
 */
public class GradeCalculator {
    public char calculate(double... scores){
        double sum = 0;
        for (int i = 0 ; i < scores.length ; i++) {
            sum = sum + scores[i];
        }
        if(sum <= 100 && sum >= 0){
            if (sum > 95) return 'A';
            if (sum > 80) return 'B';
            if (sum > 60) return 'C';
            return 'F';
        }else {
            return 'x';
        }
    }
}
