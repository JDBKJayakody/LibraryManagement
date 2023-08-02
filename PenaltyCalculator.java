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
class PenaltyCalculator {
    private PenaltyStrategy strategy;

    public void setStrategy(PenaltyStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePenalty(LocalDate actualDate, LocalDate givenDate) {
        return strategy.calculatePenalty(actualDate, givenDate);
    }
}


