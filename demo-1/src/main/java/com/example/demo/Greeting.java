package com.example.demo;

import javax.validation.constraints.NotEmpty;

public class Greeting {
	private long id;
	@NotEmpty
	  private String content;

	  public long getId() {
	    return id;
	  }
	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getContent() {
	    return content;
	  }
	  public void setContent(String content) {
	    this.content = content;
	  }
}
