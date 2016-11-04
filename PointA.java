package point;

public class PointA extends Point{ // tu t'es trompé PointNom extends PointA et PonitA extends Point 
    private char name;
    public PointA(int x,int y,char name){
        super(x,y);
        this.name=name;
    }
    public PointA(int x,char name){
        super(x);
        this.name=name;
    }
    public PointA(char name){
        super();
        this.name=name;
    }
    public void afficheCoord(){ // donc la il fallait juste redéfinir la méthode afficheCoord()
        System.out.println(name+"("+getX()+","+getY()+")");
    }
    
}
