package com.example.lab5st200511451;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class MobilePhoneContoller {

    @FXML
    private Text modelphone;

    @FXML
    private ImageView phoneimage;

    @FXML
    void initialize() {

        MobilePhone iphone11 = new MobilePhone("Iphone11PRO", "/com/example/lab5st200511451/images/Iphone11Pro.jpeg");
        modelphone.setText(iphone11.getModel());
        phoneimage.setImage(iphone11.getImage());
    }

}
