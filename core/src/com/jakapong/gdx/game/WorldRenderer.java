package com.jakapong.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {

	CramTheBookGame cramTheBookGame;
	World world;
	SpriteBatch batch;
	Texture playerImg;
	Player player;
	public WorldRenderer(CramTheBookGame cramTheBookGame, World world){
		this.cramTheBookGame = cramTheBookGame;
		batch = cramTheBookGame.batch;
		this.world = world;
		
		playerImg = new Texture("boy.png");
	}
	public void render(float delta){
		player = world.getPlayer();
		SpriteBatch batch = cramTheBookGame.batch;
		batch.begin();
		Vector2 pos = player.getPosition();
		batch.draw(playerImg,pos.x,pos.y);
		batch.end();
	}
}