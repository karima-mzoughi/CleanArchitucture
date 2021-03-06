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
package com.gitlab.sample.presentation.album_details.rmvvm

import android.support.annotation.StringRes
import com.gitlab.sample.domain.album_details.entities.AlbumDetailsEntity
import com.gitlab.sample.presentation.common.ViewState

sealed class AlbumDetailsViewState : ViewState

class GetAlbumViewState(val photos: List<AlbumDetailsEntity>) : AlbumDetailsViewState()
class ErrorAlbumViewState(
        @StringRes val errorMessage: Int, val error: Throwable, val photos: List<AlbumDetailsEntity>?
) : AlbumDetailsViewState()