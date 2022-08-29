/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import View.LoginView;
import Connection.MySqlConnect;
import Iteam.itemHoaDon;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 

/**
 *
 * @author Tai
 */
public class Giaodienhoadon extends javax.swing.JFrame {

    private Connection conn;
    private Connection conn1;
    private Connection conn2;
    private ResultSet rs;
    private ResultSet rs1;
    private ResultSet rs2;
    private PreparedStatement stmt;
    private PreparedStatement stmt1;
    private PreparedStatement stmt2;
    private Object UbUtil;
    private Object DbUtils;
    private Object UbUtils;
    ArrayList<itemHoaDon> lsHD = new ArrayList<>();
    int click = 0;
    String mhdht, maadminhoanthanh, ngaylaphoanhthanh, ghichuhoanthanh, tongtienhoanthanh;

    /**
     * Creates new form Giaodienhoadon
     */
    public Giaodienhoadon() {
        initComponents();
        try {
            conn = MySqlConnect.ConnectDb();
        } catch (Exception e) {

        }
        updateDSHD();
//        updateCTHD();
        updateSP();
//        Hoanthanh();
//        inhoadon();
    }

    public void updateDSHD() {
        Vector cols = new Vector();
        cols.addElement("Mã Hóa Đơn");
        cols.addElement("Mã ADmin");
        cols.addElement("Ngày Lập");
        cols.addElement("Ghi Chú");
        cols.addElement("Hoàn Thành");

//        
        Vector data = new Vector();

        String sql = "SELECT * FROM `hoadon`WHERE `co`=0";
//        bang_data.setModel(new DefaultTableModel(data, cols));
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("mahd"));
                user.addElement(rs.getString("maadmin"));
                user.addElement(rs.getDate("ngaylap"));
                user.addElement(rs.getString("ghichu"));
                user.addElement(rs.getString("hoanthanh"));

                data.add(user);
            }

//           
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        jTableDSHD.setModel(new DefaultTableModel(data, cols));
    }

    public void updateCTHD() {

        Vector cols = new Vector();
        cols.addElement("Mã Hóa Đơn");
        cols.addElement("Mã Sản Phẩm");
        cols.addElement("Số Lượng");
        cols.addElement("Thành Tiền");

//        
        Vector data = new Vector();

        String sql = "SELECT * FROM `chitiethoadon`";
//        bang_data.setModel(new DefaultTableModel(data, cols));
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("mahd"));
                user.addElement(rs.getString("masp"));
                user.addElement(rs.getString("soluong"));
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                user.addElement(fm.format(rs.getDouble("gia")));

                data.add(user);
            }

