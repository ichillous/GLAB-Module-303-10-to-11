package libraryPA;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid1 = new KidUser(10, "Kids");
        KidUser kid2 = new KidUser(18, "Fiction");

        System.out.println("Kid 2: ");
        kid1.registerAccount();
        kid1.requestBook();
        System.out.println("Kid 2: ");
        kid2.registerAccount();
        kid2.requestBook();

        AdultUser adult1 = new AdultUser(5, "Kids");
        AdultUser adult2 = new AdultUser(23, "Fiction");

        System.out.println("Adult 1: ");
        adult1.registerAccount();
        adult1.requestBook();
        System.out.println("Adult 2: ");
        adult2.registerAccount();
        adult2.requestBook();

    }
}
