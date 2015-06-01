//
//  Emoji.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 15 Nov 2014.
//  Copyright © 2014 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeUri;

import emoji.gwt.emoji.res.Apple;
import emoji.gwt.emoji.res.Emojis;

public class Emoji {

	private static Emoji one = null;

	/**
	 * Get Emoji with default theme.
	 * 
	 * @return
	 */
	public static Emoji get() {
		return get(null);
	}

	/**
	 * Get Emoji with theme. Swapping between themes will cause a rebuild of the
	 * lookup.
	 * 
	 * @param theme
	 * @return
	 */
	public static Emoji get(Emojis theme) {
		if (one == null) {
			one = new Emoji(theme);
		} else {
			one.setTheme(theme);
		}

		return one;
	}

	private Map<String, ImageResource> lookup = null;
	private Emojis instance;

	private Emoji(Emojis theme) {
		setTheme(theme == null ? Apple.INSTANCE : theme);
	}

	/**
	 * 
	 */
	private void build() {
		lookup = new HashMap<String, ImageResource>();

	}

	public ImageResource resource(String name) {
		return lookup.get(name);
	}

	public SafeUri safeUri(String name) {
		ImageResource i = resource(name);

		return i == null ? null : i.getSafeUri();
	}

	public String uri(String name) {
		ImageResource i = resource(name);

		return i == null ? null : i.getSafeUri().asString();
	}

	public boolean isValid(String name) {
		if (name == null) {
			return false;
		}

		return Emoji.get().resource(name) != null;
	}

	public Set<String> keyWords() {
		return lookup.keySet();
	}

	public void setTheme(Emojis theme) {
		if (theme != instance) {
			instance = theme;
		}

		build();
	}
}