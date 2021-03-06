import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Set;

public interface ServerInterface extends Remote {
    public boolean amIUp() throws RemoteException;
    public void lockMaster() throws RemoteException;
    public HashMap<String,Set<String> > syncWithSlave() throws RemoteException;
    public void unlockMaster() throws RemoteException;
    public void sendToSubscribers(String topic, Data dt, String ReqID) throws RemoteException;
    public void __registerSubscriber(String topic, String UUID, String ReqID) throws RemoteException;
    public void registerSubscriber(String topic, String UUID, String ReqID) throws RemoteException;
    public void __unregisterSubscriber(String topic, String UUID, String ReqID) throws RemoteException;
    public void unregisterSubscriber(String topic, String UUID, String ReqID) throws RemoteException;
    public void becomeSlave() throws RemoteException;
    public boolean isMasterUp() throws RemoteException;
    public int becomeMaster() throws RemoteException;
    public void printTopicList() throws RemoteException;
}