package Models;

public class Article {


	private String title;
	private String description;
	private String content;
	
	public Article(String t,String d,String c) {
		title=t;
		description=d;
		content=c;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		this.title=t;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String d) {
		this.description=d;
	}
	
	public String getContent() {
		return this.content;
	}
	public void setContent(String c) {
		this.content=c;
	}
	
}
