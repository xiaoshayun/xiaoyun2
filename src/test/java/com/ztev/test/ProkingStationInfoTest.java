package com.ztev.test;
import java.util.Date;
import org.junit.Test;
import com.ztev.ums.ztev.mqpy.mq.ParkingProductionInfo;
import com.ztev.ums.ztev.mqpy.util.MqUtil;

public class ProkingStationInfoTest {
	@Test
	public void test001(){
		ParkingProductionInfo info = new ParkingProductionInfo();
		info.setChangeTime(new Date());
		MqUtil.sendTextQueueMessage("springboot-pengy.vehicle_access_info", info);
		
		MqUtil.sendTextQueueMessage("springboot-pengy.vehicle_access_info", info);
		
		MqUtil.sendTextQueueMessage("springboot-pengy.vehicle_access_info", info);
		
		MqUtil.sendTextQueueMessage("springboot-pengy.vehicle_access_info", info);
		
	}
}
