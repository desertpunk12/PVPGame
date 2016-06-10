package com.jastudios.pvpgame.core.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jastudios.pvpgame.core.Main;

import java.util.Arrays;
import java.util.List;

public class FightState extends State {

    Texture texBg;

    public FightState(GameStateManager gsm) {
        super(gsm);

        texBg = new Texture("backgrounds/bg1.png");


    }

    List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    private Integer test(){

        return ints.parallelStream().reduce(Integer::max).get();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.draw(texBg,0,0, Main.WIDTH,Main.HEIGHT);
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void handleInput(float dt) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void dispose() {
        texBg.dispose();
    }

//    @Override
//    public String getName() {
//        return this.getClass().getName().replace(this.getClass().getPackage().getName()+".","");
//    }

    private void resetGame() {
        gsm.set(new FightState(gsm));
    }

}
