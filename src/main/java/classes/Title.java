package classes;

public class Title {
	
	private String text;

	public Title(String text) {
		this.text = text;
	}
	
	public Title() {
		this.text = "Random Chart generated by WS";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
