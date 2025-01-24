/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;
//import Business.ConfigureASystem;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author zhangjianwei
 */
public class DB4OUtil {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Datastore.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Datastore system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        System.out.println(system.getInstance().getPatients());
        System.out.println("Store Success");
        conn.close();
    }
    
    public Datastore retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<Datastore> systems = conn.query(Datastore.class); // Change to the object you want to save
        if (systems.size() == 0){
            Datastore.setDataStore(ConfigureSystem.configure());
            System.out.println("not had db4o file");
            
        }
        else{
            Datastore.setDataStore(systems.get(systems.size() - 1));
            System.out.println("already had db4o file");
            System.out.println(Datastore.getInstance().getPatients().size());
        }
        
        
        conn.close();
        System.out.println("Read db4o susscess");
        return Datastore.getInstance();
    }
}
