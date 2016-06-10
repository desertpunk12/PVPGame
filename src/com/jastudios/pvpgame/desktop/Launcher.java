package com.jastudios.pvpgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jastudios.pvpgame.core.Main;

public class Launcher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = Main.TITLE;
        cfg.width = Main.WIDTH;
        cfg.height = Main.HEIGHT;

        new LwjglApplication(new Main(), cfg);
    }
}
