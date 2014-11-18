package com.mydomain.shoppingcart.dao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlWriter;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.mydomain.shoppingcart.dao.BasketDao;

/** 
 * @author Ross
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/shoppingcart-test.xml" })
@TransactionConfiguration
@Transactional
public class BasketDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
	protected static final String BASKET_TABLE_NAME = "basket";
	protected static final String CHANGED_USER_ID = "scooby";
	protected static final Integer ID = new Integer(1);
	private static String TEST_DATA_FILE = "shoppingcart-dbunit.xml";
	@Autowired
	private BasketDao basketDao;
	private int basketTableRowCount = 0;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@AfterTransaction
	public void afterTransaction() {
		// logic to verify the final state after transaction has rolled back
		logger.debug("start - afterTransaction");
		assertEquals(basketTableRowCount, countRowsInTable(BASKET_TABLE_NAME));
		logger.debug("start - afterTransaction");
	}

	@BeforeTransaction
	public void beforeTransaction() {
		// logic to verify the initial state before a transaction is started
		logger.debug("start - beforeTransaction");
		basketTableRowCount = countRowsInTable(BASKET_TABLE_NAME);
		logger.debug("end - beforeTransaction");
	}

	@Test
	@Ignore
	public void generateDBUnitExport() {
		try {
			jdbcTemplate
					.execute("insert into item (id, name, description, price) values (1, 'Candy Cotton', 'Candy coated milky tarts', 8.50);");
			jdbcTemplate
					.execute("insert into item (id, name, description, price) values (2, 'Jelly Beans', 'Jelly icecream waffle cream', 18.99);");
			jdbcTemplate.execute("insert into basket (id, userid) values (1, 'shaggy');");
			jdbcTemplate.execute("insert into basket_item (basket_id, items_id) values (1, 1);");
			jdbcTemplate.execute("insert into basket_item (basket_id, items_id) values (1, 2);");

			IDatabaseConnection connection = new DatabaseConnection(jdbcTemplate.getDataSource().getConnection());

			QueryDataSet partialDataSet = new QueryDataSet(connection);
			partialDataSet.addTable("basket", " SELECT * FROM basket");
			partialDataSet.addTable("item", " SELECT * FROM item");
			partialDataSet.addTable("basket_item", " SELECT * FROM basket_item");
			FlatXmlWriter datasetWriter = new FlatXmlWriter(new FileOutputStream(TEST_DATA_FILE));
			datasetWriter.write(partialDataSet);
		} catch (Exception e) {
			fail("Error in generateDBUnitExport");
		}
	}

	@Test
	@Rollback(true)
	public void saveOrUpdateBasket() {
		// logic which uses the test data and modifies database state
		logger.debug("start - saveOrUpdateBasket");
		assertNotNull("Basket DAO is null.", basketDao);
		try {
//			Collection<Basket> baskets = basketDao.loadByUserId(USER_ID);
//
//			assertNotNull("Basket list is null.", baskets);
//			assertEquals("Number of baskets should be " + basketTableRowCount + 1 + ".", basketTableRowCount + 1, baskets.size());
//
//			for (Basket basket : baskets) {
//				assertNotNull("Basket is null.", basket);
//
//				if (ID.equals(basket.getId())) {
//					assertEquals("Basket userid should be " + USER_ID + ".", USER_ID, basket.getUserid());
//					basket.setUserid(CHANGED_USER_ID);
//					basketDao.saveOrUpdateBasket(basket);
//				}
//			}
		} catch (Exception e) {
			fail("Error in saveOrUpdateBasket");
		}
		logger.debug("end - saveOrUpdateBasket");
	}

	@Before
	public void setUpTestDataWithinTransaction() {
		// set up test data within the transaction
		logger.debug("start - setUpTestDataWithinTransaction");
		try {
			IDatabaseConnection connection = new DatabaseConnection(jdbcTemplate.getDataSource().getConnection());
			DatabaseOperation.INSERT.execute(connection, new FlatXmlDataSet(new FileInputStream(TEST_DATA_FILE)));
			jdbcTemplate.getDataSource().getConnection().close();
		} catch (Exception e) {
			fail("Error in setUpTestDataWithinTransaction");
		}
		logger.debug("end - setUpTestDataWithinTransaction");
	}

	@After
	public void tearDownWithinTransaction() {
		// execute "tear down" logic within the transaction
		logger.debug("start - tearDownWithinTransaction");
		try {
			IDatabaseConnection connection = new DatabaseConnection(jdbcTemplate.getDataSource().getConnection());
			DatabaseOperation.DELETE.execute(connection, new FlatXmlDataSet(new FileInputStream(TEST_DATA_FILE)));
			jdbcTemplate.getDataSource().getConnection().close();
		} catch (Exception e) {
			fail("Error in tearDownWithinTransaction");
		}
		logger.debug("end - tearDownWithinTransaction");
	}
}
