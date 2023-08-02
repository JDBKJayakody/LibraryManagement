/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Library_Management;

import java.time.LocalDate;

/**
 *
 * @author User
 */
interface PenaltyStrategy {
    double calculatePenalty(LocalDate actualDate, LocalDate givenDate);
}

