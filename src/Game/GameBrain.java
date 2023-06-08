package Game;

import Game.GameParts.Database;
import Game.GameParts.GameMechanics;

public class GameBrain {
    public GameMechanics model;
    public Database data;

    public GameBrain(GameMechanics model, Database data) {//controller
        this.data = data;
        this.model = model;

        data.getDB();
        model.CharacterSelect();
        data.updateCharStats();




    }
}
