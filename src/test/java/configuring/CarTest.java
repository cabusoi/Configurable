package configuring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CarConfig.class })
public class CarTest {

	@Test
	public void test() {
		Car car1 = new Car();
		String start1 = car1.start();

		Car car2 = new Car();
		String start2 = car2.start();

	}

}
