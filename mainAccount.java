package hsbc.com.accountproject.main;

import hsbc.com.accountproject.Account;
import hsbc.com.accountproject.exceptions.createFailException;
import hsbc.com.accountproject.exceptions.depositException;
import hsbc.com.accountproject.exceptions.withdrawException;

public class mainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a=null;
		try {
			a=new Account(101,"ABCD",25000);
			a.displayData();
			a.depositAmount(8000);
			a.withdrawAmount(3000);
		}
		catch(createFailException e) {
			System.out.println(e.getMessage());
		}
		catch(withdrawException e) {
			System.out.println(e.getMessage());
		}
		catch(depositException e) {
			System.out.println(e.getMessage());
		}

	}

}
