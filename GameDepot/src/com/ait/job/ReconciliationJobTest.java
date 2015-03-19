package com.ait.job;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

//import com.ait.job.FinancialTransactionDAO;
//import com.ait.job.MembershipDAO;
//import com.ait.job.MembershipStatusDto;
//import com.ait.job.PayPalFacade;
//import com.ait.job.ReconciliationJob;
//import com.ait.job.TransactionDto;

import static org.mockito.Mockito.*;

public class ReconciliationJobTest {

	private FinancialTransactionDAO ftDAO;
	private MembershipDAO mDAO;
	private PayPalFacade ppf;
	private ReconciliationJob reconJob;
	private List<TransactionDto> transactionsList; 
	private TransactionDto transactionDto;
	private MembershipStatusDto msDTO;
	
	@Before
	public void setUp() {
		ftDAO = mock(FinancialTransactionDAO.class);
		mDAO = mock(MembershipDAO.class);
		ppf = mock(PayPalFacade.class);
		
		reconJob = new ReconciliationJob(ftDAO, mDAO, ppf);
	}
	
	@Test
	public void testNoTransactions() {
		assertEquals(0, reconJob.reconcile());
	}
	
	@Test
	public void testOneTransaction() {
		transactionsList = new ArrayList<>();
		transactionDto = new TransactionDto();
		transactionDto.setAmount(25.00);
		transactionsList.add(transactionDto);
		
		when(ftDAO.retrieveUnSettledTransactions()).thenReturn(transactionsList);
		msDTO = new MembershipStatusDto();
		msDTO.setDeductable(0.30);
		
		when(mDAO.getStatusFor(null)).thenReturn(msDTO);
		assertEquals(1, reconJob.reconcile());
	}

}