//           
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        jTable2DSCTHD.setModel(new DefaultTableModel(data, cols));

    }

    public void updateSP() {
        Vector cols = new Vector();
        cols.addElement("Mã Sản Phẩm");
        cols.addElement("Tên Sản Phẩm");
        cols.addElement("Giá");

//        
        Vector data = new Vector();

        String sql = "SELECT * FROM `sanpham`";
//        bang_data.setModel(new DefaultTableModel(data, cols));
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("masp"));
                user.addElement(rs.getString("tensp"));
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                user.addElement(fm.format(rs.getDouble("gia")));
                data.add(user);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, cols);
        }
        jTable2DSSP.setModel(new DefaultTableModel(data, cols));

    }

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inhoadon = new javax.swing.JDialog();
        lb_maHD = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bang_inhoadon = new javax.swing.JTable();
        J_tongtien = new javax.swing.JLabel();
        jlbadmin = new javax.swing.JLabel();
        jlbdienthoai = new javax.swing.JLabel();
        jlbdiachi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDSHD = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2DSCTHD = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2DSSP = new javax.swing.JTable();
        jSoLuong = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jThanhtienqlhd = new javax.swing.JTextField();
        jMaHoaDon = new javax.swing.JTextField();
        jMaSanPham = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        txtGiaQLHD = new javax.swing.JTextField();
        hoa_don_chua_su_ly = new javax.swing.JButton();
        hoa_don_da_su_ly = new javax.swing.JButton();
        them_hoa_don = new javax.swing.JButton();
        xoa_hoa_don = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JHUY = new javax.swing.JButton();
        JBTHEM = new javax.swing.JButton();
        jTongTien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jMaHoaDonTongTien = new javax.swing.JTextField();
        in_hoa_don = new javax.swing.JButton();
        jBTTONGHD = new javax.swing.JButton();
        JBXoa = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        inhoadon.getContentPane().setLayout(null);

        lb_maHD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_maHD.setForeground(new java.awt.Color(255, 0, 51));
        lb_maHD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inhoadon.getContentPane().add(lb_maHD);
        lb_maHD.setBounds(460, 108, 40, 30);

        bang_inhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bang_inhoadon.setColumnSelectionAllowed(true);
        bang_inhoadon.setRowHeight(26);
        bang_inhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang_inhoadonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bang_inhoadon);
        bang_inhoadon.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        inhoadon.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(80, 240, 680, 390);

        J_tongtien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        J_tongtien.setForeground(new java.awt.Color(255, 0, 51));
        J_tongtien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inhoadon.getContentPane().add(J_tongtien);
        J_tongtien.setBounds(580, 630, 180, 60);

        jlbadmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbadmin);
        jlbadmin.setBounds(160, 140, 90, 20);

        jlbdienthoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbdienthoai);
        jlbdienthoai.setBounds(160, 206, 80, 20);

        jlbdiachi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbdiachi);
        jlbdiachi.setBounds(160, 170, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\chuan99.png")); // NOI18N
        inhoadon.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -12, 800, 790);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Các Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTableDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDSHDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableDSHDMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDSHD);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTable2DSCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2DSCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2DSCTHDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2DSCTHD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("Mã Sản Phẩm");

        jLabel8.setText("Số lượng");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTable2DSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2DSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2DSSPMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2DSSP);
        jTable2DSSP.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("CẬP NHẬT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Mã Hóa Đơn");

        jLabel10.setText("Thành Tiền");

        jThanhtienqlhd.setEditable(false);

        jMaHoaDon.setEditable(false);

        jMaSanPham.setEditable(false);

        label1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        label1.setText("Giá sản phẩm");

        txtGiaQLHD.setEditable(false);

        hoa_don_chua_su_ly.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hoa_don_chua_su_ly.setText("Hóa Đơn Chưa Sử Lý");
        hoa_don_chua_su_ly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoa_don_chua_su_lyActionPerformed(evt);
            }
        });

        hoa_don_da_su_ly.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hoa_don_da_su_ly.setText("Hóa Đơn Đã Sử Lý");
        hoa_don_da_su_ly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoa_don_da_su_lyActionPerformed(evt);
            }
        });

        them_hoa_don.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        them_hoa_don.setText("Thêm Hóa Đơn");
        them_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them_hoa_donActionPerformed(evt);
            }
        });

        xoa_hoa_don.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        xoa_hoa_don.setText("Xóa Hóa Đơn");
        xoa_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa_hoa_donActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Hoàn Thành");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JHUY.setText("HỦY");
        JHUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHUYActionPerformed(evt);
            }
        });

        JBTHEM.setText("THÊM CHI TIẾT");
        JBTHEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTHEMActionPerformed(evt);
            }
        });

        jLabel12.setText("Mã Hóa Đơn");

        jMaHoaDonTongTien.setEditable(false);

        in_hoa_don.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        in_hoa_don.setText("IN HÓA ĐƠN");
        in_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_hoa_donActionPerformed(evt);
            }
        });

        jBTTONGHD.setText("TỔNG HÓA ĐƠN");
        jBTTONGHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTTONGHDActionPerformed(evt);
            }
        });

        JBXoa.setText("XÓA CHI TIẾT");
        JBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(985, 985, 985))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(24, 24, 24)
                                .addComponent(jMaHoaDonTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(in_hoa_don)
                                .addGap(14, 14, 14)
                                .addComponent(jBTTONGHD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hoa_don_da_su_ly, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xoa_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hoa_don_chua_su_ly, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(them_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMaSanPham)
                            .addComponent(jMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jThanhtienqlhd)
                            .addComponent(txtGiaQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JHUY, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1035, 1035, 1035))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoa_don_chua_su_ly)
                            .addComponent(them_hoa_don)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xoa_hoa_don)
                            .addComponent(hoa_don_da_su_ly)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMaHoaDonTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jBTTONGHD)
                                    .addComponent(in_hoa_don))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jThanhtienqlhd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTHEM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JHUY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Danh Sach Sản Phẩm");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 110, 1030, 540);

        ToolBar_menu.setBorder(null);
        ToolBar_menu.setFloatable(false);
        ToolBar_menu.setRollover(true);
        ToolBar_menu.setFocusCycleRoot(true);
        ToolBar_menu.setMaximumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setMinimumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setPreferredSize(new java.awt.Dimension(2000, 25));

        sanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quanlysanpham-1.png"))); // NOI18N
        sanpham.setText("Sản Phẩm");
        sanpham.setFocusCycleRoot(true);
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
        loaisanpham.setFocusCycleRoot(true);
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
        Hoadon.setFocusCycleRoot(true);
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
        thongke.setFocusCycleRoot(true);
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
        jButton12.setFocusCycleRoot(true);
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton12);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/tro_giup_1.png"))); // NOI18N
        jButton13.setText("Trợ Giúp");
        jButton13.setFocusCycleRoot(true);
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
        doi_matkhau.setFocusCycleRoot(true);
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
        jButton15.setFocusCycleRoot(true);
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
        jButton16.setFocusCycleRoot(true);
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton16);

        getContentPane().add(ToolBar_menu);
        ToolBar_menu.setBounds(0, 0, 2000, 60);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/b_chuan.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 660, 1579, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Trang Quản Lý Hóa Đơn ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 70, 270, 34);

        jMenu1.setText("Trang Chủ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
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
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Loại Sản Phẩm");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Hóa Đơn");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenu4MenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
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
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        close();

        GiaoDienAdmin giaodien = new GiaoDienAdmin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void them_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them_hoa_donActionPerformed
