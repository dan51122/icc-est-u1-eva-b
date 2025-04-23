package Controllers;
import Models.Book;

public class LibroController {
    public void sortByName(Book[] libros) {
        int tam = libros.length;
        for(int i = 0; i< tam ; i++){
            for (int j = i+1 ; j < tam ; j++){
                if (libros[i].getName().compareTo(libros[j].getName())!=0) {
                String aux = libros[j].getName();
                libros[j].getName() = libros[j+1].getName();
                libros[j+1].getName() = aux;
                }
            }
        }            
    }

    public Book searchByName(Book[] libros, String nombre) {
        // Implementación pendiente
        return null;
    }
}
