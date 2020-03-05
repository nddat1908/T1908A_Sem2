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
public class LineP {
    private PointL begin;
    private PointL end;
    public LineP(PointL begin,PointL end){
        this.begin = begin;
        this.end = end;
    }
    public LineP(int beginX,int beginY,int endX,int endY){
        begin = new PointL(beginX, beginY);
        end = new PointL(endX, endY);
    }

    @Override
    public String toString() {
        return "LineP{" + "begin=" + begin + ", end=" + end + '}';
    }
    public PointL getBegin(){
        return begin;
    }
    public PointL getEnd(){
        return end;
    }
    public void setBegin(PointL begin){
        this.begin = begin;
    }
    public void setEnd(PointL end){
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public void setBeginXY(int x,int y){
        begin.setXY(x, y);
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
