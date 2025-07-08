package snake.config;

public record GameConfig(
        WindowConfig window,
        ApplicationConfig applicationConfig,
        FoodConfig food,
        GameOverConfig gameOver,
        SnakeConfig snake
) {
}
