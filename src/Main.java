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
            static HashMap<Main.Denomination, Integer> cash = new HashMap<>();

            static void add(Denomination m, Integer num) {
                if (cash.containsKey(m))
                    cash.put(m, cash.get(m) + num);
                else
                    cash.put(m, num);
            }


            static void remove(Denomination m, Integer num) {
                cash.remove(m, num);
            }

            public static double getValue()
            {
                double Amount = 0.00;
                if(cash.containsKey(Denomination.HundredDollar))
                {
                    Amount = cash.get(Denomination.HundredDollar) * Denomination.HundredDollar.amt;

                }
                if(cash.containsKey(Denomination.FiftyDollar))
                {
                    Amount = cash.get(Denomination.FiftyDollar) * Denomination.FiftyDollar.amt;

                }

                if(cash.containsKey(Main.Denomination.TwentyDollar))
                {
                    Amount = cash.get(Main.Denomination.TwentyDollar) * Main.Denomination.TwentyDollar.amt;

                }

                if(cash.containsKey(Denomination.TenDollar))
                {
                    Amount = cash.get(Denomination.TenDollar) * Denomination.TenDollar.amt;

                }

                if(cash.containsKey(Denomination.FiveDollar))
                {
                    Amount = cash.get(Denomination.FiveDollar) * Denomination.FiveDollar.amt;

                }

                if(cash.containsKey(Denomination.OneDollar))
                {
                    Amount = cash.get(Denomination.OneDollar) * Denomination.OneDollar.amt;

                }

                if(cash.containsKey(Denomination.Quarter))
                {
                    Amount = cash.get(Denomination.Quarter) * Denomination.Quarter.amt;

                }

                if(cash.containsKey(Main.Denomination.Dime))
                {
                    Amount = cash.get(Main.Denomination.Dime) * Main.Denomination.Dime.amt;

                }

                if(cash.containsKey(Denomination.Nickel))
                {
                    Amount = cash.get(Denomination.Nickel) * Denomination.Nickel.amt;

                }

                if(cash.containsKey(Denomination.Penny))
                {
                    Amount = cash.get(Denomination.Penny) * Denomination.Penny.amt;

                }

                return Amount;
            }





            public static String tostring(){
                String Amount = "";
                if(cash.containsKey(Denomination.HundredDollar))
                {
                    Amount += cash.get(Denomination.HundredDollar) + "  Hundred-Dollar Note \n";

                }
                if(cash.containsKey(Denomination.FiftyDollar))
                {
                    Amount += cash.get(Denomination.FiftyDollar) + "  Fifty-Dollar Note \n";

                }

                if(cash.containsKey(Denomination.TwentyDollar))
                {
                    Amount += cash.get(Denomination.TwentyDollar) + "  Twenty-Dollar Note \n";

                }

                if(cash.containsKey(Denomination.TenDollar))
                {
                    Amount += cash.get(Denomination.TenDollar) + "  Ten-Dollar Note \n";

                }

                if(cash.containsKey(Denomination.FiveDollar))
                {
                    Amount += cash.get(Denomination.FiveDollar) + "  Five-Dollar Note \n";

                }

                if(cash.containsKey(Denomination.OneDollar))
                {
                    Amount += cash.get(Denomination.OneDollar) + "  One-Dollar Note \n";

                }

                if(cash.containsKey(Denomination.Quarter))
                {
                    Amount += cash.get(Denomination.Quarter) + "  Quarter \n";

                }

                if(cash.containsKey(Denomination.Dime))
                {
                    Amount += cash.get(Denomination.Dime) + "  Dime \n";

                }

                if(cash.containsKey(Denomination.Nickel))
                {
                    Amount += cash.get(Denomination.Nickel) + "  Nickel \n";

                }

                if(cash.containsKey(Denomination.Penny))
                {
                    Amount += cash.get(Denomination.Penny) + "  Penny \n";

                }

                return Amount;
            }


    }



    public static class Register
    {
        static void makeChange(double amt)
        {
            double hundreddollar = 0, fiftydollar = 0, twentydollar = 0, tendollar = 0, fivedollar = 0, onedollar = 0, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
            while (amt - 0 > 0.001) {
                if (amt >= 100) {
                    hundreddollar += 1;
                    amt -= 100.00;
                }
                else if (amt >= 50.00) {
                    fiftydollar += 1;
                    amt -= 50.00;
                }
                else if (amt >= 20.00) {
                    twentydollar += 1;
                    amt -= 20.00;
                }
                else if (amt >= 10.00) {
                    tendollar += 1;
                    amt -= 10.00;
                } else if (amt >= 5.00) {
                    fivedollar += 1;
                    amt -= 5.00;
                } else if (amt >= 1.00) {
                    onedollar += 1;
                    amt -= 1.00;
                }else if (amt >= 0.25) {
                    quarters += 1;
                    amt -= 0.25;
                }else if (amt >= 0.10) {
                    dimes += 1;
                    amt -= 0.10;
                }else if (amt >= 0.05) {
                    nickels += 1;
                    amt -= 0.05;
                }
                else if (amt >= 0.01) {
                    pennies += 1;
                    amt -= 0.01;
                }
            }
            while (hundreddollar != 0)
            {
                Purse.add(Denomination.HundredDollar, 1);
                hundreddollar -= 1;
            }
            while (fiftydollar != 0)
            {
                Purse.add(Denomination.FiftyDollar, 1);
                fiftydollar -= 1;
            }
            while (twentydollar != 0)
            {
                Purse.add(Denomination.TwentyDollar, 1);
                twentydollar -= 1;
            }
            while (tendollar != 0)
            {
                Purse.add(Denomination.TenDollar, 1);
                tendollar -= 1;
            }
            while (fivedollar != 0)
            {
                Purse.add(Denomination.FiveDollar, 1);
                fivedollar -= 1;
            }
            while (onedollar != 0)
            {
                Purse.add(Denomination.OneDollar, 1);
                onedollar -= 1;
            }
            while (quarters != 0)
            {
                Purse.add(Denomination.Quarter, 1);
                quarters -= 1;
            }
            while (dimes != 0)
            {
                Purse.add(Denomination.Dime, 1);
                dimes -= 1;
            }while (nickels != 0)
            {
                Purse.add(Denomination.Nickel, 1);
                nickels -= 1;
            }
            while (pennies != 0)
            {
                Purse.add(Denomination.Penny, 1);
                pennies -= 1;
            }

            System.out.println(Purse.tostring());
        }

        public static void main(String[] args) {

            System.out.println("Please enter an amount");
            Scanner sc = new Scanner(System.in);
            double amount = sc.nextDouble();
            makeChange(amount);




        }




    }

}