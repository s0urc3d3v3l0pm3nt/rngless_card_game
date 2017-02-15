package com.mygdx.game.Views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.mygdx.game.Game;
import com.mygdx.game.UI.SimpleButton;


public class Home extends View {

    private Stage stage;

    @Override
    public void render() {
        stage.draw();
    }

    @Override
    public Game.viewIndexes update() {
        //Don't switch off Home by default
        return Game.viewIndexes.HOME;
    }

    @Override
    public void create() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        //Make the menu buttons
        SimpleButton playButton = new SimpleButton("Play");

        //Add them to the screen in a simple layout
        Table table = new Table();
        table.setFillParent(true);
        table.center().center();
        table.add(playButton.getButton());
        stage.addActor(table);

    }
}
