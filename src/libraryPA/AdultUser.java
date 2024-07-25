package libraryPA;

import java.util.Objects;

public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
        this.bookType = bookType;
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (age >= 12){
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (Objects.equals(bookType, "Fiction")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
