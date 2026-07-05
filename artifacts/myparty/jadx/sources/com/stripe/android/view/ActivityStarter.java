package com.stripe.android.view;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ActivityStarter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/ActivityStarter;", "", "<init>", "()V", "Args", "Result", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivityStarter {
    public static final int $stable = 0;

    private ActivityStarter() {
    }

    /* compiled from: ActivityStarter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args;", "Landroid/os/Parcelable;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Args extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_args";

        /* compiled from: ActivityStarter.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args$Companion;", "", "<init>", "()V", "EXTRA", "", "getEXTRA$annotations", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_args";

            public static /* synthetic */ void getEXTRA$annotations() {
            }

            private Companion() {
            }
        }
    }

    /* compiled from: ActivityStarter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Parcelable;", "toBundle", "Landroid/os/Bundle;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_result";

        Bundle toBundle();

        /* compiled from: ActivityStarter.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result$Companion;", "", "<init>", "()V", "EXTRA", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_result";

            private Companion() {
            }
        }
    }
}
