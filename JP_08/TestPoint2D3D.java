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
public class TestPoint2D3D {
    public static void main(String[] args) {
        Point2D p2d = new Point2D();
        System.out.println(p2d.getX());
        System.out.println(p2d.getY());
        
        p2d.setXY(3, 4);
        System.out.println(p2d.getXY()[0]);
        System.out.println(p2d.getXY()[1]);
        System.out.println("Array of {" +p2d+"}");
        System.out.println(p2d.toString());
        
        Point3D p3d = new Point3D();
        System.out.println(p3d.getX());
        System.out.println(p3d.getY());
        System.out.println(p3d.getZ());
        
        p3d.setXYZ(11, 12, 13);
        System.out.println(p3d.getXYZ()[0]);
        System.out.println(p3d.getXYZ()[1]);
        System.out.println(p3d.getXYZ()[2]);
        System.out.println("Array of {" + p3d + "}");
        System.out.println(p3d.toString());
        
    }
}
