package com.curso.example;

public interface IFerBean extends IMyBean{

	default void showFer(String s) {
		System.out.println(s);
	}
}