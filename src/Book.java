public class Book {
    private final String name;
    private int rating;

    public Book(String name) {
        this.name = name;
        this.rating = 3;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void decreaseBookRate(){
        if(this.rating == 0){
            System.out.println("Рейтинг книги минимальный. Очень плохая.");
        } else {
            this.rating--;
            System.out.println("Рейтинг книги понижен.");
        }
    }

    public void increaseBookRate(){
        if(this.rating > 4){
            System.out.println("Рейтинг книги максимальный. Книга отличная.");
        } else {
            this.rating++;
            System.out.println("Рейтинг книги повышен.");
        }
    }

}
