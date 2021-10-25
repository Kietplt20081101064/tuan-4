gói  com.kiet2008110164.tuan04.Lab4 ;

nhập  java.util.ArrayList ;
nhập  java.util.Collections ;
nhập  java.util.Comparator ;
nhập  java.util.Scanner ;

 lớp  công cộng Lab4bai3 {
    static  Scanner sc =  new  Scanner ( Hệ thống . in);
    static  ArrayList  < SanPham > list =  new  ArrayList < SanPham > ();
    static  void  nhap () {
        trong khi ( đúng ) {
            SanPham sanPham =  new  SanPham ();
            sanPham . nhapThongTin ();
            danh sách . thêm (sanPham);
            Hệ thống . ra ngoài . print ( " Nhập thêm (y / n) ?: " );
            if (sc . nextLine () . equals ( " n " ))
                phá vỡ ;
        }
    }
    static  void  xuat () {
        cho ( SanPham a : list) {
            a . xuatThongTin ();
        }
    }
    static  void  sapXepGiamDan () {
        Bộ so sánh < SanPham > comp =  new Bộ  so sánh < SanPham > () {
            @Ghi đè
            public  int  so sánh ( SanPham  o1 , SanPham  o2 ) {
                trả lại  Double . so sánh (o1 . donGia, o2 . donGia);
            }
        };
        Bộ sưu tập . sắp xếp (danh sách, tổng hợp);
        Bộ sưu tập . đảo ngược (danh sách);
        xuat ();   
    }
    static  void  xoa () {
        Hệ thống . ra ngoài . print ( " Nhập tên cần xoá: " );
        Tên chuỗi = sc . hàng tiếp theo();
        cho ( SanPham a : list) {
            if ((a . ten) . equals (name)) {
                danh sách . loại bỏ (a);
                Hệ thống . ra ngoài . println ( " Đã xoá! " );
                phá vỡ ;
            }
        }    
    }
    static  void  tinhTrungBinh () {
        tong đôi =  0 ;
        double trungBinh =  0 ;
        cho ( SanPham x : list) {
            tong + = x . donGia;
        }
        trungBinh = tong / list . kích thước();
        Hệ thống . ra ngoài . println ( " Giá trung bình của các sản phẩm là: " + trungBinh);
    }
     menu void  tĩnh () {
        Hệ thống . ra ngoài . println ( " ____________________MENU____________________ " );
        Hệ thống . ra ngoài . println ( " | >> 1. Nhập sản phẩm. | " );
        Hệ thống . ra ngoài . println ( " | >> 2. Export list. | " );
        Hệ thống . ra ngoài . println ( " | >> 3. Sắp xếp dần theo giá trị. | " );
        Hệ thống . ra ngoài . println ( " | >> 4. Tìm và xóa sản phẩm. | " );
        Hệ thống . ra ngoài . println ( " | >> 5. Xuất giá trung bình của các sản phẩm. | " );
        Hệ thống . ra ngoài . println ( " | >> 6. Kết thúc! | " );
        Hệ thống . ra ngoài . println ( " | ____________________________________________ | " );
        Hệ thống . ra ngoài . print ( " Mời bạn chọn: " );
        int key = sc . nextInt ();
        sc . hàng tiếp theo();
        chuyển (phím) {
            trường hợp  1 :
                clearScreen ();
                Hệ thống . ra ngoài . println ( " _______ Nhập sản phẩm _______ " );
                nhap ();
                phá vỡ ;
            trường hợp  2 :
                clearScreen ();
                Hệ thống . ra ngoài . println ( " _______ Export danh sách sản phẩm _______ " );
                xuat ();
                phá vỡ ;
            trường hợp  3 :
                clearScreen ();
                Hệ thống . ra ngoài . println ( " _______ Sắp xếp giảm dần theo giá _______ " );
                sapXepGiamDan ();
                phá vỡ ;
            trường hợp  4 :
                clearScreen ();
                Hệ thống . ra ngoài . println ( " _______ Tìm và xóa sản phẩm _______ " );
                xoa ();
                phá vỡ ;
            trường hợp  5 :
                clearScreen ();
                Hệ thống . ra ngoài . println ( " _______ Xuất giá trung bình của các sản phẩm _______ " );
                tinhTrungBinh ();
                phá vỡ ;
            trường hợp  6 :
                Hệ thống . thoát ra ( 0 );
            mặc định :
                Hệ thống . ra ngoài . println ( " bad select! " );    
        }    
    }   
    static  void  clearScreen () {
        Hệ thống . ra ngoài . print ( " \ 0 33 [H \ 0 33 [2J " );  
        Hệ thống . ra ngoài . tuôn ra();
    }
    public  static  void  main ( String [] args ) {
        làm {
            clearScreen ();
            thực đơn();
            Hệ thống . ra ngoài . print ( " Quay về MENU lựa chọn? (y / n): " );
        } while (sc . nextLine () . equals ( " y " ));
    } 
}