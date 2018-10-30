/***
 * Copyright 2018 Hadi Lashkari Ghouchani
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * */
package com.gitlab.sample.presentation.album_details.recycler

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.gitlab.sample.presentation.album_details.di.AlbumDetailsScope
import com.gitlab.sample.presentation.common.BaseViewHolder
import com.gitlab.sample.presentation.common.ViewData
import com.gitlab.sample.presentation.common.extention.inflate
import javax.inject.Inject

@AlbumDetailsScope
class AlbumDetailsAdapter @Inject constructor() : RecyclerView.Adapter<BaseViewHolder<*>>() {

    private val list = mutableListOf<ViewData>()
    lateinit var onCreateViewHolder: (BaseViewHolder<*>) -> Unit
    var itemWidth: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val viewHolder = AlbumPhotoViewHolder(parent.inflate(viewType), itemWidth)
        onCreateViewHolder.invoke(viewHolder)
        return viewHolder
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        (holder as AlbumPhotoViewHolder).onBind(list[position] as AlbumPhotoViewData)
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].getType()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun addAll(data: List<ViewData>) {
        list.addAll(data)
    }

    fun isEmpty(): Boolean {
        return list.isEmpty()
    }
}