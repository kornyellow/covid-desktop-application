package kmitl.covid.lib.korn.kornutil;

import javafx.scene.text.Font;
import kmitl.covid.Launcher;

import java.util.Objects;

public class KornFont {
	public static void loadFont() {
		KornFont.fontPathLight = Objects.requireNonNull(Launcher.class.getResource("font/graphikthailoop/GraphikThaiLoop-Light.otf")).toString();
		KornFont.fontPathNormal = Objects.requireNonNull(Launcher.class.getResource("font/graphikthailoop/GraphikThaiLoop-Regular.otf")).toString();
		KornFont.fontPathBold = Objects.requireNonNull(Launcher.class.getResource("font/graphikthailoop/GraphikThaiLoop-Semibold.otf")).toString();

		KornFont.headerLight = Font.loadFont(KornFont.fontPathLight, KornFont.textHeader);
		KornFont.headerNormal = Font.loadFont(KornFont.fontPathNormal, KornFont.textHeader);
		KornFont.headerBold = Font.loadFont(KornFont.fontPathBold, KornFont.textHeader);
		KornFont.subHeaderLight = Font.loadFont(KornFont.fontPathLight, KornFont.textSubHeader);
		KornFont.subHeaderNormal = Font.loadFont(KornFont.fontPathNormal, KornFont.textSubHeader);
		KornFont.subHeaderBold = Font.loadFont(KornFont.fontPathBold, KornFont.textSubHeader);
		KornFont.paragraphLight = Font.loadFont(KornFont.fontPathLight, KornFont.textParagraph);
		KornFont.paragraphNormal = Font.loadFont(KornFont.fontPathNormal, KornFont.textParagraph);
		KornFont.paragraphBold = Font.loadFont(KornFont.fontPathBold, KornFont.textParagraph);
		KornFont.smallLight = Font.loadFont(KornFont.fontPathLight, KornFont.textSmall);
		KornFont.smallNormal = Font.loadFont(KornFont.fontPathNormal, KornFont.textSmall);
		KornFont.smallBold = Font.loadFont(KornFont.fontPathBold, KornFont.textSmall);
	}

	public static Font headerLight;
	public static Font headerNormal;
	public static Font headerBold;
	public static Font subHeaderLight;
	public static Font subHeaderNormal;
	public static Font subHeaderBold;
	public static Font paragraphLight;
	public static Font paragraphNormal;
	public static Font paragraphBold;
	public static Font smallLight;
	public static Font smallNormal;
	public static Font smallBold;

	private static final int textHeader = 24;
	private static final int textSubHeader = 20;
	private static final int textParagraph = 16;
	private static final int textSmall = 14;
	public static String fontPathLight;
	public static String fontPathNormal;
	public static String fontPathBold;
}
