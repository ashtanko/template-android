#include <jni.h>
#include <iostream>


extern "C" {
JNIEXPORT jstring JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getString(JNIEnv
                                                   *env, jobject instance) {
    return (env)->NewStringUTF("TEST");
}
}extern "C"
JNIEXPORT jint JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getInt(JNIEnv *env, jobject instance) {

    return 1200;

}extern "C"
JNIEXPORT jobject JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getBitmap(JNIEnv *env, jobject instance,
                                                   jbyteArray pixelBuf_) {

    jbyte *pixelBuf = env->GetByteArrayElements(pixelBuf_, NULL);

    env->ReleaseByteArrayElements(pixelBuf_, pixelBuf, 0);

    return NULL;
}extern "C"
JNIEXPORT jstring JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getStringWithParameter(JNIEnv *env, jobject instance,
                                                                jstring value_) {
    const char *value = env->GetStringUTFChars(value_, 0);

    env->ReleaseStringUTFChars(value_, value);

    return env->NewStringUTF(value);
}extern "C"
JNIEXPORT jintArray JNICALL
Java_io_shtanko_cpptemplate_MainActivity_getArray(JNIEnv *env, jobject instance, jint size) {

    jintArray array;
    array = env->NewIntArray(size);

    return array;

}