
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
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

	//subscribers table
	private JPanel detailsPanel2;
	private JPanel exportButtonPanel2;
	private JPanel exportConceptDataPanel2;
	private JScrollPane dbContentsPanel2;

	private JLabel Subscriber_IDLabel=new JLabel("Subscriber_ID:                 ");
	private JLabel Property_ID2Label=new JLabel("Property_ID:               ");
	private JLabel Property2Label=new JLabel("Property:               ");
	private JLabel GlobalLabel=new JLabel("Global:      ");
	private JLabel USALabel=new JLabel("USA:        ");
	private JLabel JapanLabel=new JLabel("Japan:                 ");
	private JLabel South_KoreaLabel=new JLabel("South_Korea:               ");
	private JLabel AustrailiaLabel=new JLabel("Austrailia:      ");
	private JLabel CanadaLabel=new JLabel("Canada:      ");
	private JLabel SingaporeLabel=new JLabel("Singapore:        ");
	private JLabel SwedenLabel=new JLabel("Sweden:        ");
	private JLabel RussiaLabel=new JLabel("Russia:        ");
	private JLabel GermanyLabel=new JLabel("Germany:        ");
	private JLabel UKLabel=new JLabel("UK:        ");

	private JTextField Subscriber_IDTF= new JTextField(35);
	private JTextField Property_ID2TF=new JTextField(35);
	private JTextField Property2TF=new JTextField(35);
	private JTextField GlobalTF=new JTextField(35);
	private JTextField USATF=new JTextField(35);
	private JTextField JapanTF=new JTextField(35);
	private JTextField South_KoreaTF=new JTextField(35);
	private JTextField AustrailiaTF=new JTextField(35);
	private JTextField CanadaTF=new JTextField(35);
	private JTextField SingaporeTF=new JTextField(35);
	private JTextField SwedenTF=new JTextField(35);
	private JTextField RussiaTF=new JTextField(35);
	private JTextField GermanyTF=new JTextField(35);
	private JTextField UKTF=new JTextField(35);

	private static QueryTableModel TableModel = new QueryTableModel();
	private static QueryTableModel2 TableModel2 = new QueryTableModel2();


	//Add the models to JTabels
	private JTable TableofDBContents=new JTable(TableModel);
	private JTable TableofDBContents2=new JTable(TableModel2);


	//Buttons for inserting, and updating members
	//also a clear button to clear details panel
	private JButton updateButton = new JButton("Update");
	private JButton insertButton = new JButton("Insert");
	private JButton exportButton  = new JButton("Export");
	private JButton deleteButton  = new JButton("Delete");
	private JButton clearButton  = new JButton("Clear");

	private JButton updateButton2 = new JButton("Update");
	private JButton insertButton2 = new JButton("Insert");
	private JButton exportButton2  = new JButton("Export");
	private JButton deleteButton2  = new JButton("Delete");
	private JButton clearButton2  = new JButton("Clear");

	//buttons for the export panel
	private JButton query  = new JButton("Query InnerJoin");
	private JButton queryRecords  = new JButton("Query Records Property_ID");
	private JTextField queryRecordsTF  = new JTextField(12);
	private JButton query2  = new JButton("Query2 Address Desc");
	private JButton query3  = new JButton("Query3 Count Technologies");
	private final JButton query4 = new JButton("Query4 Distinct Technologies");
	private final JButton query5 = new JButton("Query5 Count Property_ID");
	private final JButton query6 = new JButton("Query6 LIKE");
	private final JButton query7 = new JButton("Query7 Max Global");
	private final JButton query8 = new JButton("Query8 Max USA");
	private final JButton query9 = new JButton("Query9 AVG Global Subscribers");
	private final JButton query10 = new JButton("Query10 Right Join");

	//chart button
	private JButton chartButton = new JButton("Chart Country Statistics");
	//switch button
	private JButton switchButton = new JButton("Change");
	private String currentTable = "Technologies";

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
		detailsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder, "Technology Details"));

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


		//setup details panel2 and add the components to it
		detailsPanel2=new JPanel();
		detailsPanel2.setLayout(new GridLayout(15,2));
		detailsPanel2.setBackground(Color.LIGHT_GRAY);
		detailsPanel2.setBorder(BorderFactory.createTitledBorder(lineBorder, "Subscriber Details"));

		detailsPanel2.add(Subscriber_IDLabel);			
		detailsPanel2.add(Subscriber_IDTF);
		detailsPanel2.add(Property_ID2Label);		
		detailsPanel2.add(Property_ID2TF);
		detailsPanel2.add(Property2Label);		
		detailsPanel2.add(Property2TF);
		detailsPanel2.add(GlobalLabel);	
		detailsPanel2.add(GlobalTF);
		detailsPanel2.add(USALabel);		
		detailsPanel2.add(USATF);
		detailsPanel2.add(JapanLabel);
		detailsPanel2.add(JapanTF);
		detailsPanel2.add(South_KoreaLabel);
		detailsPanel2.add(South_KoreaTF);
		detailsPanel2.add(AustrailiaLabel);
		detailsPanel2.add(AustrailiaTF);
		detailsPanel2.add(CanadaLabel);
		detailsPanel2.add(CanadaTF);
		detailsPanel2.add(SingaporeLabel);
		detailsPanel2.add(SingaporeTF);
		detailsPanel2.add(SwedenLabel);
		detailsPanel2.add(SwedenTF);
		detailsPanel2.add(RussiaLabel);
		detailsPanel2.add(RussiaTF);
		detailsPanel2.add(GermanyLabel);
		detailsPanel2.add(GermanyTF);
		detailsPanel2.add(UKLabel);
		detailsPanel2.add(UKTF);

		//setup export query details panel and add the components to it
		exportButtonPanel=new JPanel();
		exportButtonPanel.setLayout(new GridLayout(3,2));
		exportButtonPanel.setBackground(Color.lightGray);
		exportButtonPanel.setBorder(BorderFactory.createTitledBorder(lineBorder, "Export Data"));
		exportButtonPanel.add(query);
		exportButtonPanel.add(queryRecords);
		exportButtonPanel.add(queryRecordsTF);
		exportButtonPanel.add(query2);
		exportButtonPanel.add(query3);
		exportButtonPanel.add(query4);
		exportButtonPanel.add(query5);
		exportButtonPanel.add(query6);
		exportButtonPanel.add(query7);
		exportButtonPanel.add(query8);
		exportButtonPanel.add(query9);
		exportButtonPanel.add(query10);
		exportButtonPanel.add(chartButton);
		exportButtonPanel.setSize(900, 145);
		exportButtonPanel.setLocation(3, 600);
		content.add(exportButtonPanel);

		insertButton.setSize(100, 30);
		updateButton.setSize(100, 30);
		exportButton.setSize (100, 30);
		deleteButton.setSize (100, 30);
		clearButton.setSize (100, 30);
		switchButton.setSize(100,30);

		insertButton.setLocation(370, 10);
		updateButton.setLocation(370, 110);
		exportButton.setLocation (370, 160);
		deleteButton.setLocation (370, 60);
		clearButton.setLocation (370, 210);
		switchButton.setLocation (370, 260);


		insertButton.addActionListener(this);
		updateButton.addActionListener(this);
		exportButton.addActionListener(this);
		deleteButton.addActionListener(this);
		clearButton.addActionListener(this);
		switchButton.addActionListener(this);//
		chartButton.addActionListener(this);//
		query.addActionListener(this);//
		queryRecords.addActionListener(this);
		queryRecordsTF.addActionListener(this);
		query2.addActionListener(this);
		query3.addActionListener(this);
		query4.addActionListener(this);
		query5.addActionListener(this);
		query6.addActionListener(this);
		query7.addActionListener(this);
		query8.addActionListener(this);
		query9.addActionListener(this);
		query10.addActionListener(this);

		content.add(insertButton);
		content.add(updateButton);
		content.add(exportButton);
		content.add(deleteButton);
		content.add(clearButton);
		content.add(switchButton);


		//buttons2
		insertButton2.setSize(100, 30);
		updateButton2.setSize(100, 30);
		exportButton2.setSize (100, 30);
		deleteButton2.setSize (100, 30);
		clearButton2.setSize (100, 30);

		insertButton2.setLocation(370, 310);
		updateButton2.setLocation(370, 410);
		exportButton2.setLocation (370, 460);
		deleteButton2.setLocation (370, 360);
		clearButton2.setLocation (370, 510);

		insertButton2.addActionListener(this);
		updateButton2.addActionListener(this);
		exportButton2.addActionListener(this);
		deleteButton2.addActionListener(this);
		clearButton2.addActionListener(this);

		content.add(insertButton2);
		content.add(updateButton2);
		content.add(exportButton2);
		content.add(deleteButton2);
		content.add(clearButton2);


		TableofDBContents.setPreferredScrollableViewportSize(new Dimension(1000, 300));
		TableofDBContents2.setPreferredScrollableViewportSize(new Dimension(1000, 300));


		dbContentsPanel=new JScrollPane(TableofDBContents,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		dbContentsPanel.setBackground(Color.lightGray);
		dbContentsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder,"Database Content"));

		dbContentsPanel2=new JScrollPane(TableofDBContents2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		dbContentsPanel2.setBackground(Color.lightGray);
		dbContentsPanel2.setBorder(BorderFactory.createTitledBorder(lineBorder,"Database Content2"));

		detailsPanel.setSize(360, 300);
		detailsPanel.setLocation(3,0);
		detailsPanel2.setSize(360, 300);
		detailsPanel2.setLocation(3,300);
		dbContentsPanel.setSize(1000, 300);
		dbContentsPanel.setLocation(477, 0);
		dbContentsPanel2.setSize(1000, 300);
		dbContentsPanel2.setLocation(477, 300);

		content.add(detailsPanel);
		content.add(detailsPanel2);
		content.add(dbContentsPanel);
		content.add(dbContentsPanel2);

		setSize(1491,785);
		setVisible(true);

		TableModel.refreshFromDB(stmt,currentTable);
		TableModel2.refreshFromDB(stmt);

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
			ps = con.prepareStatement("select count(*) from mobiletechnology.technologies where Cell_ID =  ?");
		}catch(Exception e){
			System.out.println("Error: Failed to connect to database\n"+e.getMessage());
		}
	}
	//export write to file
	private void writeToFile(ResultSet rs){
		try{
			FileWriter outputFile = new FileWriter("Output.csv");
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
			
			JFreeChart chart = ChartFactory.createPieChart3D(
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
		    final File file1 = new File("Chart.png");
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
				String updateTemp ="INSERT INTO "+currentTable+" VALUES ('"+
						Property_IDTF.getText()+"','"+PropertyTF.getText()+"','"+StartedTF.getText()+"','"+TechnologyTF.getText()+"','"+StandardTF.getText()+"','"
						+BandwidthTF.getText()+"','"+Address_TechniqueTF.getText()+"','"+Core_Network_SwitchingTF.getText()+"','"+Server_TypeTF.getText()+"');";

				stmt.executeUpdate(updateTemp);

			}catch (SQLException sqle){
				System.err.println("Error with members insert:\n"+sqle.toString());
			}finally{
				TableModel.refreshFromDB(stmt,currentTable);
			}
		}
		if (target == deleteButton){
			try{
				String updateTemp ="DELETE FROM "+currentTable+" WHERE Property_ID = "+Property_IDTF.getText()+";"; 
				stmt.executeUpdate(updateTemp);
			}catch (SQLException sqle){
				System.err.println("Error with delete:\n"+sqle.toString());
			}finally{
				TableModel.refreshFromDB(stmt,currentTable);
			}
		}
		if (target == updateButton){	 	
			try{ 			
				String updateTemp ="UPDATE "+currentTable+
						//						"SET Property ID = '"+Property_IDTF.getText()+"'"+
						" SET"+
						" Property = '"+PropertyTF.getText()+"'"+
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
				rs = stmt.executeQuery("SELECT * from"+currentTable);

				rs.next();
				rs.close();	
			}catch (SQLException sqle){
				System.err.println("Error with members insert:\n"+sqle.toString());
			}finally{
				TableModel.refreshFromDB(stmt,currentTable);
			}
		}	

		//// buttons 2
		if (target == clearButton2){
			Subscriber_IDTF.setText("");
			Property_ID2TF.setText("");
			Property2TF.setText("");
			GlobalTF.setText("");
			USATF.setText("");
			JapanTF.setText("");
			South_KoreaTF.setText("");
			AustrailiaTF.setText("");
			CanadaTF.setText("");
			SingaporeTF.setText("");
			SwedenTF.setText("");
			RussiaTF.setText("");
			GermanyTF.setText("");
			UKTF.setText("");
		}

		if (target == insertButton2){		 
			try{
				String updateTemp ="INSERT INTO SUBSCRIBERS VALUES ('"+
						Subscriber_IDTF.getText()+"','"+Property_ID2TF.getText()+"','"+Property2TF.getText()+"','"+GlobalTF.getText()+"','"+USATF.getText()+"','"+JapanTF.getText()+"','"
						+South_KoreaTF.getText()+"','"+AustrailiaTF.getText()+"','"+CanadaTF.getText()+"','"+SingaporeTF.getText()+"','"+SwedenTF.getText()+"','"+RussiaTF.getText()+
						"','"+GermanyTF.getText()+"','"+UKTF.getText()+"');";

				stmt.executeUpdate(updateTemp);

			}catch (SQLException sqle){
				System.err.println("Error with members insert:\n"+sqle.toString());
			}finally{
				TableModel2.refreshFromDB(stmt);
			}
		}
		if (target == deleteButton2){
			try{
				String updateTemp ="DELETE FROM SUBSCRIBERS WHERE Property_ID = "+Property_ID2TF.getText()+";"; 
				stmt.executeUpdate(updateTemp);
			}catch (SQLException sqle){
				System.err.println("Error with delete:\n"+sqle.toString());
			}finally{
				TableModel2.refreshFromDB(stmt);
			}
		}
		if (target == updateButton2){	 	
			try{ 			
				String updateTemp ="UPDATE SUBSCRIBERS "+
						"SET Subscriber_ID = '"+Subscriber_IDTF.getText()+"'"+
						", Property = '"+Property2TF.getText()+"'"+
						", Global = '"+GlobalTF.getText()+"'"+
						", USA = '"+USATF.getText()+"'"+
						", Japan = '"+JapanTF.getText()+"'"+
						", South_Korea = '"+South_KoreaTF.getText()+"'"+
						", Austrailia = '"+AustrailiaTF.getText()+"'"+
						", Canada = '"+CanadaTF.getText()+"'"+
						", Singapore = '"+SingaporeTF.getText()+"'"+
						", Sweden = '"+SwedenTF.getText()+"'"+
						", Russia = '"+RussiaTF.getText()+"'"+
						", Germany = '"+GermanyTF.getText()+"'"+
						", UK = '"+UKTF.getText()+"'"+
						" where Property_ID = '"+Property_ID2TF.getText()+"'";

				System.out.println(updateTemp);
				stmt.executeUpdate(updateTemp);
				//these lines do nothing but the table updates when we access the db.
				rs = stmt.executeQuery("SELECT * from SUBSCRIBERS ");

				rs.next();
				rs.close();	
			}catch (SQLException sqle){
				System.err.println("Error with members insert:\n"+sqle.toString());
			}finally{
				TableModel2.refreshFromDB(stmt);
			}
		}	
		////////////////
		//export
		if (target.equals(exportButton)){  		
			//set cmd to write out all the table data to the csv
			cmd = "select * from "+currentTable;
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
			//			 cmd = "select Property_ID from mobiletechnology.technologies group by Property_ID;";
			//			cmd = "select Record_Description, sum(value)from nw_stats.perf group by Record_Description;";
			cmd = "select Property, round(subscribers.Global,0) from mobiletechnology.subscribers;";
			System.out.println(cmd);
			try {
				rs= stmt.executeQuery(cmd);
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
			pieGraph(rs, "Global subsribers that 2G, 2.5G, 3G, 4G Statistics (Millions)");	
			writeToFile(rs);
		}
		//switches between the technologies and subscribers tables
		if (target==switchButton){ 
			try{ 
				if(currentTable.equals("Technologies")){ 
					currentTable = "Subscribers"; 
				} else{ 
					currentTable = "Technologies"; 
				} rs = stmt.executeQuery("SELECT * from "+currentTable); 
				rs.next(); rs.close(); 
			} catch (SQLException sqle){ 
				System.err.println("Error with members insert:\n"+sqle.toString()); 
			} finally{ 
				TableModel.refreshFromDB(stmt, currentTable); 
			} 
		}

		//query button	
		try{
			if (target.equals(query)){  
				//set cmd to write out all the table data to the csv
				//				cmd = "select Technologies.Property, Technologies.Technology, Subscribers.Global, " +
				//						"Subscribers.USA, Subscribers.Japan from Technologies Inner Join Subscribers" +
				//						"on Technologies.Property_ID = Subscribers.Property_ID order by Technologies.Property;";
				//				cmd = "select Property, Technology, Global, " +
				//						"USA, Japan from Technologies Inner Join Subscribers" +
				//						"on Technologies.Property_ID = Subscribers.Property_ID order by Technologies.Property;";
				cmd ="select Technologies.Property_ID, technologies.Property_ID, technologies.Property, technologies.Technology, subscribers.Subscriber_ID, subscribers.Global, subscribers.USA, subscribers.UK, subscribers.Germany, subscribers.Japan, subscribers.Russia from technologies Right join subscribers on technologies.Property_ID = subscribers.Property_ID order by technologies.Property;";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(queryRecords)){ 
				String idOfCell = queryRecordsTF.getText();
				System.out.println(idOfCell);
				//Using the Prepared statement 			
//				ps.setString(1, idOfCell);
//				rs= ps.executeQuery();
				//Without a Prepared Statement we could have used the following two lines of code
				cmd="select count(*) from Technologies where Property_ID = "+idOfCell+";";	
				rs= stmt.executeQuery(cmd); 	
				writeToFile(rs);
			}
			else if (target.equals(query2)){  
				cmd ="select distinct Address_Technique from technologies order by Property_ID DESC;";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query3)){  
				cmd="SELECT COUNT(*) FROM technologies";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query4)){  
				cmd ="SELECT COUNT(DISTINCT Technology) FROM technologies;";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query5)){  
				cmd ="SELECT COUNT(Property_ID) AS Property_ID FROM technologies WHERE Property_ID=1;";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query6)){  
				cmd ="SELECT Property, Technology, Standard FROM Technologies WHERE Technology LIKE '%signalling%'; ";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query7)){  
				cmd ="SELECT MAX(Global) AS 'Global(Max Sub in Millions)' FROM subscribers;  ";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query8)){  
				cmd ="SELECT MAX(USA) AS 'USA(Max Sub in Millions)' FROM subscribers;  ";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query9)){  
				cmd =" SELECT round(AVG(Global),0) AS 'Average Global Subsribers(in Millions)' FROM subscribers;   ";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			else if (target.equals(query10)){  
				cmd =" select * from technologies Right join subscribers on technologies.Property_ID = subscribers.Property_ID order by technologies.Property;   ";
				System.out.println(cmd);
				rs = ps.executeQuery(cmd);
				writeToFile(rs);
			}
			
		}catch(Exception e1){e1.printStackTrace();}

	}
}//
