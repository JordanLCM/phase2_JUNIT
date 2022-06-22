package phase2_JUNIT_Package;

import java.io.File;

//import org.junit.Ignore;
//junit 4 uses IGNORE, junit 5 uses DISABLED
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class phase2_JUNIT002 {

	@Test
	@DisabledOnOs(OS.WINDOWS)
	public void testDisabled() {
		System.out.println("Hello Junit 5 test");
	}

	@Test
	@DisabledOnJre(JRE.JAVA_8)
	public void testJRE() {
		System.out.println("Hello Junit 5 test 2");
	}
	
//	@Test
//	@DisabledIfSystemProperty(named = "file.separator", matches = "[\\]")
//	//my system is using backwards double slash "\\"
//	public void testSYSPROP() {
//		System.out.println("c:"+File.separator+"test"+File.separator+"folder");
//	}
	
	@Test
	@Disabled
	//should ignore this test
	public void MustIgnore() {
		System.out.println("Ignore");
	}
}
