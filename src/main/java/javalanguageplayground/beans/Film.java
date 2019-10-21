package javalanguageplayground.beans;

import javalanguageplayground.annotations.Printable;
import javalanguageplayground.enumeration.Style;

public class Film extends Item {

	@Printable(style = Style.LOWERCASE)
	private String director;

	private String mainactor;

	public Film(String title, String director, String mainactor) {
		super(title);
		this.director = director;
		this.mainactor = mainactor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMainactor() {
		return mainactor;
	}

	public void setMainactor(String mainactor) {
		this.mainactor = mainactor;
	}

}
