package id.solo.gamereviewapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class AboutMeActivity : AppCompatActivity() {
    // About me view variable
    private lateinit var instagram: ImageButton
    private lateinit var linkedin: ImageButton
    private lateinit var twitter: ImageButton
    private lateinit var facebook: ImageButton

    private var title = "About Me"
    private var linkInstagram = "https://www.instagram.com/sulaiman6598/"
    private var linkLinkedIn = "https://www.linkedin.com/in/sula-iman-14430916b/"
    private var linkTwitter = "https://twitter.com/sulaimaniman6"
    private var linkFacebook = "https://www.facebook.com/sulaiman.iman.509/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        setActionBarTitle(title)

        // Initiate view
        initiateView()

        // Social media button
        instagram.setOnClickListener {
            socialIntent(linkInstagram)
        }
        linkedin.setOnClickListener {
            socialIntent(linkLinkedIn)
        }
        twitter.setOnClickListener {
            socialIntent(linkTwitter)
        }
        facebook.setOnClickListener {
            socialIntent(linkFacebook)
        }
    }

    private fun socialIntent(socialLink: String?) {
        val webPage: Uri = Uri.parse(socialLink)
        val browseIntent = Intent(Intent.ACTION_VIEW, webPage)
        startActivity(browseIntent)
    }

    private fun initiateView() {
        instagram = findViewById(R.id.img_about_instagram)
        linkedin = findViewById(R.id.img_about_linkedin)
        twitter = findViewById(R.id.img_about_twitter)
        facebook = findViewById(R.id.img_about_facebook)
    }

    private fun setActionBarTitle(title: String? = "Game Review App") {
        supportActionBar?.title = title
        supportActionBar?.apply {
            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}