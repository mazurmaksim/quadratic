package com.quadratic.equation;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		HibConnect hibConnect = new HibConnect();
		Session session = hibConnect.getSession();
		Calc clc = new Calc(1, 1, 1);
		clc.calculate();
		session.save(clc);
		session.getTransaction().commit();
	}

}
