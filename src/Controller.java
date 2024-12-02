import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Commands ADD, REMOVE, LIST, LIKE, DISLIKE, EXIT");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            try {
                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println("Введите название книги: ");
                        String name = scanner.nextLine();
                        model.addBook(name);
                        view.displayMessage("Книга добавлена.");
                        break;
                    case "remove":
                        System.out.println("Введите индекс книги для удаления: ");
                        int removeIndex = Integer.parseInt(scanner.nextLine());
                        model.removeBook(removeIndex);
                        view.displayMessage("Книга изъята.");
                        break;
                    case "list":
                        view.displayBooks(model.getBooks());
                        break;
                    case "exit":
                        view.displayMessage("Application exited.");
                        return;
                    case "like":
                        System.out.println("Введите индекс книги для повышения рейтинга: ");
                        int rateUpIndex = Integer.parseInt(scanner.nextLine());
                        model.likeBook(rateUpIndex);
                        break;
                    case "dislike":
                        System.out.println("Введите индекс книги для понижения рейтинга: ");
                        int rateDownIndex = Integer.parseInt(scanner.nextLine());
                        model.dislikeBook(rateDownIndex);
                        break;
                    default:
                        view.displayMessage("Unknown command!");
                }
            }
            catch (Exception e){
                view.displayMessage("Error: " + e.getMessage());
            }
        }
    }
}
