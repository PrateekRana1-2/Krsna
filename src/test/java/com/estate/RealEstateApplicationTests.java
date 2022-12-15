package com.estate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RealEstateApplicationTests {

	//@Test
	//void contextLoads() {
	//}
	@Test
	void findByid() {

		CoustmerEntity entity=new CoustmerEntity(null, null, null, null, null, null, null, false, null, null, null);
//		coustmerRepo.save(entity);
		Boolean actualresult=coustmerRepo.existsById((long) 1);
		assertThat(actualresult).isEqualTo(true);
	}

}
