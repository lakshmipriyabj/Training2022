package com.example.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;


import com.example.ifaces.CrudRepository;

public class CustomerServices implements CrudRepository<LoanApplication>{
	
	private Connection con;

    public CustomerServices(Connection con) {
		super();
		this.con = con;
	}

	public int add(LoanApplication obj) {
		int rowAdded=0;
		String sql2="insert into lp_customer values(?,?,?,?)";
		String sql ="insert into lp_LoanApplication values(?,?,?)";
		Customer c=obj.getCustomer_id_ref();
		try(PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmt2 = con.prepareStatement(sql2)){
			
			pstmt.setInt(1,obj.getApplicationNumber());
			pstmt.setInt(2,obj.getCustomer_id_ref().getCustomerId());
	        pstmt.setDouble(3,obj.getLoanAmount());
	        pstmt2.setInt(1,c.getCustomerId());
	        pstmt2.setString(2,c.getCustomerName());
	        pstmt2.setLong(3,c.getPhoneNumber());
	        pstmt2.setDouble(4,c.getCreditScored());
	        pstmt2.executeUpdate();
	        rowAdded = pstmt.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		return rowAdded;
	}

	public List<LoanApplication> findAll() {
	
    List<LoanApplication> loan = new ArrayList<LoanApplication>();
    String sql="select * from lp_customer lc,lp_loanApplication la where lc.customer_id=la.customer_id_ref";   	
    try(PreparedStatement pstmt = con.prepareStatement(sql)){
    		ResultSet rs = pstmt.executeQuery();
    		
    		while(rs.next())
    		{
    			int customerId = rs.getInt("customer_Id");
    			String customerName= rs.getString("customer_Name");
    			long phoneNumber = rs.getLong("phone_Number");
    			double creditScored = rs.getDouble("credit_Scored");
    			int applicationNumber = rs.getInt("application_Number");
    			int customer_id_ref= rs.getInt("customer_id_ref");
    			double loanAmount = rs.getDouble("loan_Amount");

    			Customer customer = new Customer(customerId,customerName,phoneNumber,creditScored);
    			LoanApplication loans= new LoanApplication(applicationNumber,customer,loanAmount);
    			loan.add(loans); 
    		}
    	}catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    		
   return loan ;
	}

	public int update(int Id, LoanApplication obj) {
		
		return 0;
	}

	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LoanApplication findById(int id) {
		LoanApplication cusid = null;
		String sql=" select * from lp_customer lc,lp_loanApplication la  where lc.customer_id=la.customer_id_ref and lc.customer_id=?";
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
		int customerId = rs.getInt("customer_Id");
		String customerName= rs.getString("customer_Name");
		long phoneNumber = rs.getLong("phone_Number");
		double creditScored = rs.getDouble("credit_Scored");
		int applicationNumber = rs.getInt("application_Number");
		int customer_id_ref= rs.getInt("customer_id_ref");
		double loanAmount = rs.getDouble("loan_Amount");

		Customer customer = new Customer(customerId,customerName,phoneNumber,creditScored);
		cusid = new LoanApplication(applicationNumber,customer,loanAmount);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cusid;
	}

	
	
	
	
}
