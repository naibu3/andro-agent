package com.stripe.attestation;

import android.app.Application;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StandardIntegrityManagerFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;", "Lcom/stripe/attestation/StandardIntegrityManagerFactory;", "appContext", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "create", "Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealStandardIntegrityManagerFactory implements StandardIntegrityManagerFactory {
    private final Application appContext;

    public RealStandardIntegrityManagerFactory(Application appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // com.stripe.attestation.StandardIntegrityManagerFactory
    public StandardIntegrityManager create() {
        StandardIntegrityManager standardIntegrityManagerCreateStandard = IntegrityManagerFactory.createStandard(this.appContext);
        Intrinsics.checkNotNullExpressionValue(standardIntegrityManagerCreateStandard, "createStandard(...)");
        return standardIntegrityManagerCreateStandard;
    }
}
