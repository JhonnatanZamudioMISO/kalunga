package com.jhonnatan.kalunga.presentation.core.session.views

import androidx.appcompat.app.AppCompatActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.jhonnatan.kalunga.data.user.datasource.UserDataSourceRemote
import com.jhonnatan.kalunga.domain.useCases.ConfigurationUseCase
import com.jhonnatan.kalunga.domain.useCases.utils.Countries
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/****
 * Project: kalunga
 * From: com.jhonnatan.kalunga.presentation.core.session.views
 * Created by Jhonnatan E. Zamudio P. on 5/11/2022 at 8:59 p. m.
 * All rights reserved 2022.
 */

@RunWith(AndroidJUnit4::class)
@ExperimentalCoroutinesApi
@Suppress("UNCHECKED_CAST")
class ConfigurationActivityTest {

    private lateinit var configurationActivity: AppCompatActivity

    @Before
    fun setup() {
        configurationActivity = AppCompatActivity()
    }

    @Test
    fun `Caso 01`() {
        val result = configurationActivity.onBackPressed()
        println(result)
        Assert.assertNotNull(result)
    }
}