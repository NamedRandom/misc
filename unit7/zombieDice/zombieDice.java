public class zombieDice {
    private int brains;
    private int shotguns;
    private int runners;

    public zombieDice(String color){
        if(color.toLowerCase().equals("green")){
            brains=3;
            shotguns=1;
            runners=2;
        }
        else if(color.toLowerCase().equals("red")){
             brains=1;
             shotguns=3;
             runners=2;
         }
		else if(color.toLowerCase().equals("yellow")){
             brains=2;
             shotguns=2;
             runners=2;
         } 
    }
}
