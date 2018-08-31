package com.capgemini.icici.domain ;

public class Television {
	private boolean currentState;
	private int currentVolume;
	private int currentChannel;
	public static final int MIN_VOLUME=0;
	public static final int MAX_VOLUME=100;
	
	
	public Television() {
		this.currentState=false;
		this.currentVolume=0;
		this.currentChannel=0;
	}
	public boolean getState() {
		return currentState;
	}
	public void changeState() {
		this.currentState = !currentState;
	}
	public int getVolume() {
		return currentVolume;
	}
	public void increaseVolume() {
		if(currentVolume!=MAX_VOLUME)
		this.currentVolume++; 
	}
	public void decreaseVolume() {
		if(currentVolume!=MIN_VOLUME)
		this.currentVolume-- ; 
	}
	public int getChannel() {
		return currentChannel;
	}
	public void setChannel(int channel) {
		this.currentChannel = channel;
	}
	public void getDetails()
	{
		System.out.println("Current State: "+currentState);
		System.out.println("Current Channel: "+currentChannel);
		System.out.println("Current Volume: "+currentVolume);
	}
	public Television(boolean state, int volume, int channel) {
		this.currentState=state;
		this.currentVolume=volume;
		this.currentChannel=channel;
	}
	
	
	
	
	

}