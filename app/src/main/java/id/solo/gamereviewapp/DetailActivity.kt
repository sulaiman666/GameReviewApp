package id.solo.gamereviewapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

class DetailActivity : AppCompatActivity() {
    companion object {
        const val BANNER = "banner"
        const val JUDUL = "judul"
        const val DETAIL = "detail"
        const val ABOUT = "about"

        // Spec
        const val OS = "os"
        const val CPU = "cpu"
        const val MEMORY = "memory"
        const val GPU = "gpu"
        const val DIRECTX = "directx"
        const val NETWORK = "network"
        const val STORAGE = "storage"
        const val SOUNDCARD = "soundcard"
        const val LINK = "link"
    }

    // Detail view variable
    private lateinit var judul: TextView
    private lateinit var detail: TextView
    private lateinit var about: TextView

    // Spec view variable
    private lateinit var os: TextView
    private lateinit var cpu: TextView
    private lateinit var memory: TextView
    private lateinit var gpu: TextView
    private lateinit var directx: TextView
    private lateinit var network: TextView
    private lateinit var storage: TextView
    private lateinit var soundcard: TextView
    private lateinit var download: Button
    private lateinit var share: Button

    // Local val
    private var downloadLink: String = ""
    private var banner: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra(JUDUL)
        setActionBarTitle(title)

        initiateViews()

        intentFetch()

        // Button
        download.setOnClickListener {
            downloadIntent(downloadLink)
        }
        share.setOnClickListener {
            shareIntent(downloadLink)
        }

        // Image
        loadDetail(banner)
    }

    private fun intentFetch() {
        // Display
        // Display detail
        judul.text = intent.getStringExtra(JUDUL)
        detail.text = intent.getStringExtra(DETAIL)
        about.text = intent.getStringExtra(ABOUT)
        // Display spec
        os.text = intent.getStringExtra(OS)
        cpu.text = intent.getStringExtra(CPU)
        memory.text = intent.getStringExtra(MEMORY)
        gpu.text = intent.getStringExtra(GPU)
        directx.text = intent.getStringExtra(DIRECTX)
        network.text = intent.getStringExtra(NETWORK)
        storage.text = intent.getStringExtra(STORAGE)
        soundcard.text = intent.getStringExtra(SOUNDCARD)

        // Link
        downloadLink = intent.getStringExtra(LINK).toString()
        // Banner
        banner = intent.getIntExtra(BANNER, 0)
    }

    private fun initiateViews() {
        // Initiate views
        // Detail views
        judul = findViewById(R.id.tv_detail_judul)
        detail = findViewById(R.id.tv_detail_detail_game)
        about = findViewById(R.id.tv_detail_about_game)
        // Spec views
        os = findViewById(R.id.tv_detail_spec_os)
        cpu = findViewById(R.id.tv_detail_spec_cpu)
        memory = findViewById(R.id.tv_detail_spec_memory)
        gpu = findViewById(R.id.tv_detail_spec_gpu)
        directx = findViewById(R.id.tv_detail_spec_directx)
        network = findViewById(R.id.tv_detail_spec_network)
        storage = findViewById(R.id.tv_detail_spec_storage)
        soundcard = findViewById(R.id.tv_detail_spec_sound_card)
        // Button
        download = findViewById(R.id.btn_detail_download)
        share = findViewById(R.id.btn_detail_share)
    }

    private fun downloadIntent(downloadLink: String?) {
        val webPage: Uri = Uri.parse(downloadLink)
        val browseIntent = Intent(Intent.ACTION_VIEW, webPage)
        startActivity(browseIntent)
    }

    private fun shareIntent(downloadLink: String?) {
        val title = intent.getStringExtra(JUDUL)
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(
                Intent.EXTRA_TEXT, "Let\'s join the fight and play " +
                        title + " with me!\n" + "Download " + title + " here!\n" +
                        downloadLink
            )
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, "Share game with")
        startActivity(shareIntent)
    }

    private fun loadDetail(banner: Int) {
        val imgBanner: ImageView = findViewById(R.id.detail_banner)

        Glide.with(imgBanner.context)
            .load(banner)
            .apply(RequestOptions().override(Target.SIZE_ORIGINAL))
            .into(imgBanner)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_me, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about_me -> {
                val moveAboutMeActivity = Intent(this, AboutMeActivity::class.java)
                this.startActivity(moveAboutMeActivity)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}