package com.srinivas.spring.springcore.reftypes;

public class Student {

	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}
	
	public String toString()
	{
		return "Student has scores:[ "+scores+" ]";
	}
	
}
