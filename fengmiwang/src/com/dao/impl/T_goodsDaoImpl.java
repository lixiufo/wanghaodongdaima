package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.T_goodsDao;

import com.entity.T_goods;
import com.entity.T_goodsType;

import util.BaseDao;

public class T_goodsDaoImpl extends BaseDao implements T_goodsDao {

	@Override
	public List<T_goods> getAll() {
			String sql="select*from t_goods";
			Object [] obj= {};
			ResultSet rs=this.chazhao(sql, obj);
			List<T_goods> list=new ArrayList<T_goods>();
			try {
				while(rs.next()) {
					T_goods stu=new T_goods();
					stu.setId(rs.getInt(1));
					stu.setGoodsName(rs.getString(2));
					stu.setPrice(rs.getDouble(3));
					stu.setImgpath(rs.getString(4));
					stu.setDeployDate(rs.getDate(5));
					stu.setDescription(rs.getString(6));
					stu.setTypeld(rs.getInt(7));
					list.add(stu);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.closeResource();
				return list;
			}

	@Override
	public int delT_goodsById(int id) {//ɾ��
			String sql="delete from t_goods where id =?";
			Object [] obj= {id};
			this.closeResource();
			return this.zengshanggai(sql, obj);
	}

	@Override
	public int updateById(T_goods goo) {

			String sql="update t_goods set goodsName=? ,price=? ,imgPath=? ,deployDate=?, description=?,typeId=? where id=?";
			Object [] obj= {goo.getGoodsName(),goo.getPrice(),goo.getImgpath(),goo.getDeployDate(),goo.getDescription(),goo.getTypeld(),goo.getId()};
			this.closeResource();
			return this.zengshanggai(sql, obj);
		}

	@Override
	public List<T_goods> getAllByPage(int pageNo, int pageSize) {
		String sql="select * from t_goods limit ?,?";
		//��ǰҳ�� -1  * ҳ����   
		//��һҳ  ��ʾ5������  ?,?  0 2   ��һҳ
		//��ʾ�������͵�����	2 2	�ڶ�ҳ
		//��ʾ������ ������    4  2	����ҳ
		//��ʾ������ �ڰ���  6  2	����ҳ
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_goods> list=new ArrayList<T_goods>();
		try {
			while(rs.next()) {
				T_goods g=new T_goods();
				g.setId(rs.getInt(1));	
				g.setGoodsName(rs.getString(2));
				g.setPrice(rs.getDouble(3));
				g.setImgpath(rs.getString(4));
				g.setDeployDate(rs.getDate(5));
				g.setDescription(rs.getString(6));
				g.setTypeld(rs.getInt(7));
				list.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return list;
	}

	@Override
	public int getDataCoutn() {
		String sql="select count(1) from t_goods";
		Object [] obj= {};
		ResultSet rs=this.chazhao(sql, obj);
		int count=0;
		try {
			while(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return count;
	}

	@Override
	public List<T_goods> getGoodsFuzzy(int pageNo, int pageSize, String condition) {//ģ����ѯ
		//limit��Զ����� Ҫ�ڷ�ҳ֮ǰ��ƴ�ӵ�sqlƴ�ӽ��� 
		String sql="select *  from t_goods,t_goodstype where t_goods.typeId=t_goodstype.id "+condition+" limit ?,?";
		Object [] obj= {(pageNo-1)*pageSize,pageSize};
		ResultSet rs=this.chazhao(sql, obj);
		List<T_goods> list=new ArrayList<T_goods>();
		try {
			while(rs.next()) {
				T_goods good=new T_goods();
				good.setId(rs.getInt("id"));
				good.setGoodsName(rs.getString("goodsName"));
				good.setPrice(rs.getDouble("price"));
				good.setImgpath(rs.getString("imgPath"));
				good.setDeployDate(rs.getDate("deployDate"));
				good.setDescription(rs.getString("description"));
				good.setTypeld(rs.getInt("typeId"));
				
				
				T_goodsType t_goodsType=new T_goodsType();
				t_goodsType.setTypename(rs.getString("t_goodsType.typename"));
	
				good.setT_goodsType(t_goodsType);
				list.add(good);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return list;
	}

	@Override
	public int addT_goods(T_goods goo) {//����
		String sql="insert into t_goods(goodsName,price,imgPath,deployDate,description,typeId) values(?,?,?,?,?,?)";
		Object [] obj= {goo.getGoodsName(),goo.getPrice(),goo.getImgpath(),goo.getDeployDate(),goo.getDescription(),goo.getTypeld()};
		this.closeResource();
		return this.zengshanggai(sql, obj);
	}

	@Override
	public T_goods getgoodById(int id) {
		String sql="select * from t_goods where id=?";
		Object [] obj= {id};
		ResultSet rs=this.chazhao(sql, obj);
		T_goods good=new T_goods();
		try {
			while(rs.next()) {
				good.setId(rs.getInt("id"));
				good.setGoodsName(rs.getString("goodsName"));
				good.setPrice(rs.getDouble("price"));
				good.setImgpath(rs.getString("imgPath"));
				good.setDeployDate(rs.getDate("deployDate"));
				good.setDescription(rs.getString("description"));
				good.setTypeld(rs.getInt("typeId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.closeResource();
		return good;
	}
	}
	


	


