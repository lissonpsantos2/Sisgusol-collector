package sisgusol.Xtras;

public class Preferencias {
    
    //Preferências de Conexão XBee
    private String portName;
    private Integer baudRate;
    int i = 2;
    
    //Preferências Banco de Dados
    private String ipDoBD;
    private String nomeDoBD;
    private String usuario;
    private String senha;
    
    public Preferencias () {
        portName = null;
        baudRate = null;
        ipDoBD = null;
        nomeDoBD = null;
        usuario = null;
        senha = null;
    }
    
    public String getPortName () {
        return portName;
    }    
    
    public Integer getBaudRate () {
        return baudRate;
    }
    
    public String getIpDoBD () {
        return ipDoBD;
    }
    
    public String getNomeDoBD () {
        return nomeDoBD;
    }
    
    public String getUsuario () {
        return usuario;        
    }
    
    public String getSenha () {
        return senha;
    }
    
    public void setPortName (String aPortName) {
        portName = aPortName;
    }    
    
    public void setBaudRate (Integer aBaudRate) {
        baudRate = aBaudRate;
    }
    
    public void setIpDoBD (String aIpDoBD) {
        ipDoBD = aIpDoBD;
    }
    
    public void setNomeDoBD (String aNomeDoBD) {
        nomeDoBD = aNomeDoBD;
    }
    
    public void setUsuario (String aUsuario) {
        usuario = aUsuario;
    }
    
    public void setSenha (String aSenha) {
        senha = aSenha;
    }
}
