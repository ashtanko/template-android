package io.shtanko.storagetemplate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    "https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty".httpGet().responseString { request, response, result ->

      when (result) {
        is Result.Failure -> {
          print("FAILURE")
        }
        is Result.Success -> {
          print("SUCCESS")
        }

      }
    }

  }
}