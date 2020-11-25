package Orelly;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CreatingCustomerizedSortingCustomerObjects {
    public static void main (String[] args){
        List<Book> books = new ArrayList<>();
        books.add(new Book ("Pepe el Toro", "Effective Java"));
        books.add(new Book("Anne whit E", "Soft Skills"));
        books.add(new Book("James Bond", "Golden Lessons"));
        books.add(new Book("Uncle Bob", "Clean Code"));
        books.add(new Book("Rafael del Nero", "Golden Lesson"));
        books.add(new Book("Uncle Bob", "Clean Architecture"));
        books.add(new Book("Joshua Bloch", "Effective Java"));
        books.add(new Book("John Sonmez", "Soft Skills"));

        //using collections.sort
        Collections.sort(books);

        //books.forEach(System.out::println);
        books.forEach(book -> System.out.println(book.getAuthor()+ " - " + book.getname()));

        //using lambda expression
        System.out.println("Using lambda expression");
        books.sort(( b1, b2 ) -> {
            if (b1.autor.compareTo(b2.autor) == 0) {
                return b1.name.compareTo(b2.name);
            }
                    return b1.autor.compareTo(b2.autor);
        });
        books.forEach(book -> System.out.println (book.getAuthor() + " : " + book.getname()));

        //Using stream with method reference
        System.out.println("Using stream with method reference");

        List<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparing(Book::getAuthor).thenComparing(Book::getname))
                .collect(Collectors.toList());
        sortedBooks.forEach(book -> System.out.println(book.getAuthor() + " : " + book.getname()));

        //Using only method reference
        System.out.println("Using method reference");

        books.sort(Comparator.comparing(Book::getAuthor).thenComparing(Book::getname));
        books.forEach(book -> System.out.println(book.autor + " : " + book.getname()));
    }

    public static class Book implements Comparable<Book>{
        String name;
        String autor;

        public Book (String autor, String name){
            this.autor = autor;
            this.name = name;
        }
        public String getAuthor(){
            return autor;
        }
        public String getname(){
            return name;
        }
        @Override //using this code, the compareTo() method don't let the ID sort the information, we have first the
        //name book and then the author.
         //public int compareTo(Book book) //return name.compareTo(book.name + " : " + book.autor);
        public int compareTo (Book book){
            if (this.getAuthor().compareTo(getAuthor()) == 0)
            {
                return getname().compareTo(book.getname());
            }
            else{
            return getAuthor().compareTo(book.getAuthor());
            }
        }

    }
}
