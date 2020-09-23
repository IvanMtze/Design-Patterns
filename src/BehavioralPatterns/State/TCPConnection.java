package BehavioralPatterns.State;

public class TCPConnection {
    private TCPState state;

    public TCPConnection(TCPState state) {
        this.state = state;
    }
    public void changeState(TCPState s){
        this.state = s;
    }
    public void activeOpen(){
        this.state.activeOpen(this);
    }

    public void passiveOpen(){
        state.passiveOpen(this);
    }

    public void close(){
        state.close(this);
    }

    public void acknowledge(){
        state.acknowledge(this);
    }

    public void synchronize(){
        state.synchronize(this);
    }

}
