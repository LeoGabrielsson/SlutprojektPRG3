package Game.GameParts;

import Game.CharacterRoles.Brawler;

import static javax.swing.JOptionPane.showInputDialog;

public class GameMechanics {
    public String selected;
    public Brawler Hero;

    public GameMechanics() {
        selected = showInputDialog(null, "Select character:" +
                "\n Brawler" +
                "\n Rogue W.I.P" +
                "\n Mage W.I.P");

        if (selected.equals("Brawler") || selected.equals("brawler")) {
            Hero = new Brawler();
            System.out.println("Character selected" +
                    "\n\n"
                    + Hero.name + ": It's not a blood sport without a little blood!");
            new Fights();
        } else {
            System.out.println("Error selecting character");
            System.exit(4);
        }

    }
}