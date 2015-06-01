//
//  Noto.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 31 May 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji.res;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

/**
 * @author William Shakour (billy1380)
 *
 */
public interface Noto extends ClientBundle, Emojis {
	public static final Noto INSTANCE = GWT.create(Noto.class);

}
