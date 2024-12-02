import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Book> books = new ArrayList<>();

    public void addBook(String name){
        books.add(new Book(name));
    }

    public void removeBook(int index){
        if (index >= 0 && index<books.size()){
            books.remove(index);
        }else{
            throw new IllegalArgumentException("Wrong book index");
        }
    }

    public void likeBook(int index){
        books.get(index).increaseBookRate();
    }

    public void dislikeBook(int index){
        books.get(index).decreaseBookRate();
    }

    public List<Book> getBooks(){
        return books;
    }

}
