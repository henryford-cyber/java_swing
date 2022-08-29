package Project.Controller;

import Project.DanhMuc;
import Project.View.DiemJPanel;
import Project.View.SinhvienJPanel;
import Project.View.TrangchuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Project.View.Main1JFrame;
public class CTL_Chuyenmanhinh {

    private JPanel root;
    private String kindSelected = "";

    private List<DanhMuc> listDanhMuc = null;

    public CTL_Chuyenmanhinh(JPanel jpnRoot) {
        this.root = jpnRoot;

    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {

        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangchuJPanel());
        root.validate();
        root.repaint();

    }

    public void setEvent(List<DanhMuc> listDanhMuc) {
        this.listDanhMuc = listDanhMuc;
        for (DanhMuc danhmuc : listDanhMuc) {
            danhmuc.getJlb().addMouseListener(new LabelEvent(danhmuc.getKind(), danhmuc.getJpn(), danhmuc.getJlb()));

        }

    }

    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
       kindSelected = "Trangchu";
       jpnItem.setBackground(new Color(96, 100, 191));
       jlbItem.setBackground(new Color(96, 100, 191));
       JPanel node = new TrangchuJPanel();
       root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
}

    
    

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChinh":
                    node = new TrangchuJPanel();
                    break;
                case "Sinhvien":
                    node = new SinhvienJPanel();
                    break;
                case "Diem":
                    node = new DiemJPanel();
                    break;
                // more
                default:
              node = new TrangchuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangBackgound(kind);

        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96, 100, 191));
            jlbItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
            }
        }
    }

    private void setChangBackgound(String kind) {
        for (DanhMuc danhmuc : listDanhMuc) {
            if (danhmuc.getKind().equalsIgnoreCase(kind)) {
                danhmuc.getJpn().setBackground(new Color(96, 175, 191));
                danhmuc.getJlb().setBackground(new Color(96, 175, 191));

            } else {
                danhmuc.getJpn().setBackground(new Color(76, 175, 80));
                danhmuc.getJlb().setBackground(new Color(76, 175, 80));
            }
        }
    }

}

 
