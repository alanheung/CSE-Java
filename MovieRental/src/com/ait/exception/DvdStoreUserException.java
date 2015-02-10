/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2012
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ait.exception;

public class DvdStoreUserException extends DvdStoreException {

	private static final long serialVersionUID = 334051992916748022L;

	public DvdStoreUserException(String userID) {
		super("Account not found or not allowed to rent new movie: "+ userID);
	}

}
