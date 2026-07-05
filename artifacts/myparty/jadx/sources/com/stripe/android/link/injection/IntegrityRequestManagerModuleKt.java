package com.stripe.android.link.injection;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.attestation.IntegrityRequestManager;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntegrityRequestManagerModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"createIntegrityStandardRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "context", "Landroid/app/Application;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntegrityRequestManagerModuleKt {
    public static final IntegrityRequestManager createIntegrityStandardRequestManager(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new IntegrityStandardRequestManager(577365562050L, new Function2() { // from class: com.stripe.android.link.injection.IntegrityRequestManagerModuleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IntegrityRequestManagerModuleKt.createIntegrityStandardRequestManager$lambda$0((String) obj, (Throwable) obj2);
            }
        }, new RealStandardIntegrityManagerFactory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createIntegrityStandardRequestManager$lambda$0(String message, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.INSTANCE.getInstance(false).error(message, error);
        return Unit.INSTANCE;
    }
}
