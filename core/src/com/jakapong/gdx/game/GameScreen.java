package com.jakapong.gdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
public class GameScreen extends ScreenAdapter{

    private CramTheBookGame cramTheBookGame;
    private Texture playerImg;
    private Player player;
    
    private int x;
    private int y;
    World world;
    WorldRenderer worldRenderer;
    
    public GameScreen(CramTheBookGame cramTheBookGame) {
        this.cramTheBookGame = cramTheBookGame;
        playerImg =  new Texture("boy.png");
        
        world = new World(cramTheBookGame);
        player = world.getPlayer();
    }
    
    @Override
    public void render (float delta) {
    	update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        worldRenderer = new WorldRenderer(cramTheBookGame, world);
        worldRenderer.render(delta);
      	
    }
    private void update(float delta){
    	if(Gdx.input.isKeyPressed(Keys.UP)){
       		player.move(player.DIRECTION_UP);
       	}
    	if(Gdx.input.isKeyPressed(Keys.RIGHT)){
    		player.move(player.DIRECTION_RIGHT);
       	}
    	if(Gdx.input.isKeyPressed(Keys.LEFT)){
    		player.move(player.DIRECTION_LEFT);
       	}
       	if(Gdx.input.isKeyPressed(Keys.DOWN)){
       		player.move(player.DIRECTION_DOWN);
       	}
    }
}
