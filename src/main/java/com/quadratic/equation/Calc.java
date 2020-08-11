package com.quadratic.equation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CALCULATION")
public class Calc {

	private int id;
	private double a;
	private double b;
	private double c;
	private double r_x1;
	private double r_x2;

	public Calc(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		calculate();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
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

	public double Discriminant() {

		return Math.pow(b, 2) - 4 * a * c;
	}

// A zero not work
	public void calculate() {

		try {
			if (a == 0)
				throw new ArithmeticException();

			if (Discriminant() > 0) {
				r_x1 = (-b + Math.sqrt(Discriminant())) / (2 * a);
				r_x2 = (-b - Math.sqrt(Discriminant())) / (2 * a);
			}
			if (Discriminant() == 0) {
				r_x1 = -b / (2 * a);
			} else if (Discriminant() < 0) {
				System.out.println("Discriminant is less then zero");
				System.exit(0);
			}
		} catch (ArithmeticException e) {
			System.out.println("A can't be a 0");
			System.exit(0);
		}
	}
}
