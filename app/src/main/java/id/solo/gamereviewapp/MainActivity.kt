package id.solo.gamereviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.solo.gamereviewapp.model.Game
import id.solo.gamereviewapp.model.GameData
import id.solo.gamereviewapp.model.adapter.CardViewGameAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvGame: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()
    private var title: String = "Game Review"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvGame = findViewById(R.id.rv_games)
        rvGame.setHasFixedSize(true)

        list.addAll(GameData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvGame.layoutManager = LinearLayoutManager(this)
        val cardViewGameAdapter = CardViewGameAdapter(list)
        rvGame.adapter = cardViewGameAdapter
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
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
}