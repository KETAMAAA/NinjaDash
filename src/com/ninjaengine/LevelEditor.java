package com.ninjaengine;

import com.Util.Vector2;
import com.dataStructure.Transform;

import java.awt.Color;
import java.awt.Graphics2D;

import com.Util.Constants;

public class LevelEditor extends Scene {
	GameObject testObj;
	
	public LevelEditor(String name) {
		super.Scene(name);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		testObj = new GameObject("game object", new Transform(new Vector2(0.0f, 0.0f)));
	}

	@Override
	public void update(double dt) {
		testObj.update(dt);
		
	}

	@Override
	public void draw(Graphics2D g2) {
		g2.setColor(Color.BLUE);
		g2.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
	}

}
