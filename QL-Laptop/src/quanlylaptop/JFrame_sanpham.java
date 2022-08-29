package quanlylaptop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import View.LoginView;
import Connection.MySqlConnect;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Iteam.*;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import static quanlylaptop.QuanLyLoaiSanPham.malsp;
//import quanlylaptop.sql.Loaisanpham;
//import quanlylaptop.sql.Sanpham;

/**
 *
 * @author Tai
 */
public class JFrame_sanpham extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;
    private PreparedStatement ps;
    public static String sql = "SELECT * FROM `sanpham`";
    public static String masp;
    String chonlsp = "";
    String manew = "";

    /**
     * Creates new form JFrame_sanpham
     */
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public JFrame_sanpham() throws SQLException {
        initComponents();
        try {
            con = MySqlConnect.ConnectDb();
        } catch (Exception e) {
        }
//        sanpham1();
        sanpham();
        loadCombBox();
        loadCombBox1();
//       showCT();
//        process(false);
    }

    private void loadCombBox() throws SQLException {
        jComboBox1.removeAllItems();
        String sql = "SELECT `tenlsp` FROM `loaisanpham`";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            this.jComboBox1.addItem(rs.getString("tenlsp"));

        }

    }

    private void loadCombBox1() throws SQLException {
        com8.removeAllItems();
        String sql = "SELECT `tenlsp` FROM `loaisanpham`";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            this.com8.addItem(rs.getString("tenlsp"));

        }

    }

    public void sanpham1() {
        Double giatrunggian =0d;
//        Double gianew = 0d;
        int a =1;
        String gia = txt_giasanpham.getText().trim();
        chonlsp = jComboBox1.getSelectedItem().toString();
        Vector cols = new Vector();
        cols.addElement("Mã sản phẩm");
        cols.addElement("Loại sản phẩm");
        cols.addElement("Tên sản phẩm");
        cols.addElement("Giá sản phẩm");
//        cols.addElement("Hinh anh");
//        cols.addElement("Tóm tắt");
        cols.addElement("Linh kiện");
//        cols.addElement("Khuyến mại");
//        cols.addElement("Thông số");
//        cols.addElement("Bài viết");
        cols.addElement("Bảo hành");
        cols.addElement("Số lượng");
        Vector data = new Vector();

        String sql = "SELECT * FROM `sanpham`";
        try {
            ps = con.prepareStatement("SELECT a.`masp`, a.`loaisp`, a.`tensp`, a.`gia`, a.`linhkien`, a.`khuyenmai`, a.`thongso`, a.`baiviet`, a.`baohanh`, a.`soluong` FROM `sanpham` a,loaisanpham b WHERE  a.loaisp=b.malsp AND b.`tenlsp`='" + chonlsp + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
//                giatrunggian = rs.getDouble("gia");
//              
//                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//               String gianew = fm.format(giatrunggian);
//                
                Vector user = new Vector();
                user.addElement(rs.getString("a.masp"));
                user.addElement(rs.getString("a.loaisp"));
                user.addElement(rs.getString("a.tensp"));
                user.addElement(rs.getString("a.gia"));
                user.addElement(rs.getString("a.linhkien"));
//                user.addElement(rs.getString("a.khuyenmai"));
//                user.addElement(rs.getString("a.thongso"));
//                user.addElement(rs.getString("a.baiviet"));
                user.addElement(rs.getString("a.baohanh"));
                user.addElement(rs.getString("a.soluong"));
//                user.addElement(rs.getString("hinhanh"));
//                user.addElement(rs.getString("tomtat"));

                data.add(user);
            }
        } catch (Exception e) {
        }
        tb_danhsachsanpham.setModel(new DefaultTableModel(data, cols));
    }

    public void sanpham() {
        Double giatrunggian = 0d;
        Vector cols = new Vector();
        cols.addElement("Mã sản phẩm");
        cols.addElement("Loại sản phẩm");
        cols.addElement("Tên sản phẩm");
        cols.addElement("Giá sản phẩm");
//       cols.addElement("Hinh anh");
//        cols.addElement("Tóm tắt");
        cols.addElement("Linh kiện");
        cols.addElement("Khuyến mại");
        cols.addElement("Thông số");
        cols.addElement("Bài viết");
        cols.addElement("Bảo hành");
        cols.addElement("Số lượng");
        Vector data = new Vector();

        String sql = "SELECT * FROM `sanpham`";
        try {
            ps = con.prepareStatement("SELECT `masp`, `loaisp`, `tensp`, `gia`, `linhkien`, `khuyenmai`, `thongso`, `baiviet`, `baohanh`, `soluong` FROM `sanpham`");
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector user = new Vector();
                 giatrunggian = rs.getDouble("gia");
              
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
               String gianew = fm.format(giatrunggian);
               
                user.addElement(rs.getString("masp"));
                user.addElement(rs.getString("loaisp"));
                user.addElement(rs.getString("tensp"));
                user.addElement(rs.getString(gianew));
                user.addElement(rs.getString("linhkien"));
                user.addElement(rs.getString("khuyenmai"));
                user.addElement(rs.getString("thongso"));
                user.addElement(rs.getString("baiviet"));
                user.addElement(rs.getString("baohanh"));
                user.addElement(rs.getString("soluong"));
//                user.addElement(rs.getString("hinhanh"));
//                user.addElement(rs.getString("tomtat"));

                data.add(user);
            }
        } catch (Exception e) {
        }
        tb_danhsachsanpham.setModel(new DefaultTableModel(data, cols));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdialog_them_san_pham = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_themsp = new javax.swing.JButton();
        btn_suasp = new javax.swing.JButton();
        btn_xoasp = new javax.swing.JButton();
        com8 = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_baiviet = new javax.swing.JTextArea();
        cbb_baohanh = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_danhsachsanpham = new javax.swing.JTable();
        cbb_linhkien = new javax.swing.JComboBox();
        ToolBar_menu = new javax.swing.JToolBar();
        sanpham = new javax.swing.JButton();
        loaisanpham = new javax.swing.JButton();
        Hoadon = new javax.swing.JButton();
        thongke = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        doi_matkhau = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nen_thong_tinsp = new javax.swing.JLabel();
        txt_thongso = new javax.swing.JTextField();
        txt_soluong = new javax.swing.JTextField();
        txt_giasanpham = new javax.swing.JTextField();
        txt_tensanpham = new javax.swing.JTextField();
        txt_khuyenmai = new javax.swing.JTextField();
        txt_masp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nen_chinh = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jdialog_them_san_pham.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jdialog_them_san_pham.setTitle("Bảng nhập sản phẩm mới");
        jdialog_them_san_pham.getContentPane().setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/icon_nhapsanpham.png"))); // NOI18N
        jLabel15.setText("hi");
        jdialog_them_san_pham.getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 700, 480);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loại sản phẩm:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 480, 130, 40);

        btn_themsp.setBackground(new java.awt.Color(0, 153, 51));
        btn_themsp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_themsp.setForeground(new java.awt.Color(255, 255, 255));
        btn_themsp.setText("Thêm sản phẩm");
        btn_themsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themspMouseClicked(evt);
            }
        });
        btn_themsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_themsp);
        btn_themsp.setBounds(570, 450, 130, 30);

        btn_suasp.setBackground(new java.awt.Color(0, 153, 51));
        btn_suasp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_suasp.setForeground(new java.awt.Color(255, 255, 255));
        btn_suasp.setText("Cập nhật");
        btn_suasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_suasp);
        btn_suasp.setBounds(720, 450, 90, 30);

        btn_xoasp.setBackground(new java.awt.Color(0, 102, 102));
        btn_xoasp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_xoasp.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoasp.setText("Xóa");
        btn_xoasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoasp);
        btn_xoasp.setBounds(840, 450, 90, 30);

        com8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        com8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                com8MouseClicked(evt);
            }
        });
        com8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com8ActionPerformed(evt);
            }
        });
        getContentPane().add(com8);
        com8.setBounds(650, 270, 340, 30);

        jScrollPane4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_baiviet.setColumns(20);
        txt_baiviet.setRows(5);
        jScrollPane4.setViewportView(txt_baiviet);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(200, 400, 350, 80);

        cbb_baohanh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbb_baohanh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cbb_baohanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_baohanhActionPerformed(evt);
            }
        });
        getContentPane().add(cbb_baohanh);
        cbb_baohanh.setBounds(650, 310, 340, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 488, 185, 25);

        tb_danhsachsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_danhsachsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_danhsachsanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_danhsachsanpham);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 520, 1010, 200);

        cbb_linhkien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chuột", "USB", "" }));
        cbb_linhkien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_linhkienActionPerformed(evt);
            }
        });
        getContentPane().add(cbb_linhkien);
        cbb_linhkien.setBounds(690, 220, 300, 40);

        ToolBar_menu.setBorder(null);
        ToolBar_menu.setFloatable(false);
        ToolBar_menu.setRollover(true);
        ToolBar_menu.setMaximumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setMinimumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setPreferredSize(new java.awt.Dimension(2000, 25));

        sanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quanlysanpham-1.png"))); // NOI18N
        sanpham.setText("Sản Phẩm");
        sanpham.setFocusable(false);
        sanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanphamMouseClicked(evt);
            }
        });
        ToolBar_menu.add(sanpham);

        loaisanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loaisanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/loai-san-pham_1.png"))); // NOI18N
        loaisanpham.setText("Loại Sản Phẩm");
        loaisanpham.setFocusable(false);
        loaisanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loaisanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        loaisanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loaisanphamMouseClicked(evt);
            }
        });
        ToolBar_menu.add(loaisanpham);

        Hoadon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Hoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/Hoa_Don_1.png"))); // NOI18N
        Hoadon.setText("Hóa Đơn");
        Hoadon.setFocusable(false);
        Hoadon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoadonActionPerformed(evt);
            }
        });
        ToolBar_menu.add(Hoadon);

        thongke.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/thong_ke_1.png"))); // NOI18N
        thongke.setText("Thống Kê");
        thongke.setFocusable(false);
        thongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        thongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeActionPerformed(evt);
            }
        });
        ToolBar_menu.add(thongke);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quan_ly_1.png"))); // NOI18N
        jButton12.setText("Admin");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        ToolBar_menu.add(jButton12);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/tro_giup_1.png"))); // NOI18N
        jButton13.setText("Trợ Giúp");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        ToolBar_menu.add(jButton13);

        doi_matkhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        doi_matkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/icon_doi_mat_khau.png"))); // NOI18N
        doi_matkhau.setText("Đổi Mật Khẩu");
        doi_matkhau.setFocusable(false);
        doi_matkhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        doi_matkhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        doi_matkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doi_matkhauActionPerformed(evt);
            }
        });
        ToolBar_menu.add(doi_matkhau);

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/dangsuat.png"))); // NOI18N
        jButton15.setText("Đăng Xuất");
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        ToolBar_menu.add(jButton15);

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/iocn_thoat_1.png"))); // NOI18N
        jButton16.setText("Thoát");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton16);

        getContentPane().add(ToolBar_menu);
        ToolBar_menu.setBounds(0, 0, 2000, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chi tiết thông tin sản phẩm");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(224, 150, 570, 30);

        nen_thong_tinsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nen_thong_tinsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/dep1.png"))); // NOI18N
        getContentPane().add(nen_thong_tinsp);
        nen_thong_tinsp.setBounds(0, 60, 1024, 425);

        txt_thongso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thongsoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_thongso);
        txt_thongso.setBounds(650, 400, 350, 30);

        txt_soluong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_soluong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_soluong);
        txt_soluong.setBounds(200, 350, 350, 40);

        txt_giasanpham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_giasanpham.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_giasanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giasanphamActionPerformed(evt);
            }
        });
        getContentPane().add(txt_giasanpham);
        txt_giasanpham.setBounds(200, 310, 350, 40);

        txt_tensanpham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_tensanpham.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tensanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tensanphamActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tensanpham);
        txt_tensanpham.setBounds(200, 270, 350, 40);

        txt_khuyenmai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txt_khuyenmai);
        txt_khuyenmai.setBounds(650, 350, 350, 40);

        txt_masp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_masp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_masp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maspActionPerformed(evt);
            }
        });
        getContentPane().add(txt_masp);
        txt_masp.setBounds(200, 220, 350, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 490, 130, 25);
        getContentPane().add(txt_timkiem);
        txt_timkiem.setBounds(410, 488, 260, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/89.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 490, 1024, 274);

        nen_chinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh-nen-admin-1.png"))); // NOI18N
        getContentPane().add(nen_chinh);
        nen_chinh.setBounds(0, -30, 2000, 1540);

        jScrollPane5.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(450, 270, 400, 150);

        jMenu1.setText("Trang Chủ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem1.setText("Đăng Xuất");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem2.setText("Thoát");
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Sản Phẩm");
        jMenu2.setToolTipText("");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu8.setText("Loại Sản Phẩm");
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu8);

        jMenu4.setText("Hóa Đơn");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu7.setText("Thống Kê");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem3.setText("Đổi Mật Khẩu");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem4.setText("Thêm Tài Khoản");
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Trợ Giúp");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themspActionPerformed

