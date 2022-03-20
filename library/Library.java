import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Category> categories = new ArrayList<Category>();
    public void start() {
        while (true) {
            System.out.println("enter your operation(1.add, 2.search): ");

            Scanner operation = new Scanner(System.in);
                int oper = operation.nextInt();
                if (oper == 1) {
                        Scanner bookdata = new Scanner(System.in);
                        Book book = new Book();
                        System.out.println("Name: ");
                        book.name = bookdata.nextLine();
                        System.out.println("Author: ");
                        book.author = bookdata.nextLine();
                        System.out.println("Subject: ");
                        book.subject = bookdata.nextLine();
                        System.out.println("Category: ");
                        String category = bookdata.nextLine();
                        Boolean flag = true;
                        for(Category cat : categories){
                            if(cat.name.contains(category)){
                                book.category = cat;
                                cat.books.add(book);
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            Category cat = new Category(category);
                            cat.books.add(book);
                            book.category = cat;
                            categories.add(cat);
                        }
                        books.add(book);

                    }
                else{
                    System.out.println("Enter name to search: ");
                    Scanner search = new Scanner(System.in);
                    String searched = search.nextLine();
                    Boolean flag= true;
                    for(Category cat : categories){
                        if(cat.name.contains(searched)){
                            System.out.println("Found!!");
                            for(Book b : cat.books){
                                System.out.println(b.name);
                            }
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        for(Book b : books){
                            if(b.name.contains(searched)){
                                System.out.println("Found!!");
                                System.out.println(b.category.name);
                                flag = false;
                                break;   
                            }
                        }
                    }
                    if(flag){
                        System.out.println("Not Found!!");
                    }
                    
                }
                }
            }
        
    

    public static void main(String[] args){
        Library library = new Library();
        library.start();
    }
}
