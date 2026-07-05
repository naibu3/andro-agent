package com.qonversion.android.sdk.internal.di.component;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.mvp.ScreenFragment;
import com.qonversion.android.sdk.internal.di.module.FragmentModule;
import com.qonversion.android.sdk.internal.di.scope.ActivityScope;
import dagger.Component;
import kotlin.Metadata;

/* compiled from: FragmentComponent.kt */
@Component(dependencies = {AppComponent.class}, modules = {FragmentModule.class})
@ActivityScope
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;", "", "inject", "", "into", "Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface FragmentComponent {
    void inject(ScreenFragment into);
}
