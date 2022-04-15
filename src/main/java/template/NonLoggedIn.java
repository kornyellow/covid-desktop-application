package template;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import lib.korn.kornutil.KornFont;
import lib.methods.authentication.CVAuthEvent;

public class NonLoggedIn {
	public static GridPane getLayout() {
		GridPane gridPane = new GridPane();

		gridPane.setAlignment(Pos.CENTER);
		gridPane.setVgap(10);
		gridPane.setHgap(5);

		TextField usernameField = new TextField();
		TextField passwordField = new TextField();
		usernameField.setFont(KornFont.paragraphNormal);
		passwordField.setFont(KornFont.paragraphNormal);
		usernameField.setPromptText("ชื่อผู้ใช้");
		passwordField.setPromptText("รหัสผ่าน");
		gridPane.add(usernameField, 1,1);
		gridPane.add(passwordField, 1,2);

		VBox headerBox = new VBox();
		Label headerLabel = new Label("แอพพลิเคชั่นจองวัคซีน");
		Label subHeaderLabel = new Label("มหาวิทยาลัยพระจอมเกล้าคุณทหารลาดกระบัง");
		headerLabel.setFont(KornFont.headerBold);
		subHeaderLabel.setFont(KornFont.paragraphNormal);
		headerBox.getChildren().add(headerLabel);
		headerBox.getChildren().add(subHeaderLabel);
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setSpacing(5);
		gridPane.add(headerBox, 0,0);
		GridPane.setColumnSpan(headerBox, 2);

		Label usernameLabel = new Label("ชื่อผู้ใช้ (Username)");
		Label passwordLabel = new Label("รหัสผ่าน (Password)");
		usernameLabel.setFont(KornFont.paragraphNormal);
		passwordLabel.setFont(KornFont.paragraphNormal);
		usernameLabel.setPadding(new Insets(0, 20, 0, 20));
		passwordLabel.setPadding(new Insets(0, 20, 0, 20));
		gridPane.add(usernameLabel, 0,1);
		gridPane.add(passwordLabel, 0,2);

		Label invalidUsernameLabel = new Label();
		Label invalidPasswordLabel = new Label();
		invalidUsernameLabel.setFont(KornFont.paragraphNormal);
		invalidPasswordLabel.setFont(KornFont.paragraphNormal);
		gridPane.add(invalidUsernameLabel, 3,1);
		gridPane.add(invalidPasswordLabel, 3,2);

		Button forgotPasswordButton = new Button("ลืมรหัสผ่าน?");
		Button submitButton = new Button("เข้าสู่ระบบ");
		forgotPasswordButton.setFont(KornFont.paragraphNormal);
		submitButton.setFont(KornFont.paragraphNormal);
		gridPane.add(forgotPasswordButton, 0,3);
		gridPane.add(submitButton, 1,3);
		GridPane.setHalignment(forgotPasswordButton, HPos.CENTER);
		GridPane.setHalignment(submitButton, HPos.CENTER);

		submitButton.setOnAction(CVAuthEvent.submitButtonEvent(
			invalidUsernameLabel,
			usernameField,
			invalidPasswordLabel,
			passwordField
		));

		return gridPane;
	}
}
