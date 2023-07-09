package Utility ;
import java.sql.Connection ;
import java.sql.DriverManager ;
public class SingletonConnection
	{
		private static Connection Con ;
		static
			{ 
				try
					{
						Class.forName("com.mysql.jdbc.Driver") ;
						Con = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_livre" , "root" , "" ) ;
						System.out.println("\nConnexion etablie") ;
					}
				catch(Exception E)
					{
						E.printStackTrace() ;
					}
			}
		public static Connection getConnection()
			{
				return(Con) ;
			}
	}