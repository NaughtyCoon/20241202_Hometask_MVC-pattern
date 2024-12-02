import java.util.List;

public class View {
    public void displayBooks(List<Book> books){
        System.out.println("Список книг: ");
        for(int i =0; i < books.size(); i++){
            Book book = books.get(i);
            System.out.println(i + ". " + book.getName() + ", рейтинг книги: " + book.getRating());
        }
        System.out.println();
    }

    public void displayMessage(String message){
        System.out.println(message);
    }
}
