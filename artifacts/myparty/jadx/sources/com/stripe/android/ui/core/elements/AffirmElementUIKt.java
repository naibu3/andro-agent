package com.stripe.android.ui.core.elements;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import com.stripe.android.uicore.text.HtmlKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: AffirmElementUI.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"MIN_LUMINANCE_FOR_LIGHT_ICON", "", "AffirmElementUI", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AffirmElementUIKt {
    private static final double MIN_LUMINANCE_FOR_LIGHT_ICON = 0.5d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AffirmElementUI$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AffirmElementUI(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AffirmElementUI(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1603052936);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1603052936, i3, -1, "com.stripe.android.ui.core.elements.AffirmElementUI (AffirmElementUI.kt:18)");
            }
            if (ColorKt.m3709luminance8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU()) < MIN_LUMINANCE_FOR_LIGHT_ICON) {
                i4 = R.drawable.stripe_ic_affirm_logo_night;
            } else {
                i4 = R.drawable.stripe_ic_affirm_logo_day;
            }
            HtmlKt.m8897Htmlm4MizFo(StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_affirm_buy_now_pay_later, composerStartRestartGroup, 0), modifier3, MapsKt.mapOf(TuplesKt.to("affirm", new EmbeddableImage.Drawable(i4, R.string.stripe_paymentsheet_payment_method_affirm, null, 4, null))), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getH6(), false, null, 0, null, composerStartRestartGroup, ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (EmbeddableImage.Drawable.$stable << 6), 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.ui.core.elements.AffirmElementUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AffirmElementUIKt.AffirmElementUI$lambda$0(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
