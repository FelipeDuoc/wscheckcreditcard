package com.example.demo.domain;


public class Response {
	private Boolean isvalid;

	public Response(Boolean isvalid) {
		super();
		this.isvalid = isvalid;
	}

	public Response() {
		super();
	}

	public Boolean getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}

	@Override
	public String toString() {
		return "Response [isvalid=" + isvalid + "]";
	}
	
	
}
