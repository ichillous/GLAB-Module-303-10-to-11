package libraryPA;

import java.util.Objects;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11){
            System.out.println("You have successfully registered under a Kids Account");
        }
    }

    @Override
    public void requestBook() {
        if (Objects.equals(bookType, "Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
