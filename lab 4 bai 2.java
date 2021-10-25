gói  com.kiet2008110164.tuan04.Lab4 ;

nhập  java.util.ArrayList ;
nhập  java.util.Collections ;
nhập  java.util.Scanner ;

 lớp  công cộng Lab4Bai2 {
    static  Scanner sc =  new  Scanner ( Hệ thống . in);
    static  ArrayList  < String > list =  new  ArrayList < String > ();
    static  void  Menu () {
        Hệ thống . ra ngoài . println ( " ------------------ MENU ------------------ " );
        Hệ thống . ra ngoài . println ( " >> 1. Nhập danh sách và tên. " );
        Hệ thống . ra ngoài . println ( " >> 2. Export list. " );
        Hệ thống . ra ngoài . println ( " >> 3. Random list. " );
        Hệ thống . ra ngoài . println ( " >> 4. Sắp xếp dần và xuất danh sách. " );
        Hệ thống . ra ngoài . println ( " >> 5. Tìm và xóa nhập tên từ bàn phím. " );
        Hệ thống . ra ngoài . println ( " >> 6. end. " );
        Hệ thống . ra ngoài . print ( " Select function: " );
        int key = sc . nextInt ();
        sc . hàng tiếp theo();
        chuyển (phím) {
            trường hợp  1 :
                nhap ();
                phá vỡ ;
            trường hợp  2 :
                xuat ();
                phá vỡ ;
            trường hợp  3 :
                xuatNgauNhien ();
                phá vỡ ;
            trường hợp  4 :
                sắp xếp();
                phá vỡ ;
            trường hợp  5 :
                xoa ();
                phá vỡ ;
            trường hợp  6 :
                Hệ thống . thoát ra ( 0 );
                phá vỡ ;
        }
    }
    static  void  nhap () {
        trong khi ( đúng ) {
            Hệ thống . ra ngoài . print ( " Nhập họ và tên: " );
            Chuỗi x = sc . hàng tiếp theo();
            danh sách . thêm (x);
            Hệ thống . ra ngoài . print ( " Nhập thêm (y / n) ?: " );
            if (sc . nextLine () . equals ( " n " ))
                phá vỡ ;
        }
    }
    static  void  xuat () {
        for ( Chuỗi a : danh sách) {
            Hệ thống . ra ngoài . println ( " Họ và tên: "  + a);
        }    
    }
    static  void  xuatNgauNhien () {
        Bộ sưu tập . xáo trộn (danh sách);
        xuat ();
    }
    static  void  sapXep () {
        Bộ sưu tập . sắp xếp (danh sách);
        Bộ sưu tập . đảo ngược (danh sách);
        xuat ();
    }
    static  void  xoa () {
        Hệ thống . ra ngoài . print ( " Nhập tên cần xoá: " );
        Tên chuỗi = sc . hàng tiếp theo();
        for ( Chuỗi a : danh sách) {
            if (a . bằng (tên)) {
                danh sách . loại bỏ (a);
                Hệ thống . ra ngoài . println ( " Đã xoá! " );
                phá vỡ ;
            }
        }
    }
    public  static  void  main ( String [] args ) {
        làm {
            Thực đơn();
            Hệ thống . ra ngoài . print ( " Quan về MENU the select? (y / n): " );
        } while (sc . nextLine () . equals ( " y " ));
    }
    
}