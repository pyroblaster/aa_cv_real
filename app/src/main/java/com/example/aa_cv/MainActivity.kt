package com.example.aa_cv

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.net.Uri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val twitterButton = findViewById(R.id.userTwitterButton) as Button
        val twitterURL = "https://twitter.com/elonmusk"
        twitterButton.setOnClickListener {
            openURL(twitterURL)
        }

        val teslaButton = findViewById(R.id.userTeslaButton) as Button
        val teslaURL = "https://www.tesla.com/"
        teslaButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Lead me to Tesla.", Toast.LENGTH_SHORT).show()
            openURL(teslaURL)
        }

        val wikiButton = findViewById(R.id.userWikiButton) as Button
        val wikiURL = "https://en.wikipedia.org/wiki/Elon_Musk"
        wikiButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Lead me to Wiki.", Toast.LENGTH_SHORT).show()
            openURL(wikiURL)
        }

    }
    fun openURL(address:String){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(address)
        startActivity(openURL)

    }

}
