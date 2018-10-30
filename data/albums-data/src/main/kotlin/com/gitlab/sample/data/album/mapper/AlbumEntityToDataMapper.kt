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
package com.gitlab.sample.data.album.mapper

import com.gitlab.sample.data.common.utils.Mapper
import com.gitlab.sample.domain.album.entities.AlbumEntity
import com.gitlab.sample.presentation.album.entities.AlbumData

class AlbumEntityToDataMapper : Mapper<AlbumEntity, AlbumData>() {
    override fun mapFrom(from: AlbumEntity) = AlbumData(
            id = from.id,
            userId = from.userId,
            title = from.title
    )
}