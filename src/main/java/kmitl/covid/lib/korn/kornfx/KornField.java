package kmitl.covid.lib.korn.kornfx;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Pair;
import kmitl.covid.lib.classes.other.PasswordSkin;
import kmitl.covid.lib.enums.EnumGender;
import kmitl.covid.lib.enums.EnumNameTitle;
import kmitl.covid.lib.enums.EnumVaccineType;
import kmitl.covid.lib.korn.kornresource.KornFont;
import kmitl.covid.lib.korn.kornutil.KornDateTime;

import java.time.chrono.ThaiBuddhistChronology;

public class KornField {
	public static VBox getTextFieldWithLabel(String labelText) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		TextField field = new TextField();
		field.setFont(KornFont.paragraphNormal);
		field.getStyleClass().add("form");

		VBox box = new VBox();
		box.setSpacing(15);
		box.getChildren().add(label);
		box.getChildren().add(field);

		return box;
	}
	public static VBox getPasswordFieldWithLabel(String labelText) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		PasswordField field = new PasswordField();
		field.setFont(KornFont.paragraphNormal);
		field.setSkin(new PasswordSkin(field));
		field.getStyleClass().add("form");

		VBox box = new VBox();
		box.setSpacing(15);
		box.getChildren().add(label);
		box.getChildren().add(field);

		return box;
	}
	public static Pair<VBox, ToggleGroup> getRadioButtonGender(String labelText) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		ToggleGroup group = new ToggleGroup();

		RadioButton radioButton1 = new RadioButton(EnumGender.MALE.getThai());
		radioButton1.setUserData(EnumGender.MALE.getThai());
		radioButton1.setFont(KornFont.paragraphNormal);
		radioButton1.setToggleGroup(group);
		radioButton1.getStyleClass().addAll("form-radio");

		RadioButton radioButton2 = new RadioButton(EnumGender.FEMALE.getThai());
		radioButton2.setUserData(EnumGender.FEMALE.getThai());
		radioButton2.setFont(KornFont.paragraphNormal);
		radioButton2.setToggleGroup(group);
		radioButton2.getStyleClass().addAll("form-radio");

		RadioButton radioButton3 = new RadioButton(EnumGender.NOT_SPECIFIED.getThai());
		radioButton3.setUserData(EnumGender.NOT_SPECIFIED.getThai());
		radioButton3.setFont(KornFont.paragraphNormal);
		radioButton3.setToggleGroup(group);
		radioButton3.getStyleClass().addAll("form-radio");

		HBox radioBox = new HBox();
		radioBox.setSpacing(15);
		radioBox.getChildren().add(radioButton1);
		radioBox.getChildren().add(radioButton2);
		radioBox.getChildren().add(radioButton3);

		VBox box = new VBox();
		box.setSpacing(20);
		box.getChildren().add(label);
		box.getChildren().add(radioBox);

		return new Pair<>(box, group);
	}

	public static Pair<VBox, ToggleGroup> getRadioButtonVaccineType(String labelText) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		ToggleGroup group = new ToggleGroup();

		RadioButton radioButton1 = new RadioButton(EnumVaccineType.PFIZER.getThai());
		radioButton1.setUserData(EnumVaccineType.PFIZER.getThai());
		radioButton1.setFont(KornFont.paragraphNormal);
		radioButton1.setToggleGroup(group);
		radioButton1.getStyleClass().addAll("form-radio");

		RadioButton radioButton2 = new RadioButton(EnumVaccineType.MODERNA.getThai());
		radioButton2.setUserData(EnumVaccineType.MODERNA.getThai());
		radioButton2.setFont(KornFont.paragraphNormal);
		radioButton2.setToggleGroup(group);
		radioButton2.getStyleClass().addAll("form-radio");

		RadioButton radioButton3 = new RadioButton(EnumVaccineType.ASTRAZENECA.getThai());
		radioButton3.setUserData(EnumVaccineType.ASTRAZENECA.getThai());
		radioButton3.setFont(KornFont.paragraphNormal);
		radioButton3.setToggleGroup(group);
		radioButton3.getStyleClass().addAll("form-radio");

		RadioButton radioButton4 = new RadioButton(EnumVaccineType.JOHNSON.getThai());
		radioButton4.setUserData(EnumVaccineType.JOHNSON.getThai());
		radioButton4.setFont(KornFont.paragraphNormal);
		radioButton4.setToggleGroup(group);
		radioButton4.getStyleClass().addAll("form-radio");

		RadioButton radioButton5 = new RadioButton(EnumVaccineType.SINOVAC.getThai());
		radioButton5.setUserData(EnumVaccineType.SINOVAC.getThai());
		radioButton5.setFont(KornFont.paragraphNormal);
		radioButton5.setToggleGroup(group);
		radioButton5.getStyleClass().addAll("form-radio");

		HBox radioBox = new HBox();
		radioBox.setSpacing(15);
		radioBox.getChildren().add(radioButton1);
		radioBox.getChildren().add(radioButton2);
		radioBox.getChildren().add(radioButton3);
		radioBox.getChildren().add(radioButton4);
		radioBox.getChildren().add(radioButton5);

		VBox box = new VBox();
		box.setSpacing(20);
		box.getChildren().add(label);
		box.getChildren().add(radioBox);

		return new Pair<>(box, group);
	}

	public static Pair<VBox, ToggleGroup> getRadioButtonNameTitle(String labelText) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		ToggleGroup group = new ToggleGroup();

		RadioButton radioButton1 = new RadioButton(EnumNameTitle.MISTER.getThai());
		radioButton1.setUserData(EnumNameTitle.MISTER.getThai());
		radioButton1.setFont(KornFont.paragraphNormal);
		radioButton1.setToggleGroup(group);
		radioButton1.getStyleClass().addAll("form-radio");

		RadioButton radioButton2 = new RadioButton(EnumNameTitle.MISS.getThai());
		radioButton2.setUserData(EnumNameTitle.MISS.getThai());
		radioButton2.setFont(KornFont.paragraphNormal);
		radioButton2.setToggleGroup(group);
		radioButton2.getStyleClass().addAll("form-radio");

		RadioButton radioButton3 = new RadioButton(EnumNameTitle.MISTRESS.getThai());
		radioButton3.setUserData(EnumNameTitle.MISTRESS.getThai());
		radioButton3.setFont(KornFont.paragraphNormal);
		radioButton3.setToggleGroup(group);
		radioButton3.getStyleClass().addAll("form-radio");

		HBox radioBox = new HBox();
		radioBox.setSpacing(15);
		radioBox.getChildren().add(radioButton1);
		radioBox.getChildren().add(radioButton2);
		radioBox.getChildren().add(radioButton3);

		VBox box = new VBox();
		box.setSpacing(20);
		box.getChildren().add(label);
		box.getChildren().add(radioBox);

		return new Pair<>(box, group);
	}


	public static VBox getDatePicker(String labelText, double width, KornDateTime initialDate) {
		Label label = new Label(labelText);
		label.setFont(KornFont.paragraphNormal);
		label.getStyleClass().add("text");

		DatePicker datePicker;
		if (initialDate != null) datePicker = new DatePicker(initialDate.getLocalDate());
		else datePicker = new DatePicker();

		datePicker.getEditor().setDisable(true);
		datePicker.getEditor().setFont(KornFont.paragraphNormal);
		datePicker.getStyleClass().add("form-date-picker");
		datePicker.setMinWidth(width);
		datePicker.setChronology(ThaiBuddhistChronology.INSTANCE);
		datePicker.setShowWeekNumbers(false);

		VBox box = new VBox();
		box.setSpacing(20);
		box.getChildren().add(label);
		box.getChildren().add(datePicker);

		return box;
	}
}
