package br.com.erudio;

public class Greeting {

	private long id;
	private final String content;
	
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}
	
	
}
