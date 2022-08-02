package com.sohan.b.observerpattern.observable;

import com.sohan.b.observerpattern.observers.Observer;

public interface Observable {
	void addObserver(Observer o);

	void deleteObserver(Observer o);

	void notifyObservers();
}
