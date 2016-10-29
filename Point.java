package point;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }  
    public Point(int x){
        this.x=this.y=x;
        
    }
    public Point(){
        this.x=this.y=0;  
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void deplace(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    
    
}
