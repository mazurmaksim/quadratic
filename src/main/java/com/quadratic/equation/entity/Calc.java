package com.quadratic.equation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CALCULATION")
public class Calc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column
	private double a;

	@Column
	private double b;

	@Column
	private double c;

	@Column
	private double r_x1;

	@Column
	private double r_x2;

	public Calc() {
	}

	public Calc(double a, double b, double c, double r_x1, double r_x2) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.r_x1 = r_x1;
		this.r_x2 = r_x2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getR_x1() {
		return r_x1;
	}

	public void setR_x1(double r_x1) {
		this.r_x1 = r_x1;
	}

	public double getR_x2() {
		return r_x2;
	}

	public void setR_x2(double r_x2) {
		this.r_x2 = r_x2;
	}


}
