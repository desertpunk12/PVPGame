package com.jastudios.pvpgame.core.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class State {

    protected GameStateManager gsm;

    public State(GameStateManager gsm) {
        this.gsm = gsm;
    }

    public abstract void render(SpriteBatch sb);

    public abstract void update(float dt);

    public abstract void handleInput(float dt);

    public abstract void resize(int width, int height);

    public abstract void dispose();

    public String getName(){
        //returns the name of the class
        return this.getClass().getName().replace(this.getClass().getPackage().getName()+".","");
    };

}
