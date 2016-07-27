package sisgusol.Xtras;

import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Measure {
    
    private String dateTime;
    private String address64Bit;    
    private String nodeID;
    private String mSensor30;
    private String mSensor60;    

    public Measure() {
    }

    public void setData(Date dateTime, String Address64Bit, String NodeID, String mSensor30, String mSensor60) {
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dateTime = dateTimeFormat.format(dateTime);
        this.address64Bit = Address64Bit;
        this.nodeID = NodeID;
        this.mSensor30 = mSensor30;
        this.mSensor60 = mSensor60;        
    }
    
    public void createDB (DBInterface database) throws SQLException {
        database.createTable("CREATE TABLE IF NOT EXISTS `"+database.DBname+"`.`t_measurement` ("
                            + " `DATE_TIME` DATETIME NOT NULL ,"
                            + " `64BIT_ADDRESS` VARCHAR(20) NOT NULL ,"
                            + " `NODE_ID` VARCHAR(10) NOT NULL ,"
                            + " `M_SENSOR30` FLOAT NOT NULL ,"
                            + " `M_SENSOR60` FLOAT NOT NULL ,"
                            + " PRIMARY KEY (`DATE_TIME`, `64BIT_ADDRESS`));");
    }
    
    public void insertIntoDB (DBInterface database) throws SQLException {
        database.insert("INSERT INTO `"+database.DBname+"`.`t_measurement` "
                        +"VALUES ('"
                        +dateTime+"', '"
                        +address64Bit+"', '"
                        +nodeID+"', "                        
                        +mSensor30+", "
                        +mSensor60
                        +")");
    }
}
