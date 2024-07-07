abstract class Phone{
    private String modelName;
    private int simSlots;
    
    abstract public void addSimSlots();
    public void addSpeaker(){
        System.out.println("Added the speaker");
    }
}
class SmartPhone extends Phone{
    public void addSimSlots(){
        System.out.println("Added 2 sim slots for the Smartphone");
    }
}
class FeaturePhone extends Phone{
    public void addSimSlots(){
        System.out.println("Added 1 sim slots for the Smartphone");
    }
}
public class AbstractExample{
    public static void main(String[] ar){
        //Phone p =new Phone();
        SmartPhone sp = new SmartPhone();
        sp.addSimSlots();
        sp.addSpeaker();

        FeaturePhone fp = new FeaturePhone();
        fp.addSimSlots();
        fp.addSpeaker();
    }
}
