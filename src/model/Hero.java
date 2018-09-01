package model;

public class Hero {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getXietiao() {
		return xietiao;
	}
	public void setXietiao(float xietiao) {
		this.xietiao = xietiao;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	private String name;
	private float xietiao;
	private int damage;
	
}
