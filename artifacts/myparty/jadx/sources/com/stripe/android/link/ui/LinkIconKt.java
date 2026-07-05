package com.stripe.android.link.ui;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.stripe.android.uicore.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LinkIcon.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LinkIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "LinkIcon-iJQMabo", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkIconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkIcon_iJQMabo$lambda$0(Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m7857LinkIconiJQMabo(modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: LinkIcon-iJQMabo, reason: not valid java name */
    public static final void m7857LinkIconiJQMabo(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1309686101);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                j = Color.INSTANCE.m3693getUnspecified0d7_KjU();
            }
            long j3 = j;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1309686101, i3, -1, "com.stripe.android.link.ui.LinkIcon (LinkIcon.kt:14)");
            }
            Modifier modifier3 = modifier;
            IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_link_logo_bw, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0), modifier3, j3, composerStartRestartGroup, (i3 << 6) & 8064, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j2 = j3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkIconKt.LinkIcon_iJQMabo$lambda$0(modifier2, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
