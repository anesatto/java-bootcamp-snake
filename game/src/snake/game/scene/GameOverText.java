package snake.game.scene;

import snake.game.core.Game;
import snake.graphics.basic.Color;
import snake.graphics.basic.Point;
import snake.graphics.drawable.Text;

public class GameOverText extends Text {

    public GameOverText (int score) {
        super("Fim de Jogo!\n PONTOS: " + score,
                new Point(Game.WINDOW_WIDTH / 2 - 75, Game.WINDOW_HEIGHT / 2),
                Color.GREEN);
    }
}
