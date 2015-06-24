# DexExtractor
android dex  extractor ，anti-bangbang

## usgae
put libdvm.so to your  emulator /system/lib

boot your  emulator  with sdcard and install bangbanged.apk
open  logcat
monitor Application tag at dalvikm like this ![logcat](art/image.png), you will see  create file end.
just  adb  pull /sdcard/pkg_classes_xxx.dex<br>
just run java -jar Decoder.jar pkg_dexs_dir
get all odex  endwith read.dex
