package sisgusol.Xtras;

public class Preferences {
    
    //Preferências de Conexão XBee
    private String portName;
    private Integer baudRate;
    
    //Preferências Banco de Dados
    private String DBip;
    private String DBname;
    private String DBuser;
    private String DBpassword;

    public Preferences(String portName, Integer baudRate, String aDBip, String aDBname, String aDBuser, String aDBpassword) {
        this.portName = portName;
        this.baudRate = baudRate;
        this.DBip = aDBip;
        this.DBname = aDBname;
        this.DBuser = aDBuser;
        this.DBpassword = aDBpassword;
    }
    
    
    public String getPortName () {
        return portName;
    }    
    
    public Integer getBaudRate () {
        return baudRate;
    }
    
    public String getIpDoBD () {
        return DBip;
    }
    
    public String getNomeDoBD () {
        return DBname;
    }
    
    public String getUsuario () {
        return DBuser;        
    }
    
    public String getSenha () {
        return DBpassword;
    }
    
    public void setPortName (String aPortName) {
        portName = aPortName;
    }    
    
    public void setBaudRate (Integer aBaudRate) {
        baudRate = aBaudRate;
    }
    
    public void setIpDoBD (String aDBip) {
        DBip = aDBip;
    }
    
    public void setNomeDoBD (String aDBname) {
        DBname = aDBname;
    }
    
    public void setUsuario (String aDBuser) {
        DBuser = aDBuser;
    }
    
    public void setSenha (String aDBpassword) {
        DBpassword = aDBpassword;
    }
}
