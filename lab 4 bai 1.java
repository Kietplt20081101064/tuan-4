gói  com.kiet2008110164.tuan04.Lab4 ;

nhập  java.util.ArrayList ;
nhập  java.util.Scanner ;

 lớp  công cộng Lab4Bai1 {
    public  static  void  main ( String [] args ) {
        ArrayList  < Double > list =  new  ArrayList < Double > ();
        Máy quét sc =  Máy quét mới  ( Hệ thống . In);
        trong khi ( đúng ) {
            Hệ thống . ra ngoài . print ( " Import number: " );
            nhân đôi x = sc . nextDouble ();
            danh sách . thêm (x);
            Hệ thống . ra ngoài . print ( " Nhập thêm (y / n) ?: " );
            sc . hàng tiếp theo();
            if (sc . nextLine () . equals ( " n " ))
                phá vỡ ;
        }
        tong đôi =  0 ;
        for ( Double x : list) {
            Hệ thống . ra ngoài . print (x + "     " );
            tong + = x;
        }
        Hệ thống . ra ngoài . println ( " \ n Tổng = "  + tong);
        sc . gần();
    }
}