//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    record Denomination (String name, double amt, String form, String img){}
    public static void main(String[] args) {
        Denomination HundredDollar = new Denomination("HundredDollar", 100.00, "bill", "hundred_note.png");
        Denomination FiftyDollar = new Denomination("FiftyDollar", 50.00, "bill", "fifty_note.png");
        Denomination TwentyDollar = new Denomination("TwentyDollar", 20.00, "bill", "twenty_note.png");
        Denomination TenDollar = new Denomination("TenDollar", 10.00, "bill", "ten_note.png");
        Denomination FiveDollar = new Denomination("FiveDollar", 5.00, "bill", "five_note.png");
        Denomination OneDollar = new Denomination("OneDollar", 1.00, "bill", "one_note.png");
        Denomination quarter = new Denomination("quarter", .25, "coin", "quarter.png");
        Denomination dime = new Denomination("dime", .10, "coin", "dime.png");
        Denomination penny = new Denomination("penny", .01, "coin", "penny.png");
    }
}