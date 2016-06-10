package sisgusol.Xtras;

import com.digi.xbee.api.RemoteXBeeDevice;

public class RemoteDevice {
    
    private RemoteXBeeDevice Rdevice;
    private Boolean acqStatus;
    
    public RemoteDevice (RemoteXBeeDevice aRdevice) {
        Rdevice = aRdevice;
        
    }

    public RemoteXBeeDevice getRdevice() {
        return Rdevice;
    }

    public Boolean getAcqStatus() {
        return acqStatus;
    }
}
