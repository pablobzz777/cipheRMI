package cipher;

import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MetodosRemotos extends Remote {
    public EncryptMsg cifrarMensaje (String mensaje) throws RemoteException;
    public String descifrarMensaje (List<BigInteger> ecMessage) throws RemoteException;
}
