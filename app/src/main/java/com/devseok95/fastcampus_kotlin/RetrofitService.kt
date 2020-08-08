package com.devseok95.fastcampus_kotlin
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


interface RetrofitService {

    @GET("json/students/")
    fun getStudentsList(): Call<ArrayList<PersonFromServer>>

    @POST("json/students/")
    fun createStudnet(
        @Body params: HashMap<String, Any>
    ): Call<PersonFromServer>

    @POST("json/students/")
    fun createStudentEasy(
        @Body person: PersonFromServer
    ): Call<PersonFromServer>

    @GET("youtube/list/")
    fun getYoutubeList():Call<ArrayList<Youtube>>

    @GET("melon/list/")
    fun getSongList():Call<ArrayList<Song>>

}