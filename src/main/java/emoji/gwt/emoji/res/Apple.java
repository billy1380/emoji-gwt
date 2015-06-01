//
//  Apple.java
//  emoji-gwt
//
//  Created by William Shakour (billy1380) on 1 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package emoji.gwt.emoji.res;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface Apple extends ClientBundle, Emojis {
	public static final Apple INSTANCE = GWT.create(Apple.class);

	
}
