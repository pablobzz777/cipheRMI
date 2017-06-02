package cipher;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MetodosRemotosImpl extends UnicastRemoteObject implements MetodosRemotos{
    
    public Random sc = new SecureRandom();
    
    public MetodosRemotosImpl() throws RemoteException{
        super();
    }
    
    @Override
    public EncryptMsg cifrarMensaje(String mensaje) throws RemoteException {
        EncryptMsg msj = new EncryptMsg();
        if (mensaje != ""){
            String ecMsg="";
            msj.ecMessage.clear();
            try {
                BigInteger r = new BigInteger(64, sc);
                byte[] bytes = mensaje.getBytes("UTF-8");
                for( byte elem: bytes ){
                    int aux = elem;
                    String value = Integer.toString(aux);
                    BigInteger X = new BigInteger(value);
                    BigInteger EC = X.multiply(r);
                    msj.ecMessage.add(EC);
                    ecMsg += EC.toString() + "\n";
                }
                msj.ecMessage.add(r);
                ecMsg+=r.toString()+ "\n";
                msj.ecMessageField=ecMsg;
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Cipher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return msj;
    }

    @Override
    public String descifrarMensaje(List<BigInteger> ecMessage) throws RemoteException {
        String dcMsg="";
        if(!ecMessage.isEmpty()){
            List<BigInteger> dcMessage = new ArrayList<>();
            for ( int i=0; i<ecMessage.size()-1; i++){
                BigInteger ad = ecMessage.get(i).divide(ecMessage.get(ecMessage.size()-1));
                dcMessage.add(ad);
            }
            for (BigInteger elem: dcMessage){
                int aux = Integer.parseInt(elem.toString());
                dcMsg += (char)aux;
            }
        }
        return dcMsg;
    }
    
}
