/**
 * 
 */
package io.github.bunnyblue.dexdump;

import io.github.bunnyblue.dexdump.odex.ODex;
import io.github.bunnyblue.dexdump.util.DexChecker;
import io.github.bunnyblue.dexdump.util.DexProcessor;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

/**
 * @author BunnyBlue
 *
 */
public class Boot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = null;
		if (args != null && args.length > 0) {
			dir = args[0];

		} else {
			System.out.println(" add dir ");
		}
		Collection<File> dexFiles = FileUtils.listFiles(new File(dir),
				new String[] { "dex" }, false);

		for (File file : dexFiles) {
			try {
				System.out.println("Boot.main()" + file.getAbsolutePath() + DexChecker.isDex(file));
				if (!DexChecker.isDex(file)) {
					DexProcessor.decodeDex(file);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// deodex();
		// tesst();
		System.out.println("Boot.main()");
	}

	// Boot.deodex()/Users/BunnyBlue/Downloads/jeb2demo/com.gome.eshopnewclasses_3940056.read.dextrue

	public static void deodex() {
		Collection<File> dexFiles = FileUtils.listFiles(new File("/Users/BunnyBlue/Downloads/jeb2demo"),
				new String[] { "dex" }, false);

		for (File file : dexFiles) {
			try {

				if (DexChecker.isOdexFileFile(file)) {
					System.err.println("Boot.deodex()" + file.getAbsolutePath() + DexChecker.isOdexFileFile(file));
					// ODex.dumpToSmalli("/Users/BunnyBlue/Downloads/jeb2demo/system/framework",
					// file);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void tesst() {
		Collection<File> dexFiles = FileUtils.listFiles(new File("/Users/BunnyBlue/Downloads/jeb2demo"),
				new String[] { "dex" }, false);
File file=new File("/Users/BunnyBlue/Downloads/jeb2demo/com.gome.eshopnewclasses_3940056.read.dex");
		ODex.dumpToSmalli("/Users/BunnyBlue/Downloads/jeb2demo/system/framework", file);
//		for (File file : dexFiles) {
//			try {
//
//				if (DexChecker.isOdexFileFile(file)) {
//					System.err.println("Boot.deodex()" + file.getAbsolutePath() + DexChecker.isOdexFileFile(file));
//					// ODex.dumpToSmalli("/Users/BunnyBlue/Downloads/jeb2demo/system/framework",
//					// file);
//				}
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}
