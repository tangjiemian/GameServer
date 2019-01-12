package com.fxui;

import java.net.URL;

import com.common.utils.CommonFileUtils;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JavaFxUi extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		
		//URL url = getClass().getResource("FXML/Window.fxml");
		
		//System.out.println(url);
		
		BorderPane root = (BorderPane)FXMLLoader.load(CommonFileUtils.getFMXLSourcePath("Window.fxml"));
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
