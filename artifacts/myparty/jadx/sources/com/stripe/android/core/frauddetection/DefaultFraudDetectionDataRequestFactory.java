package com.stripe.android.core.frauddetection;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FraudDetectionDataRequestFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;", "fraudDetectionDataRequestParamsFactory", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;", "<init>", "(Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;", "arg", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFraudDetectionDataRequestFactory implements FraudDetectionDataRequestFactory {
    private final FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory;

    public DefaultFraudDetectionDataRequestFactory(FraudDetectionDataRequestParamsFactory fraudDetectionDataRequestParamsFactory) {
        Intrinsics.checkNotNullParameter(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.fraudDetectionDataRequestParamsFactory = fraudDetectionDataRequestParamsFactory;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRequestFactory(Context context) {
        this(new FraudDetectionDataRequestParamsFactory(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataRequestFactory
    public FraudDetectionDataRequest create(FraudDetectionData arg) {
        Map mapCreateParams$stripe_core_release = this.fraudDetectionDataRequestParamsFactory.createParams$stripe_core_release(arg);
        String guid = arg != null ? arg.getGuid() : null;
        if (guid == null) {
            guid = "";
        }
        return new FraudDetectionDataRequest(mapCreateParams$stripe_core_release, guid);
    }
}
