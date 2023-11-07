package com.rohdcode.stringmanipulation.interfaces;

import com.rohdcode.stringmanipulation.enumeration.SizeConstantes;

public interface Scalable {
	// J'évite de faire ça, car cela sera accécible pour tout les codes et on ne veut pas que le code dépende d'interface
	// static final int BIG = 0, MEDIUM = 1, SMALL = 2;
	
	// void setScalable(int size);
	
	void setScalable(SizeConstantes constante);
}
