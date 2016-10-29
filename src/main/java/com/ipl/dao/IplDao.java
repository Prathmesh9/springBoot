package com.ipl.dao;

import java.util.List;


public interface IplDao<E> {
	public boolean isValid(String username, String password);

	public List<E> showList();

	public List<E> delete(int id);

	public boolean add(E user);
}
