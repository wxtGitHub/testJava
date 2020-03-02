package com.testJava.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testJava.dao.impl.TestDaoImpl;
import com.testJava.entity.User;


@Controller
public class TestController {
	
	@Autowired
	TestDaoImpl testDaoImpl;
	
	@RequestMapping("test/testDB.action")
	@ResponseBody
	public Object testDB(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> map=new HashMap<String,Object>();
		
		User user=testDaoImpl.get("1");
		map.put("mgs","获取数据成功！");
		map.put("code","0");
		map.put("data",user);
		return map;
	}
	
	@RequestMapping("test/test.action")
	@ResponseBody
	public Object test(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> map=new HashMap<String,Object>();
		
		map.put("mgs","获取数据成功！");
		map.put("code","0");
		map.put("data","");
		return map;
	}
	
}

