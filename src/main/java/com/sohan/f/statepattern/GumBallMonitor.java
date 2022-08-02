package com.sohan.f.statepattern;

import java.rmi.RemoteException;

import com.sohan.g.proxypattern.remoteproxy.IGumBallMachineRemote;

public class GumBallMonitor {

	private final IGumBallMachineRemote gumBallMachine;

	public GumBallMonitor(IGumBallMachineRemote gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	public void getReport() throws RemoteException {
		System.out.println(gumBallMachine.getCount());
		System.out.println(gumBallMachine.getCurrentState());
	}

}
