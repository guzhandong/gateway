package com.renewable.gateway.service.impl;

import com.renewable.gateway.BaseSpringTestCase;
import com.renewable.gateway.dao.SensorRegisterMapper;
import com.renewable.gateway.pojo.SensorRegister;
import com.renewable.gateway.service.IRegisteredInfoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * IRegisteredInfoServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Mar 15, 2019</pre>
 */
public class IRegisteredInfoServiceImplTest extends BaseSpringTestCase {

    @Autowired
    private IRegisteredInfoService iRegisteredInfoService;

    @Resource
    private SensorRegisterMapper sensorRegisterMapper;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getSerialCount()
     */
    @Test
    public void testGetSerialCount() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: getSerialList()
     */
    @Test
    public void testGetSerialList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getSensorCount()
     */
    @Test
    public void testGetSensorCount() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: getSensorList()
     */
    @Test
    public void testGetSensorList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getSensorListByPort(String port)
     */
    @Test
    public void testGetSensorListByPort() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getSensor(String port, String address)
     */
    @Test
    public void testGetSensorForPortAddress() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getSensor(int id)
     */
    @Test
    public void testGetSensorId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setNickname(int id, String nickname)
     */
    @Test
    public void testSetNickname() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: insertSensor(SensorRegister sensorRegister)
     */
    @Test
    public void testInsertSensor() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: updateSensor(int id, SensorRegister sensorRegister)
     */
    @Test
    public void testUpdateSensor() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: deleteSensor(int id)
     */
    @Test
    public void testDeleteSensor() throws Exception {
//TODO: Test goes here...
    }


    /**
     * Method: checkValid(String str, String type)
     */
    @Test
    public void testCheckValid() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = IRegisteredInfoServiceImpl.getClass().getMethod("checkValid", String.class, String.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }

    /**
     * Method: checkValidPortAndAddress(String port, String address)
     */
    @Test
    public void testCheckValidPortAndAddress() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = IRegisteredInfoServiceImpl.getClass().getMethod("checkValidPortAndAddress", String.class, String.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
        SensorRegister sensorRegister = new SensorRegister();
        sensorRegister.setPort("COM4");
        sensorRegister.setAddress("01");
        sensorRegister.setRemake("test_1");
        iRegisteredInfoService.updateSensor(sensorRegister);
    }

} 
