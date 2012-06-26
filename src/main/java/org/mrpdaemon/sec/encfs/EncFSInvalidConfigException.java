/*
 * EncFS Java Library
 * Copyright (C) 2011 Mark R. Pariente
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package org.mrpdaemon.sec.encfs;

/**
 * Class representing an invalid configuration exception
 */
public class EncFSInvalidConfigException extends EncFSException {

	// Serialization version
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new EncFSInvalidConfigException
	 */
	public EncFSInvalidConfigException() {
		super();
	}

	/**
	 * Creates a new EncFSInvalidConfigException
	 * 
	 * @param message
	 *            Exception message
	 */
	public EncFSInvalidConfigException(String message) {
		super(message);
	}

	/**
	 * Creates a new EncFSInvalidConfigException
	 * 
	 * @param cause
	 *            Underlying Throwable for the exception
	 */
	public EncFSInvalidConfigException(Throwable cause) {
		super(cause);
	}

	/**
	 * Creates a new EncFSInvalidConfigException
	 * 
	 * @param message
	 *            Exception message
	 * @param cause
	 *            Underlying Throwable for the exception
	 */
	public EncFSInvalidConfigException(String message, Throwable cause) {
		super(message, cause);
	}

}
