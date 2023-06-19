package com.example.exam.prac1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mobile {
	String color;
	String brand;
	int camera;
	
	Mobile(String color, String brand,int camera){
		this.color=color;
		this.brand = brand;
		this.camera = camera;
	}
	
	Mobile(Mobile m ){
		this.color= m.color;
		this.brand = m.brand;
		this.camera = m.camera;
	}
	
	
	Mobile(){
		this.color = "Test coolor";
		this.camera = 4;
		this.brand = "lava";
	}
	@GetMapping("/hello")
	public String display() {
		return "color : "+this.color+" brand : "+this.brand+" camera : "+this.camera;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("Samsung","Black",2);
		Mobile m2 = new Mobile();
		
		Mobile m3 = new Mobile(m2);
		
		m1.display();
		m2.display();
		m3.display();
		
		System.out.println(m1.display());
		System.out.println(m2.display());
		System.out.println(m3.display());

	}

}
