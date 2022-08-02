package com.sohan.g.proxypattern.remoteproxy;

import com.sohan.f.statepattern.GumBallMachine;
import com.sohan.f.statepattern.state.IState;

import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumBallMachineTestDrive {

    public static void main(String[] args) {
        try {
            GumBallMachine gumBallMachine = runUsingRemoteProxy();
            runUsingProtectionProxy(gumBallMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static GumBallMachine runUsingRemoteProxy() throws RemoteException, MalformedURLException {
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        System.out.println("RMI registry is ready...");

        GumBallMachine gumBallMachine = new GumBallMachine(5);
        Naming.rebind("rmi://localhost/gumBallRemote", gumBallMachine);
        System.out.println("Server started...");

        gumBallMachine.insertQuarter();
        gumBallMachine.turnsCrank();
        return gumBallMachine;
    }

    private static void runUsingProtectionProxy(IGumBallMachineRemote gumBallMachine) throws RemoteException {
        IGumBallMachineRemote gumBallMachineProxy = (IGumBallMachineRemote) Proxy.newProxyInstance(
                gumBallMachine.getClass().getClassLoader(),
                gumBallMachine.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    if (method.getName().startsWith("get")) {
                        System.out.println("Called.........");
                        return method.invoke(gumBallMachine, args1);
                    }
                    return null;
                });
        IState currentState = gumBallMachineProxy.getCurrentState();
        System.out.println("Current state.... " + currentState);
    }

}
