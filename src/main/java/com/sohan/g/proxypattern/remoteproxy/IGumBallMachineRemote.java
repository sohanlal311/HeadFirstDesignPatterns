package com.sohan.g.proxypattern.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.sohan.f.statepattern.state.IState;

public interface IGumBallMachineRemote extends Remote {

	int getCount() throws RemoteException;

	IState getCurrentState() throws RemoteException;

}
