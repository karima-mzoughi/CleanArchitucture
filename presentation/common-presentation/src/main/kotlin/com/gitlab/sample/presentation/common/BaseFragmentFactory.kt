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
package com.gitlab.sample.presentation.common

import android.support.v4.app.FragmentTransaction

interface BaseFragmentFactory {
    fun create(type: FragmentType): BaseFragment

    fun commitFragment(fragmentTransaction: FragmentTransaction, fragment: BaseFragment)
}

enum class FragmentType {
    ALBUMS, ALBUM_DETAILS
}

interface BundleKey {
    companion object {
        const val ALBUM_ID = "ALBUM_ID"
    }
}

