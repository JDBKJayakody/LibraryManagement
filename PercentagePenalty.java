/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_Management;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class PercentagePenalty implements PenaltyStrategy {

   private double percentage;

    public PercentagePenalty(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculatePenalty(LocalDate actualDate, LocalDate givenDate) {
        int daysLate = (int) (actualDate.toEpochDay() - givenDate.toEpochDay());
        return daysLate > 0 ? percentage * daysLate : 0;
    }
    
}
