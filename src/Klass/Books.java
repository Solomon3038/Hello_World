package Klass;

public class Books {

   String author;
   String name;



    public Books (String author, String name) {
        this.author =author;
        this.name = name;
    }

    public String getauthor (){
        return this.author ;
    }
   public String getName (){
        return this.name;
   }

    public static Books getobjekts (Books o ){
     return o;
    }


    @Override
    public String toString()
    {
        return this.name +this.author;
    }




    public static void main (String [] args){
  Books books = new Books("Waler","Hello Java");
  System.out.println(books.getauthor());
        System.out.println(books.getName());
  Books newbooks = Books.getobjekts(books);
        System.out.println(newbooks);

    }

}
