package com.sixth.space.network

import com.sixth.space.base.HttpResponse
import com.sixth.space.data.video.HotItem
import com.sixth.space.data.video.RecommendItem
import com.sixth.space.data.video.CommentItem
import com.sixth.space.data.video.TikTokItem
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author: Frankie
 * @Date: 2024/2/29
 * @Description:
 */
interface RetrofitService {
    @GET("api/v4/rankList/videos")
    suspend fun fetchHotList(
        @Query("strategy") strategy: String
    ): HttpResponse<HotItem>

    @GET("/api/v2/replies/video")
    suspend fun fetchReply(
        @Query("lastId") lastId: String,
        @Query("videoId") videoId: String,
        @Query("num") num: String,
        @Query("type") type: String
    ): HttpResponse<CommentItem>

    @GET("/api/v4/video/related")
    suspend fun fetchRecommend(
        @Query("id") id: String
    ): HttpResponse<RecommendItem>


    @GET("/api/v5/index/tab/feed")
    suspend fun fetchTiktok(
        @Query("date") date: String, @Query("num") num: String
    ): HttpResponse<TikTokItem>
}