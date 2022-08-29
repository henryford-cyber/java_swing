/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Connection.MySqlConnect;
import DAO.AccountDao;
import DAO.BillDao;
import DAO.ProductDao;
import Model.Account;
import Model.Bill;
import Model.Product;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author ADMIN
 */
public class HomeView extends javax.swing.JPanel {
 Connection conn = null;
            PreparedStatement pstmt = null;
    private List<Product> listProduct = new ArrayList<>();
    private List<Bill> listBill = new ArrayList<>();
    private List<Account> listAdmin = new ArrayList<>();
    private BillDao billDao = new BillDao();
    private ProductDao prDao = new ProductDao();
    private AccountDao adDao = new AccountDao();
    public int countLoaisp1;
    public int countLoaisp2;
    public int countLoaisp7;
    public int countLoaisp4;
    public int countLoaisp5;
    public int countLoaisp6;
    public int countHDhoanthanh;
    public int countHDchuahoanthanh;
    public int countHaNoi;
    public int countTPHCM;
    public int countHue;
    public int countKhac;

    /**
     * Creates new form HomeView
     */
    public HomeView() {
        initComponents();
        showChart2();
        showChart();
        showChart3();
    }

    public JPanel getRenderChart1() {
        return renderChart1;
    }

    public void showChart() {
        JFreeChart pieChart = createChart(createDataset());
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        renderChart2.removeAll();
        renderChart2.add(chartPanel, BorderLayout.CENTER);
        renderChart2.validate();
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "", dataset, true, true, true);
        return chart;
    }

    private PieDataset createDataset() {
        listBill = billDao.getBill();
        DefaultPieDataset dataset = new DefaultPieDataset();
        listBill.forEach(sv -> {
            if (sv.getHoanthanh().equals("1")) {
                countHDhoanthanh++;
            } else {
                countHDchuahoanthanh++;
            }
        });
        dataset.setValue("HD đã hoàn thành", countHDhoanthanh);
        dataset.setValue("HD chưa hoàn thành", countHDchuahoanthanh);
        return dataset;
    }

    public JPanel getRenderChart2() {
        return renderChart2;
    }

    public void showChart2() {
        ChartPanel chartPanel = new ChartPanel(createChart2());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        renderChart1.removeAll();
        renderChart1.add(chartPanel, BorderLayout.CENTER);
        renderChart1.validate();
    }

    public JFreeChart createChart2() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "HÃNG", "SỐ LƯỢNG",
                createDataset2(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private CategoryDataset createDataset2() {
        listProduct = prDao.getProduct();
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        listProduct.forEach(sv -> {
            if (sv.getLoaisp().equals("1")) {
                countLoaisp1++;
            }
            if (sv.getLoaisp().equals("2")) {
                countLoaisp2++;
            }
            if (sv.getLoaisp().equals("4")) {
                countLoaisp4++;
            }
            if (sv.getLoaisp().equals("5")) {
                countLoaisp5++;
            }
            if (sv.getLoaisp().equals("6")) {
                countLoaisp6++;
            }
            if (sv.getLoaisp().equals("7")) {
                countLoaisp7++;
            }

        });
        dataset.addValue(countLoaisp1, "Số Lượng", "Asus");
        dataset.addValue(countLoaisp2, "Số Lượng", "Dell");
        dataset.addValue(countLoaisp4, "Số Lượng", "HP");
        dataset.addValue(countLoaisp5, "Số Lượng", "Sony");
        dataset.addValue(countLoaisp6, "Số Lượng", "Apple");
        dataset.addValue(countLoaisp7, "Số Lượng", "Hang khac !");

        return dataset;
    }

    public JPanel getRenderChart3() {
        return renderChart3;
    }

    public void showChart3() {
        ChartPanel chartPanel = new ChartPanel(createChart3());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        renderChart3.removeAll();
        renderChart3.add(chartPanel, BorderLayout.CENTER);
        renderChart3.validate();
    }

    public JFreeChart createChart3() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "",
                "TỈNH ", "SỐ LƯỢNG",
                createDataset3(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    private CategoryDataset createDataset3() {
        listAdmin = adDao.getAccount();
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        listAdmin.forEach(ok -> {
            if (ok.getDiachi().equals("Ha Noi")) {
                countHaNoi++;
            }
            if (ok.getDiachi().equals("TP.HCM")) {
                countTPHCM++;
            }
            if (ok.getDiachi().equals("Hue")) {
                countHue++;
            }
             else {
                countKhac++;
            } 

        });
        dataset.addValue(countHaNoi, "Số Lượng", "Hà Nội");
        dataset.addValue(countTPHCM, "Số Lượng", "TP HCM");
        dataset.addValue(countHue, "Số Lượng", "Huế");
        dataset.addValue(countKhac, "Số Lượng", "Tỉnh khác");
        

        return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doimatkhau = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        matkhau_hientai = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        matkhau_moi = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        matkhau_moi_xac_nhan = new javax.swing.JPasswordField();
        Doi_mat_khau_nut_cap_nhat = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        thong_bao_mk = new javax.swing.JLabel();
        tro_giup = new javax.swing.JButton();
        thongbao_mat_khau_moi = new javax.swing.JLabel();
        xac_nhan_khongdung = new javax.swing.JLabel();
        matkhau_xac_nhan = new javax.swing.JLabel();
        dialog_hinh_nen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        renderChart2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        jPanel2 = new javax.swing.JPanel();
        renderChart1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        renderChart3 = new javax.swing.JPanel();

        doimatkhau.getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Mật Khẩu");
        doimatkhau.getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 20, 90, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Mật khẩu hiện tại:");
        doimatkhau.getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 30, 120, 14);

        matkhau_hientai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_hientai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        doimatkhau.getContentPane().add(matkhau_hientai);
        matkhau_hientai.setBounds(270, 70, 160, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Mật khẩu mới:");
        doimatkhau.getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 80, 100, 14);

        matkhau_moi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_moi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matkhau_moi.setToolTipText("Mật khẩu từ 6 -> 12 ký tự");
        matkhau_moi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                matkhau_moiFocusLost(evt);
            }
        });
        doimatkhau.getContentPane().add(matkhau_moi);
        matkhau_moi.setBounds(270, 20, 160, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Xác nhận mật khẩu:");
        doimatkhau.getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 140, 120, 14);

        matkhau_moi_xac_nhan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_moi_xac_nhan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        doimatkhau.getContentPane().add(matkhau_moi_xac_nhan);
        matkhau_moi_xac_nhan.setBounds(270, 130, 160, 30);

        Doi_mat_khau_nut_cap_nhat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Doi_mat_khau_nut_cap_nhat.setText("Cập nhật");
        Doi_mat_khau_nut_cap_nhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Doi_mat_khau_nut_cap_nhatActionPerformed(evt);
            }
        });
        doimatkhau.getContentPane().add(Doi_mat_khau_nut_cap_nhat);
        Doi_mat_khau_nut_cap_nhat.setBounds(210, 200, 100, 23);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Bỏ qua");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        doimatkhau.getContentPane().add(jButton2);
        jButton2.setBounds(350, 200, 80, 23);

        thong_bao_mk.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        thong_bao_mk.setForeground(new java.awt.Color(255, 51, 0));
        doimatkhau.getContentPane().add(thong_bao_mk);
        thong_bao_mk.setBounds(270, 50, 160, 20);

        tro_giup.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tro_giup.setText("Trợ Giúp");
        doimatkhau.getContentPane().add(tro_giup);
        tro_giup.setBounds(0, 200, 81, 40);

        thongbao_mat_khau_moi.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        thongbao_mat_khau_moi.setForeground(new java.awt.Color(255, 51, 0));
        doimatkhau.getContentPane().add(thongbao_mat_khau_moi);
        thongbao_mat_khau_moi.setBounds(270, 104, 160, 20);
        doimatkhau.getContentPane().add(xac_nhan_khongdung);
        xac_nhan_khongdung.setBounds(250, 170, 180, 20);
        doimatkhau.getContentPane().add(matkhau_xac_nhan);
        matkhau_xac_nhan.setBounds(270, 164, 170, 20);

        dialog_hinh_nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dialog/icon_doimatkhau.png"))); // NOI18N
        doimatkhau.getContentPane().add(dialog_hinh_nen);
        dialog_hinh_nen.setBounds(0, 0, 480, 250);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        renderChart2.setBackground(new java.awt.Color(255, 255, 255));
        renderChart2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        renderChart2.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Thống kê theo tuần :");

        kButton1.setText("Tháng");
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 153, 51));

        kButton2.setText("Tuần");
        kButton2.setkEndColor(new java.awt.Color(255, 102, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(0, 0, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(204, 204, 0));
        kButton2.setkStartColor(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(renderChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renderChart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.setEnabled(false);
        kGradientPanel1.setFocusCycleRoot(true);
        kGradientPanel1.setkBorderRadius(50);
        kGradientPanel1.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 255, 0));
        kGradientPanel1.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("SerpentineSans", 0, 30)); // NOI18N
        jLabel5.setText("TRANG CHỦ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(528, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(485, 485, 485))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\thongke2.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\thongke3.png")); // NOI18N

        kButton3.setText("Thống kê theo mã sản phẩm và số lượng");
        kButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(51, 0, 204));
        kButton3.setkEndColor(new java.awt.Color(0, 0, 255));
        kButton3.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 0, 255));
        kButton3.setkSelectedColor(new java.awt.Color(0, 51, 204));
        kButton3.setkStartColor(new java.awt.Color(0, 0, 204));

        kButton4.setText("Thống kê theo giá và sản phẩm");
        kButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(51, 153, 0));
        kButton4.setkEndColor(new java.awt.Color(51, 153, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(51, 153, 0));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(51, 153, 0));
        kButton4.setkPressedColor(new java.awt.Color(0, 153, 0));
        kButton4.setkSelectedColor(new java.awt.Color(51, 153, 0));
        kButton4.setkStartColor(new java.awt.Color(51, 153, 0));

        kButton5.setText("Thống kê theo loại sản phẩm và số lượng");
        kButton5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(kButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(kButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kButton6.setText("Đổi mật khẩu");
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new java.awt.Color(0, 204, 102));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(kButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        renderChart1.setBackground(new java.awt.Color(255, 255, 255));
        renderChart1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        renderChart1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Thống kê tổng quan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(renderChart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(renderChart1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
        );

        renderChart3.setBackground(new java.awt.Color(255, 255, 255));
        renderChart3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        renderChart3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(renderChart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renderChart3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matkhau_moiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_matkhau_moiFocusLost
        if(new String(matkhau_moi.getPassword()).equals("")){
            thong_bao_mk.setText("Bạn chưa điền mật khẩu hiện tại");
        }

    }//GEN-LAST:event_matkhau_moiFocusLost

    private void Doi_mat_khau_nut_cap_nhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Doi_mat_khau_nut_cap_nhatActionPerformed

        String pw = new String(matkhau_moi.getPassword());
        if (pw.equals("")) {
            thong_bao_mk.setText("Bạn chưa điền mật khẩu hiện tại");
            matkhau_moi.requestFocus();
            return;
        }

        String pw1 = new String(matkhau_hientai.getPassword());
        if (pw1.equals("")) {
            thongbao_mat_khau_moi.setText("Bạn chưa nhập mật khẩu mới");
            matkhau_hientai.requestFocus();
            return;
        }

        String pw2 = new String(matkhau_moi_xac_nhan.getPassword());
        if (pw2.equals("")) {
            matkhau_xac_nhan.setText("Bạn chưa nhập mật khẩu xác nhận");
            matkhau_moi_xac_nhan.requestFocus();
            return;
        }
        if(!pw1.equals(pw2)){
            xac_nhan_khongdung.setText("Xác nhận mật khẩu không đúng");
            matkhau_moi_xac_nhan.requestFocus();
            return;
        }

        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement("UPDATE `taikhoan` SET `matkhau`=? WHERE `matkhau`=?");
            pstmt.setString(1,matkhau_hientai.getText());
            pstmt.setString(2, matkhau_moi.getText());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Bạn Đã Đổi Mật Khẩu Thành Công");
                

            } else {
                JOptionPane.showMessageDialog(null, "Thông tin chưa chính xác");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_Doi_mat_khau_nut_cap_nhatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        matkhau_moi.setText(null);
        matkhau_hientai.setText(null);
        matkhau_moi_xac_nhan.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
         doimatkhau.setSize(480, 300);
        doimatkhau.setLocationRelativeTo(null);
        doimatkhau.setVisible(true);
    }//GEN-LAST:event_kButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Doi_mat_khau_nut_cap_nhat;
    private javax.swing.JLabel dialog_hinh_nen;
    private javax.swing.JDialog doimatkhau;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField matkhau_hientai;
    private javax.swing.JPasswordField matkhau_moi;
    private javax.swing.JPasswordField matkhau_moi_xac_nhan;
    private javax.swing.JLabel matkhau_xac_nhan;
    private javax.swing.JPanel renderChart1;
    private javax.swing.JPanel renderChart2;
    private javax.swing.JPanel renderChart3;
    private javax.swing.JLabel thong_bao_mk;
    private javax.swing.JLabel thongbao_mat_khau_moi;
    private javax.swing.JButton tro_giup;
    private javax.swing.JLabel xac_nhan_khongdung;
    // End of variables declaration//GEN-END:variables
}
