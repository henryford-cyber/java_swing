package edu.namphan.Project.Controller;

import edu.namphan.Project.View.TrangchuJPanel;
import edu.namphan.Project.Model.DanhMuc;
import edu.namphan.Project.View.Main1JFrame;

import edu.namphan.Project.View.SinhvienJPanel;
import edu.namphan.Project.View.TaikhoanJPanel;
import edu.namphan.Project.View.userFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CTL_Chuyenmanhinh {

//    private JPanel root;
//    private String kindSelected = "";
//    private List<DanhMuc> listDanhMuc = null;
//    private SinhvienController sinhvienCTL =new SinhvienController();
    private Main1JFrame view;
    private userFrame user;
    private SinhvienJPanel sinhvienjpanel = new SinhvienJPanel();
    private TaikhoanJPanel taikhoanjpanel = new TaikhoanJPanel();
    private TrangchuJPanel trangchujpanel = new TrangchuJPanel();

    public CTL_Chuyenmanhinh(Main1JFrame view) {
//        this.root = jpnRoot;
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public CTL_Chuyenmanhinh(userFrame user) {

        this.user = user;
        this.user.setVisible(true);
        listener();
    }

    public void listener() {
        bntSinhvien();
        bntTaikhoan();
        bntTrangchu();
    }

    public void bntTrangchu() {
        this.view.getJlbTrangchu().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(trangchujpanel);
            }
        });
    }

    public void bntSinhvien() {
        this.view.getJlbSinhvien().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(sinhvienjpanel);
            }
        });
    }

    public void bntTaikhoan() {
        this.view.getJpnTaikhoan().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(taikhoanjpanel);
            }
        });
    }

    public void switchPanel(JPanel panel) {
        List<JPanel> list = new ArrayList() {
            {
                add(trangchujpanel);
                add(sinhvienjpanel);
                add(taikhoanjpanel);
            }
        };
        list.forEach(item -> {
            item.setVisible(false);

        });
        this.view.getPanelRender().add(panel);
        panel.setVisible(true);
    }

//    public void setView(JPanel jpnItem, JLabel jlbItem) {
//
//        kindSelected = "TrangChu";
//        jpnItem.setBackground(new Color(69, 255, 162));
//        jlbItem.setBackground(new Color(69, 255, 162));
//        root.removeAll();
//        root.setLayout(new BorderLayout());
//        root.add(new TrangchuJPanel());
//        root.validate();
//        root.repaint();
//
//    }
//
//    public void setEvent(List<DanhMuc> listDanhMuc) {
//        this.listDanhMuc = listDanhMuc;
//        for (DanhMuc danhmuc : listDanhMuc) {
//            danhmuc.getJlb().addMouseListener(new LabelEvent(danhmuc.getKind(), danhmuc.getJpn(), danhmuc.getJlb()));
//
//        }
//
//    }
//
//    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
//        kindSelected = "Trangchu";
//        jpnItem.setBackground(new Color(255, 255, 255));
//        jlbItem.setBackground(new Color(255, 255, 255));
//        JPanel node = new TrangchuJPanel();
//        root.removeAll();
//        root.setLayout(new BorderLayout());
//        // root.setSize(1366,760);
//        root.add(node);
//        root.validate();
//        root.repaint();
//    }
//
//    class LabelEvent implements MouseListener {
//
//        private JPanel node;
//        private String kind;
//
//        private JPanel jpnItem;
//        private JLabel jlbItem;
// 
//
//        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
//            this.kind = kind;
//            this.jpnItem = jpnItem;
//            this.jlbItem = jlbItem;
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            switch (kind) {
//                case "TrangChinh":
//                    node = new TrangchuJPanel();
//                    
//                    break;
//                case "Sinhvien":
//                    node = new SinhvienJPanel();  
//                    break;
//                case "Diem":
//                   // node = new DiemJPanel();
//                    break;
//                case "Taikhoan":
//                    node = new TaikhoanJPanel();
//                    break;
//                // more
//                default:
//                    node = new TrangchuJPanel();
//                    break;
//            }
//            root.removeAll();
//            root.setLayout(new BorderLayout());
//            // root.setSize(1366,760);
//            root.add(node);
//            root.validate();
//            root.repaint();
//            setChangBackgound(kind);
//
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            //click 
//            kindSelected = kind;
//            jpnItem.setBackground(new Color(202, 204, 203));
//            jlbItem.setBackground(new Color(202, 204, 203));
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//             
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            // rê chuột nhả bay màu
//            jpnItem.setBackground(new Color(69, 255, 162));
//            jlbItem.setBackground(new Color(69, 255, 162));
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            // rê vào hiện màu mãi
//            if (!kindSelected.equalsIgnoreCase(kind)) {
//                jpnItem.setBackground(new Color(255, 255, 255));
//                jlbItem.setBackground(new Color(255, 255, 255));
//            }
//        }
//    }
//
//    private void setChangBackgound(String kind) {
//        for (DanhMuc danhmuc : listDanhMuc) {
//            if (danhmuc.getKind().equalsIgnoreCase(kind)) {
//                danhmuc.getJpn().setBackground(new Color(69, 255, 162));
//                danhmuc.getJlb().setBackground(new Color(69, 255, 162));
//
//            } else {
//                danhmuc.getJpn().setBackground(new Color(255, 255, 255));
//                danhmuc.getJlb().setBackground(new Color(255, 255, 255));
//            }
//        }
//    }
}
