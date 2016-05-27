
package javaapplication103;

public class Suite extends Room {

    public Suite(String name, int priceRoom, String idRoom, String status) {
        super(name, priceRoom, idRoom, status);
    }
@Override
    public String getName(){
        return super.getName();
    }
    
    @Override
    public String getIdRoom(){
    return super.getIdRoom();
    }
    
    @Override
    public String getStatus(){
        return super.getStatus();
    }

    @Override
   public void setStatus(String status) {
        super.setStatus(status);
    }
}
