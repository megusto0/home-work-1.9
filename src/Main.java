public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Daron", "Acemoglu");
        Author author2 = new Author("Joanne", "Rowling");

        Book book1 = new Book("why nations fail", author1, 2012);
        Book book2 = new Book("harry potter", author2, 1996);
        book2.setPublishYear(1997);
    }
}