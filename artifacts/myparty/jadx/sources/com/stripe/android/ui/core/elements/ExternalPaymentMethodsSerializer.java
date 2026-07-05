package com.stripe.android.ui.core.elements;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: ExternalPaymentMethodsSerializer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;", "", "<init>", "()V", "format", "Lkotlinx/serialization/json/Json;", "deserializeList", "Lkotlin/Result;", "", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "str", "", "deserializeList-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalPaymentMethodsSerializer {
    public static final ExternalPaymentMethodsSerializer INSTANCE = new ExternalPaymentMethodsSerializer();
    private static final Json format = JsonKt.Json$default(null, new Function1() { // from class: com.stripe.android.ui.core.elements.ExternalPaymentMethodsSerializer$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ExternalPaymentMethodsSerializer.format$lambda$0((JsonBuilder) obj);
        }
    }, 1, null);
    public static final int $stable = 8;

    private ExternalPaymentMethodsSerializer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit format$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* renamed from: deserializeList-IoAF18A, reason: not valid java name */
    public final Object m8652deserializeListIoAF18A(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        try {
            Result.Companion companion = Result.INSTANCE;
            ExternalPaymentMethodsSerializer externalPaymentMethodsSerializer = this;
            return Result.m9118constructorimpl((List) format.decodeFromString(new ArrayListSerializer(ExternalPaymentMethodSpec.INSTANCE.serializer()), str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }
}
