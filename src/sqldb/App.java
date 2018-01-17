package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hostName = "yookserver.database.windows.net";
		String dbName = "myDatabase";
		String user = "yookmoonsu";
		String password = "!dbr9389818";
		String url = String.format("jdbc:sqlserver://yookserver.database.windows.net:1433;database=myDatabase;user=yookmoonsu@yookserver;password=!dbr9389818;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url);
			String schema = connection.getSchema();
			System.out.println("Successful connection - Schema: " + schema);
			
			System.out.println("Query data example:");
			System.out.println("=========================================");
			
			String selectSql = "SELECT TOP 20 pc.Name as CategoryName, p.name as ProductName " 
                    + "FROM [SalesLT].[ProductCategory] pc "  
                    + "JOIN [SalesLT].[Product] p ON pc.productcategoryid = p.productcategoryid";
			
			try (Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery(selectSql)) {
				
				System.out.println("Top 20 categories:");
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
				}
				connection.close();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}