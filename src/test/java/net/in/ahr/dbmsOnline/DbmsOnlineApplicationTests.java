package net.in.ahr.dbmsOnline;

import net.in.ahr.dbmsOnline.sample01.HelloApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloApplication.class)
@WebAppConfiguration
public class DbmsOnlineApplicationTests {

	@Test
	public void contextLoads() {
	}

}
