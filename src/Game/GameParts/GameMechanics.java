package Game.GameParts;

import Game.CharacterRoles.Brawler;

import static javax.swing.JOptionPane.showInputDialog;

public class GameMechanics {
    public static String selected;
    public static Brawler B;

    public GameMechanics() {
        selected = showInputDialog(null, "Select character:" +
                "\n Brawler" +
                "\n Rogue W.I.P" +
                "\n Mage W.I.P");

        if (selected.equals("Brawler") || selected.equals("brawler")) {
            B = new Brawler();
            System.out.println("Character selected" +
                    "\n\n"
                    + B.name + ": It's not a blood sport without a little blood!");
        } else {
            System.out.println("Error selecting character");
            System.exit(4);
        }
    }

    public void brawlerFights(){
        Fights.Fight1();
    }
}