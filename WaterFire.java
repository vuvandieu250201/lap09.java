package monster;

public class WaterFire extends Monster {
  public WaterFire(String name){
    super(name);
  }
  @Override
  public String attack(){
    return "WaterFire with water !";
  }
}
