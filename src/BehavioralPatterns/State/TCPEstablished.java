package BehavioralPatterns.State;

public class TCPEstablished extends TCPState{
    public static TCPState instance;
    public  void transmit(TCPConnection connection, TPCOctetStream octetStream){
        octetStream.processOctet(connection);
    }
    public void close(TCPConnection connection){
        changeState(connection,TCPListen.instance);
    }
}
