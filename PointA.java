package point;

public class PointA extends Point{
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
    public void afficheCoord(){
        System.out.println(name+"("+getX()+","+getY()+")");
    }
    
}
