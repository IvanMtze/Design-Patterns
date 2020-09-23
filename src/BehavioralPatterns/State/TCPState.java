package BehavioralPatterns.State;

public class TCPState {

    public void activeOpen(TCPConnection tcpConnection) {

    }

    public void passiveOpen(TCPConnection tcpConnection) {

    }

    public void close(TCPConnection tcpConnection) {

    }

    public void synchronize(TCPConnection tcpConnection) {

    }

    public void acknowledge(TCPConnection tcpConnection) {

    }
    public void changeState(TCPConnection tcpConnection, TCPState state) {
        tcpConnection.changeState(state);
    }
}
