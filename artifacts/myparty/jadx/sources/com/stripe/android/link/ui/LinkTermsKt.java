package com.stripe.android.link.ui;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.style.TextAlign;
import androidx.core.view.PointerIconCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.EmbeddableImage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LinkTerms.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0000\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"LinkTerms", "", "type", "Lcom/stripe/android/link/ui/LinkTermsType;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "LinkTerms-8iNrtrE", "(Lcom/stripe/android/link/ui/LinkTermsType;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "replaceHyperlinks", "", "LinkTermsPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkTermsKt {

    /* compiled from: LinkTerms.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkTermsType.values().length];
            try {
                iArr[LinkTermsType.InlineOptionalWithPhoneFirst.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkTermsType.InlineOptional.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkTermsType.Inline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkTermsType.InlineWithDefaultOptIn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LinkTermsType.Full.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkTermsPreview$lambda$2(int i, Composer composer, int i2) {
        LinkTermsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkTerms_8iNrtrE$lambda$1(LinkTermsType linkTermsType, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m7870LinkTerms8iNrtrE(linkTermsType, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinkTerms-8iNrtrE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7870LinkTerms8iNrtrE(final LinkTermsType type, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier.Companion companion;
        int iM6006getCentere0LSkKk;
        int i6;
        String strStringResource;
        final Modifier modifier3;
        final int i7;
        int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1788855147);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i10 = composerStartRestartGroup.changed(i5) ? 256 : 128;
                    i4 |= i10;
                } else {
                    i5 = i;
                }
                i4 |= i10;
            } else {
                i5 = i;
            }
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) == 0) {
                        iM6006getCentere0LSkKk = TextAlign.INSTANCE.m6006getCentere0LSkKk();
                        i4 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1788855147, i4, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:30)");
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i6 == 1) {
                        composerStartRestartGroup.startReplaceGroup(758246027);
                        strStringResource = StringResources_androidKt.stringResource(R.string.stripe_sign_up_terms_alternative_with_phone_number, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 2) {
                        composerStartRestartGroup.startReplaceGroup(758384349);
                        strStringResource = StringResources_androidKt.stringResource(R.string.stripe_sign_up_terms_alternative, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 3) {
                        composerStartRestartGroup.startReplaceGroup(758497065);
                        strStringResource = StringResources_androidKt.stringResource(R.string.stripe_sign_up_terms, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i6 == 4) {
                        composerStartRestartGroup.startReplaceGroup(758615547);
                        strStringResource = "<img src=\"link_logo\"> • " + StringResources_androidKt.stringResource(R.string.stripe_sign_up_terms_default_opt_in, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 5) {
                            composerStartRestartGroup.startReplaceGroup(1964120590);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(758759108);
                        strStringResource = StringResources_androidKt.stringResource(R.string.stripe_link_sign_up_terms, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.startReplaceGroup(1964142575);
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    composerStartRestartGroup.startReplaceGroup(1964143158);
                    if (type == LinkTermsType.InlineWithDefaultOptIn) {
                        if (StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())) {
                            i8 = R.drawable.stripe_link_logo_knockout_black;
                        } else {
                            i8 = R.drawable.stripe_link_logo_knockout_white;
                        }
                        mapCreateMapBuilder.put("link_logo", new EmbeddableImage.Drawable(i8, com.stripe.android.R.string.stripe_link, null, 4, null));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                    composerStartRestartGroup.endReplaceGroup();
                    MandateTextUIKt.m8662MandateJ7GKdg(replaceHyperlinks(strStringResource), companion, iM6006getCentere0LSkKk, PlaceholderVerticalAlign.INSTANCE.m5528getTextCenterJ6kI3mc(), mapBuild, composerStartRestartGroup, i4 & PointerIconCompat.TYPE_TEXT, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = companion;
                    i7 = iM6006getCentere0LSkKk;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    companion = modifier2;
                }
                iM6006getCentere0LSkKk = i5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i6 == 1) {
                }
                composerStartRestartGroup.startReplaceGroup(1964142575);
                Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                composerStartRestartGroup.startReplaceGroup(1964143158);
                if (type == LinkTermsType.InlineWithDefaultOptIn) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Map mapBuild2 = MapsKt.build(mapCreateMapBuilder2);
                composerStartRestartGroup.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(replaceHyperlinks(strStringResource), companion, iM6006getCentere0LSkKk, PlaceholderVerticalAlign.INSTANCE.m5528getTextCenterJ6kI3mc(), mapBuild2, composerStartRestartGroup, i4 & PointerIconCompat.TYPE_TEXT, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                i7 = iM6006getCentere0LSkKk;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                i7 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkTermsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkTermsKt.LinkTerms_8iNrtrE$lambda$1(type, modifier3, i7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i4 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i3 & 4) == 0) {
                    iM6006getCentere0LSkKk = i5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i6 == 1) {
                }
                composerStartRestartGroup.startReplaceGroup(1964142575);
                Map mapCreateMapBuilder22 = MapsKt.createMapBuilder();
                composerStartRestartGroup.startReplaceGroup(1964143158);
                if (type == LinkTermsType.InlineWithDefaultOptIn) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Map mapBuild22 = MapsKt.build(mapCreateMapBuilder22);
                composerStartRestartGroup.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(replaceHyperlinks(strStringResource), companion, iM6006getCentere0LSkKk, PlaceholderVerticalAlign.INSTANCE.m5528getTextCenterJ6kI3mc(), mapBuild22, composerStartRestartGroup, i4 & PointerIconCompat.TYPE_TEXT, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                i7 = iM6006getCentere0LSkKk;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String replaceHyperlinks(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "<terms>", "<a href=\"https://link.com/terms\">", false, 4, (Object) null), "</terms>", "</a>", false, 4, (Object) null), "<privacy>", "<a href=\"https://link.com/privacy\">", false, 4, (Object) null), "</privacy>", "</a>", false, 4, (Object) null), "<link>", "<a href=\"https://link.com\">", false, 4, (Object) null), "</link>", "</a>", false, 4, (Object) null);
    }

    private static final void LinkTermsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1231107741);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1231107741, i, -1, "com.stripe.android.link.ui.LinkTermsPreview (LinkTerms.kt:87)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$LinkTermsKt.INSTANCE.m7839getLambda2$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkTermsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkTermsKt.LinkTermsPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
