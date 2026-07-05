package com.stripe.android.stripe3ds2.utils;

import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;", "", "<init>", "()V", "loader", "Ljava/util/ServiceLoader;", "Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;", "serviceImpl", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AnalyticsProvider provider;
    private final ServiceLoader<AnalyticsDelegate> loader;

    public /* synthetic */ AnalyticsProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AnalyticsProvider() {
        ServiceLoader<AnalyticsDelegate> serviceLoaderLoad = ServiceLoader.load(AnalyticsDelegate.class);
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(...)");
        this.loader = serviceLoaderLoad;
    }

    public final AnalyticsDelegate serviceImpl() {
        if (this.loader.iterator().hasNext()) {
            return this.loader.iterator().next();
        }
        return null;
    }

    /* compiled from: AnalyticsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider$Companion;", "", "<init>", "()V", "provider", "Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;", "instance", "getInstance", "()Lcom/stripe/android/stripe3ds2/utils/AnalyticsProvider;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnalyticsProvider getInstance() {
            AnalyticsProvider analyticsProvider = AnalyticsProvider.provider;
            if (analyticsProvider == null) {
                analyticsProvider = new AnalyticsProvider(null);
            }
            if (AnalyticsProvider.provider == null) {
                AnalyticsProvider.provider = analyticsProvider;
            }
            return analyticsProvider;
        }
    }
}
