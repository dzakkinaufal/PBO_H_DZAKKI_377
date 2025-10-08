class Book {

    private String title;
    private String author;
    private double price;
    private int stock;

    private static final double DISCOUNT_RATE = 0.1;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double calculateDiscount() {
        return getPrice() * (1 - DISCOUNT_RATE);
    }

    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + getStock());
    }

    public void adjustStock(int adjustment) {
        this.stock += adjustment;
        System.out.println("Stock adjusted.");
        System.out.println("Current stock: " + getStock());
    }
}


class Library {

    private Book book;
    private String location;

    public Library(Book book, String location) {
        this.book = book;
        this.location = location;
    }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }


    public void showLibraryInfo() {
        System.out.println("Library Location: " + getLocation());
        getBook().displayInfo();
    }
}


class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.2, 5);
        Library lib = new Library(book1, "Perpustakaan Kota");


        System.out.println("--- Initial Info ---");
        lib.showLibraryInfo();
        System.out.println();

        book1.adjustStock(5);
        System.out.println(); 

        System.out.println("--- Updated Info ---");
        lib.showLibraryInfo();
    }
}