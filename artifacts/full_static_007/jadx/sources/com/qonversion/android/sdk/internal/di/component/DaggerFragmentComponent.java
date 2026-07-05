package com.qonversion.android.sdk.internal.di.component;

import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.automations.mvp.ScreenFragment;
import com.qonversion.android.sdk.automations.mvp.ScreenFragment_MembersInjector;
import com.qonversion.android.sdk.automations.mvp.ScreenPresenter;
import com.qonversion.android.sdk.internal.di.module.FragmentModule;
import com.qonversion.android.sdk.internal.di.module.FragmentModule_ProvideScreenProcessorFactory;
import com.qonversion.android.sdk.internal.di.module.FragmentModule_ProvideScreenViewFactory;
import com.qonversion.android.sdk.internal.repository.QRepository;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class DaggerFragmentComponent implements FragmentComponent {
    private final AppComponent appComponent;
    private Provider<ScreenProcessor> provideScreenProcessorProvider;
    private Provider<ScreenContract.View> provideScreenViewProvider;

    private DaggerFragmentComponent(FragmentModule fragmentModule, AppComponent appComponent) {
        this.appComponent = appComponent;
        initialize(fragmentModule, appComponent);
    }

    public static Builder builder() {
        return new Builder();
    }

    private ScreenPresenter getScreenPresenter() {
        return new ScreenPresenter((QRepository) Preconditions.checkNotNull(this.appComponent.repository(), "Cannot return null from a non-@Nullable component method"), this.provideScreenViewProvider.get());
    }

    private void initialize(FragmentModule fragmentModule, AppComponent appComponent) {
        this.provideScreenViewProvider = DoubleCheck.provider(FragmentModule_ProvideScreenViewFactory.create(fragmentModule));
        this.provideScreenProcessorProvider = DoubleCheck.provider(FragmentModule_ProvideScreenProcessorFactory.create(fragmentModule));
    }

    @Override // com.qonversion.android.sdk.internal.di.component.FragmentComponent
    public void inject(ScreenFragment screenFragment) {
        injectScreenFragment(screenFragment);
    }

    private ScreenFragment injectScreenFragment(ScreenFragment screenFragment) {
        ScreenFragment_MembersInjector.injectAutomationsManager(screenFragment, (QAutomationsManager) Preconditions.checkNotNull(this.appComponent.automationsManager(), "Cannot return null from a non-@Nullable component method"));
        ScreenFragment_MembersInjector.injectPresenter(screenFragment, getScreenPresenter());
        ScreenFragment_MembersInjector.injectScreenProcessor(screenFragment, this.provideScreenProcessorProvider.get());
        return screenFragment;
    }

    public static final class Builder {
        private AppComponent appComponent;
        private FragmentModule fragmentModule;

        private Builder() {
        }

        public Builder fragmentModule(FragmentModule fragmentModule) {
            this.fragmentModule = (FragmentModule) Preconditions.checkNotNull(fragmentModule);
            return this;
        }

        public Builder appComponent(AppComponent appComponent) {
            this.appComponent = (AppComponent) Preconditions.checkNotNull(appComponent);
            return this;
        }

        public FragmentComponent build() {
            Preconditions.checkBuilderRequirement(this.fragmentModule, FragmentModule.class);
            Preconditions.checkBuilderRequirement(this.appComponent, AppComponent.class);
            return new DaggerFragmentComponent(this.fragmentModule, this.appComponent);
        }
    }
}
