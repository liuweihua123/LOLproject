package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.DButil;

public class HeroDao {

	PreparedStatement ps=null;
	ResultSet rs=null;
	public void addHero(Hero hero)
	{
		String sql="insert into hero values(null,?,?,?)";
		try {
			ps=DButil.conn().prepareStatement(sql);
			ps.setString(1,hero.getName());
			ps.setFloat(2, hero.getXietiao());
			ps.setInt(3, hero.getDamage());
			int n=ps.executeUpdate();
			if(n>0)
			{
				System.out.println("添加成功");
			}
			else
			{
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(DButil.conn()!=null)
			{
				try {
					DButil.conn().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void deleteHero(int id)
	{
		String sql="delete from hero where id="+id;
		try {
			ps=DButil.conn().prepareStatement(sql);
			int n=ps.executeUpdate();
			if(n>0)
			{
				System.out.println("删除成功");
			}
			else
			{
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(DButil.conn()!=null)
			{
				try {
					DButil.conn().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void updateHero(Hero hero,int id)
	{
		String sql="update hero set name= ?, xietiao = ? , damage = ? where id="+id;
		
		try {
			ps=DButil.conn().prepareStatement(sql);
			ps.setString(1,hero.getName());//从servlet传值后的页面获取
			ps.setFloat(2, hero.getXietiao());
			ps.setInt(3, hero.getDamage());
			int n=ps.executeUpdate();
			if(n>0)
			{
				System.out.println("更新成功");
			}
			else
			{
				System.out.println("更新失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(DButil.conn()!=null)
			{
				try {
					DButil.conn().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Hero> queryALLHero()
	{
		String sql="select * from hero";
		ArrayList<Hero> list=new ArrayList<Hero>();
		
		try {
			Statement stat=DButil.conn().createStatement();
			rs=stat.executeQuery(sql);
			while(rs.next())
			{
				Hero hero=new Hero();
				hero.setId(rs.getInt("id"));
				hero.setName(rs.getString("name"));
				hero.setXietiao(rs.getFloat("xietiao"));
				hero.setDamage(rs.getInt("damage"));
				list.add(hero);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(DButil.conn()!=null)
			{
				try {
					DButil.conn().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
		
	}
	
	public Hero getAHero(int id)
	{
		String sql="select * from hero where id="+id;
		Hero hero=new Hero();
		try {
			Statement stat=DButil.conn().createStatement();
			rs=stat.executeQuery(sql);
			while(rs.next())
			{
				
				hero.setName(rs.getString("name"));
				hero.setXietiao(rs.getFloat("xietiao"));
				hero.setDamage(rs.getInt("damage"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(DButil.conn()!=null)
			{
				try {
					DButil.conn().close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return hero;
		
	}
	
	
}