//        
        if (this.txt_masp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống", "Thông báo", 1);
        } else if (this.txt_masp.getText().length() > 6) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm vượt quá 6 ký tự", "Thông báo", 1);
        } else if (this.txt_tensanpham.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Tên sản phẩm không được để trống", "Thông báo", 1);
        } else if (this.txt_tensanpham.getText().length() > 70) {
            JOptionPane.showMessageDialog(null, "Tên sản phẩm vượt quá 70 ký tự", "Thông báo", 1);
        } else if (this.txt_soluong.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Số lượng sản phẩm không được để trống", "Thông báo", 1);
        } else {
            try {
                BtnSanPham.themSP(Integer.parseInt(txt_masp.getText()), Integer.parseInt(manew), txt_tensanpham.getText(), Double.parseDouble(txt_giasanpham.getText()), cbb_linhkien.getSelectedItem().toString(), txt_khuyenmai.getText(), txt_thongso.getText(), txt_baiviet.getText(), cbb_baohanh.getSelectedItem().toString(), Integer.parseInt(txt_soluong.getText()));
            } catch (Exception e) {
                Logger.getLogger(JFrame_sanpham.class.getName()).log(Level.SEVERE, null, e);
            }
            sanpham();
            lamsach();
        }

    }//GEN-LAST:event_btn_themspActionPerformed

    private void cbb_baohanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_baohanhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_baohanhActionPerformed

    private void txt_tensanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tensanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tensanphamActionPerformed

    private void btn_suaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaspActionPerformed
        // TODO add your handling code here:
        if (this.txt_masp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống", "Thông báo", 1);
        } else if (this.txt_masp.getText().length() > 6) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm vượt quá 6 ký tự", "Thông báo", 1);
        } else if (this.txt_tensanpham.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Tên sản phẩm không được để trống", "Thông báo", 1);
        } else if (this.txt_tensanpham.getText().length() > 70) {
            JOptionPane.showMessageDialog(null, "Tên sản phẩm vượt quá 70 ký tự", "Thông báo", 1);
        } else {
            BtnSanPham.suaSP(masp, Integer.parseInt(txt_masp.getText()), Integer.parseInt(manew), txt_tensanpham.getText(), Double.parseDouble(txt_giasanpham.getText()), cbb_linhkien.getSelectedItem().toString(), txt_khuyenmai.getText(), txt_thongso.getText(), txt_baiviet.getText(), cbb_baohanh.getSelectedItem().toString(), Integer.parseInt(txt_soluong.getText()));
            sanpham();
            lamsach();
        }


    }//GEN-LAST:event_btn_suaspActionPerformed

    private void txt_giasanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giasanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giasanphamActionPerformed

    private void txt_thongsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_thongsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_thongsoActionPerformed

    private void btn_xoaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaspActionPerformed
        // TODO add your handling code here:
        if (this.txt_masp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống", "Thông báo", 1);
        } else {
            BtnSanPham.xoaSP(masp);
            JOptionPane.showMessageDialog(null, "Bạn có chắc xóa sản phẩm" + masp + "này", "Thông báo", 2);
            sanpham();
            lamsach();
        }
    }//GEN-LAST:event_btn_xoaspActionPerformed

    private void cbb_linhkienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_linhkienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_linhkienActionPerformed

    private void txt_maspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maspActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_maspActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        chonlsp = jComboBox1.getSelectedItem().toString();
        sanpham1();

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tb_danhsachsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_danhsachsanphamMouseClicked
        // TODO add your handling code here:
        try {
            int row = this.tb_danhsachsanpham.getSelectedRow();
            String idrow = this.tb_danhsachsanpham.getModel().getValueAt(row, 0).toString();
            String sql1 = "SELECT * FROM `sanpham` WHERE masp='" + idrow + "'";
            ResultSet rs = UpdateTable.ShowTextField(sql1);
            if (rs.next()) {
                masp = rs.getString("masp");
                this.txt_masp.setText(rs.getString("masp"));
                this.nen_chinh.setText(rs.getString("gia"));
                this.txt_tensanpham.setText(rs.getString("tensp"));
                this.txt_giasanpham.setText(rs.getString("gia"));
                this.cbb_linhkien.setSelectedItem(rs.getString("linhkien"));
                this.txt_khuyenmai.setText(rs.getString("khuyenmai"));
                this.txt_thongso.setText(rs.getString("thongso"));
                this.txt_baiviet.setText(rs.getString("baiviet"));
                this.cbb_baohanh.setSelectedItem(rs.getString("baohanh"));
                this.txt_soluong.setText(rs.getString("soluong"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo lỗi", 1);
        }
    }//GEN-LAST:event_tb_danhsachsanphamMouseClicked

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
         
        String sql = "SELECT `malsp` FROM `loaisanpham` WHERE `tenlsp`= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, this.jComboBox1.getSelectedItem().toString()); 
            rs = ps.executeQuery(); 
            while (rs.next()) {
                manew = rs.getString("malsp"); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void btn_themspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themspMouseClicked
        // TODO add your handling code here:
//        lamsach();
    }//GEN-LAST:event_btn_themspMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String txt_search = txt_timkiem.getText().trim();
        Vector cols = new Vector();
        cols.addElement("Mã sản phẩm");
        cols.addElement("Loại sản phẩm");
        cols.addElement("Tên sản phẩm");
        cols.addElement("Giá sản phẩm"); 
        cols.addElement("Linh kiện");
        cols.addElement("Khuyến mại");
        cols.addElement("Thông số");
        cols.addElement("Bài viết");
        cols.addElement("Bảo hành");
        cols.addElement("Số lượng");

        Vector data_timkiem = new Vector();

        String sql = "SELECT * FROM `sanpham`";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("masp"));
                user.addElement(rs.getString("loaisp"));
                user.addElement(rs.getString("tensp"));
                user.addElement(rs.getString("gia"));
                user.addElement(rs.getString("linhkien"));
                user.addElement(rs.getString("khuyenmai"));
                user.addElement(rs.getString("thongso"));
                user.addElement(rs.getString("baiviet"));
                user.addElement(rs.getString("baohanh"));
                user.addElement(rs.getString("soluong"));

                if (user.toString().contains(txt_search)) {
                    data_timkiem.addElement(user);
                }
            }
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        tb_danhsachsanpham.setModel(new DefaultTableModel(data_timkiem, cols));
//       ds_admin.setModel(new DefaultTableModel(null, cols));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        close();
        GiaoDienAdmin giaodien = new GiaoDienAdmin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        close();
        QuanLyLoaiSanPham giaodien = new QuanLyLoaiSanPham();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        close();
        Giaodienhoadon giaodien = new Giaodienhoadon();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        close();
        Thongke_chuan thok = new Thongke_chuan();
        thok.setSize(1009, 634);
        thok.setLocationRelativeTo(null);
        thok.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        ho_tro giaodien = new ho_tro();
        giaodien.setSize(845, 835);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void loaisanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loaisanphamMouseClicked
        close();
        QuanLyLoaiSanPham giaodien = new QuanLyLoaiSanPham();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_loaisanphamMouseClicked

    private void HoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoadonActionPerformed
        close();
        Giaodienhoadon giaodien = new Giaodienhoadon();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_HoadonActionPerformed

    private void thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeActionPerformed
        close();
        Thongke_chuan thok = new Thongke_chuan();
        thok.setSize(1009, 634);
        thok.setLocationRelativeTo(null);
        thok.setVisible(true);
    }//GEN-LAST:event_thongkeActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        ho_tro giaodien = new ho_tro();
        giaodien.setSize(845, 835);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton13MouseClicked

    private void doi_matkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doi_matkhauActionPerformed
        doi_mat_khau doimatkhau = new doi_mat_khau();

        doimatkhau.setSize(480, 300);
        doimatkhau.setLocationRelativeTo(null);
        doimatkhau.setVisible(true);
