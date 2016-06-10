package com.jastudios.pvpgame.core;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jastudios.pvpgame.core.states.FightState;
import com.jastudios.pvpgame.core.states.GameStateManager;

public class Main extends ApplicationAdapter {

    public static final String TITLE = "PVP Game";
    public static final int WIDTH = 1280;//640;
    public static final int HEIGHT = 720;//360;
    private final boolean showTitleFPS = true;

    private SpriteBatch sb;
    private GameStateManager gsm;

    private float bgColor = 1;

    private float timer = 0;

    @Override
    public void create() {
        sb = new SpriteBatch();
        gsm = new GameStateManager();

//        gsm.push(new MenuState(gsm));
        gsm.push(new FightState(gsm));
    }


    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();

        //<editor-fold defaultstate="collapsed" desc="FPS in title bar">
        if ((timer += dt) > 1) {
            if (showTitleFPS)
                Gdx.graphics.setTitle(TITLE + "," + bgColor + ", FPS:" + Gdx.graphics.getFramesPerSecond());
            timer -= 1;
        }//</editor-fold>

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(bgColor, bgColor, bgColor, 1);

        gsm.update(dt);
        sb.begin();
        gsm.render(sb);
        sb.end();
    }

    @Override
    public void resize(int width, int height) {
        gsm.resize(width, height);
    }

    @Override
    public void dispose() {
        super.dispose();
        sb.dispose();
        gsm.dispose();
    }

}
