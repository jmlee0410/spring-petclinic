package org.springframework.samples.petclinic.sample;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.notNullValue;


@SpringBootTest
class SampleControllerTest {
	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testDI() {
		SampleController sampleController = applicationContext.getBean(SampleController.class);
		MatcherAssert.assertThat(sampleController, notNullValue());
	}
}
