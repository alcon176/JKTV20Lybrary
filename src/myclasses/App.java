/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import entity.Reader;
import entity.Author;
import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    Scanner scanner = new Scanner(System.in);
    Book[] books = new Book[10];
    Reader[] readers = new Reader[10];
    public App() {
    }
    
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить книгу");
            System.out.println("2: Список книг");
            System.out.println("3: Добавить читателя");
            System.out.println("4: Список читателей");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0: 
                    repeat="q";
                    System.out.println("Программа закончена");
                    break;
                case 1: 
                    System.out.println("Добавление книги: ");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] == null){
                            books[i] = addBook();
                            break;
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                            System.out.println(books[i].toString());
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Добавление читателя: ");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] == null){
                            readers[i] = addReader();
                            break;
                        }
                    }
                    break;
                case 4: 
                    System.out.println("Список читателей: ");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] != null){
                            System.out.println(readers[i].toString());
                        }
                    }
                    break;
            }
        }while("y".equals(repeat));
    }
    private Reader addReader(){
        Reader reader = new Reader();
        System.out.print("Введите имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Введите номер телефона читателя: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }
    private Book addBook(){
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setCaption(scanner.nextLine());
        System.out.print("Введите год издания: ");
        book.setPublicedyear(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Сколько авторов у книги: ");
        int countAuthors=scanner.nextInt();
        scanner.nextLine();
        Author[] authors = new Author[countAuthors];
        for (int i = 0; i < authors.length; i++) {
            System.out.println("Добавление автора "+(i+1));
            Author author = new Author();
            System.out.print("Имя автора: ");
            author.setName(scanner.nextLine());
            System.out.print("Фамилия автора: ");
            author.setLastname(scanner.nextLine());
            System.out.print("Год рождения автора: ");
            author.setYear(scanner.nextInt());
            System.out.print("День рождения автора: ");
            author.setDay(scanner.nextInt());
            System.out.print("Месяц рождения автора: ");
            author.setMonth(scanner.nextInt());
            scanner.nextLine();
            authors[i]= author;
        }
        book.setAuthor(authors);
        return book;
    }
        //System.out.println("Hello!");
     //   Book book1 = new Book();
     //   book1.setCaption("Voina i Mir");
     //   Author author1 = new Author();
     //   author1.setName("Lev");
     //   author1.setLastname("Tolstoy");
     //   author1.setYear(1828);
     //  author1.setDay(9);
     //   author1.setMonth(9);
     //   Author[] authors = new Author[1];
     //   authors[0]=author1;        
     //   book1.setAuthor(authors);
     //   book1.setPublicedyear(2005);
     //   Book book2 = new Book();
     //   book2.setCaption("Otsi i deti");
     //   Author author2 = new Author();
     //   author2.setName("Ivan");
     //   author2.setLastname("Turgenev");
     //   author2.setYear(1818);
     //   author2.setDay(28);
     //   author2.setMonth(10);
     //   Author[] authors2 = new Author[1];
     //   authors2[0]=author2;
     //   book2.setAuthor(authors2);
     //   book2.setPublicedyear(2007);
        
     //   Reader rider1 = new Reader();
     //   rider1.setFirstname("Ivan");
     //   rider1.setLastname("Ivanov");
     //   rider1.setPhone("486465464");
        
     //   History history1 = new History();
     //   history1.setBook(book1);
     //   history1.setRiden(rider1);
     //   Calendar c = new GregorianCalendar();      
     //   history1.setGivenDate(c.getTime());
        
     //   System.out.println("history1 - "+history1.toString());
        
     //  history1.setReturnDate(c.getTime());
     //   System.out.println("History1 - "+history1.toString());
 //   }


    
    
    
}
