package com.clock.pattern;

public interface Observable {
	  public void addObservateur(Observateur obs);
	  public void updateObservateur();
	  public void delObservateur();
}
