package io.shtanko.androidbottomview

import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.design.bottomNavigationView
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.matchParent

class MainUI<in T> : AnkoComponent<T> {

  val CONTENT_FRAME = R.id.main_container

  override fun createView(ui: AnkoContext<T>): View = with(ui) {
    coordinatorLayout {

      frameLayout {
        id = CONTENT_FRAME
        lparams(matchParent, matchParent)
      }

      bottomNavigationView {

        inflateMenu(R.menu.navigation_menu)
        fitsSystemWindows = true

        itemIconTintList = ContextCompat.getColorStateList(ctx, R.color.primary_dark_material_dark)
        itemTextColor = ContextCompat.getColorStateList(ctx, R.color.primary_dark_material_dark)

        removeShiftMode(this)
      }.lparams(matchParent) {
        anchorGravity = Gravity.BOTTOM
        anchorId = CONTENT_FRAME

      }
    }
  }
}