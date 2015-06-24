package io.github.bunnyblue.dexdump.util;

import io.github.bunnyblue.dexdump.encoder.Base64;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DexProcessor {
	public static boolean decodeDex(File dexFile) throws IOException {
		byte[] datas = FileUtils.readFileToByteArray(dexFile);
		byte[] dexData = Base64.decode(datas, Base64.DEFAULT);
		File readedDex = new File(dexFile.getAbsolutePath().replace(".dex", ".read.dex"));
		readedDex.delete();
		FileUtils.writeByteArrayToFile(readedDex, dexData);

		return true;
	}

}
