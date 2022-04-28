package com.example.dao;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;

public class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
	int	rowAdded=0;
		String sql="insert into  lpriya_member values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMemberName());
			pstmt.setString(3,obj.getMemberAddres());
			pstmt.setDate(4,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6,obj.getFeesPaid());
			pstmt.setInt(7,obj.getMaxBookAllowed());
			pstmt.setDouble(8,obj.getPenaltyAmount());
			rowAdded = pstmt.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	public List<Member> findAll()
	{
		
		List<Member> memberList = new ArrayList<Member>();
	    String sql="Select * from lpriya_member";
	  try(PreparedStatement pstmt = con.prepareStatement(sql))
	    {
	    	
	    	ResultSet rs=pstmt.executeQuery();
	    	while(rs.next()) {
	    		int memberId = rs.getInt("MEMBER_ID");
	    	 String memberName= rs.getString("MEMBER_NAME");             
	    		 String memberAddres=rs.getString("MEMBER_ADDRESS");
	    	//	 Date accountopendate = result.getDate("acc_open_date");
	    		 Date accountOpenDate=rs.getDate("ACC_OPEN_DATE");
	 			 LocalDate accDate = accountOpenDate.toLocalDate();
	    	     String memberShipType=rs.getString("MEMBERSHIP_TYPE");
	    		 double feesPaid=rs.getDouble("FEES_PAID");
	             int maxBookAllowed=rs.getInt("MAX_BOOKS_ALLOWED");
	    		 double penaltyAmount = rs.getDouble("PENALTY_AMOUNT");
	    		 Member member = new Member(memberId,memberName,memberAddres,accDate,memberShipType,feesPaid,maxBookAllowed, penaltyAmount);
	    			memberList.add(member); 
	    	}
	    }
	  
	  
	  catch(SQLException e) {
  		e.printStackTrace();
	  }
		return memberList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
