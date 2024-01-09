package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 10000, "han", "12345");
        Album album = new Album("봄 여름 가을 겨울", 15000, "BIGBANG");
        Movie movie = new Movie("신세계", 11000, "유광진", "황정민");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
