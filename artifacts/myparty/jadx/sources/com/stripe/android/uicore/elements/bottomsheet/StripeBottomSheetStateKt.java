package com.stripe.android.uicore.elements.bottomsheet;

import android.os.Build;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeBottomSheetState.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0005H\u0082@¢\u0006\u0002\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"rememberStripeBottomSheetState", "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "confirmValueChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;", "repeatUntilSucceededOrLimit", "", "limit", "", "block", "Lkotlin/coroutines/Continuation;", "", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipHideAnimation", "getSkipHideAnimation", "()Z", "isRunningUnitTest", "isRunningUiTest", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeBottomSheetStateKt {

    /* compiled from: StripeBottomSheetState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt", f = "StripeBottomSheetState.kt", i = {0, 0, 0}, l = {99}, m = "repeatUntilSucceededOrLimit", n = {"block", "limit", "counter"}, s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeBottomSheetStateKt.repeatUntilSucceededOrLimit(0, null, this);
        }
    }

    private static final boolean getSkipHideAnimation() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberStripeBottomSheetState$lambda$1$lambda$0(ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final StripeBottomSheetState rememberStripeBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Function1<? super ModalBottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceGroup(2070707701);
        if ((i2 & 1) != 0) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(-21688856);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(StripeBottomSheetStateKt.rememberStripeBottomSheetState$lambda$1$lambda$0((ModalBottomSheetValue) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        Function1<? super ModalBottomSheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2070707701, i, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:20)");
        }
        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue2, AnimationSpecKt.tween$default(0, 0, null, 7, null), function12, true, composer, (i & 14) | 3120 | ((i << 3) & 896), 0);
        StripeBottomSheetKeyboardHandler stripeBottomSheetKeyboardHandlerRememberStripeBottomSheetKeyboardHandler = StripeBottomSheetKeyboardHandlerKt.rememberStripeBottomSheetKeyboardHandler(composer, 0);
        composer.startReplaceGroup(-21677788);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new StripeBottomSheetState(modalBottomSheetStateRememberModalBottomSheetState, stripeBottomSheetKeyboardHandlerRememberStripeBottomSheetKeyboardHandler);
            composer.updateRememberedValue(objRememberedValue2);
        }
        StripeBottomSheetState stripeBottomSheetState = (StripeBottomSheetState) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stripeBottomSheetState;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0055
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object repeatUntilSucceededOrLimit(int r5, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1 r0 = (com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1 r0 = new com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.util.concurrent.CancellationException -> L32
            goto L57
        L32:
            r7 = r2
            goto L55
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L44:
            if (r5 >= r6) goto L57
            r0.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L55
            r0.I$0 = r6     // Catch: java.util.concurrent.CancellationException -> L55
            r0.I$1 = r5     // Catch: java.util.concurrent.CancellationException -> L55
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L55
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L55
            if (r5 != r1) goto L57
            return r1
        L55:
            int r5 = r5 + r3
            goto L44
        L57:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.repeatUntilSucceededOrLimit(int, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean isRunningUnitTest() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            String lowerCase = FINGERPRINT.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            objM9118constructorimpl = Result.m9118constructorimpl(Boolean.valueOf(Intrinsics.areEqual(lowerCase, "robolectric")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            objM9118constructorimpl = false;
        }
        return ((Boolean) objM9118constructorimpl).booleanValue();
    }

    private static final boolean isRunningUiTest() {
        Object objM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(Class.forName("androidx.test.InstrumentationRegistry"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m9125isSuccessimpl(objM9118constructorimpl);
    }
}
