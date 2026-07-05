package com.stripe.android.financialconnections.utils;

import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ConflatedJob.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "", "<init>", "()V", "job", "Lkotlinx/coroutines/Job;", "prevJob", "isActive", "", "()Z", "plusAssign", "", "newJob", "cancel", ViewProps.START, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConflatedJob {
    public static final int $stable = 8;
    private Job job;
    private Job prevJob;

    public final boolean isActive() {
        Job job = this.job;
        if (job != null) {
            return job.isActive();
        }
        return false;
    }

    public final synchronized void plusAssign(Job newJob) {
        Intrinsics.checkNotNullParameter(newJob, "newJob");
        cancel();
        this.job = newJob;
    }

    public final void cancel() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.prevJob = this.job;
    }

    public final void start() {
        Job job = this.job;
        if (job != null) {
            job.start();
        }
    }
}
