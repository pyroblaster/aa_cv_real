package com.example.aa_cv

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val twitterURL = "https://www.twitter.com/antebartulovic"
        userTwitterButton.setOnClickListener {
            openURL(twitterURL)
            Toast.makeText(this@MainActivity, "Check this out!", Toast.LENGTH_SHORT).show()
            openURL(twitterURL)
        }

        val userRedditURL = "https://www.reddit.com/"
        userRedditButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Fly me to the moon!", Toast.LENGTH_SHORT).show()
            openURL(userRedditURL)
        }

        val userWebURL = "https://pandareptil.com/"
        userWebButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Lets go!", Toast.LENGTH_SHORT).show()
            openURL(userWebURL)
        }

    }
    private fun openURL(address:String){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(address)
        startActivity(openURL)

    }

}
