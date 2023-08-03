public class Main {
    public static void main (String[] args) {
        System.out.println("Привет, мир!");
        Author author1 = new Author("Михаил", "Михеев");
        Author author2 = new Author("Михаель", "Гавен");

        Book book1 = new Book("Адмирал", 2016, author1);
        Book book2 = new Book("Заговор адмирала", 2013, author1);
        System.out.println("Автор: " + author1.getFullName());
        System.out.println("Автор: " + author2.getFullName());

        System.out.println("Название книги: " + book1.getName() + ", год издания книги: " + book1.getYear() + ", автор книги: " + book1.getAuthor().getFullName());
        System.out.println("Название книги: " + book2.getName() + ", год издания книги: " + book2.getYear() + ", автор книги: " + book2.getAuthor().getFullName());
    }
}