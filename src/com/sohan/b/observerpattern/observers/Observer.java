package com.sohan.b.observerpattern.observers;

import com.sohan.b.observerpattern.observable.Observable;

public interface Observer {
	void update(Observable obv, Object obj);
}
