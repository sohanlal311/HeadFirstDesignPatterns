package com.sohan.g.proxypattern.remoteproxy;

import java.rmi.Naming;

import com.sohan.f.statepattern.GumBallMachine;

public class GumBallMachineTestDrive {

	public static void main(String[] args) {
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			System.out.println("RMI registry is ready...");
			GumBallMachine gumBallMachine = new GumBallMachine(5);
			Naming.rebind("rmi://localhost/gumBallRemote", gumBallMachine);
			System.out.println("Server started...");
			gumBallMachine.insertQuarter();
			gumBallMachine.turnsCrank();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
