package com.renewable.gateway.service.impl; /**
 * @Description：
 * @Author: jarry
 */
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author arganzheng
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({
//        "classpath:conf-spring/spring-dao.xml",
//        "classpath:conf-spring/spring-service.xml",
//        "classpath:conf-spring/spring-controller.xml"
//})
@ContextConfiguration({ "/../webapp/WEB-INF/dispatcher-servlet.xml",
        "/../resources/applicationContext.xml" })
@Transactional
public class BaseSpringTestCase{
}

