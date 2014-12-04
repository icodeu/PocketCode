package com.icodeyou.pocketcode.model;

public class Category {
	private String category_id;
	private String category_name;
	private boolean isSelected;

	public Category(String category_id, String category_name) {
		setCategory_id(category_id);
		setCategory_name(category_name);
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public boolean getSelected() {
		return isSelected;
	}

	public String getCategory_id() {
		return category_id;
	}

	public String getCategory_name() {
		return category_name;
	}
}
