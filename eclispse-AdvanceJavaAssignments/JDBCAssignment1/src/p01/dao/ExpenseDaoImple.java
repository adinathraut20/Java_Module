package p01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import p01.connect.DBConnect;
import p01.dto.Expense;

public class ExpenseDaoImple implements ExpenseDao {
	
	private DBConnect connect;
	
	public ExpenseDaoImple(){
		connect = new DBConnect();
	}
	@Override
	public int insertData(Expense e) {
		try {
			Connection con = connect.getConnect();
			PreparedStatement s = con.prepareStatement("insert into expense values(?,?,?,?);");
			s.setInt(1,e.getExpenseId());
			s.setString(2, e.getItem());
			s.setFloat(3, e.getPrice());
			s.setString(4, e.getPurchaseDate());
			
			int i = s.executeUpdate();
			System.out.println("Record Added : "+i );

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateData(Expense e) {
		try {
			Connection con = connect.getConnect();
			PreparedStatement s = con.prepareStatement("update  expense set item = ?, price = ?, purchaseDate = ? where expenseId = ?;");
			
			s.setString(1, e.getItem());
			s.setFloat(2, e.getPrice());
			s.setString(3, e.getPurchaseDate());
			
			s.setInt(4,e.getExpenseId());
			
			int i = s.executeUpdate();
			System.out.println("Record Updated : "+i );

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteData(int id) {
		try {
			Connection con = connect.getConnect();
			PreparedStatement st = con.prepareStatement("delete from expense where expenseId = ?");

			st.setInt(1, id);

			int flag = st.executeUpdate();
			System.out.println("Record Removed : " + flag);
			con.close();
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return 0;
	}

	@Override
	public int showExpense() {
		try {
			Connection con = connect.getConnect();
			PreparedStatement st = con.prepareStatement("select * from expense");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("Expense Id : " + rs.getInt(1) + "\nItem : " + rs.getString(2) + "\nPrice : "
						+ rs.getFloat(3) + "\nDate of Purchase : " + rs.getDate(4) + "\n");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		
		return 0;
	}

}
