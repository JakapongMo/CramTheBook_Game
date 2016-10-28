package com.jakapong.gdx.game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public class GameScreen extends ScreenAdapter{

    private CramTheBookGame cramTheBookGame;
    private Texture playerImg;
 
    public GameScreen(CramTheBookGame cramTheBookGame) {
        this.cramTheBookGame = cramTheBookGame;
        playerImg =  new Texture("boy.png");
    }
    
    @Override
    public void render (float delta) {
    	SpriteBatch batch = cramTheBookGame.batch;
		batch.begin();
		batch.draw(playerImg,100,100);
		batch.end();
    }
}
