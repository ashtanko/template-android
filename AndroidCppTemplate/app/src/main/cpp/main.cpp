#include <jni.h>
#include <stddef.h>
#include <ctype.h>

extern "C" {
JNIEXPORT jstring JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getString(JNIEnv
                                                   *env, jobject instance) {
    return (env)->NewStringUTF("TEST");
}
}