package chat.rocket.android.draw.main.di

import androidx.lifecycle.LifecycleOwner
import chat.rocket.android.draw.main.presenter.DrawView
import chat.rocket.android.draw.main.ui.DrawingActivity
import chat.rocket.core.lifecycle.CancelStrategy
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Job

@Module
class DrawModule {

    @Provides
    fun provideMainView(activity: DrawingActivity): DrawView = activity

    @Provides
    fun provideJob() = Job()

    @Provides
    fun provideLifecycleOwner(activity: DrawingActivity): LifecycleOwner = activity

    @Provides
    fun provideCancelStrategy(owner: LifecycleOwner, jobs: Job): CancelStrategy =
        CancelStrategy(owner, jobs)
}