package com.training.daos;



import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.Invoice;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;

public class InvoiceDaoImpl extends JdbcDaoSupport implements MyDAO<Invoice>{

	@Override
	public boolean add(Invoice t) {
		String sql="insert into Invoice2016 values (?,?,?)";
		int rowInserted=getJdbcTemplate().update(sql,t.getInvoiceNumber(),t.getCusomerName(),t.getAmount());
		boolean result=false;
		if(rowInserted>0)
		{
			result= true;
		}
		return result;
	}

	@Override
	public Invoice find(int key) {
		String sql="Select * from Invoice2016 where invoiceNumber=?";
		//Invoice inv=getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Invoice>(Invoice.class),key);
		Invoice inv=getJdbcTemplate().queryForObject(sql,new InvoiceRowMapper(),key);
		return inv;
	}

	@Override
	public List<Invoice> findAll() {
		String sql="Select * from Invoice2016";
		//Invoice inv=getJdbcTemplate().queryForObject(sql,new BeanPropertyRowMapper<Invoice>(Invoice.class),key);
		List<Invoice> invList=getJdbcTemplate().query(sql, new InvoiceRowMapper());
		return invList;
	}

}
