package Game;

import Game.GameParts.GameMechanics;

public class StartGame {
    public static void main(String[] args) {
        GameMechanics model = new GameMechanics();
        GameBrain game = new GameBrain(model);
    }
}
