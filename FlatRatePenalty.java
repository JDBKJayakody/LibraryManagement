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
class FlatRatePenalty implements PenaltyStrategy {
    private double flatRate;

    public FlatRatePenalty(double flatRate) {
        this.flatRate = flatRate;
    }

    @Override
    public double calculatePenalty(LocalDate actualDate, LocalDate givenDate) {
        int daysLate = (int) (actualDate.toEpochDay() - givenDate.toEpochDay());
        return daysLate > 0 ? flatRate : 0;
    }
}

