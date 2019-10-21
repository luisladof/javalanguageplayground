package javalanguageplayground.beans;

import javalanguageplayground.annotations.Printable;

public class Book extends Item {

	@Printable
	private String author;

	private String editor;

	public Book(String title, String author, String editor) {
		super(title);
		this.author = author;
		this.editor = editor;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

}
