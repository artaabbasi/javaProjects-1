import java.util.ArrayList;

public class Category {
    public ArrayList<Book> books = new ArrayList<Book>();
    public String name;
    public Category(String name) {
        this.name = name;
    }
}
