package com.wolken.PG;

public class Pg {

		private String name;

		public Pg(String name) {
			
			this.name = name;
		}

		@Override
		public String toString() {
			return "Pg [name=" + name + "]";
		}

		public String getName() {
			return name;
		}

		public void PrintName() {
			System.out.println(name);
		}
		
		
	}


