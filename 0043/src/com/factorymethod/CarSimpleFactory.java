package com.factorymethod;

public class CarSimpleFactory {

	

		public static Car getCar(String brand) {
			if(brand.equalsIgnoreCase("BWM")) {
				return new BMW();
			}else if(brand.equalsIgnoreCase("binli")) {
				return new binli();
			}else {
				System.out.println("ц╩сп");
				return null;
			}
		}
	}


