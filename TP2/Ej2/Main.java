package TP2;

public class Main {
    /*
    Desarrollar un sistema de gestión para una biblioteca.
    En el main crea una biblioteca, un libro de cada clase y utilizá todos los métodos definidos.
     */
    public static void main(String[]args){
        Library library = new Library();

        Novel ElSabuesoDeLosBaskerville=new Novel("Charlie y la fabrica de chocolate","Roald Dahl",1964,"Novela");
        Infantile TresCerditos=new Infantile("El principito ","Antoine de Saint-Exupéry",1943,6-7);
        Universitary LinuxBible=new Universitary("6502 assembly","Lance a leventhal",1979,"programacion");

        //metodos listbook y add
        library.listBooksAvailable();//escribe mensaje de que no hay libros
        //se agregan tres libros
        library.addBook(ElSabuesoDeLosBaskerville);
        library.addBook(TresCerditos);
        library.addBook(LinuxBible);
        //como ahora hay libros se listan
        library.listBooksAvailable();

        //metodos borrowBook y return book
        library.borrowBook("El principito");
        library.borrowBook("El principito");
        library.returnBook("El principito");
        library.returnBook("El principito");
    }
}
