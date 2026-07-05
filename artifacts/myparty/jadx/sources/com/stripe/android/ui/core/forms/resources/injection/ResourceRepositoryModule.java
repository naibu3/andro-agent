package com.stripe.android.ui.core.forms.resources.injection;

import android.content.Context;
import android.content.res.Resources;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceRepositoryModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;", "", "<init>", "()V", "provideResources", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ResourceRepositoryModule {
    public static final int $stable = 0;
    public static final ResourceRepositoryModule INSTANCE = new ResourceRepositoryModule();

    private ResourceRepositoryModule() {
    }

    @Provides
    @Singleton
    public final Resources provideResources(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }
}
