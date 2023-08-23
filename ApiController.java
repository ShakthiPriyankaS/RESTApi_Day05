package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookentity;
import com.example.demo.service.Bookservice;

@RestController
public class ApiController {
	
	@Autowired
	Bookservice sser;
	
	@PostMapping("addbook")
	public Bookentity add(@RequestBody  Bookentity ss) {		
		return sser.saveinfo(ss);
	}
	
	@PostMapping("addnbook")
	public List<Bookentity> addndetails(@RequestBody List<Bookentity> ss)
	{
		return sser.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<Bookentity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("update")
	public Bookentity modify(@RequestBody Bookentity ss)
	{
		return sser.changeinfo(ss);
	}
	@PutMapping("updatebyid/{id}")
	public String modeifybyId(@PathVariable int id,@RequestBody Bookentity pp)
	{
		return sser.updateinfobyid(id,pp);
	}
@DeleteMapping("deleteDetails")
	
	public String delete(@RequestBody Bookentity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted successfully";
		
	}
@GetMapping("showId/{id}")
public Optional<Bookentity> getbyId(@PathVariable int id )
{
	return sser.showbyid(id);

}
@DeleteMapping("delId/{id}")
public void deleteById(@PathVariable int id)
{
	sser.deleteid(id);

}
}
