package com.example.exam.Prac9A;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table
public class Table53{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column
	@Nonnull
	public String name;
	
}
