
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;


@SuppressWarnings("serial")
public class JDBCMainWindowContent extends JInternalFrame implements ActionListener{
	
	// DB Connectivity Attributes
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private PreparedStatement ps = null;//

	private Container content;
	
	private JPanel detailsPanel;
	private JPanel exportButtonPanel;
	private JPanel exportConceptDataPanel;
	private JScrollPane dbContentsPanel;
	
	private Border lineBorder;
	
	private JLabel Property_IDLabel=new JLabel("Property_ID:                 ");
	private JLabel PropertyLabel=new JLabel("Property:               ");
	private JLabel StartedLabel=new JLabel("Started:      ");
	private JLabel TechnologyLabel=new JLabel("Technology:        ");
	private JLabel StandardLabel=new JLabel("Standard:                 ");
	private JLabel BandwidthLabel=new JLabel("Bandwidth:               ");
	private JLabel Address_TechniqueLabel=new JLabel("Address_Technique:      ");
	private JLabel Core_Network_SwitchingLabel=new JLabel("Core_Network_Switching:      ");
	private JLabel Server_TypeLabel=new JLabel("Server_Type:        ");
	
	private JTextField Property_IDTF= new JTextField(35);
	private JTextField PropertyTF=new JTextField(35);
	private JTextField StartedTF=new JTextField(35);
	private JTextField TechnologyTF=new JTextField(35);
	private JTextField StandardTF=new JTextField(35);
	private JTextField BandwidthTF=new JTextField(35);
	private JTextField Address_TechniqueTF=new JTextField(35);
	private JTextField Core_Network_SwitchingTF=new JTextField(35);
	private JTextField Server_TypeTF=new JTextField(45);

			
	private static QueryTableModel TableModel = new QueryTableModel();
	
	//Add the models to JTabels
	private JTable TableofDBContents=new JTable(TableModel);
	
	//Buttons for inserting, and updating members
	//also a clear button to clear details panel
	private JButton updateButton = new JButton("Update");
	private JButton insertButton = new JButton("Insert");
	private JButton exportButton  = new JButton("Export");
	private JButton deleteButton  = new JButton("Delete");
	private JButton clearButton  = new JButton("Clear");
	private JButton chartButton = new JButton("Chart Network Statistics");

	
	private JButton last3LossRates  = new JButton("3 Previous Loss Rates per AP");
	private JTextField last3LossRatesTF  = new JTextField(12);
	private JButton avgofRSS  = new JButton("Avg Loss for last 3 Rec per AP");
	private JTextField avgofRSSTF  = new JTextField(12);
	private JButton overLappingAP  = new JButton("AP Location");
	private JButton overLappingChannels  = new JButton("AP Channel");
	


