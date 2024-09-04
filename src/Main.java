//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;


public class Main {

    record Denomination (String name, double amt, String form, String img){
        public static final Denomination HundredDollar = new Denomination("HundredDollars", 100.00, "bill", "Hundred_note.png");
        public static final Denomination FiftyDollar = new Denomination("FiftyDollars", 50.00, "bill", "fifty_note.png");
        public static final Denomination TwentyDollar = new Denomination("TwentyDollars", 20.00, "bill", "twenty_note.png");
        public static final Denomination TenDollar = new Denomination("TenDollars", 10.00, "bill", "ten_note.png");
        public static final Denomination FiveDollar = new Denomination("FiveDollars", 5.00, "bill", "five_note.png");
        public static final Denomination OneDollar = new Denomination("OneDollar", 1.00, "bill", "one_note.png");
        public static final Denomination Quarter = new Denomination("Quarter", 0.25, "coin", "quarter.png");
        public static final Denomination Dime = new Denomination("Dime", 0.10, "coin", "dime.png");
        public static final Denomination Nickel = new Denomination("Nickel", 0.05, "coin", "nickel.png");
        public static final Denomination Penny = new Denomination("Penny", 0.01, "coin", "penny.png");



    }
    public static class Purse
    {
            static HashMap<Main.Denomination, Integer> cash = new HashMap();

            static void add(Main.Denomination m, Integer num) {
                cash.put(m, num);
            }


            static void remove(Main.Denomination m, Integer num) {
                cash.remove(m, num);

            }

            public static void getValue()
            {

            }





            public String toString(){
                String Amount = "";
                if(cash.containsKey(Main.Denomination.HundredDollar))
                {
                    Amount += cash.get(Main.Denomination.HundredDollar) + "  Hundred-Dollar Note \n";

                }
                if(cash.containsKey(Main.Denomination.FiftyDollar))
                {
                    Amount += cash.get(Main.Denomination.FiftyDollar) + "  Fifty-Dollar Note \n";

                }

                if(cash.containsKey(Main.Denomination.TwentyDollar))
                {
                    Amount += cash.get(Main.Denomination.TwentyDollar) + "  Twenty-Dollar Note \n";

                }

                if(cash.containsKey(Main.Denomination.TenDollar))
                {
                    Amount += cash.get(Main.Denomination.TenDollar) + "  Ten-Dollar Note \n";

                }

                if(cash.containsKey(Main.Denomination.FiveDollar))
                {
                    Amount += cash.get(Main.Denomination.FiveDollar) + "  Five-Dollar Note \n";

                }

                if(cash.containsKey(Main.Denomination.OneDollar))
                {
                    Amount += cash.get(Main.Denomination.OneDollar) + "  One-Dollar Note \n";

                }

                if(cash.containsKey(Main.Denomination.Quarter))
                {
                    Amount += cash.get(Main.Denomination.Quarter) + "  Quarter \n";

                }

                if(cash.containsKey(Main.Denomination.Dime))
                {
                    Amount += cash.get(Main.Denomination.Dime) + "  Dime \n";

                }

                if(cash.containsKey(Main.Denomination.Nickel))
                {
                    Amount += cash.get(Main.Denomination.Nickel) + "  Nickel \n";

                }

                if(cash.containsKey(Main.Denomination.Penny))
                {
                    Amount += cash.get(Main.Denomination.Penny) + "  Penny \n";

                }

                return Amount;
            }






    }
    public static void main(String[] args) {


        Purse.add(Denomination.HundredDollar, 1);
        Purse.getValue();


    }
}