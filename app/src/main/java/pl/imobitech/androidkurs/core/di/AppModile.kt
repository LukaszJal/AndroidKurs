package pl.imobitech.androidkurs.core.di

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val NUMBER_OF_COLUMNS = 2

val appModule = module {
    factory {
        LinearLayoutManager(this.androidContext())
    }

    factory {
        GridLayoutManager(this.androidContext(), NUMBER_OF_COLUMNS)
    }

    factory {
        DividerItemDecoration(this.androidContext(), LinearLayoutManager.VERTICAL)
    }
}