package BehavioralPatterns.State;

public class TCPClosed extends TCPState{
    public static TCPState instance;
    public void activeOpen(TCPConnection connection){
        changeState(connection, TCPEstablished.instance);
    }
    public void passiveOpen(TCPConnection connection){
        changeState(connection, TCPListen.instance);
    }
}
