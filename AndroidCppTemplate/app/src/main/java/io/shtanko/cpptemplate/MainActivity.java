package io.shtanko.cpptemplate;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    System.out.println("GET STRING " + getString());
    System.out.println("GET STRING WITH PARAMETER " + getStringWithParameter("HELLO JNI"));
    System.out.println("GET INT " + getInt());
    System.out.println("GET ARRAY " + getArray(12000).length);
  }

  public native String getString();
  public native int getInt();
  public native Bitmap getBitmap(byte[] pixelBuf);
  public native String getStringWithParameter(String value);
  public native int[] getArray(int size);

}
