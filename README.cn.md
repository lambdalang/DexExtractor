# DexExtractor
android dex脱壳，对抗梆梆加固

## usgae
push libdvm.so android4.4模拟器 /system/lib

使用 -scard参数启动模拟器
adb  install  安装加固后的apk
打开logcat  logcat
监视log被加固的包名和dvmtag，如图 ![logcat](art/image.png), 当you will see  create file end.
  adb  pull /sdcard/classes_xxx.dex 脱出odex
十六进制打开classes_xxx.dex 然后 修改第一个字节x为d
然后把odex文件转换成dex
