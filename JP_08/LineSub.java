/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author Admin
 */
public class LineSub extends PointL {
    PointL end;
    
    public LineSub(int beginX,int beginY,int endX,int endY){
        super(beginX, beginY);
        this.end = new PointL(endX, endY);
    }
    public LineSub(PointL begin, PointL end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" + "" + end + '}';
    }
    
     public PointL getBegin(){
        return this;
    }
    public PointL getEnd(){
        return end;
    }
    public void setBegin(PointL begin){
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public void setEnd(PointL end){
        this.end = end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setBeginXY(int x,int y){
        super.setXY(x, y);
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setEndXY(int x,int y){
        end.setXY(x, y);
    }
    public int getLength(){
        int xDiff = getEndX() - getEndX();
        int yDiff = getEndY() - getEndY();
        return (int) Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double getGradient(){
        int xDiff = getEndX() - getEndX();
        int yDiff = getEndY() - getEndY();
        return (int)Math.atan2(yDiff, xDiff);
    }
}
