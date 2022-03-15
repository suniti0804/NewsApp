package com.example.project8

import android.util.Log


object Constants {

    const val url = "https://saurav.tech/NewsAPI/everything/cnn.json"
   // const val API_Key = "d0e72f6943ef4dfcb04fd071d1e3dc76"
   // fun getHeadlines(country: String="in"): String="https://newsapi.org/v2/top-headlines?country=$country&apiKey=$API_Key"

}

fun Any?.printlog(tag:String="TAG") {
        Log.e(tag,this.toString())
}