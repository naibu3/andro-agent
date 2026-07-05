package com.stripe.android.paymentsheet.utils;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* compiled from: TestMetadata.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001\"\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"3\u0010\u0000\u001a\u0004\u0018\u00010\u0003*\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000e*\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"testMetadata", "Landroidx/compose/ui/Modifier;", "metadata", "", "TestMetadata", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestMetadata", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getTestMetadata$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setTestMetadata", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TestMetadataKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TestMetadataKt.class, "testMetadata", "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1))};
    private static final SemanticsPropertyKey<String> TestMetadata = new SemanticsPropertyKey<>("TestMetadata", new Function2() { // from class: com.stripe.android.paymentsheet.utils.TestMetadataKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return TestMetadataKt.TestMetadata$lambda$1((String) obj, (String) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TestMetadata$lambda$1(String str, String str2) {
        return str;
    }

    public static final Modifier testMetadata(Modifier modifier, final String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: com.stripe.android.paymentsheet.utils.TestMetadataKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TestMetadataKt.testMetadata$lambda$0(str, (SemanticsPropertyReceiver) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit testMetadata$lambda$0(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        setTestMetadata(semantics, str);
        return Unit.INSTANCE;
    }

    public static final SemanticsPropertyKey<String> getTestMetadata() {
        return TestMetadata;
    }

    public static final String getTestMetadata(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        return TestMetadata.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setTestMetadata(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        TestMetadata.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }
}
