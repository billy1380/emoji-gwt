//
//  ThemeFactory.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 29 May 2016.
//  Copyright © 2016 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji.res;

/**
 * @author William Shakour (billy1380)
 *
 */
public class ThemeFactory {
	public static Emojis getTheme (String themeName) {
		Emojis theme = Noto.INSTANCE;
		switch (themeName) {
		case "apple":
			theme = Apple.INSTANCE;
			break;
		case "twemoji":
			theme = Twemoji.INSTANCE;
			break;
		}

		return theme;
	}
}
