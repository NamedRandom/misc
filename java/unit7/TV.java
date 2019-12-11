public class TV {

    private int channel;

    public String toString(){
        return "The TV is on channel "+channel;
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int input){
        channel=input;
    }
    public TV(int channelIn){
        channel = channelIn;
    }
    public TV(){
    }
}
