package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Component comLeaf1 = new LeafConstante(5);
		Component comLeaf2 = new LeafConstante(2);
		
		Component comResta = new CompositeResta(
				comLeaf1,
				comLeaf2	
			);
		
		System.out.println(
				new CompositeSuma(
						new CompositeResta(
							new LeafConstante(1),
							new CompositeSuma(
								new LeafConstante(3),
								new LeafConstante(4)
							)
						),
						comResta
				).getValue()
		);
		
		
		
	}

}
