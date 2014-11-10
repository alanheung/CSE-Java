import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class CustomerTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCustomer() {
    Customer c = new Customer( "David" );
    assertNotNull( c );
  }
  
  public void testAddRental() {
    Customer c = new Customer( "Sallie" );
    Movie    m = new Movie( "Gone with the Wind", Movie.REGULAR );
    Rental   r = new Rental( m, 3 );        // 3-day rental
    c.addRental( r );
    assertNotNull( c );
  }
  
  public void testGetName() {
    Customer c = new Customer( "David" );
    assertEquals( "David", c.name() );
  }
  
  public void testStatementForRegularMovie() {
    Customer c = new Customer( "Sallie" );
    Movie    m = new Movie( "Gone with the Wind", Movie.REGULAR );
    Rental   r = new Rental( m, 3 );        // 3-day rental
    c.addRental( r );
    
    String expected = "Rental Record for Sallie\n" + "\tGone with the Wind\t3.5\n" +
      "Amount owed is 3.5\n" + "You earned 1 frequent renter points";
    String statement = c.statement();
    assertEquals( expected, statement );
  }
  
  public void testStatementForNewReleaseMovie() {
    Customer c = new Customer( "Sallie" );
    Movie    m = new Movie( "Star Wars", Movie.NEW_RELEASE );
    Rental   r = new Rental( m, 3 );        // 3-day rental
    c.addRental( r );
    
    String expected = "Rental Record for Sallie\n" + "\tStar Wars\t9.0\n" +
      "Amount owed is 9.0\n" + "You earned 2 frequent renter points";
    String statement = c.statement();
    assertEquals( expected, statement );
  }
  
  public void testStatementForChildrensMovie() {
    Customer c = new Customer( "Sallie" );
    Movie    m = new Movie( "Madagascar", Movie.CHILDRENS );
    Rental   r = new Rental( m, 3 );        // 3-day rental
    c.addRental( r );
    
    String expected = "Rental Record for Sallie\n" + "\tMadagascar\t1.5\n" +
      "Amount owed is 1.5\n" + "You earned 1 frequent renter points";
    String statement = c.statement();
    assertEquals( expected, statement );
  }
  
  public void testStatementForManyMovies() {
    Customer c  = new Customer( "David" );
    
    Movie    m1 = new Movie( "Madagascar", Movie.CHILDRENS );
    Rental   r1 = new Rental( m1, 6 );        // 6-day rental
    Movie    m2 = new Movie( "Star Wars", Movie.NEW_RELEASE );
    Rental   r2 = new Rental( m2, 2 );        // 2-day rental
    Movie    m3 = new Movie( "Gone with the Wind", Movie.REGULAR );
    Rental   r3 = new Rental( m3, 8 );        // 8-day rental
    
    c.addRental( r1 );
    c.addRental( r2 );
    c.addRental( r3 );
   
    String expected = "Rental Record for David\n" + "\tMadagascar\t6.0\n" +
      "\tStar Wars\t6.0\n" + "\tGone with the Wind\t11.0\n" +
      "Amount owed is 23.0\n" + "You earned 4 frequent renter points";
    String statement = c.statement();
    assertEquals( expected, statement );
  }
  
}