	public JDBCMainWindowContent( String aTitle){
		
		//setting up the GUI
		super(aTitle, false,false,false,false);
		setEnabled(true);
		
		initiate_db_conn();
		//add the 'main' panel to the Internal Frame
		content=getContentPane();
		content.setLayout(null);
		content.setBackground(Color.lightGray);
		lineBorder = BorderFactory.createEtchedBorder(15, Color.blue, Color.black);
	
		//setup details panel and add the components to it
		detailsPanel=new JPanel();
		detailsPanel.setLayout(new GridLayout(11,2));
		detailsPanel.setBackground(Color.lightGray);
		detailsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder, "AP Details"));
			
		detailsPanel.add(Property_IDLabel);			
		detailsPanel.add(Property_IDTF);
		detailsPanel.add(PropertyLabel);		
		detailsPanel.add(PropertyTF);
		detailsPanel.add(StartedLabel);	
		detailsPanel.add(StartedTF);
		detailsPanel.add(TechnologyLabel);		
		detailsPanel.add(TechnologyTF);
		detailsPanel.add(StandardLabel);
		detailsPanel.add(StandardTF);
		detailsPanel.add(BandwidthLabel);
		detailsPanel.add(BandwidthTF);
		detailsPanel.add(Address_TechniqueLabel);
		detailsPanel.add(Address_TechniqueTF);
		detailsPanel.add(Core_Network_SwitchingLabel);
		detailsPanel.add(Core_Network_SwitchingTF);
		detailsPanel.add(Server_TypeLabel);
		detailsPanel.add(Server_TypeTF);
		
		//setup details panel and add the components to it
		exportButtonPanel=new JPanel();
		exportButtonPanel.setLayout(new GridLayout(3,2));
		exportButtonPanel.setBackground(Color.lightGray);
		exportButtonPanel.setBorder(BorderFactory.createTitledBorder(lineBorder, "Export Data"));
		exportButtonPanel.add(last3LossRates);
		exportButtonPanel.add(last3LossRatesTF);
		exportButtonPanel.add(avgofRSS);
		exportButtonPanel.add(avgofRSSTF);
		exportButtonPanel.add(overLappingAP);
		exportButtonPanel.add(overLappingChannels);
		exportButtonPanel.setSize(500, 200);
		exportButtonPanel.setLocation(3, 300);
		content.add(exportButtonPanel);
		
		insertButton.setSize(100, 30);
		updateButton.setSize(100, 30);
		exportButton.setSize (100, 30);
		deleteButton.setSize (100, 30);
		clearButton.setSize (100, 30);
		
		insertButton.setLocation(370, 10);
		updateButton.setLocation(370, 110);
		exportButton.setLocation (370, 160);
		deleteButton.setLocation (370, 60);
		clearButton.setLocation (370, 210);
		
		insertButton.addActionListener(this);
		updateButton.addActionListener(this);
		exportButton.addActionListener(this);
		deleteButton.addActionListener(this);
		clearButton.addActionListener(this);

		content.add(insertButton);
		content.add(updateButton);
		content.add(exportButton);
		content.add(deleteButton);
		content.add(clearButton);
				
		TableofDBContents.setPreferredScrollableViewportSize(new Dimension(1000, 300));
	
		dbContentsPanel=new JScrollPane(TableofDBContents,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		dbContentsPanel.setBackground(Color.lightGray);
		dbContentsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder,"Database Content"));
		
		detailsPanel.setSize(360, 300);
		detailsPanel.setLocation(3,0);
		dbContentsPanel.setSize(1000, 300);
		dbContentsPanel.setLocation(477, 0);
		
		content.add(detailsPanel);
		content.add(dbContentsPanel);
		
		setSize(982,645);
		setVisible(true);
	
		TableModel.refreshFromDB(stmt);
	}
	
	public void initiate_db_conn(){
		try{
			// Load the JConnector Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Specify the DB Name
			String url="jdbc:mysql://localhost:3306/mobiletechnology";
			// Connect to DB using DB URL, Username and password
			con = DriverManager.getConnection(url, "root", "admin");
			//Create a generic statement which is passed to the TestInternalFrame1
			stmt = con.createStatement();
		}catch(Exception e){
			System.out.println("Error: Failed to connect to database\n"+e.getMessage());
		}
	}
	//export write to file
	private void writeToFile(ResultSet rs){
		try{
			FileWriter outputFile = new FileWriter("CellOutput.csv");
			PrintWriter printWriter = new PrintWriter(outputFile);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numColumns = rsmd.getColumnCount();

			for(int i=0;i<numColumns;i++){
				printWriter.print(rsmd.getColumnLabel(i+1)+",");
			}
			printWriter.print("\n");
			while(rs.next()){
				for(int i=0;i<numColumns;i++){
					printWriter.print(rs.getString(i+1)+",");
				}
				printWriter.print("\n");
				printWriter.flush();
			}
			printWriter.close();
		}catch(Exception e){e.printStackTrace();}
	}

	//pie chart
	public  void pieGraph(ResultSet rs, String title) {
		try {
			DefaultPieDataset dataset = new DefaultPieDataset();

			while (rs.next()) {
				String category = rs.getString(1);
				String value = rs.getString(2);
				dataset.setValue(category+ " "+value, new Double(value));
			}
			JFreeChart chart = ChartFactory.createPieChart(
					title,  
					dataset,             
					false,              
					true,
					true
			);

			ChartFrame frame = new ChartFrame(title, chart);
			chart.setBackgroundPaint(Color.WHITE);
			frame.pack();
			frame.setVisible(true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//event handling for members desktop
	public void actionPerformed(ActionEvent e){
		 Object target=e.getSource();
			ResultSet rs=null;
			String cmd = null;
		 if (target == clearButton){
			 Property_IDTF.setText("");
			 PropertyTF.setText("");
			 StartedTF.setText("");
			 TechnologyTF.setText("");
			 StandardTF.setText("");
			 BandwidthTF.setText("");
			 Address_TechniqueTF.setText("");
			 Core_Network_SwitchingTF.setText("");
			 Server_TypeTF.setText("");
		 }
		
		 if (target == insertButton){		 
	 		try{
 				String updateTemp ="INSERT INTO TECHNOLOGIES VALUES ('"+
 		 				  Property_IDTF.getText()+"','"+PropertyTF.getText()+"','"+StartedTF.getText()+"','"+TechnologyTF.getText()+"','"+StandardTF.getText()+"','"
 		 				 +BandwidthTF.getText()+"','"+Address_TechniqueTF.getText()+"','"+Core_Network_SwitchingTF.getText()+"','"+Server_TypeTF.getText()+"');";
 						
 				stmt.executeUpdate(updateTemp);
	 		
	 		}catch (SQLException sqle){
	 			System.err.println("Error with members insert:\n"+sqle.toString());
	 		}finally{
	 			TableModel.refreshFromDB(stmt);
			}
		 }
		 if (target == deleteButton){
	 		try{
 				String updateTemp ="DELETE FROM TECHNOLOGIES WHERE Property_ID = "+Property_IDTF.getText()+";"; 
 				stmt.executeUpdate(updateTemp);
	 		}catch (SQLException sqle){
	 			System.err.println("Error with delete:\n"+sqle.toString());
	 		}finally{
	 			TableModel.refreshFromDB(stmt);
			}
		 }
		 if (target == updateButton){	 	
	 		try{ 			
 				String updateTemp ="UPDATE TECHNOLOGIES "+
 									"SET Property = '"+PropertyTF.getText()+"'"+
 									", Started = '"+StartedTF.getText()+"'"+
 									", Technology = '"+TechnologyTF.getText()+"'"+
 									", Standard = '"+StandardTF.getText()+"'"+
 									", Bandwidth = '"+BandwidthTF.getText()+"'"+
 									", Address_Technique = '"+Address_TechniqueTF.getText()+"'"+
 									", Core_Network_Switching = '"+Core_Network_SwitchingTF.getText()+"'"+
 									", Server_Type = '"+Server_TypeTF.getText()+"'"+
 									" where Property_ID = '"+Property_IDTF.getText()+"'";
 				
 				System.out.println(updateTemp);
 				stmt.executeUpdate(updateTemp);
 				//these lines do nothing but the table updates when we access the db.
 				rs = stmt.executeQuery("SELECT * from TECHNOLOGIES ");

 				rs.next();
 				rs.close();	
 			}catch (SQLException sqle){
	 			System.err.println("Error with members insert:\n"+sqle.toString());
	 		}finally{
	 			TableModel.refreshFromDB(stmt);
			}
		 }	
		 //export
		 if (target.equals(exportButton)){  		
			 //set cmd to write out all the table data to the csv
			 cmd = "select * from TECHNOLOGIES";
			 System.out.println(cmd);
			 try {
				 rs = ps.executeQuery(cmd);
			 } catch (SQLException e1) {
				 // TODO Auto-generated catch block
				 e1.printStackTrace();
			 }
			 writeToFile(rs);
		 }
		 //chart
		 if (target.equals(chartButton)){  		
			 cmd = "select Bandwidth, sum(value)from nw_stats.perf group by Record_Description;";
			 System.out.println(cmd);
			 try {
				 rs= stmt.executeQuery(cmd);
			 } catch (SQLException e1) {
				 // TODO Auto-generated catch block
				 e1.printStackTrace();
			 } 
			 pieGraph(rs, "Network Statistics");	
		 }
	}
}//
