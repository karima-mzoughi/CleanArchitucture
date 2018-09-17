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
package com.gitlab.sample.cleanarchitecture

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gitlab.sample.cleanarchitecture.di.app.AppComponent
import com.gitlab.sample.cleanarchitecture.di.injector.AppInjector

class MainActivity : AppCompatActivity() {

    private lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        appComponent = AppInjector.getAppComponent()

        if (savedInstanceState == null) {
            MainNavigator().launchFragment(appComponent, supportFragmentManager)
        }

    }
}