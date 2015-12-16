package com.example.restdatetest;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.Date;

/**
 * @author Maciej Radzikowski
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, setterVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Model {

	private String lorem = "ipsum";

	private Date date = new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLorem() {
		return lorem;
	}

	public void setLorem(String lorem) {
		this.lorem = lorem;
	}

}
