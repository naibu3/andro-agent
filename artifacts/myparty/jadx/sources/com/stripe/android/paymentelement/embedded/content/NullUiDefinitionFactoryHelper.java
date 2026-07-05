package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NullUiDefinitionFactoryHelper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/NullUiDefinitionFactoryHelper;", "", "<init>", "()V", "nullEmbeddedUiDefinitionFactory", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;", "getNullEmbeddedUiDefinitionFactory", "()Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NullUiDefinitionFactoryHelper {
    public static final NullUiDefinitionFactoryHelper INSTANCE = new NullUiDefinitionFactoryHelper();
    private static final UiDefinitionFactory.Arguments.Factory.Default nullEmbeddedUiDefinitionFactory = new UiDefinitionFactory.Arguments.Factory.Default(NullCardAccountRangeRepositoryFactory.INSTANCE, null, null, new Function1() { // from class: com.stripe.android.paymentelement.embedded.content.NullUiDefinitionFactoryHelper$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return NullUiDefinitionFactoryHelper.nullEmbeddedUiDefinitionFactory$lambda$0((InlineSignupViewState) obj);
        }
    }, null, null, null, null, false, null, 496, null);
    public static final int $stable = 8;

    private NullUiDefinitionFactoryHelper() {
    }

    public final UiDefinitionFactory.Arguments.Factory.Default getNullEmbeddedUiDefinitionFactory() {
        return nullEmbeddedUiDefinitionFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nullEmbeddedUiDefinitionFactory$lambda$0(InlineSignupViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("Not possible.");
    }
}
