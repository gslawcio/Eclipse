package data;

		public class Car {
			private String brand;
			private String color;
			private String model;
			private int year;
	    		
			public Car(int year, String brand, String model, String color) {
		        this.setYear(year);
				this.setBrand(brand);
				this.setModel(model);
				this.setColor(color);
			}

			public String getBrand() {
				return brand;
			}
		
			public String getColor() {
				return color;
			}

			public String getModel() {
				return model;
			}

			public int getYear() {
				return year;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public void setYear(int year) {
				if (year>0)
				this.year = year;
				else
					System.out.println("B³edny rok");
			}

		}