//                        giaodien.setSize(480, 300);
//                        giaodien.setLocationRelativeTo(null);
//                        giaodien.setVisible(true);
    }//GEN-LAST:event_doi_matkhauActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        close();
        LoginView giaodien = new LoginView();
        giaodien.setSize(1024, 610);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanphamMouseClicked
        close();
        JFrame_sanpham giaodien;
        try {
            giaodien = new JFrame_sanpham();
            giaodien.setSize(1024, 768);
            giaodien.setLocationRelativeTo(null);
            giaodien.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_sanphamMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        close();
        JFrame_sanpham giaodien;
        try {
            giaodien = new JFrame_sanpham();
            giaodien.setSize(1024, 768);
            giaodien.setLocationRelativeTo(null);
            giaodien.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void com8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_com8MouseClicked
        chonlsp = com8.getSelectedItem().toString();
        sanpham1();        // TODO add your handling code here:
    }//GEN-LAST:event_com8MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        close();

        GiaodienquanlyAdmin giaodien = new GiaodienquanlyAdmin();
        giaodien.setSize(1123, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        close();

        GiaodienquanlyAdmin giaodien = new GiaodienquanlyAdmin();
        giaodien.setSize(1123, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void com8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com8ActionPerformed
//    public void show_du_lieu_ra_bang() {
//        int row = bang_sanh_sach_san_pham.getSelectedRow();
//        String id = bang_sanh_sach_san_pham.getValueAt(row, 0).toString();
//        if (row != -1) {
//            txt_masanpham.setText(id);
//            cbb_loaisanpham.setSelectedItem(bang_sanh_sach_san_pham.getValueAt(row, 1).toString());
//            txt_tensanpham.setText(bang_sanh_sach_san_pham.getValueAt(row, 2).toString());
//            txt_giasanpham.setText(bang_sanh_sach_san_pham.getValueAt(row, 3).toString());
//            cbb_linhkien.setSelectedItem(bang_sanh_sach_san_pham.getValueAt(row, 4).toString());
//            txt_khuyenmai.setText(bang_sanh_sach_san_pham.getValueAt(row, 5).toString());
//            txt_thongso.setText(bang_sanh_sach_san_pham.getValueAt(row, 6).toString());
//            txt_baiviet.setText(bang_sanh_sach_san_pham.getValueAt(row, 7).toString());
//            cbb_baohanh.setSelectedItem(bang_sanh_sach_san_pham.getValueAt(row, 8).toString());
//            txt_soluong.setText(bang_sanh_sach_san_pham.getValueAt(row, 9).toString());
//
//        }
//    }

    public void lamsach() {
        txt_masp.setText(null);
        txt_baiviet.setText(null);
        txt_giasanpham.setText(null);
        txt_khuyenmai.setText(null);
        nen_chinh.setText(null);
        txt_soluong.setText(null);
        txt_tensanpham.setText(null);
        txt_thongso.setText(null);
        cbb_baohanh.setSelectedItem(null);
        cbb_linhkien.setSelectedItem(null);
//        cbb_masp.setSelectedItem(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_sanpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame_sanpham giaodien;
                try {
                    giaodien = new JFrame_sanpham();
                    giaodien.setSize(1024, 768);
                    giaodien.setLocationRelativeTo(null);
                    giaodien.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame_sanpham.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hoadon;
    private javax.swing.JToolBar ToolBar_menu;
    private javax.swing.JButton btn_suasp;
    private javax.swing.JButton btn_themsp;
    private javax.swing.JButton btn_xoasp;
    private javax.swing.JComboBox cbb_baohanh;
    private javax.swing.JComboBox cbb_linhkien;
    private javax.swing.JComboBox com8;
    private javax.swing.JButton doi_matkhau;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JDialog jdialog_them_san_pham;
    private javax.swing.JButton loaisanpham;
    private javax.swing.JLabel nen_chinh;
    private javax.swing.JLabel nen_thong_tinsp;
    private javax.swing.JButton sanpham;
    private javax.swing.JTable tb_danhsachsanpham;
    private javax.swing.JButton thongke;
    private javax.swing.JTextArea txt_baiviet;
    private javax.swing.JTextField txt_giasanpham;
    private javax.swing.JTextField txt_khuyenmai;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tensanpham;
    private javax.swing.JTextField txt_thongso;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
