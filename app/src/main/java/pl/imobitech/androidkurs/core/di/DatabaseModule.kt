package pl.imobitech.androidkurs.core.di

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import pl.imobitech.androidkurs.features.data.AppDatabase

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "DATABASE_NAME"
        )

    }
}