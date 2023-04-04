package com.example.testmedia

import android.content.Intent
import android.database.Observable
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    @POST("")
    fun sendCode(
        @Query("emailSend") email: String
    )

    @POST("")
    fun singIn(
        @Query("emailSing") email : String,
        @Query("code") code: String,
    )

    @GET("")
    fun catalog(

    )


    @GET("")
    fun news(

    )

    @POST("")
    fun createProfile(
        @Query("id") id : Int,
        @Query("firstName") firstname : String,
        @Query("lastName") lastname : String,
        @Query("middleName") middlename : String,
        @Query ("bith") bith: String,
        @Query ("pol") pol : String,
        @Query ("image") image: Int
    )

    @POST("")
    fun upDateProfile (
        @Query("firstName") firstname : String,
        @Query("lastName") lastname : String,
        @Query("middleName") middlename : String,
        @Query ("bith") bith: String,
        @Query ("pol") pol : String
    )

    @POST("")
    fun avatar (
        @Query("binary") binary : String
    )

    @POST("api/order")
    fun order (
        @Query("address") address : String,
        @Query("date_time") date_time : String,
        @Query("phone") phone : String,
        @Query("comment") comment : String,
        @Query("audio_comment") audio_comment : String,

    ) : Observable<OrderData>

    @POST ("")
    fun saveAudioComment (
        @Query("order_id") order_id : Int,
        @Query("binary") binary : String
    ) : Observable<DataModel>


    @GET ("api/orders")
    fun orders (
        @Query("")
    )

    companion object{
        fun createApi() : Api{

            val gson = GsonBuilder()
                .setLenient()
                .create()


            val retrofit = Retrofit.Builder()
                .baseUrl("https://medic.madskill.ru/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
            return retrofit.create(Api::class.java)

        }

    }


}