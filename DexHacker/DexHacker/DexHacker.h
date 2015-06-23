//
//  DexHacker.h
//  
//
//  Created by BunnyBlue on 6/23/15.
//
//

#ifndef ____DexHacker__
#define ____DexHacker__
#include <iostream>
#include<string.h>
#include<stdio.h>
#include "base64.h"
#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>
#define BUFLEN 1024
class DexHacker{
public:
    void  writeDex2Encoded(unsigned char * data,size_t length);
    void  writeEncodedDex2Dex(const char *dexPath);
    char * getProcessName(char * buffer);
};
#endif /* defined(____DexHacker__) */
