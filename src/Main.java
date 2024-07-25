//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(":", "{", "}");
        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj1.add("Name").add("Tony");
        sj2.add("LastName").add("Strak");
        System.out.println(sj1.merge(sj2).toString());
    }
}