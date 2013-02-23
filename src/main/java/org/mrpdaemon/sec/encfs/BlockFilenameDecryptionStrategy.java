/*
 * EncFS Java Library
 * Copyright (C) 2013 encfs-java authors
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

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

public class BlockFilenameDecryptionStrategy extends
		NotNullFilenameDecryptionStrategy {

	public BlockFilenameDecryptionStrategy(EncFSVolume volume, String volumePath) {
		super(volume, volumePath, EncFSAlgorithm.BLOCK);
	}

	protected byte[] decryptConcrete(EncFSVolume volume, byte[] encFileName,
			byte[] fileIv) throws EncFSCorruptDataException {
		try {
			return BlockCryptography.blockDecode(volume, fileIv, encFileName);
		} catch (InvalidAlgorithmParameterException e) {
			throw new EncFSCorruptDataException(e);
		} catch (IllegalBlockSizeException e) {
			throw new EncFSCorruptDataException(e);
		} catch (BadPaddingException e) {
			throw new EncFSCorruptDataException(e);
		}
	}

	public String decryptPost(byte[] fileName) {
		// For the block cipher remove padding before returning the result
		int padLen = fileName[fileName.length - 1];

		return new String(Arrays.copyOfRange(fileName, 0, fileName.length
				- padLen));
	}
}
