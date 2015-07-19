package cn.crxy.zk.study;

import static org.junit.Assert.*;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZKTest {

	@Before
	public void setUp() throws Exception {
		String connectString = "192.168.0.1";
		int sessionTimeout = 3000;
		Watcher watcher = null;
		ZooKeeper zooKeeper = new ZooKeeper(connectString, sessionTimeout, watcher);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
