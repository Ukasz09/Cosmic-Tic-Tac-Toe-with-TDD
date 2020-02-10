package com.github.Ukasz09.ticTacToeTDD.applicationInterface.spritesImplementation.others;

import com.github.Ukasz09.ticTacToeTDD.applicationInterface.spritesAbstraction.properties.ImageSheetProperty;
import com.github.Ukasz09.ticTacToeTDD.applicationInterface.spritesAbstraction.properties.ImagesProperties;
import com.github.Ukasz09.ticTacToeTDD.applicationInterface.spritesAbstraction.properties.SpritesProperties;
import javafx.scene.image.Image;

public class PlayerViewProperties {
    private static final Image DEFAULT_AVATAR = ImagesProperties.schemeSpriteForImageView();
    private static final ImageSheetProperty DEFAULT_SIGN_SHEET_PROPERTY = SpritesProperties.sign1SheetProperty();
    private static final String DEFAULT_NAME = "Janek";

    private Image avatar;
    private ImageSheetProperty signSheetProperty;
    private String name;
    private int winQty = 0;

    public PlayerViewProperties(Image avatar, ImageSheetProperty signSheetProperty, String name) {
        this.avatar = avatar;
        this.signSheetProperty = signSheetProperty;
        this.name = name;
    }

    public PlayerViewProperties() {
        this.avatar = DEFAULT_AVATAR;
        this.signSheetProperty = DEFAULT_SIGN_SHEET_PROPERTY;
        this.name = DEFAULT_NAME;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public void setSignSheetProperty(ImageSheetProperty signSheetProperty) {
        this.signSheetProperty = signSheetProperty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWinQty(int winQty) {
        this.winQty = winQty;
    }
}