package com.example.exam.Prac3b;

public abstract class Animals {
 protected int  legs;
 protected String name;
 protected Animals(int l,String animalName) {
	 this.legs = l;
	 this.name = animalName;
 }
 
 
 protected String display() {
	 return "legs :"+this.legs+" name : "+this.name;
 }
 abstract String eat() ;
 
 
 
}
