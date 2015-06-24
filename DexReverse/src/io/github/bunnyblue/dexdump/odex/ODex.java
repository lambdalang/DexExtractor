package io.github.bunnyblue.dexdump.odex;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class ODex {
	public static boolean dumpToSmalli(String bootPath, File dexFile) {
		// org.jf.baksmali.main aa;
		java.lang.String bootclass = "--bootclasspath";
		String odexdir = dexFile.getAbsolutePath() + "smali";
		try {
			FileUtils.deleteDirectory(new File(odexdir));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File odexDir = new File(odexdir);
		odexDir.mkdirs();
		String[] args = new String[] { bootclass, bootPath, "-x", "--output", odexDir.getAbsolutePath(),
				dexFile.getAbsolutePath() };


		// try {
		// org.jf.baksmali.main.main(args);
		// smaliToDex(odexDir);
		// System.out.println("ODex.dumpToSmalli(------------------------)");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// // e.printStackTrace();
		// } finally {
		// // smaliToDex(odexDir);
		// // String data = null;
		// // data.charAt(2);
		// // System.out.println("xxxxxxxxxxxxx" + odexDir.getAbsolutePath());
		// }

		

		return false;
	}

	public static void smaliToDex(File smaliDir) {
		if (!smaliDir.isDirectory()) {
			return;
		}
		String odexdir = smaliDir.getAbsolutePath().replace("dexsmali", "_deodex.dex");

		String[] args = new String[] { "--output", odexdir, smaliDir.getAbsolutePath() };
		System.out.println(odexdir);
		// org.jf.smali.main.main(args);

	}

}
