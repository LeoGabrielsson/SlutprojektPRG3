package Game.GameParts;

import Game.GameParts.Bosses.WyrmlingThundrix;


public class Fights {
    public WyrmlingThundrix Boss1;

    public Fights() {
        f1();
    }

    private void f1() {
        Boss1 = new WyrmlingThundrix();
        int x = 0;
        while(true) {
            if (x == 2 || x == 4) {
                System.out.println("*Thundrix flew away*" +
                        "\n|| Victory against wyrmling Thundrix ||");
                break;
            } else if (x == 1) {
                System.out.println("Defeat");
                System.exit(1);
            } else {
                System.out.println("Next round...");
                x = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            }

        }

    }

    private void f2() {
        System.out.println("I WILL return again, hero." +
                "\n|| Victory against young Thundrix ||");
    }

    private void f3() {
        System.out.println("This is not the end...          || Victory against adult Thundrix ||");
    }

    private void f4() {

    }

}
