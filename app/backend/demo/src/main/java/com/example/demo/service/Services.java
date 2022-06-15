package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface Services<K, E> {

	public List<E> getAll();

	public E getById(K key);

	public void add(E entity);

	public void delete(K key);

	public void update(E entity);

}
