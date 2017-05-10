package io.shtanko.androidbottomview

import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log

fun removeShiftMode(view: BottomNavigationView) {
  val menuView = view.getChildAt(0) as BottomNavigationMenuView
  try {
    val shiftingMode = menuView.javaClass.getDeclaredField("mShiftingMode")
    shiftingMode.isAccessible = true
    shiftingMode.setBoolean(menuView, false)
    shiftingMode.isAccessible = false
    for (i in 0..menuView.childCount - 1) {
      val item = menuView.getChildAt(i) as BottomNavigationItemView
      item.setShiftingMode(false)
      // set once again checked value, so view will be updated
      item.setChecked(item.itemData.isChecked)
    }
  } catch (e: NoSuchFieldException) {
    Log.e("ERROR NO SUCH FIELD", "Unable to get shift mode field")
  } catch (e: IllegalAccessException) {
    Log.e("ERROR ILLEGAL ALG", "Unable to change value of shift mode")
  }
}