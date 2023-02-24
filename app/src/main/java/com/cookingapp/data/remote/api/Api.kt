package com.cookingapp.data.remote.api

import com.cookingapp.data.remote.dto.MealDetailDto
import com.cookingapp.data.remote.dto.MealDto
import retrofit2.http.GET
import retrofit2.http.Query
// this file uses retrofit in order to make http calls
// Api holds declaration to our endpoints which are interface and this is also a helper class
// to build our API
interface Api {

    // here is where we define the endpoints for the data we are requesting from http request
    // this is the last section of the url. this would be the meals
    // e.g https://www.mealdatabase.com/api/meals
    //@GET("meals") // this is the first endpoint

    // call fun getAllMeals() to return list<MealDetailDto>.
    // use postman to see and test endpoints. returns in form of json objects
    //suspend fun getAllMeals(): List<MealDto>

    @GET("games")
    suspend fun getAllMeals(): List<MealDto>

    @GET("game")
    suspend fun getMeal(
        @Query("id") id: Int
    ): MealDetailDto?

    @GET("games")
    suspend fun getMealsByPlatform(
        @Query("platform") platform: String
    ): List<MealDto>

    @GET("games")
    suspend fun sortMeals(
        @Query("sort-by") criteria: String
    ): List<MealDto>
}