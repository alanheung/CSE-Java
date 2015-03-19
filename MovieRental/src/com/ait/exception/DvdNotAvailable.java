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

/**
 * General exception for a DVD not being available for rent in the store.
 */
public class DvdNotAvailable extends DvdStoreException {

	private static final long serialVersionUID = -7844164306968873458L;

	public DvdNotAvailable(final String message) {
		super(message);
	}

}
