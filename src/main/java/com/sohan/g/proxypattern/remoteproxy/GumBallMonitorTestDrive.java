package com.sohan.g.proxypattern.remoteproxy;

import com.sohan.f.statepattern.GumBallMonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumBallMonitorTestDrive {

    public static void main(String[] args) throws Exception {
        runUsingRemoteProxy();
    }

    private static void runUsingRemoteProxy() throws NotBoundException, MalformedURLException, RemoteException {
        IGumBallMachineRemote gumBallMachine = (IGumBallMachineRemote) Naming
                .lookup("rmi://localhost/gumBallRemote");
        GumBallMonitor gumBallMonitor = new GumBallMonitor(gumBallMachine);
        gumBallMonitor.getReport();
    }

}
