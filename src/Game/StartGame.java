package Game;

import Game.GameParts.Database;
import Game.GameParts.GameMechanics;

public class StartGame {
    public static void main(String[] args) {
        GameMechanics model = new GameMechanics();
        Database database = new Database();

        GameBrain game = new GameBrain(model,database);
    }
}
