package Study.Car_ex.util;

import java.util.Vector;

public class GenericTest {
    public static void main(String[] args) {
        Book a = new Book(3000);
        Book b = new Book(5000);
        Book c = new Book(7000);
        Book d = new Book(9000);
        Book e = new Book(10000);

        Vector<Book> books = new Vector<>();
        books.add(a);
        books.add(b);
        books.add(c);
        books.add(d);
        books.add(e);

        int avgprice = avgPrice(books);

        System.out.println(avgprice);

    }


    private static int avgPrice(Vector<Book> bookList){
        int sumPrice = 0;
        for(Book book : bookList){
            sumPrice = sumPrice + book.price;
        }
        int avgPrice = sumPrice / bookList.size();

        return avgPrice;
    }

}

class Book{
    int price=0;
    private void setPrice(int price){ this.price = price; }
    Book(int price){
        this.price = price;
    }
}