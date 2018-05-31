package button;



public class Book {
    String name;
    Type bookType;
    String author;
    int year;

    Book(String name, String author, int year, Type type){

        bookType = type;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}