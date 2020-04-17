package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao{
	String url ="jdbc:oracle:thin:@192.168.0.68:1521:orcl";
	String user = "scott";
	String pass = "tiger";

	public CustomerModel() throws Exception{
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

	}

	public void insertCustomer(Customer vo) throws Exception{
		Connection con = null;
		try {
			// 2. Connection 연결객체 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			// 3. sql 문장 만들기
			String sql = "INSERT INTO customer(name,tel,tel2,adr,email) VALUES(?,?,?,?,?)";
			// 4. sql 전송객체 (PreparedStatement)		
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,vo.getCustName());
			st.setString(2,vo.getCustTel1());
			st.setString(3,vo.getCustTel2());
			st.setString(4,vo.getCustAddr());
			st.setString(5,vo.getCustEmail());
			// 5. sql 전송
			st.executeUpdate();

			// 6. 닫기 
			st.close();

		}catch(Exception e) {
			System.out.println("실패 : " + e.getMessage());	
		}finally {
			try {
				con.close();  // 완전 중요 DB Connection은 닫아줘야한다.
			} catch (SQLException e) {
			}
		}
	}

	public Customer selectByTel(String tel) throws Exception{
		Connection con = null;
		// 2. Connection 연결객체 얻어오기 
		con = DriverManager.getConnection(url,user,pass);
		// 3. SQL 문장
		String sql = "SELECT * FROM customer WHERE tel=?";
		// 4. 전송객체 얻어오기
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, tel);
		// 5. sql 전송
		ResultSet rs =st.executeQuery();
		Customer dao = new Customer();
		rs.next();
		dao.setCustTel1(rs.getString("TEL"));
		dao.setCustName(rs.getString("NAME"));
		dao.setCustTel2(rs.getString("TEL2"));
		dao.setCustAddr(rs.getString("ADR"));
		dao.setCustEmail(rs.getString("EMAIL"));

		// 6. 닫기
		rs.close();
		st.close();
		con.close();  // 완전 중요 DB Connection은 닫아줘야한다.
		return dao;
	}

	public int updateCustomer(Customer vo) throws Exception{
		Connection con = null;
		int result = 0;
		try {
			// 2.Connection 얻어오기
			con = DriverManager.getConnection(url,user,pass);
			// 3.SQL문장
			String sql = "UPDATE customer SET name=?,tel2=?, adr=?, email=? WHERE tel=?";
			// 4.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, vo.getCustName());
			st.setString(2, vo.getCustTel2());
			st.setString(3, vo.getCustAddr());
			st.setString(4, vo.getCustEmail());
			st.setString(5, vo.getCustTel1());
			// 5.전송
			st.executeUpdate();
			// 6.닫기
			st.close();
		}finally {
			con.close();
		}
		return result;
	}
}
