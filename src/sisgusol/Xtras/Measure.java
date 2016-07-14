package sisgusol.Xtras;

import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Measure {
    private String nodeID;
    private String depth;
    private String address64Bit;
    private String measure;
    private String dateTime;

    public Measure() {
    }

    public void setData(String NodeID, String depth, String Address64Bit, String measure, Date dateTime) {
        this.nodeID = NodeID;
        this.depth = depth;
        this.address64Bit = Address64Bit;
        this.measure = measure;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dateTime = dateTimeFormat.format(dateTime);
    }
    
    public void createDB (DBInterface database) throws SQLException {
        database.createTable("CREATE TABLE IF NOT EXISTS `lisson_sisgusol`.`measurement` ("
                            + " `DATE_TIME` DATETIME NOT NULL ,"
                            + " `NODE_ID` VARCHAR(10) NOT NULL ,"
                            + " `64BIT_ADDRESS` VARCHAR(20) NOT NULL ,"
                            + " `DEPTH` INT NOT NULL ,"
                            + " `MEASURE` FLOAT NOT NULL ,"
                            + " PRIMARY KEY (`DATE_TIME`, `NODE_ID`));");
    }
    
    public void insertIntoDB (DBInterface database) throws SQLException {
        database.insert("INSERT INTO `lisson_sisgusol`.`measurement` "
                        +"VALUES ('"
                        +dateTime+"', '"
                        +nodeID+"', '"
                        +address64Bit+"', "
                        +depth+", "
                        +measure
                        +")");
        System.out.println(dateTime+"---"+nodeID+"---"+address64Bit+"---"+depth+"---"+measure);
    }
}
