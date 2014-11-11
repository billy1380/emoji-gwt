package emoji.gwt.emoji.res;

public class Emoji {

	private Emoji one = null;

	public Emoji get() {
		if (one == null) {
			one = new Emoji();
		}

		return one;
	}

}