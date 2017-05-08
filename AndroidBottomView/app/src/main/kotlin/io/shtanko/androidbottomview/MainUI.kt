package io.shtanko.androidbottomview

import android.view.View
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.matchParent

class MainUI<T> : AnkoComponent<T> {

  override fun createView(ui: AnkoContext<T>): View = with(ui) {
    linearLayout {

      frameLayout {
        backgroundResource = R.color.material_blue_grey_800

      }.lparams(width = matchParent, height = 200)

    }
  }

}