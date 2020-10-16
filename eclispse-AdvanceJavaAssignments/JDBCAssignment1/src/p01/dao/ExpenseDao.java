package p01.dao;

import p01.dto.Expense;

public interface ExpenseDao {

	public int insertData(Expense e);
	public int updateData(Expense e);
	public int deleteData(int id);
	public int showExpense();
}
