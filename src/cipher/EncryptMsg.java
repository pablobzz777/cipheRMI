package cipher;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EncryptMsg implements Serializable{
    List<BigInteger> ecMessage;
    String ecMessageField;
    
    public EncryptMsg(){
        this.ecMessage= new ArrayList<>();
    }
    
}
