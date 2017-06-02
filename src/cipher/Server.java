package cipher;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    
    public  static  void main (String [] args) throws RemoteException, AlreadyBoundException {
        System.out.println("Starting cipheRMI server...");
        System.out.println("Creating remote methods...");
        Remote stub = new MetodosRemotosImpl();
        System.out.println("Binding remote methods...");
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("cipheRMI", stub);
        System.out.println("cipheRMI server started!");
    }
    
}