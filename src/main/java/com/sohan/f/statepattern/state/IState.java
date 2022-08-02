package com.sohan.f.statepattern.state;

import java.io.Serializable;

public interface IState extends Serializable {

	void insertQuarter();

	void ejectQuarter();

	boolean turnsCrank();

	void dispense();

}
