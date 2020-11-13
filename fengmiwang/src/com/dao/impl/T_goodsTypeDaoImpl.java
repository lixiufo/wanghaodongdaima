package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.T_goodsTypeDao;
import com.entity.T_goodsType;

import util.BaseDao;

public class T_goodsTypeDaoImpl extends BaseDao implements T_goodsTypeDao {

	@Override
	public List<T_goodsType> getAll() {
		String sql="select * from t_goodstype";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_goodsType> list=new ArrayList<T_goodsType>();
		try {
			while(rs.next()) {
				T_goodsType s=new T_goodsType();
				s.setId(rs.getInt(1));
				s.setTypename(rs.getString(2));
				list.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
			return list;
		}

	@Override
	public int addT_goodsType(T_goodsType goods) {
			String sql="insert into t_goodstype (typename) values(?)";
			Object [] obj= {goods.getTypename()};
			this.closeResource();
			return this.zengshanggai(sql, obj);
	}

	@Override
	public int delT_goodsTypeById(int id) {
		String sql="delete from t_goodstype where id =?";
		Object [] obj= {id};
		this.closeResource();
		return this.zengshanggai(sql, obj);
	}
	}


