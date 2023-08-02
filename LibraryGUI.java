/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_Management;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LibraryGUI extends JFrame implements ActionListener {
    private JButton sortButton;
    private JComboBox<String> sortingOptions;
    private DefaultListModel<String> bookListModel;
    private JList<String> bookList;
    private Library library;

    public LibraryGUI() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 400);
        getContentPane().setBackground(new Color(204, 255, 255));

        sortingOptions = new JComboBox<>(new String[]{"Sort by Title", "Sort by Author"});
        sortingOptions.addActionListener(this);

        sortButton = new JButton("Sort");
        sortButton.addActionListener(this);

        JPanel topPanel = new JPanel();
        topPanel.add(sortingOptions);
        topPanel.add(sortButton);
        topPanel.setBackground(new Color(204, 255, 255)); 

        bookListModel = new DefaultListModel<>();
        bookList = new JList<>(bookListModel);

        JScrollPane scrollPane = new JScrollPane(bookList);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Biology", "Nandadasa"));
        books.add(new Book("Divine Comedy", "Dante"));
        books.add(new Book("Ape gama", "Martin Wickramasinghe"));
        books.add(new Book("Sahithya Rasaswadaya", "Karuna Samaranayaka"));
        books.add(new Book("The Art of Computer Programming", "Donald Knuth"));
        books.add(new Book("Gamperaliya", "Martin Wickramasinghe"));
        books.add(new Book("Born Digital", "John Palfrey"));
        books.add(new Book("Ben Hur", "Lewis Wallace"));
        books.add(new Book("How to Design Programs", " Matthias Felleisen"));
        books.add(new Book("Concrete Mathematics", "Ronald Graham"));
        books.add(new Book("Introduction to Algorithms", "Thomas H.Coreman"));
        books.add(new Book("Agni Veena", "Kazi Nasrul Islam"));
        books.add(new Book("Araliya", "Nimal Disanayaka"));
        books.add(new Book("Adventures of Tom Sawyer", "Mark Twain"));
        books.add(new Book("Geethanjalee", "Rabindra Nath Tagore"));
        books.add(new Book("Delusions of Gender", "Cordelia Fine"));
        books.add(new Book("Rana Bima Osse Nandikadal", "Sarath Gunarathna"));
        
        
         

        library = new Library();
        library.setSortingStrategy(new SortByTitleStrategy());
        library.sortBooks(books);
        updateBookList(books);
    }

    private void updateBookList(List<Book> books) {
        bookListModel.clear();
        for (Book book : books) {
            bookListModel.addElement(book.getTitle() + " - " + book.getAuthor());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sortButton) {
            List<Book> books = new ArrayList<>();
            books.add(new Book("Biology", "Nandadasa"));
        books.add(new Book("Divine Comedy", "Dante"));
        books.add(new Book("Ape gama", "Martin Wickramasinghe"));
        books.add(new Book("Sahithya Rasaswadaya", "Karuna Samaranayaka"));
        books.add(new Book("The Art of Computer Programming", "Donald Knuth"));
        books.add(new Book("Gamperaliya", "Martin Wickramasinghe"));
        books.add(new Book("Born Digital", "John Palfrey"));
        books.add(new Book("Ben Hur", "Lewis Wallace"));
        books.add(new Book("How to Design Programs", " Matthias Felleisen"));
        books.add(new Book("Concrete Mathematics", "Ronald Graham"));
        books.add(new Book("Introduction to Algorithms", "Thomas H.Coreman"));
        books.add(new Book("Agni Veena", "Kazi Nasrul Islam"));
        books.add(new Book("Araliya", "Nimal Disanayaka"));
        books.add(new Book("Adventures of Tom Sawyer", "Mark Twain"));
        books.add(new Book("Geethanjalee", "Rabindra Nath Tagore"));
        books.add(new Book("Delusions of Gender", "Cordelia Fine"));
        books.add(new Book("Rana Bima Osse Nandikadal", "Sarath Gunarathna"));
        
            String selectedStrategy = (String) sortingOptions.getSelectedItem();
            if (selectedStrategy.equals("Sort by Title")) {
                library.setSortingStrategy(new SortByTitleStrategy());
            } else if (selectedStrategy.equals("Sort by Author")) {
                library.setSortingStrategy(new SortByAuthorStrategy());
            }

            library.sortBooks(books);
            updateBookList(books);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LibraryGUI gui = new LibraryGUI();
            gui.setVisible(true);
             gui.setVisible(true);
            gui.setLocationRelativeTo(null);
        });
    }
}
