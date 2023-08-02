/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_Management;

/**
 *
 * @author User
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByTitleStrategy implements SortingStrategy {
    public void sort(List<Book> books) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }
}
