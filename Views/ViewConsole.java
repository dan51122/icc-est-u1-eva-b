package Views;
import Models.Book;

public class ViewConsole {
    
    public void mostrarArray(Book[] books){
        for(int i = 0; i< books.length;i++ ){
            System.out.print(" " + books[i] + ";");
        }
    }
    public void mostrarMessage(String message){
        System.out.println(message);
    }
}
