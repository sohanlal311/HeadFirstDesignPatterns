package com.sohan.g.proxypattern.remoteproxy;

import java.rmi.Naming;

import com.sohan.f.statepattern.GumBallMonitor;

public class GumBallMonitorTestDrive {

	public static void main(String[] args) throws Exception {
		IGumBallMachineRemote gumBallMachine = (IGumBallMachineRemote) Naming
				.lookup("rmi://localhost/gumBallRemote");
		GumBallMonitor gumBallMonitor = new GumBallMonitor(gumBallMachine);
		gumBallMonitor.getReport();
	}

}
