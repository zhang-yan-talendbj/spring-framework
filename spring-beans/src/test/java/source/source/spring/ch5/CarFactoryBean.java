package source.source.spring.ch5;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String carInfo;

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public Car getObject() throws Exception {
		Car car = new Car();
		String[] split = carInfo.split(",");
		car.setBrand(split[0]);
		car.setMaxSpeed(Integer.valueOf(split[1]));
		car.setPrice(Double.valueOf(split[2]));
		return car;
	}

	public Class<Car> getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
