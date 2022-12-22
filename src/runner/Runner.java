package runner;

import furniture.BookCase;

public class Runner {
    public static void main(String[] args) {
        BookCase bookcase = new BookCase(12.3, -11.5, "brown", 100, 45, 15, true, 74, 5);
        System.out.println(bookcase);
    }
}
