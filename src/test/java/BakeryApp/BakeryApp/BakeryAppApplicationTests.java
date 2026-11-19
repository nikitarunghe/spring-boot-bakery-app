package BakeryApp.BakeryApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BakeryAppApplicationTests {

	@Autowired
CakeBaker cakeBaker;

@Test
void CakeBakerTest() {
    cakeBaker.bakeCake();
}

	@Test
	void contextLoads() {
	}

	

}
