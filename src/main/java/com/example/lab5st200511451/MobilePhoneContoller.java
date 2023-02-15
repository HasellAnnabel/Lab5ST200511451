package com.example.lab5st200511451;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MobilePhoneContoller implements Initializable {

    @FXML
    private Text modelphone;

    @FXML
    private ImageView phoneimage;



    @Override

    public void initialize (URL url, ResourceBundle resourceBundle){
        MobilePhone iphone11 = new MobilePhone("Iphone11PRO", "/com/example/lab5st200511451/images/Iphone11Pro.jpeg");
        modelphone.setText(iphone11.getModel());
        phoneimage.setImage(iphone11.getImage());

    }

}
