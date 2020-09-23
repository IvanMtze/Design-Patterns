package BehavioralPatterns.State;

public class TCPListen extends TCPState{
    public static TCPState instance;
    public void send(TCPConnection connection){
        changeState(connection, TCPEstablished.instance);
    }
}
