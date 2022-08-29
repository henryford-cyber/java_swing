/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ProductDao;
import Model.Product;
import View.ProductView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
 
public class ProductController {

    public ProductController() {
    }
    private ProductView view;
    private ProductDao prDao = new ProductDao();

    public ProductController(ProductView view) {
        this.view = view;
        this.view.setVisible(true);

    }

    public void xuatFileExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet spreadsheet = workbook.createSheet("SẢN PHẨM");
        XSSFRow row = null;
        Cell cell = null;
        row = spreadsheet.createRow((short) 2);
        row.setHeight((short) 500);
        row.createCell(0, CellType.STRING).setCellValue("DANH SÁCH SẢN PHẨM");
        row = spreadsheet.createRow((short) 3);
        row.setHeight((short) 500);
        row.createCell(0, CellType.NUMERIC).setCellValue("STT");
        row.createCell(1, CellType.STRING).setCellValue("Masp");
        row.createCell(2, CellType.STRING).setCellValue("Loaisp");
        row.createCell(3, CellType.STRING).setCellValue("Tensp");
        row.createCell(4, CellType.STRING).setCellValue("Gia");
        row.createCell(5, CellType.STRING).setCellValue("Tomtac");
        row.createCell(6, CellType.STRING).setCellValue("Linhkien");
        row.createCell(7, CellType.STRING).setCellValue("Khuyenmai");
        row.createCell(8, CellType.STRING).setCellValue("Thongso");
        row.createCell(9, CellType.STRING).setCellValue("Baiviet");
        row.createCell(10, CellType.STRING).setCellValue("Baohanh");
        row.createCell(11, CellType.STRING).setCellValue("Soluong"); 
        row.createCell(12, CellType.STRING).setCellValue("Tinhtrang");

        List<Product> listItem = prDao.getProduct();
        if (listItem != null) {
            int s = listItem.size();
            for (int i = 0; i < listItem.size(); i++) {
                Product pr = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(pr.getMasp());
                row.createCell(2).setCellValue(pr.getLoaisp());
                row.createCell(3).setCellValue(pr.getTensp());
                row.createCell(4).setCellValue(pr.getGia());
                row.createCell(5).setCellValue(pr.getTomtac());
                row.createCell(6).setCellValue(pr.getLinhkien());
                row.createCell(7).setCellValue(pr.getKhuyenmai());
                row.createCell(8).setCellValue(pr.getThongso());
                row.createCell(9).setCellValue(pr.getBaiviet());
                row.createCell(10).setCellValue(pr.getBaohanh());
                row.createCell(11).setCellValue(pr.getSoluong());
                row.createCell(12).setCellValue(pr.getTinhtrang());
            }
        }
        try {
            File fi = new File("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\FileExcell\\Product.xlsx");
            FileOutputStream out = new FileOutputStream(fi);
            workbook.write(out);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
