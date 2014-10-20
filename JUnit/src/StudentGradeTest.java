import static org.junit.Assert.*;
import  org.junit.Before;
import  org.junit.Test;

public class StudentGradeTest {
	
		private StudentGrade studentGrade;
		@Before
		public void setup(){
			studentGrade = new StudentGrade();
		}
		@Test
		public void testGradeAGreaterThan85(){
			studentGrade = new StudentGrade();
			assertEquals('A', studentGrade.StudentGrade(90));
		}
		@Test
		public void testGradeBGreaterThan70(){
			studentGrade = new StudentGrade();
			assertEquals('B', studentGrade.StudentGrade(75));
		}
		@Test
		public void testGradeCGreaterThan55(){
			studentGrade = new StudentGrade();
			assertEquals('C', studentGrade.StudentGrade(65));
		}
		@Test
		public void testGradeDGreaterThan40(){
			studentGrade = new StudentGrade();
			assertEquals('D', studentGrade.StudentGrade(45));
		}
		@Test
		public void testGradeEGreaterThan25(){
			studentGrade = new StudentGrade();
			assertEquals('E', studentGrade.StudentGrade(35));
		}
		@Test
		public void testGradeFGreaterThan0(){
			studentGrade = new StudentGrade();
			assertEquals('F', studentGrade.StudentGrade(15));
		}
	}
