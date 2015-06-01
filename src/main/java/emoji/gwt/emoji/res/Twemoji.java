//
//  Twemoji.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 1 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji.res;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 * @author William Shakour (billy1380)
 *
 */
public interface Twemoji extends ClientBundle, Emojis {
	public static final Twemoji INSTANCE = GWT.create(Twemoji.class);
}
