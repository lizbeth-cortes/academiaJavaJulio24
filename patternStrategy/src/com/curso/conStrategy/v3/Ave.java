package com.curso.conStrategy.v3;

import com.curso.conStrategy.v0.strategy.ComportamientoVolar;
import com.curso.conStrategy.v0.strategy.SiVolar;

public abstract class Ave {
	
	private ComportamientoVolar cv = new SiVolar();

	void volar() {
		cv.ejecutarVuelo();
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	public ComportamientoVolar getCv() {
		return cv;
	}

	public void setCv(ComportamientoVolar cv) {
		this.cv = cv;
	}
}
