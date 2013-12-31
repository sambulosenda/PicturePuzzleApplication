package com.picturepuzzle.app;

import java.io.Serializable;

/**
 * Data wrapper
 * Holds player's finishing time and other data as needed
 * @author Chris
 *
 */


public class WinTime implements Serializable {

	private static final long serialVersionUID = -1834367984330374038L;
	private long time;
	
	
	public WinTime(long time) {
		super();
		this.time = time;
	}

	public String toString(){
		StringBuilder timeAsString = new StringBuilder();
		
		timeAsString.append((time/(1000*60*60)%60)).append(":")
		  .append((int)(time/(1000*60)%60)).append(":")
		  .append((int)(time/1000)%60); 
		
		return timeAsString.toString();
	}

	public long getTime() {
		// TODO Auto-generated method stub
		return time;
	}
	
}
