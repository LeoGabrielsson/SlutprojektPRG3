package Game;

import Game.GameParts.GameMechanics;

public class GameBrain {
    private GameMechanics model;

    public GameBrain(GameMechanics model) {//controller
        this.model = model;


    }

    public GameMechanics getModel() {
        return model;
    }
    public void setModel(GameMechanics model) {
        this.model = model;
    }
}
