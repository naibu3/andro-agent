package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import com.stripe.android.pushProvisioning.PushProvisioningActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushProvisioningProxy.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/DefaultPushProvisioningProxy;", "", "<init>", "()V", "beginPushProvisioning", "", "activity", "Landroid/app/Activity;", "description", "", "provider", "Lcom/reactnativestripesdk/pushprovisioning/EphemeralKeyProvider;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultPushProvisioningProxy {
    public static final int $stable = 0;

    public final void beginPushProvisioning(Activity activity, String description, EphemeralKeyProvider provider) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(provider, "provider");
        new PushProvisioningActivityStarter(activity, new PushProvisioningActivityStarter.Args(description, provider, false)).startForResult();
    }
}