//        Them_hoa_don thd = new Them_hoa_don();
        ThemHoaDon thd = new ThemHoaDon();
        thd.setVisible(true);
        thd.setSize(1024, 768);
        thd.setLocationRelativeTo(null);
    }//GEN-LAST:event_them_hoa_donActionPerformed

    private void jTable2DSCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2DSCTHDMouseClicked

        int row = jTable2DSCTHD.getSelectedRow();
        if (row != -1) {
            jMaHoaDon.setText(jTable2DSCTHD.getValueAt(row, 0).toString());
            jMaSanPham.setText(jTable2DSCTHD.getValueAt(row, 1).toString());
            jSoLuong.setText(jTable2DSCTHD.getValueAt(row, 2).toString());

        }


    }//GEN-LAST:event_jTable2DSCTHDMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int hdhoanthanh = 0;
        String mhd = jMaHoaDon.getText().trim();
        if (mhd != null) {
            String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`='" + mhd + "'";
            try {
                stmt = conn.prepareStatement(sql1);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    hdhoanthanh = rs.getInt("hoanthanh");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (mhd == null) {
            JOptionPane.showMessageDialog(null, "Hãy Chon Hóa Đơn Bạn Muộn Cập Nhật");
        }
        if (hdhoanthanh == 0) {

            double thanhtientrunggian = 0;
            double giatrungian = 0;

            String vl1 = jMaHoaDon.getText().trim();
            String vl2 = jMaSanPham.getText().trim();
            String vl3 = jSoLuong.getText().trim();

            String sql = "SELECT  `gia` FROM `sanpham` WHERE `masp`='" + vl2 + "'";
            try {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                while (rs.next()) {

                    int soluongnew = Integer.parseInt(vl3);

                    giatrungian = rs.getDouble("gia");
                    thanhtientrunggian = giatrungian * soluongnew;

                    NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                    String thanhtien = fm.format(thanhtientrunggian);
                    String giasanpham = fm.format(giatrungian);

                    jThanhtienqlhd.setText(thanhtien);
                    txtGiaQLHD.setText(giasanpham);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "fgsfgsdgas");

            }
            String up1 = jMaHoaDon.getText();
            String up2 = jMaSanPham.getText();
            String up3 = jSoLuong.getText();
            String up4 = Double.toString(thanhtientrunggian);

            try {
                stmt = conn.prepareStatement("UPDATE chitiethoadon SET "
                        + "`mahd`='" + up1 + "',`masp`='" + up2 + "',`soluong`='" + up3 + "',`gia`='" + up4 + "' WHERE `masp`='" + up2 + "'");
                int i = stmt.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
//                    setNUll();
                    Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                    giaodienhoadon.setSize(1024, 768);
                    giaodienhoadon.setLocationRelativeTo(null);
                    giaodienhoadon.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Cập Nhât Thất Bại");

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mời bạn chọn chi tiết hóa đơn cần sửa");
            }

        } else if (hdhoanthanh == 1) {
            JOptionPane.showMessageDialog(null, "Hóa đơn đã được giải quyết. Bạn không có quyền thay đổi chi tiết");
            setNUll();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void in_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_hoa_donActionPerformed
        inhoadon();
        inhoadon.setSize(800, 800);
        
        inhoadon.setLocationRelativeTo(null);
        inhoadon.setVisible(true);

//        String link = "D:\\New1\\QuanLyLapTop\\QuanLyLapTop\\src\\quanlylaptop\\report1.jrxml";
//       
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn=DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
//            JasperReport jr = JasperCompileManager.compileReport(link);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null,conn);
//            JasperViewer.viewReport(jp);
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_in_hoa_donActionPerformed

    private void jTable2DSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2DSSPMouseClicked

        int row = jTable2DSSP.getSelectedRow();

        if (row != -1) {

            jMaSanPham.setText(jTable2DSSP.getValueAt(row, 0).toString());
            txtGiaQLHD.setText(jTable2DSSP.getValueAt(row, 2).toString());

        }


    }//GEN-LAST:event_jTable2DSSPMouseClicked

    private void hoa_don_chua_su_lyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoa_don_chua_su_lyActionPerformed
        Vector cols = new Vector();
        cols.addElement("Mã Hóa Đơn");
        cols.addElement("Mã ADmin");
        cols.addElement("Ngày Lập");
        cols.addElement("Ghi Chú");
        cols.addElement("Hoàn Thành");

//        
        Vector data = new Vector();

        String sql = "SELECT * FROM `hoadon` WHERE `hoanthanh`=0";
//        bang_data.setModel(new DefaultTableModel(data, cols));
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("mahd"));
                user.addElement(rs.getString("maadmin"));
                user.addElement(rs.getDate("ngaylap"));
                user.addElement(rs.getString("ghichu"));
                user.addElement(rs.getString("hoanthanh"));

                data.add(user);
            }

//           
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        jTableDSHD.setModel(new DefaultTableModel(data, cols));
    }//GEN-LAST:event_hoa_don_chua_su_lyActionPerformed

    private void jTableDSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDSHDMouseClicked

        int index = jTableDSHD.getSelectedRow();
        click++;
        int row = jTableDSHD.getSelectedRow();
        if (row != -1) {
            String mahd = jTableDSHD.getValueAt(row, 0).toString();
            maadminhoanthanh = jTableDSHD.getValueAt(row, 1).toString();
            ngaylaphoanhthanh = jTableDSHD.getValueAt(row, 2).toString();
//            System.out.println(ngaylaphoanhthanh);
//            ngaylaphoanhthanh.setDate((java.util.Date) (jTableDSHD.getValueAt(row, 2)));
//           

            jMaHoaDonTongTien.setText(mahd);
            jMaHoaDon.setText(mahd);

            Vector cols = new Vector();
            cols.addElement("Mã Hóa Đơn");
            cols.addElement("Mã SẢn Phẩm");
            cols.addElement("Số Lượng");
            cols.addElement("Giá");

            Vector data = new Vector();

            String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
//             String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";

            try {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    Vector user = new Vector();
                    user.addElement(rs.getString("mahd"));
                    user.addElement(rs.getString("masp"));
                    user.addElement(rs.getString("soluong"));
                    NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                    user.addElement(fm.format(rs.getDouble("gia")));
                    data.add(user);
                }

            } catch (Exception e) {

            }
            jTable2DSCTHD.setModel(new DefaultTableModel(data, cols));

        }

    }//GEN-LAST:event_jTableDSHDMouseClicked

    private void hoa_don_da_su_lyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoa_don_da_su_lyActionPerformed
        Vector cols = new Vector();
        cols.addElement("Mã Hóa Đơn");
        cols.addElement("Mã ADmin");
        cols.addElement("Ngày Lập");
        cols.addElement("Ghi Chú");
        cols.addElement("Hoàn Thành");

//        
        Vector data = new Vector();

        String sql = "SELECT * FROM `hoadon` WHERE `hoanthanh`=1";
//        bang_data.setModel(new DefaultTableModel(data, cols));
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
//           bang_data.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("mahd"));
                user.addElement(rs.getString("maadmin"));
                user.addElement(rs.getDate("ngaylap"));
                user.addElement(rs.getString("ghichu"));
                user.addElement(rs.getString("hoanthanh"));

                data.add(user);
            }

//           
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        jTableDSHD.setModel(new DefaultTableModel(data, cols));
    }//GEN-LAST:event_hoa_don_da_su_lyActionPerformed

    private void JHUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHUYActionPerformed
        setNUll();
        this.dispose();

    }//GEN-LAST:event_JHUYActionPerformed

    private void JBTHEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTHEMActionPerformed
        int hdhoanthanh = 0;
        String mhd = jMaHoaDon.getText().trim();
        String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`=" + mhd + "";
        try {
            stmt = conn.prepareStatement(sql1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                hdhoanthanh = rs.getInt("hoanthanh");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (hdhoanthanh == 0) {

            double thanhtientrunggian = 0;
            double giatrungian = 0;

            String vl1 = jMaHoaDon.getText().trim();
            String vl2 = jMaSanPham.getText().trim();
            String vl3 = jSoLuong.getText().trim();

            String sql = "SELECT  `gia` FROM `sanpham` WHERE `masp`='" + vl2 + "'";
            try {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                while (rs.next()) {

                    int soluongnew = Integer.parseInt(vl3);

                    giatrungian = rs.getDouble("gia");
                    thanhtientrunggian = giatrungian * soluongnew;

                    NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                    String thanhtien = fm.format(thanhtientrunggian);
                    String giasanpham = fm.format(giatrungian);

                    jThanhtienqlhd.setText(thanhtien);
                    txtGiaQLHD.setText(giasanpham);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "fgsfgsdgas");

            }
            String up1 = jMaHoaDon.getText();
            String up2 = jMaSanPham.getText();
            String up3 = jSoLuong.getText();
            String up4 = Double.toString(thanhtientrunggian);

            conn = MySqlConnect.ConnectDb();
            try {
                stmt = conn.prepareStatement("INSERT INTO `chitiethoadon`(`mahd`, `masp`, `soluong`, `gia`) VALUES ('" + up1 + "','" + up2 + "','" + up3 + "','" + up4 + "') ");
                int i = stmt.executeUpdate();

                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Thêm Thành Công");
                    setNUll();
                    Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                    giaodienhoadon.setSize(1024, 768);
                    giaodienhoadon.setLocationRelativeTo(null);
                    giaodienhoadon.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Thêm Thất Bại");

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mời bạn chọn Sản Phẩm");
            }

        } else if (hdhoanthanh == 1) {
            JOptionPane.showMessageDialog(null, "Hóa đơn đã được giải quyết. Bạn không có quyền thay đổi chi tiết");
            setNUll();
        }


    }//GEN-LAST:event_JBTHEMActionPerformed

    private void jBTTONGHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTTONGHDActionPerformed
        String mahd = jMaHoaDonTongTien.getText().toString();

        String sql = "SELECT SUM( `gia`) FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                double giatongtamthoi = rs.getDouble("SUM( `gia`)");

                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                String trunggian = fm.format(giatongtamthoi);
                jTongTien.setText(trunggian);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBTTONGHDActionPerformed

    private void JBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBXoaActionPerformed

        if (click != 0) {

            int hdhoanthanh = 0;
            String mhd = jMaHoaDon.getText().trim();

            String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`='" + mhd + "'";
            try {
                stmt = conn.prepareStatement(sql1);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    hdhoanthanh = rs.getInt("hoanthanh");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (hdhoanthanh == 0) {
                String dlt1 = jMaHoaDon.getText();
                String dlt2 = jMaSanPham.getText();
                String sql = "DELETE FROM `chitiethoadon` WHERE `masp`= " + dlt2 + " ";
                try {
                    stmt = conn.prepareStatement(sql);
                    stmt.execute();
                    JOptionPane.showMessageDialog(null, "XÓa chi tiết hóa đơn thành công");
                    Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                    giaodienhoadon.setSize(1024, 768);
                    giaodienhoadon.setLocationRelativeTo(null);
                    giaodienhoadon.setVisible(true);
                    updateCTHD();
                } catch (SQLException ex) {
                    Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (hdhoanthanh == 1) {
                JOptionPane.showMessageDialog(null, "Hóa đơn đã giải quyết không đươc xóa.");
            }

        } else if (click == 0) {
            JOptionPane.showMessageDialog(null, "Hãy click chọn chi tiết hóa đơn cần xóa !!!");

        }

    }//GEN-LAST:event_JBXoaActionPerformed

    private void xoa_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa_hoa_donActionPerformed
        int hdhoanthanh = 0;
        String mhd = jMaHoaDon.getText().trim();

        String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`='" + mhd + "'";
        try {
            stmt = conn.prepareStatement(sql1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                hdhoanthanh = rs.getInt("hoanthanh");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);

        }
        if (hdhoanthanh == 0) {

            try {
                stmt = conn.prepareStatement("UPDATE `hoadon` SET `mahd`='" + mhd + "',`maadmin`=2,`ngaylap`='" + "2015-11-01" + "',`ghichu`='" + "" + "',`tongtien`=1,`hoanthanh`=1,`co`= 1 WHERE `mahd`='" + mhd + "'");
                int i = stmt.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, " XÓA !!! Hoàn Thành");
                    Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                    giaodienhoadon.setSize(1024, 768);
                    giaodienhoadon.setLocationRelativeTo(null);
                    giaodienhoadon.setVisible(true);

                    setNUll();

                } else {
                    JOptionPane.showMessageDialog(null, "XÓA!!!Thất Bại");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (hdhoanthanh == 1) {
            JOptionPane.showMessageDialog(null, "Hóa đơn đã giải quyết không đươc xóa.");
        }
    }//GEN-LAST:event_xoa_hoa_donActionPerformed

    private void jTableDSHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDSHDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableDSHDMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mhdht = jMaHoaDonTongTien.getText();

        java.util.Date ngaylap = Date.valueOf(ngaylaphoanhthanh);
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String ngaylap1 = format.format(ngaylap.getTime());
        int hdhoanthanh = 0;

        if (mhdht != null) {
            String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`='" + mhdht + "'";
            try {
                stmt = conn.prepareStatement(sql1);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    hdhoanthanh = rs.getInt("hoanthanh");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (hdhoanthanh == 1) {
                JOptionPane.showMessageDialog(null, "Hóa đơn đã được giải quyết bạn không được quyền xử lí lại");

            } else if (hdhoanthanh == 0) {
                String sql = "UPDATE `hoadon` SET `mahd`='" + mhdht + "',`maadmin`='" + maadminhoanthanh + "'" + ",`ngaylap`='" + ngaylap1 + "',`ghichu`='" + "" + "',`tongtien`='" + 1 + "',`hoanthanh`='" + 1 + "' WHERE `mahd`=" + mhdht + "";
                try {
                    stmt = conn.prepareStatement(sql);
                    int i = stmt.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "Hoàn Thành");
                        Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                        giaodienhoadon.setSize(1024, 768);
                        giaodienhoadon.setLocationRelativeTo(null);
                        giaodienhoadon.setVisible(true);

                        setNUll();

                    } else {
                        JOptionPane.showMessageDialog(null, "Thất Bại");

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (mhdht == null) {
            JOptionPane.showMessageDialog(null, "Hãy Chon Hóa Đơn Bạn Muốn Hoàn Thành");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu4MenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuCanceled
        close();
        Giaodienhoadon giaodien = new Giaodienhoadon();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu4MenuCanceled

    public void inhoadon() {
        lb_maHD.setText(jMaHoaDonTongTien.getText());
        String ma = jMaHoaDonTongTien.getText();
        Vector cols = new Vector();
//        cols.addElement("Mã Hóa Đơn");
        cols.addElement("Tên sản Phẩm");
        cols.addElement("Mã Sản Phẩm");
        cols.addElement("Giá Sản Phẩm");
        cols.addElement("Số Lượng");
//        cols.addElement("Bảo Hành");
        cols.addElement("Thành Tiền");
        
//        
        Vector data = new Vector();

        try {
            String sql1 = "SELECT a.masp,a.tensp,a.gia,b.soluong,b.gia FROM sanpham a , chitiethoadon b WHERE a.masp=b.masp AND b.mahd="+ma+"";
            
            String sql = "SELECT *\n"
                    + "FROM\n"
                    + "    sanpham\n"
                    + "    INNER JOIN loaisanpham ON sanpham.loaisp = loaisanpham.malsp\n"
                    + "    INNER JOIN chitiethoadon ON sanpham.masp = chitiethoadon.masp\n"
                    + "WHERE chitiethoadon.mahd =" + ma + "";

//        String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`="+ma+" ";
            stmt = conn.prepareStatement(sql1);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Vector user = new Vector();
//                user.addElement(rs.getString("mahd"));
                user.addElement(rs.getString("tensp"));
                user.addElement(rs.getString("masp"));
                NumberFormat fm1 = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                user.addElement(fm1.format(rs.getDouble("a.gia")));
                user.addElement(rs.getString("b.soluong"));
                
//                user.setElementAt(rs.getInt("baohanh"));
//                Integer new =Integer.getInteger("baohanh");
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                user.addElement(fm.format(rs.getDouble("b.gia")));
                
//                lb_maHD.setText(rs.getString("mahd"));
                data.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, cols);
        }
         String sql2 = "SELECT a.tenadmin,a.diachi,a.dienthoai FROM admin a , hoadon b WHERE a.maadmin=b.maadmin AND b.mahd="+ma+"";
         
         try {
            stmt=conn.prepareStatement(sql2);
            rs=stmt.executeQuery();
            while(rs.next()){
                jlbadmin.setText(rs.getString("a.tenadmin"));
                jlbdiachi.setText(rs.getString("a.diachi"));
                jlbdienthoai.setText(rs.getString("a.dienthoai"));
                
            
            }
        } catch (Exception e) {
        }
        bang_inhoadon.setModel(new DefaultTableModel(data, cols));

        // goi tong tien
        String mahd = jMaHoaDonTongTien.getText().toString();
        try {
            String sql = "SELECT SUM( `gia`) FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                double giatongtamthoi = rs.getDouble("SUM( `gia`)");
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                String trunggian = fm.format(giatongtamthoi);
                J_tongtien.setText(trunggian);
            }   

        } catch (SQLException ex) {
            Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
        }

//         goi ten admin
//         int index = jTableDSHD.getSelectedRow();
//        click++;
//        int row = jTableDSHD.getSelectedRow();
//        String Table_click = jTableDSHD.getValueAt(row, 0).toString();
//        maadminhoanthanh = jTableDSHD.getValueAt(row, 1).toString();
////            ngaylaphoanhthanh = jTableDSHD.getValueAt(row, 2).toString();
//        try {
//            String sql = "SELECT `tenadmin` FROM `admin` WHERE 'maadmin'="+maadminhoanthanh+"";
//            stmt = conn.prepareStatement(sql);
//                rs = stmt.executeQuery();
//        if(rs.next()){
//             j_tenadmin.setText(rs.getString("tenadmin"));
//        }           
//        }catch(Exception e) {}
    }


    private void bang_inhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang_inhoadonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bang_inhoadonMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
         close();

                GiaodienquanlyAdmin giaodien = new GiaodienquanlyAdmin();
                giaodien.setSize(1123, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        close();
        Thongke_chuan thok = new Thongke_chuan();
                thok.setSize(1009, 634);
                thok.setLocationRelativeTo(null);
                thok.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

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
      
    }//GEN-LAST:event_doi_matkhauActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        close();
        LoginView giaodien = new LoginView();
        giaodien.setSize(1024, 610);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    public void setNUll() {
        jMaHoaDon.setText(null);
        jMaSanPham.setText(null);
        jSoLuong.setText(null);
        jThanhtienqlhd.setText(null);
        txtGiaQLHD.setText(null);
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
            java.util.logging.Logger.getLogger(Giaodienhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodienhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodienhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodienhoadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Giaodienhoadon giaodienhoadon = new Giaodienhoadon();
                giaodienhoadon.setSize(1024, 768);
                giaodienhoadon.setLocationRelativeTo(null);
                giaodienhoadon.setVisible(true);
//                new Giaodienhoadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hoadon;
    private javax.swing.JButton JBTHEM;
    private javax.swing.JButton JBXoa;
    private javax.swing.JButton JHUY;
    private javax.swing.JLabel J_tongtien;
    private javax.swing.JToolBar ToolBar_menu;
    private javax.swing.JTable bang_inhoadon;
    private javax.swing.JButton doi_matkhau;
    private javax.swing.JButton hoa_don_chua_su_ly;
    private javax.swing.JButton hoa_don_da_su_ly;
    private javax.swing.JButton in_hoa_don;
    private javax.swing.JDialog inhoadon;
    private javax.swing.JButton jBTTONGHD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMaHoaDon;
    private javax.swing.JTextField jMaHoaDonTongTien;
    private javax.swing.JTextField jMaSanPham;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jSoLuong;
    private javax.swing.JTable jTable2DSCTHD;
    private javax.swing.JTable jTable2DSSP;
    private javax.swing.JTable jTableDSHD;
    private javax.swing.JTextField jThanhtienqlhd;
    private javax.swing.JTextField jTongTien;
    private javax.swing.JLabel jlbadmin;
    private javax.swing.JLabel jlbdiachi;
    private javax.swing.JLabel jlbdienthoai;
    private java.awt.Label label1;
    private javax.swing.JLabel lb_maHD;
    private javax.swing.JButton loaisanpham;
    private javax.swing.JButton sanpham;
    private javax.swing.JButton them_hoa_don;
    private javax.swing.JButton thongke;
    private javax.swing.JTextField txtGiaQLHD;
    private javax.swing.JButton xoa_hoa_don;
    // End of variables declaration//GEN-END:variables

}
