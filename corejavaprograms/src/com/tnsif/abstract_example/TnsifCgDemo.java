package com.tnsif.abstract_example;

public class TnsifCgDemo {
	public static void main(String args[]) {
		Trainer t=new TechTrainer();
		t.session();
		t.checks();
		t=new SoftSkillTrainer();
		t.session();
		t.checks();
		
	}

}
