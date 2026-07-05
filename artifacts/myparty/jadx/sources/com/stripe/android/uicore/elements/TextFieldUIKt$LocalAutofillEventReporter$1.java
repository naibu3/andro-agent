package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TextFieldUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class TextFieldUIKt$LocalAutofillEventReporter$1 extends FunctionReferenceImpl implements Function0<Function1<? super String, ? extends Unit>> {
    public static final TextFieldUIKt$LocalAutofillEventReporter$1 INSTANCE = new TextFieldUIKt$LocalAutofillEventReporter$1();

    TextFieldUIKt$LocalAutofillEventReporter$1() {
        super(0, TextFieldUIKt.class, "defaultAutofillEventReporter", "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super String, ? extends Unit> invoke() {
        return TextFieldUIKt.defaultAutofillEventReporter();
    }
}
