package com.stripe.android.link.ui;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.location.LocationRequestCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.common.ui.InlineContentTemplateBuilder;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.LinkThemeConfig;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.link.ui.wallet.BankIconKt;
import com.stripe.android.link.ui.wallet.DefaultPaymentUI;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.ui.PrimaryButtonTheme;
import com.stripe.android.uicore.StripeTheme;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LinkButton.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a5\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150 2\b\b\u0002\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\u0010#\u001a\u0015\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\tH\u0003¢\u0006\u0002\u0010+\u001a\u0011\u0010,\u001a\u00020\u0015*\u00020-H\u0003¢\u0006\u0002\u0010.\u001a\r\u0010/\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u00100\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u00101\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010\u0016\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"LinkButtonVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LinkButtonHorizontalPadding", "LinkButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getLinkButtonShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "LINK_BRAND_NAME", "", "LINK_ICON_ID", "LINK_DIVIDER_SPACER_ID", "LINK_DIVIDER_ID", "LINK_EMAIL_TEXT_WEIGHT", "", "LINK_PAY_WITH_FONT_SIZE", "", "LINK_EMAIL_FONT_SIZE", "LINK_ICON_ASPECT_RATIO", LinkButtonKt.LinkButtonTestTag, "LinkEmailButton", "", "(Landroidx/compose/runtime/Composer;I)V", "LinkNoEmailButton", "LinkEmailOnlyButton", "LinkMasterCardButton", "LinkButton", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/LinkButtonState;", ViewProps.ENABLED, "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/link/ui/LinkButtonState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentDetailsButtonContent", "paymentUI", "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;", "(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI;Landroidx/compose/runtime/Composer;I)V", "PaymentDetailsDisplay", "SignedInButtonContent", "email", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SignedOutButtonContent", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "LinkIconAndDivider", LinkButtonKt.LINK_DIVIDER_ID, "LinkButtonIcon", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkButtonKt {
    private static final String LINK_BRAND_NAME = "Link";
    private static final String LINK_DIVIDER_ID = "LinkDivider";
    private static final String LINK_DIVIDER_SPACER_ID = "LinkDividerSpacer";
    private static final int LINK_EMAIL_FONT_SIZE = 16;
    private static final float LINK_EMAIL_TEXT_WEIGHT = 0.5f;
    private static final float LINK_ICON_ASPECT_RATIO = 2.7692308f;
    private static final String LINK_ICON_ID = "LinkIcon";
    private static final int LINK_PAY_WITH_FONT_SIZE = 21;
    public static final String LinkButtonTestTag = "LinkButtonTestTag";
    private static final float LinkButtonVerticalPadding = Dp.m6117constructorimpl(10);
    private static final float LinkButtonHorizontalPadding = Dp.m6117constructorimpl(25);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkButton$lambda$4(LinkButtonState linkButtonState, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkButton(linkButtonState, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkButtonIcon$lambda$27(int i, Composer composer, int i2) {
        LinkButtonIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkDivider$lambda$26(int i, Composer composer, int i2) {
        LinkDivider(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkEmailButton$lambda$0(int i, Composer composer, int i2) {
        LinkEmailButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkEmailOnlyButton$lambda$2(int i, Composer composer, int i2) {
        LinkEmailOnlyButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkIconAndDivider$lambda$25(int i, Composer composer, int i2) {
        LinkIconAndDivider(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkMasterCardButton$lambda$3(int i, Composer composer, int i2) {
        LinkMasterCardButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkNoEmailButton$lambda$1(int i, Composer composer, int i2) {
        LinkNoEmailButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentDetailsButtonContent$lambda$6(DefaultPaymentUI defaultPaymentUI, int i, Composer composer, int i2) {
        PaymentDetailsButtonContent(defaultPaymentUI, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentDetailsDisplay$lambda$8(DefaultPaymentUI defaultPaymentUI, int i, Composer composer, int i2) {
        PaymentDetailsDisplay(defaultPaymentUI, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedInButtonContent$lambda$14(String str, int i, Composer composer, int i2) {
        SignedInButtonContent(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedOutButtonContent$lambda$19(RowScope rowScope, int i, Composer composer, int i2) {
        SignedOutButtonContent(rowScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundedCornerShape getLinkButtonShape() {
        return RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(StripeTheme.INSTANCE.getPrimaryButtonStyle().getShape().getCornerRadius()));
    }

    private static final void LinkEmailButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(126759919);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(126759919, i, -1, "com.stripe.android.link.ui.LinkEmailButton (LinkButton.kt:85)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkButtonKt.INSTANCE.m7825getLambda1$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkEmailButton$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LinkNoEmailButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155931026);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155931026, i, -1, "com.stripe.android.link.ui.LinkNoEmailButton (LinkButton.kt:97)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkButtonKt.INSTANCE.m7826getLambda2$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkNoEmailButton$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LinkEmailOnlyButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1605951675);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1605951675, i, -1, "com.stripe.android.link.ui.LinkEmailOnlyButton (LinkButton.kt:109)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkButtonKt.INSTANCE.m7827getLambda3$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkEmailOnlyButton$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LinkMasterCardButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-152048907);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-152048907, i, -1, "com.stripe.android.link.ui.LinkMasterCardButton (LinkButton.kt:121)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkButtonKt.INSTANCE.m7828getLambda4$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkMasterCardButton$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LinkButton(final LinkButtonState state, final boolean z, final Function0<Unit> onClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1951679341);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1951679341, i3, -1, "com.stripe.android.link.ui.LinkButton (LinkButton.kt:142)");
            }
            composerStartRestartGroup.startReplaceGroup(830390063);
            float disabled = z ? 1.0f : ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled)), ComposableLambdaKt.rememberComposableLambda(-1072105811, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkButtonKt.LinkButton.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1072105811, i5, -1, "com.stripe.android.link.ui.LinkButton.<anonymous> (LinkButton.kt:151)");
                        }
                        final Modifier modifier2 = modifier;
                        final Function0<Unit> function0 = onClick;
                        final boolean z2 = z;
                        final LinkButtonState linkButtonState = state;
                        ThemeKt.DefaultLinkTheme(false, ComposableLambdaKt.rememberComposableLambda(576054193, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkButtonKt.LinkButton.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(576054193, i6, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButton.kt:152)");
                                    }
                                    Modifier modifierTestTag = TestTagKt.testTag(SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, PrimaryButtonTheme.INSTANCE.getShape(composer3, 6).m8524getHeightD9Ej5fM(), 1, null), LinkButtonKt.LinkButtonTestTag);
                                    RoundedCornerShape linkButtonShape = LinkButtonKt.getLinkButtonShape();
                                    float f = 0;
                                    ButtonElevation buttonElevationM1800elevationR_JCAzs = ButtonDefaults.INSTANCE.m1800elevationR_JCAzs(Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), composer3, (ButtonDefaults.$stable << 15) | 28086, 0);
                                    ButtonColors buttonColorsM1799buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1799buttonColorsro_MJ88(LinkTheme.INSTANCE.getColors(composer3, 6).m7794getButtonBrand0d7_KjU(), 0L, LinkTheme.INSTANCE.getColors(composer3, 6).m7794getButtonBrand0d7_KjU(), 0L, composer3, ButtonDefaults.$stable << 12, 10);
                                    PaddingValues paddingValuesM1016PaddingValuesa9UjIt4 = PaddingKt.m1016PaddingValuesa9UjIt4(LinkButtonKt.LinkButtonHorizontalPadding, LinkButtonKt.LinkButtonVerticalPadding, LinkButtonKt.LinkButtonHorizontalPadding, LinkButtonKt.LinkButtonVerticalPadding);
                                    final LinkButtonState linkButtonState2 = linkButtonState;
                                    ButtonKt.Button(function0, modifierTestTag, z2, null, buttonElevationM1800elevationR_JCAzs, linkButtonShape, null, buttonColorsM1799buttonColorsro_MJ88, paddingValuesM1016PaddingValuesa9UjIt4, ComposableLambdaKt.rememberComposableLambda(-769387071, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.LinkButtonKt.LinkButton.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope Button, Composer composer4, int i7) {
                                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                            if ((i7 & 6) == 0) {
                                                i7 |= composer4.changed(Button) ? 4 : 2;
                                            }
                                            if ((i7 & 19) != 18 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-769387071, i7, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButton.kt:172)");
                                                }
                                                LinkButtonState linkButtonState3 = linkButtonState2;
                                                if (linkButtonState3 instanceof LinkButtonState.DefaultPayment) {
                                                    composer4.startReplaceGroup(205244904);
                                                    LinkButtonKt.PaymentDetailsButtonContent(((LinkButtonState.DefaultPayment) linkButtonState2).getPaymentUI(), composer4, 0);
                                                    composer4.endReplaceGroup();
                                                } else if (linkButtonState3 instanceof LinkButtonState.Email) {
                                                    composer4.startReplaceGroup(205249700);
                                                    LinkButtonKt.SignedInButtonContent(((LinkButtonState.Email) linkButtonState2).getEmail(), composer4, 0);
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    if (!Intrinsics.areEqual(linkButtonState3, LinkButtonState.Default.INSTANCE)) {
                                                        composer4.startReplaceGroup(205242846);
                                                        composer4.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer4.startReplaceGroup(205252314);
                                                    LinkButtonKt.SignedOutButtonContent(Button, composer4, i7 & 14);
                                                    composer4.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 905969664, 72);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 48, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkButton$lambda$4(state, z, onClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentDetailsButtonContent(final DefaultPaymentUI defaultPaymentUI, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1561896749);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(defaultPaymentUI) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1561896749, i2, -1, "com.stripe.android.link.ui.PaymentDetailsButtonContent (LinkButton.kt:188)");
            }
            long jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release = LinkThemeConfig.INSTANCE.m7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            long jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release, ((Number) objConsume).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            LinkIconAndDivider(composerStartRestartGroup, 0);
            PaymentDetailsDisplay(defaultPaymentUI, composerStartRestartGroup, i2 & 14);
            SpacerKt.Spacer(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(4)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(defaultPaymentUI.getLast4(), rowScopeInstance.weight(Modifier.INSTANCE, 0.5f, false), jM3656copywmQWz5c$default, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composer2, 3072, 3120, 55280);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.PaymentDetailsButtonContent$lambda$6(defaultPaymentUI, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PaymentDetailsDisplay(final DefaultPaymentUI defaultPaymentUI, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1692861304);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(defaultPaymentUI) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692861304, i2, -1, "com.stripe.android.link.ui.PaymentDetailsDisplay (LinkButton.kt:214)");
            }
            Modifier modifierM1065size3ABfNKs = SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1065size3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            DefaultPaymentUI.PaymentType paymentType = defaultPaymentUI.getPaymentType();
            if (paymentType instanceof DefaultPaymentUI.PaymentType.Card) {
                composerStartRestartGroup.startReplaceGroup(1001953337);
                ImageKt.Image(PainterResources_androidKt.painterResource(((DefaultPaymentUI.PaymentType.Card) defaultPaymentUI.getPaymentType()).getIconRes(), composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, LocationRequestCompat.QUALITY_LOW_POWER);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(paymentType instanceof DefaultPaymentUI.PaymentType.BankAccount)) {
                    composerStartRestartGroup.startReplaceGroup(1001950923);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1001962693);
                BankIconKt.BankIcon(((DefaultPaymentUI.PaymentType.BankAccount) defaultPaymentUI.getPaymentType()).getBankIconCode(), null, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.PaymentDetailsDisplay$lambda$8(defaultPaymentUI, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignedInButtonContent(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-61511536);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61511536, i2, -1, "com.stripe.android.link.ui.SignedInButtonContent (LinkButton.kt:231)");
            }
            composerStartRestartGroup.startReplaceGroup(-196530137);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(str);
                objRememberedValue = builder.toAnnotatedString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnnotatedString annotatedString = (AnnotatedString) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            long jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release = LinkThemeConfig.INSTANCE.m7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            long jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release, ((Number) objConsume).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            ResolvableString resolvableStringResolvableString$default = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_pay_with_link, new Object[0], null, 4, null);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final String strResolve = resolvableStringResolvableString$default.resolve((Context) objConsume2);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-196517778);
            boolean zChanged = composerStartRestartGroup.changed(strResolve);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkButtonKt.SignedInButtonContent$lambda$12$lambda$11(strResolve, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            LinkIconAndDivider(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2077TextIbK3jfQ(annotatedString, rowScopeInstance.weight(Modifier.INSTANCE, 0.5f, false), jM3656copywmQWz5c$default, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, null, null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composer2, 3072, 3120, 120816);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.SignedInButtonContent$lambda$14(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedInButtonContent$lambda$12$lambda$11(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SignedOutButtonContent(final RowScope rowScope, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1138308412);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1138308412, i, -1, "com.stripe.android.link.ui.SignedOutButtonContent (LinkButton.kt:263)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_pay_with_link, composerStartRestartGroup, 0);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringsKt.substringBefore$default(strStringResource, LINK_BRAND_NAME, (String) null, 2, (Object) null));
            InlineTextContentKt.appendInlineContent(builder, LINK_ICON_ID, "[icon]");
            builder.append(StringsKt.substringAfter$default(strStringResource, LINK_BRAND_NAME, (String) null, 2, (Object) null));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            int iM6006getCentere0LSkKk = TextAlign.INSTANCE.m6006getCentere0LSkKk();
            InlineContentTemplateBuilder inlineContentTemplateBuilder = new InlineContentTemplateBuilder();
            InlineContentTemplateBuilder.m7219addQI4CevY$default(inlineContentTemplateBuilder, LINK_ICON_ID, TextUnitKt.getEm(2.6d), TextUnitKt.getEm(0.9d), 0, ComposableSingletons$LinkButtonKt.INSTANCE.m7829getLambda5$paymentsheet_release(), 8, null);
            Map<String, InlineTextContent> mapBuild = inlineContentTemplateBuilder.build();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-106775092);
            boolean zChanged = composerStartRestartGroup.changed(strStringResource);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkButtonKt.SignedOutButtonContent$lambda$18$lambda$17(strStringResource, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue, 1, null);
            long jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release = LinkThemeConfig.INSTANCE.m7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            TextKt.m2077TextIbK3jfQ(annotatedString, modifierSemantics$default, Color.m3656copywmQWz5c$default(jM7814getContentOnPrimaryButtonvNxB06k$paymentsheet_release, ((Number) objConsume).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(21), null, null, null, 0L, null, TextAlign.m5999boximpl(iM6006getCentere0LSkKk), 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, mapBuild, null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composer2, 3072, 3120, 87536);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.SignedOutButtonContent$lambda$19(rowScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedOutButtonContent$lambda$18$lambda$17(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    private static final void LinkIconAndDivider(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(628395052);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628395052, i, -1, "com.stripe.android.link.ui.LinkIconAndDivider (LinkButton.kt:297)");
            }
            composerStartRestartGroup.startReplaceGroup(-1036521759);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                InlineTextContentKt.appendInlineContent(builder, LINK_ICON_ID, "[icon]");
                InlineTextContentKt.appendInlineContent(builder, LINK_DIVIDER_SPACER_ID, "[divider_spacer]");
                InlineTextContentKt.appendInlineContent(builder, LINK_DIVIDER_ID, "[divider]");
                InlineTextContentKt.appendInlineContent(builder, LINK_DIVIDER_SPACER_ID, "[divider_spacer]");
                objRememberedValue = builder.toAnnotatedString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnnotatedString annotatedString = (AnnotatedString) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            long sp = TextUnitKt.getSp(16);
            TextStyle bodyEmphasized = LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized();
            int iM6056getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8();
            InlineContentTemplateBuilder inlineContentTemplateBuilder = new InlineContentTemplateBuilder();
            InlineContentTemplateBuilder.m7219addQI4CevY$default(inlineContentTemplateBuilder, LINK_ICON_ID, TextUnitKt.getEm(3), TextUnitKt.getEm(1.1d), 0, ComposableSingletons$LinkButtonKt.INSTANCE.m7830getLambda6$paymentsheet_release(), 8, null);
            InlineContentTemplateBuilder.m7219addQI4CevY$default(inlineContentTemplateBuilder, LINK_DIVIDER_ID, TextUnitKt.getEm(0.1d), TextUnitKt.getEm(1.3d), 0, ComposableSingletons$LinkButtonKt.INSTANCE.m7831getLambda7$paymentsheet_release(), 8, null);
            InlineContentTemplateBuilder.m7220addSpacernttgDAE$default(inlineContentTemplateBuilder, LINK_DIVIDER_SPACER_ID, TextUnitKt.getEm(0.5d), 0, 4, null);
            Map<String, InlineTextContent> mapBuild = inlineContentTemplateBuilder.build();
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1036484856);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkButtonKt.LinkIconAndDivider$lambda$24$lambda$23((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m2077TextIbK3jfQ(annotatedString, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue2, 1, null), 0L, sp, null, null, null, 0L, null, null, 0L, iM6056getEllipsisgIe3tQ8, false, 1, 0, mapBuild, null, bodyEmphasized, composer2, 3078, 3120, 88052);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkIconAndDivider$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkIconAndDivider$lambda$24$lambda$23(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.invisibleToUser(semantics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkDivider(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(414444570);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414444570, i, -1, "com.stripe.android.link.ui.LinkDivider (LinkButton.kt:335)");
            }
            DividerKt.m1877DivideroMI9zvI(SizeKt.fillMaxHeight$default(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(1)), 0.0f, 1, null), LinkThemeConfig.INSTANCE.m7815getSeparatorOnPrimaryButtonvNxB06k$paymentsheet_release(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6)), 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkDivider$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkButtonIcon(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1379399772);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379399772, i, -1, "com.stripe.android.link.ui.LinkButtonIcon (LinkButton.kt:345)");
            }
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, LINK_ICON_ASPECT_RATIO, false, 2, null);
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LinkIconKt.m7857LinkIconiJQMabo(AlphaKt.alpha(modifierAspectRatio$default, ((Number) objConsume).floatValue()), 0L, composerStartRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.LinkButtonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkButtonKt.LinkButtonIcon$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
