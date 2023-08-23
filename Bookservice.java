package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookentity;
import com.example.demo.repository.Bookrepo;

@Service
public class Bookservice{
	
	@Autowired
	Bookrepo sr;
	 
	public Bookentity saveinfo(Bookentity pp)
	{
		return sr.save(pp);
	}
	
	public List<Bookentity> showinfo()
	{
		return sr.findAll();
	}
	
	public List<Bookentity> savedetails(List<Bookentity> pp)
	{
		return sr.saveAll(pp);
	}
	public Bookentity changeinfo(Bookentity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public String updateinfobyid(int id,Bookentity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public Optional<Bookentity> showbyid(int id)
	{
		return sr.findById(id);
	}
	public void deleteinfo(Bookentity ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
}