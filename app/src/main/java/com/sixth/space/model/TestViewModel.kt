package com.sixth.space.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sixth.space.base.HttpResponse
import com.sixth.space.data.video.HotItem
import com.sixth.space.network.Resource
import com.sixth.space.network.RetrofitService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @author: Frankie
 * @Date: 2024/3/3
 * @Description:
 */
@HiltViewModel
class TestViewModel @Inject constructor(private val service: RetrofitService) : ViewModel() {
    val recipesLiveDataPrivate = MutableLiveData<Resource<HttpResponse<HotItem>>>()
    val recipesLiveData: LiveData<Resource<HttpResponse<HotItem>>> get() = recipesLiveDataPrivate
    fun fetchHotData() {
    }

    fun demo() {
        viewModelScope.launch(Dispatchers.IO){
           service.fetchReply("","322130","","");
        }
    }
}