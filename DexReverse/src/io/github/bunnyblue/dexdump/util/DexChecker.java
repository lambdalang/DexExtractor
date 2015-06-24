package io.github.bunnyblue.dexdump.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DexChecker {
	public static boolean isDex(File file) throws IOException {
		// if (file.getAbsolutePath().endsWith(".read.dex")) {
		//
		// return false;
		// }
		byte[] datas = FileUtils.readFileToByteArray(file);
		if (datas != null && datas.length > 64 && datas[0] == 'd' && datas[1] == 'e') {
			System.out.println((char) datas[0] + "xxxxxx" + (char) datas[1] + (char) datas[2]);
			return true;
		}
		return false;
	}

	public static boolean isOdexFileFile(File file) throws IOException {
	// if (file.getAbsolutePath().endsWith(".read.dex")) {
	//
	// return false;
	// }
	byte[] datas = FileUtils.readFileToByteArray(file);

		if (datas != null && datas.length > 64 && datas[0] == 'd' && datas[1] == 'e' && datas[2] == 'y') {
			System.out.println((char) datas[0] + " xxxisOdexFileFilexxx " + (char) datas[1] + (char) datas[2]);
		return true;
	}
	return false;
}
}
