import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class letterGradeBoundaryTest {

private letterGrade gradefunction;
	
	@Before
	public void setUp() throws Exception {
		gradefunction = new letterGrade();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void letterGradeXTC1() {
		Assert.assertEquals('X', gradefunction.letterGradeX(101));
	}
	
	@Test
	public void letterGradeXTC2() {
		Assert.assertEquals('A', gradefunction.letterGradeX(90));
		Assert.assertEquals('A', gradefunction.letterGradeX(100));
	}
	
	@Test
	public void letterGradeXTC3() {
		Assert.assertEquals('B', gradefunction.letterGradeX(80));
		Assert.assertEquals('B', gradefunction.letterGradeX(89));
	}
	
	@Test
	public void letterGradeXTC4() {
		Assert.assertEquals('C', gradefunction.letterGradeX(70));
		Assert.assertEquals('C', gradefunction.letterGradeX(79));
	}
	
	@Test
	public void letterGradeXTC5() {
		Assert.assertEquals('D', gradefunction.letterGradeX(60));
		Assert.assertEquals('D', gradefunction.letterGradeX(69));
	}
	
	@Test
	public void letterGradeXTC6() {
		Assert.assertEquals('F', gradefunction.letterGradeX(0));
		Assert.assertEquals('F', gradefunction.letterGradeX(59));
	}
	
	@Test
	public void letterGradeXTC7() {
		Assert.assertEquals('X', gradefunction.letterGradeX(-1));
	}

}
