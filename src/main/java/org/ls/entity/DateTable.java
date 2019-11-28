package org.ls.entity;

import java.io.Serializable;

public class DateTable implements  Serializable{
	private  static final  long  serialVersionUID=3520594881115970282L;
	private   Integer   draw;
	private   Integer   length = 10;
	private   Integer   start = 0;

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	
	
}
