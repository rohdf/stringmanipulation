package com.rohdcode.stringmanipulation.interfaces;

import com.rohdcode.stringmanipulation.enumeration.SizeConstantes;

public class Box implements Scalable {

	@Override
	public void setScalable(SizeConstantes size) {
		switch(size) {
		case BIG: System.out.println("BIG"); break;
		case MEDIUM: System.out.println("MEDIUM"); break;
		case SMALL: System.out.println("SMALL"); break;
		}

	}

}
