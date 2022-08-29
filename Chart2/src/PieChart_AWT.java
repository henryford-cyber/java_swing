

import java.awt.Color;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
public class PieChart_AWT extends ApplicationFrame {
   
   public PieChart_AWT( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Đà Nẵng" , new Double( 20 ) );  
      dataset.setValue( "TP.HCM" , new Double( 20 ) );   
      dataset.setValue( "Huế" , new Double( 40 ) );    
      dataset.setValue( "Hải Phòng" , new Double( 10 ) );  
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Thống Kê Sinh viên các tỉnh ",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

   public static void main( String[ ] args ) {
      PieChart_AWT demo = new PieChart_AWT( "Thống Kê Sinh viên các tỉnh " );  
      demo.setSize( 600 , 550 );  
demo.setBackground(Color.WHITE);
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }
}