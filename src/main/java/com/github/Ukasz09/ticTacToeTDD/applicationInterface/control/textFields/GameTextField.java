package com.github.Ukasz09.ticTacToeTDD.applicationInterface.control.textFields;

import com.github.Ukasz09.ticTacToeTDD.applicationInterface.ViewManager;
import com.github.Ukasz09.ticTacToeTDD.applicationInterface.sprites.properties.FontProperties;
import com.github.Ukasz09.ticTacToeTDD.applicationInterface.control.buttons.IGameButtonProperties;
import javafx.scene.control.TextField;
import javafx.scene.effect.Effect;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GameTextField extends TextField implements IGameButtonProperties {
    private static final double WIDTH_PROPORTION = 35 / 192d;
    private static final double HEIGHT_PROPORTION = 10 / 108d;
    private static final double FONT_SIZE_PROPORTION = 4 / 192d;
    private static final Effect DEFAULT_INCORRECT_DATA_EFFECT = new InnerShadow(100, Color.DARKRED);

    protected ViewManager manager;

    //----------------------------------------------------------------------------------------------------------------//
    public GameTextField(String promptText) {
        manager = ViewManager.getInstance();
        initializeTextField(promptText);
    }

    //----------------------------------------------------------------------------------------------------------------//
    private void initializeTextField(String promptText) {
        setDefaultAppearance(promptText);
        setDefaultSize();
        setDefaultEvents();
    }

    private void setDefaultAppearance(String promptText) {
        setBackground(new Background(new BackgroundFill(DEFAULT_BACKGROUND_COLOR, new CornerRadii(DEFAULT_CORNER_RADIUS), DEFAULT_INSETS)));
        int fontSize = (int) (manager.getScaledWidth(FONT_SIZE_PROPORTION));
        setDefaultTextFieldFont(DEFAULT_FONT_COLOR_CSS, fontSize);
        setFocusTraversable(false);
        setPromptText(promptText);
    }

    private void setDefaultTextFieldFont(String fontColor, int fontSize) {
        Font font = FontProperties.chargenRegularFont(fontSize);
        setStyle("-fx-text-inner-color: " + fontColor + ";");
        setFont(font);
    }

    private void setDefaultSize() {
        double textFieldWidth = manager.getScaledWidth(WIDTH_PROPORTION);
        double textFieldHeight = manager.getScaledHeight(HEIGHT_PROPORTION);
        setMinSize(textFieldWidth, textFieldHeight);
        setPrefSize(textFieldWidth, textFieldHeight);
    }

    private void setDefaultEvents() {
        setOnMouseEntered(event -> setEffect(DEFAULT_MOUSE_ENTERED_EFFECT));
        setOnKeyPressed(event -> setEffect(DEFAULT_MOUSE_ENTERED_EFFECT));
        setOnMouseExited(event -> setEffect(null));
    }

    public void setDefaultIncorrectDataEffect() {
        setEffect(DEFAULT_INCORRECT_DATA_EFFECT);
    }
}
