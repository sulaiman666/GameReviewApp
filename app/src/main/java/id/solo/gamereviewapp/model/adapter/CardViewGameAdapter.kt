package id.solo.gamereviewapp.model.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import id.solo.gamereviewapp.DetailActivity
import id.solo.gamereviewapp.R
import id.solo.gamereviewapp.model.Game

class CardViewGameAdapter(private val listGame: ArrayList<Game>) :
    RecyclerView.Adapter<CardViewGameAdapter.CardViewHolder>() {
    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgLogo: ImageView = itemView.findViewById(R.id.img_item_logo_game)
        var tvJudul: TextView = itemView.findViewById(R.id.tv_item_judul_game)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail_game)
        var buttonShare: Button = itemView.findViewById(R.id.btn_set_share)
        var buttonDownload: Button = itemView.findViewById(R.id.btn_set_download)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_games, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.logo)
            .apply(RequestOptions().override(Target.SIZE_ORIGINAL))
            .into(holder.imgLogo)

        holder.tvJudul.text = game.judul
        holder.tvDetail.text = game.about

        holder.buttonShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(
                    Intent.EXTRA_TEXT, "Let\'s join the fight and play " +
                            listGame[holder.adapterPosition].judul + " with me!\n" +
                            "Download " + listGame[holder.adapterPosition].judul + " here!\n" +
                            game.link
                )
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Share game with")
            holder.buttonShare.context.startActivity(shareIntent)
        }

        holder.buttonDownload.setOnClickListener {
            val webPage: Uri = Uri.parse(game.link)
            val browseIntent = Intent(Intent.ACTION_VIEW, webPage)

            holder.buttonDownload.context.startActivity(browseIntent)
        }

        holder.itemView.setOnClickListener {
            // Membuka detail activity
            val moveDetailActivity = Intent(holder.itemView.context, DetailActivity::class.java)

            // Mengirim info detail
            moveDetailActivity.putExtra(DetailActivity.JUDUL, game.judul)
            moveDetailActivity.putExtra(DetailActivity.DETAIL, game.detail)
            moveDetailActivity.putExtra(DetailActivity.ABOUT, game.about)
            moveDetailActivity.putExtra(DetailActivity.LINK, game.link)

            // Mengirim spec
            moveDetailActivity.putExtra(DetailActivity.BANNER, game.banner)
            moveDetailActivity.putExtra(DetailActivity.OS, game.spec["os"])
            moveDetailActivity.putExtra(DetailActivity.CPU, game.spec["cpu"])
            moveDetailActivity.putExtra(DetailActivity.MEMORY, game.spec["memory"])
            moveDetailActivity.putExtra(DetailActivity.GPU, game.spec["gpu"])
            moveDetailActivity.putExtra(DetailActivity.DIRECTX, game.spec["directx"])
            moveDetailActivity.putExtra(DetailActivity.NETWORK, game.spec["network"])
            moveDetailActivity.putExtra(DetailActivity.STORAGE, game.spec["storage"])
            moveDetailActivity.putExtra(DetailActivity.SOUNDCARD, game.spec["soundcard"])

            holder.itemView.context.startActivity(moveDetailActivity)
        }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }
}