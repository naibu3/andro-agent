package com.stripe.android.core.strings;

import android.content.Context;
import com.stripe.android.core.strings.transformations.TransformOperation;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResolvableStringUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a-\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001aI\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2 \u0010\f\u001a\u0011\u0012\r\b\u0001\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\r0\u0001\"\t\u0018\u00010\u0002¢\u0006\u0002\b\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0007¢\u0006\u0002\u0010\u0010\u001a7\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122 \u0010\f\u001a\u0011\u0012\r\b\u0001\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\r0\u0001\"\t\u0018\u00010\u0002¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0013\u001a\u000e\u0010\u0017\u001a\u00020\t*\u0004\u0018\u00010\tH\u0007\u001a\u0015\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0087\u0002\"\u0015\u0010\b\u001a\u00020\t*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0015\u0010\b\u001a\u00020\t*\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"resolveArgs", "", "", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "", "(Landroid/content/Context;Ljava/util/List;)[Ljava/lang/Object;", "resolvableString", "Lcom/stripe/android/core/strings/ResolvableString;", "id", "", "formatArgs", "Lkotlinx/parcelize/RawValue;", "transformations", "Lcom/stripe/android/core/strings/transformations/TransformOperation;", "(I[Ljava/lang/Object;Ljava/util/List;)Lcom/stripe/android/core/strings/ResolvableString;", "value", "", "(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;", "getResolvableString", "(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", "(I)Lcom/stripe/android/core/strings/ResolvableString;", "orEmpty", "plus", "other", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResolvableStringUtilsKt {
    public static final Object[] resolveArgs(Context context, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(args, "args");
        List<? extends Object> list = args;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object objResolve : list) {
            if (objResolve instanceof ResolvableString) {
                objResolve = ((ResolvableString) objResolve).resolve(context);
            }
            arrayList.add(objResolve);
        }
        return arrayList.toArray(new Object[0]);
    }

    public static /* synthetic */ ResolvableString resolvableString$default(int i, Object[] objArr, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return resolvableString(i, objArr, list);
    }

    public static final ResolvableString resolvableString(int i, Object[] formatArgs, List<? extends TransformOperation> transformations) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return new IdentifierResolvableString(i, transformations, ArraysKt.toList(formatArgs));
    }

    public static final ResolvableString resolvableString(String value, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new StaticResolvableString(value, ArraysKt.toList(formatArgs));
    }

    public static final ResolvableString getResolvableString(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StaticResolvableString(str, CollectionsKt.emptyList());
    }

    public static final ResolvableString getResolvableString(int i) {
        return new IdentifierResolvableString(i, CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }

    public static final ResolvableString orEmpty(ResolvableString resolvableString) {
        return resolvableString == null ? getResolvableString("") : resolvableString;
    }

    public static final ResolvableString plus(ResolvableString resolvableString, ResolvableString other) {
        Intrinsics.checkNotNullParameter(resolvableString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new ConcatenatedResolvableString(resolvableString, other);
    }
}
