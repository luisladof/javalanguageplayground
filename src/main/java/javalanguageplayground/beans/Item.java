package javalanguageplayground.beans;

import javalanguageplayground.annotations.Printable;
import javalanguageplayground.enumeration.Style;

public class Item {

	@Printable(style = Style.UPPERCASE)
	private String title;

	public Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
