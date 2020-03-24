package Java2_05;

import java.sql.*;

public class Java2_05{
    public static void main(String[] args) {
        try(

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");


                Statement stmt = conn.createStatement();

        ){
//1.HIỂN THỊ 3 ĐƠN HÀNG MỚI TIẾP NHẬN
            System.out.println("============================================================================");
            String strSelect = "select * from don_hang ORDER BY ma_don DESC LIMIT 3";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()){
                int ma_don = rset.getInt("ma_don");
                String trang_thai = rset.getString("trang_thai");
                int kh_id = rset.getInt("kh_id");
                System.out.println(ma_don + ", " + trang_thai + ", " + kh_id);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);

//2.HIỂN THỊ ĐƠN HÀNG THEO MÃ KHÁCH HÀNG
            System.out.println("============================================================================");
            String strSelect1 = "select * from don_hang WHERE  kh_id = 5";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");

            ResultSet rset1 = stmt.executeQuery(strSelect1);

            System.out.println("The records selected are: ");
            int rowCount1 = 0;
            while (rset1.next()){
                int ma_don = rset1.getInt("ma_don");
                String trang_thai = rset1.getString("trang_thai");
                int kh_id = rset1.getInt("kh_id");
                System.out.println(ma_don + ", " + trang_thai + ", " + kh_id);
                rowCount1++;
            }
            System.out.println("Total number of record = " + rowCount1);
//3.HIỂN THỊ TRẠNG THÁI ĐƠN HÀNG THEO MÃ ĐƠN HÀNG
            System.out.println("============================================================================");
            String strSelect2 = "select * from don_hang WHERE  ma_don = 2";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            System.out.println("The records selected are: ");
            int rowCount2 = 0;
            while (rset2.next()){
                int ma_don = rset2.getInt("ma_don");
                String trang_thai = rset2.getString("trang_thai");
                int kh_id = rset2.getInt("kh_id");
                System.out.println(ma_don + ", " + trang_thai + ", " + kh_id);
                rowCount2++;
            }
            System.out.println("Total number of record = " + rowCount2);
//4.HIỂN THỊ THÔNG TIN CHI TIẾT CỦA MỘT ĐƠN HÀNG  THEO MÃ ĐƠN ĐƯỢC NHẬP VÀO
            System.out.println("============================================================================");
            String strSelect3 = "select * from don_hang WHERE  ma_don = 7";
            System.out.println("The SQL statement is: " + strSelect3 + "\n");
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            System.out.println("The records selected are: ");
            int rowCount3 = 0;
            while (rset3.next()){
                int ma_don = rset3.getInt("ma_don");
                String trang_thai = rset3.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount3++;
            }
            System.out.println("Total number of record = " + rowCount3);
//5.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐANG CHỜ XỬ LÝ
            System.out.println("============================================================================");
            String strSelect4 = "select * from don_hang WHERE  trang_thai = 'Đang xử lý'";
            System.out.println("The SQL statement is: " + strSelect4 + "\n");
            ResultSet rset4 = stmt.executeQuery(strSelect4);
            System.out.println("The records selected are: ");
            int rowCount4 = 0;
            while (rset4.next()){
                int ma_don = rset4.getInt("ma_don");
                String trang_thai = rset4.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount4++;
            }
            System.out.println("Total number of record = " + rowCount4);
//6.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ ĐÓNG GÓI
            System.out.println("============================================================================");
            String strSelect5 = "select * from don_hang WHERE  trang_thai = 'Đã đóng gói'";
            System.out.println("The SQL statement is: " + strSelect5 + "\n");
            ResultSet rset5 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount5 = 0;
            while (rset5.next()){
                int ma_don = rset5.getInt("ma_don");
                String trang_thai = rset5.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount5++;
            }
            System.out.println("Total number of record = " + rowCount5);
//7.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GỬI VẬN CHUYỂN
            System.out.println("============================================================================");
            String strSelect6 = "select * from don_hang WHERE  trang_thai = 'Đang giao hàng'";
            System.out.println("The SQL statement is: " + strSelect6 + "\n");
            ResultSet rset6 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount6 = 0;
            while (rset6.next()){
                int ma_don = rset6.getInt("ma_don");
                String trang_thai = rset6.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount6++;
            }
            System.out.println("Total number of record = " + rowCount6);
//8.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GIAO HÀNG THÀNH CÔNG
            System.out.println("============================================================================");
            String strSelect7 = "select * from don_hang WHERE  trang_thai = 'Hoàn thành'";
            System.out.println("The SQL statement is: " + strSelect7 + "\n");
            ResultSet rset7 = stmt.executeQuery(strSelect7);
            System.out.println("The records selected are: ");
            int rowCount7 = 0;
            while (rset7.next()){
                int ma_don = rset7.getInt("ma_don");
                String trang_thai = rset7.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount7++;
            }
            System.out.println("Total number of record = " + rowCount7);
//9.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ BỊ HỦY
            System.out.println("============================================================================");
            String strSelect9 = "select * from don_hang WHERE  trang_thai = 'Hủy'";
            System.out.println("The SQL statement is: " + strSelect9 + "\n");
            ResultSet rset9 = stmt.executeQuery(strSelect9);
            System.out.println("The records selected are: ");
            int rowCount9 = 0;
            while (rset9.next()){
                int ma_don = rset9.getInt("ma_don");
                String trang_thai = rset9.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount9++;
            }
            System.out.println("Total number of record = " + rowCount9);
        }catch (SQLException ex){
            ex.printStackTrace();
        }//Step5
    }
}
