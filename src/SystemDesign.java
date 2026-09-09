import javax.xml.crypto.Data;

interface DataBases{
    void connect();
    void disconnect();
}
class Mysql implements DataBases{
    public void connect(){
        System.out.println("This is a mysql connection");
    }
    public void disconnect(){
        System.out.println("mysql is disconnected");
    }
}
class Postgresql implements DataBases{
    public void connect(){
        System.out.println("Postgresql is connected");
    }
    public void disconnect(){
        System.out.println("Postgresql is disconnected");
    }
}
class MongoDB implements DataBases{
    public void connect(){
        System.out.println("MongoDB is connected");
    }
    public void disconnect(){
        System.out.println("MongoDB is disconnected");
    }
}
interface DataBasesFactory{
    DataBases createDataBases();
}
class MysqlFactory implements DataBasesFactory{
    public DataBases createDataBases(){
        return new Mysql();
    }
}
class PostgresqlFactory implements DataBasesFactory{
    public DataBases createDataBases(){
        return new Postgresql();
    }
}
class MongoDBFactory implements DataBasesFactory{
    public DataBases createDataBases(){
        return new MongoDB();
    }
}
public class SystemDesign{
    public static void main(String[] args){
        DataBasesFactory mysqlFactory=new MysqlFactory();
        DataBases mysql= mysqlFactory.createDataBases();
        mysql.connect();
        mysql.disconnect();
    }
}