package Game.GameParts;

import Game.CharacterRoles.Brawler;

import javax.swing.*;

public class CharacterSelect {
    public String selectedCharacter = JOptionPane.showInputDialog(null, "Select character:" +
            "\n Brawler" +
            "\n Rogue W.I.P" +
            "\n Arch Mage W.I.P");

    public CharacterSelect(String selected) {
        if (selected.equals("Brawler")) {
            Brawler B = new Brawler();
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}