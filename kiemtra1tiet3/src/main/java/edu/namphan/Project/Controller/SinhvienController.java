/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.namphan.Project.Controller;

import edu.namphan.Project.DAO.SinhvienDAO;
import edu.namphan.Project.Model.Sinhvien;
import edu.namphan.Project.View.SinhvienJPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Cell;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ADMIN
 */
public class SinhvienController {

    DefaultTableModel tbl = new DefaultTableModel();
    private List<Sinhvien> listSinhvien = new ArrayList<>();

    private SinhvienJPanel view;

    public void SinhvienController(SinhvienJPanel view) {
        this.view = view;
        Listener();
    }

    public void Listener() {
        btnSave();
        btnRefresh();

    }

    public void btnSave() {
        view.getBtnSave().addActionListener((ActionEvent e) -> {
            StringBuilder sb = new StringBuilder();
            if (view.getTxtUser().getText().equals("") || view.getTxtBirtday().getText().equals("") || view.getTxtPhonenumber().getText().equals("") || view.getTxtEmail().getText().equals("") || view.getTxtGender().getText().equals("") || view.getTxtAddress().getText().equals("")) {
                sb.append("Cần nhập thông tin đầy đủ để thêm sinh viên!");

            } else {
                view.getTxtUser().setBackground(Color.white);
            }
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(null, sb);
                return;
            }

            Sinhvien sinhvien = new Sinhvien();
            sinhvien.setName(view.getTxtUser().getText());
            sinhvien.setBirtday(view.getTxtBirtday().getText());
            sinhvien.setGender(view.getTxtGender().getText());
            sinhvien.setEmail(view.getTxtEmail().getText());
            sinhvien.setPhonenumber(view.getTxtPhonenumber().getText());
            sinhvien.setAddress(view.getTxtAddress().getText());

            SinhvienDAO dao = new SinhvienDAO();
            dao.insert(sinhvien);
            dao.loadSinhvien();
            JOptionPane.showMessageDialog(null, "Sinh viên mới đã được lưu vào CSDL của bạn");

            JOptionPane.showMessageDialog(null, "Lỗi rồi đại vương ơi !");

        });
    }

    public void btnRefresh() {
        view.getBtnRefresh().addActionListener((ActionEvent e) -> {
            view.getTxtSearch().setText("");
            view.getTxtUser().setText("");
            view.getTxtEmail().setText("");
            view.getTxtPhonenumber().setText("");
            view.getTxtAddress().setText("");
            view.getTxtGender().setText("");
            view.getTxtBirtday().setText("");

        });
    }
//    public void loadSinhvien() {
//        listSinhvien = SinhvienDAO.getAllSinhvien();
//        tbl = (DefaultTableModel) this.view.getTblSinhvien().getModel();
//        tbl.setRowCount(0);
//        listSinhvien.forEach(p -> {
//
//            tbl.addRow(new Object[]{
//                p.getId(),
//                p.getName(),
//                p.getBirtday(),
//                p.getGender(),
//                p.getPhonenumber(),
//                p.getEmail(),
//                p.getAddress()
//            });
//
//        });
//    }

    public void xuatFileExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("Sinh viên");
        XSSFRow row = null;
        Cell cell = null;
        row = spreadsheet.createRow((short) 2);
        row.setHeight((short) 500);
        row.createCell(0, CellType.STRING).setCellValue("DANH SÁCH HỌC VIÊN");
        row = spreadsheet.createRow((short) 3);
        row.setHeight((short) 500);
        row.createCell(0, CellType.NUMERIC).setCellValue("STT");
        row.createCell(1, CellType.STRING).setCellValue("Ho và tên");
        row.createCell(2, CellType.STRING).setCellValue("Ngày sinh");
        row.createCell(3, CellType.STRING).setCellValue("Giới tính");
        row.createCell(4, CellType.STRING).setCellValue("Số diện thoại");
        row.createCell(5, CellType.STRING).setCellValue("Email");
        row.createCell(6, CellType.STRING).setCellValue("Địa chỉ");
        SinhvienDAO svdao = new SinhvienDAO();
        List<Sinhvien> listItem = svdao.getAllSinhvien();
        if (listItem != null) {
            int s = listItem.size();
            for (int i = 0; i < listItem.size(); i++) {
                Sinhvien sv = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(sv.getName());
                row.createCell(2).setCellValue(sv.getBirtday());
                row.createCell(3).setCellValue(sv.getGender());
                row.createCell(4).setCellValue(sv.getPhonenumber());
                row.createCell(5).setCellValue(sv.getEmail());
                row.createCell(6).setCellValue(sv.getAddress());
            }
        }
        try {
            File fi = new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\kiemtra1tiet3\\src\\sinhvien.xlsx");
            FileOutputStream out = new FileOutputStream(fi);
            workbook.write(out);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
