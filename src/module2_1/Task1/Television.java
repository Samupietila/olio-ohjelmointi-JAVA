package module2_1.Task1;





public class Television {
    public int channel;
    public boolean isTVon;


    public Television(){
        channel = 1; isTVon = false;
    }

    void setChannel(int becomingChannel){
        if(becomingChannel <= 10) {
            channel = becomingChannel;
        }
        else{
            channel = 1;
        }
    }
    public int getChannel(){
        return channel;
    }

    public boolean isOn(){
        return isTVon;
    }
    void pressOnOff(){
        isTVon = !isTVon;
    }
}
