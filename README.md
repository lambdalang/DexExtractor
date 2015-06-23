# DexExtractor
android dex  extractor ，anti-bangbang

## usgae
put libdvm.so to your  emulator /system/lib

boot your  emulator  with sdcard and install bangbanged.apk
open  logcat
monitor Application tag at dalvikm  you will see  create file end.
just  adb  pull /sdcard/classes_xxx.dex
open classes_xxx.dex in hex mode,and  modify first  byte  'x' to 'd'
final just odex  this file to dex

