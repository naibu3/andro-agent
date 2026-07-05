package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleEventsCutter.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MultipleEventsCutterKt$clickableSingle$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Role $role;

    MultipleEventsCutterKt$clickableSingle$2(boolean z, String str, Role role, Function0<Unit> function0) {
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = role;
        this.$onClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-1610772522);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610772522, i, -1, "com.stripe.android.financialconnections.ui.components.clickableSingle.<anonymous> (MultipleEventsCutter.kt:61)");
        }
        composer.startReplaceGroup(-102827773);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = MultipleEventsCutterKt.get(MultipleEventsCutter.INSTANCE);
            composer.updateRememberedValue(objRememberedValue);
        }
        final MultipleEventsCutter multipleEventsCutter = (MultipleEventsCutter) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-102824573);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue2;
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localIndication);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Indication indication = (Indication) objConsume;
        Modifier.Companion companion2 = companion;
        boolean z = this.$enabled;
        String str = this.$onClickLabel;
        Role role = this.$role;
        composer.startReplaceGroup(-102818641);
        boolean zChangedInstance = composer.changedInstance(multipleEventsCutter) | composer.changed(this.$onClick);
        final Function0<Unit> function0 = this.$onClick;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt$clickableSingle$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultipleEventsCutterKt$clickableSingle$2.invoke$lambda$4$lambda$3(multipleEventsCutter, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierM605clickableO2vRcR0 = ClickableKt.m605clickableO2vRcR0(companion2, mutableInteractionSource, indication, z, str, role, (Function0) objRememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM605clickableO2vRcR0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(MultipleEventsCutter multipleEventsCutter, final Function0 function0) {
        multipleEventsCutter.processEvent(new Function0() { // from class: com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt$clickableSingle$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultipleEventsCutterKt$clickableSingle$2.invoke$lambda$4$lambda$3$lambda$2(function0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
