//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.*;


public class Main {



    record Denomination (String name, double amt, String form, String img){
        public static final Denomination HundredDollar = new Denomination("HundredDollars", 100.00, "bill", "images/Hundred_note.png");
        public static final Denomination FiftyDollar = new Denomination("FiftyDollars", 50.00, "bill", "images/fifty_note.png");
        public static final Denomination TwentyDollar = new Denomination("TwentyDollars", 20.00, "bill", "images/twenty_note.png");
        public static final Denomination TenDollar = new Denomination("TenDollars", 10.00, "bill", "images/ten_note.png");
        public static final Denomination FiveDollar = new Denomination("FiveDollars", 5.00, "bill", "images/five_note.png");
        public static final Denomination OneDollar = new Denomination("OneDollar", 1.00, "bill", "images/one_note.png");
        public static final Denomination Quarter = new Denomination("Quarter", 0.25, "coin", "images/quarter.png");
        public static final Denomination Dime = new Denomination("Dime", 0.10, "coin", "images/dime.png");
        public static final Denomination Nickel = new Denomination("Nickel", 0.05, "coin", "images/nickel.png");
        public static final Denomination Penny = new Denomination("Penny", 0.01, "coin", "images/penny.png");



    }
    public static class Purse
    {
            static HashMap<Denomination, Integer> cash = new HashMap<>();

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

                if(cash.containsKey(Denomination.TwentyDollar))
                {
                    Amount = cash.get(Denomination.TwentyDollar) * Denomination.TwentyDollar.amt;

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

                if(cash.containsKey(Denomination.Dime))
                {
                    Amount = cash.get(Denomination.Dime) * Denomination.Dime.amt;

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


        static Purse makeChange(double amt)
        {

            Purse Purse = null;
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

            return Purse;
        }

        public static void main(String[] args) {
            System.out.println("Do you want graphics? <y or n> ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Please enter an amount");
                double amount = sc.nextDouble();
                makeChange(amount);
            }
            else {
                MakingChange.screen();
            }




        }




    }

    public class MakingChange
    {
        Register register = new Register();
        Purse purse = new Purse();
        public static void screen() {
            JFrame frame = new JFrame("Frames and Panels");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.getContentPane().add(new RegisterPanel());

            frame.pack();
            frame.setVisible(true);

        }

    }
    private static class RegisterPanel extends JPanel
    {
        private JTextField textfield;
        private JLabel label;
        Register register = new Register();
        public RegisterPanel() {
            this.setPreferredSize(new Dimension(700, 700));
            this.setBackground(Color.WHITE);

            textfield = new JTextField("Sample Text");
            textfield.setPreferredSize(new Dimension(300, 50));
            textfield.addActionListener(new InputListener());

            label = new JLabel("");
            label.setFont(new Font("Arial", Font.BOLD, 20));

            this.add(textfield);
            this.add(label);





        }

        private class InputListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e) {
                String text = textfield.getText();
                double amt = Double.parseDouble(text);

                Purse purse = register.makeChange(amt);

                label.setText(purse.tostring());


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
                    ImageIcon img = new ImageIcon(Denomination.HundredDollar.img());
                    label.setIcon(img);
                    hundreddollar -= 1;
                }
                while (fiftydollar != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.FiftyDollar.img());
                    label.setIcon(img);
                    fiftydollar -= 1;
                }
                while (twentydollar != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.TwentyDollar.img());
                    label.setIcon(img);
                    twentydollar -= 1;
                }
                while (tendollar != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.TenDollar.img());
                    label.setIcon(img);
                    tendollar -= 1;
                }
                while (fivedollar != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.FiveDollar.img());
                    label.setIcon(img);
                    fivedollar -= 1;
                }
                while (onedollar != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.OneDollar.img());
                    label.setIcon(img);
                    onedollar -= 1;
                }
                while (quarters != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.Quarter.img());
                    label.setIcon(img);
                    quarters -= 1;
                }
                while (dimes != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.Dime.img());
                    label.setIcon(img);
                    dimes -= 1;
                }while (nickels != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.Nickel.img());
                    label.setIcon(img);
                    nickels -= 1;
                }
                while (pennies != 0)
                {
                    ImageIcon img = new ImageIcon(Denomination.Penny.img());
                    label.setIcon(img);
                    pennies -= 1;
                }



            }

        }



    }



}