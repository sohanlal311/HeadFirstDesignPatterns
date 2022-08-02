package com.sohan.h.mvc;

public interface BeatModelInterface {

	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	int getBPM();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);
	
	void notifyObservers();

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);
}
