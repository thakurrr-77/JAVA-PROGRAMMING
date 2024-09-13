package InterFaces_14;
class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("sms");
    }
}
interface ICamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void pause();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("smartPhone video Calling");
    }
    public void click(){
        System.out.println("SmartPhone clicking Photo");
    }
    public void record(){
        System.out.println("SmartPhone recording video");
    }
    public void play(){
        System.out.println("SmartPhone playing audio");
    }
    public void pause(){
        System.out.println("Smartphone paused audio");
    }
}
public class InterFace_2_example {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
    }
}
