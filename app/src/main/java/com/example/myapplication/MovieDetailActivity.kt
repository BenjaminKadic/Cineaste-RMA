package com.example.myapplication
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var movie: Movie
    private lateinit var title : TextView
    private lateinit var overview : TextView
    private lateinit var releaseDate : TextView
    private lateinit var genre : TextView
    private lateinit var website : TextView
    private lateinit var poster : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        title = findViewById(R.id.movie_title)
        overview = findViewById(R.id.movie_overview)
        releaseDate = findViewById(R.id.movie_release_date)
        genre = findViewById(R.id.movie_genre)
        poster = findViewById(R.id.movie_poster)
        website = findViewById(R.id.movie_website)
        val extras = intent.extras
        if (extras != null) {
            movie = getMovieByTitle(extras.getString("movie_title",""))
            populateDetails()
        } else {
            finish()
        }
        website.setOnClickListener{
            showWebsite()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        title.setOnClickListener {
            showWebsiteOnTitleClick()
        }

        val shareButton = findViewById<FloatingActionButton>(R.id.shareButton)

        // Set a click listener for the share button
        shareButton.setOnClickListener {
            // Create a share intent
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, movie.title + " - " + movie.overview)

            // Start an activity to show the available share options
            startActivity(Intent.createChooser(shareIntent, "Share movie via"))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        // Navigate back to the previous activity
        super.onBackPressed()
    }

    private fun populateDetails() {
        title.text=movie.title
        releaseDate.text=movie.releaseDate
        genre.text=movie.genre
        //website.text=movie.homepage
        overview.text=movie.overview
        val context: Context = poster.context
        var id: Int = context.resources
            .getIdentifier(movie.genre, "drawable", context.packageName)
        if (id===0) id=context.resources
            .getIdentifier("picture1", "drawable", context.packageName)
        poster.setImageResource(id)
    }
    private fun getMovieByTitle(name:String):Movie{
        val movies: ArrayList<Movie> = arrayListOf()
        movies.addAll(getRecentMovies())
        movies.addAll(getFavoriteMovies())
        val movie= movies.find { movie -> name == movie.title }
        return movie?:Movie(0,"Test","Test","Test","Test","Test")
    }
    private fun showWebsite(){
        val webIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse(movie.homepage))
        try {
            startActivity(webIntent)
        } catch (e: ActivityNotFoundException) {
            // Definisati naredbe ako ne postoji aplikacija za navedenu akciju
        }
    }

    private fun showWebsiteOnTitleClick() {
        val query = "${movie.title} trailer"
        val uri = Uri.parse("https://www.google.com/search?q=${query.replace(" ", "+")}")
        val webIntent = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(webIntent)
        } catch (e: ActivityNotFoundException) {
            // Define the action to take if there is no activity that can handle the intent
        }
    }
}