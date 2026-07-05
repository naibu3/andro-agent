package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.BadgeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.IconStyle;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedPaymentMethodTab.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a±\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130%H\u0001¢\u0006\u0004\b(\u0010)\u001a9\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010+\u001a3\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0004\b-\u0010.\u001a-\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130%2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u00101\u001a\r\u00102\u001a\u00020\u0013H\u0003¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0013H\u0003¢\u0006\u0002\u00103\u001a\r\u00105\u001a\u00020\u0013H\u0003¢\u0006\u0002\u00103\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0016\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u00066"}, d2 = {SavedPaymentMethodTabKt.SAVED_PAYMENT_METHOD_CARD_TEST_TAG, "", "getSAVED_PAYMENT_METHOD_CARD_TEST_TAG$annotations", "()V", "TEST_TAG_MODIFY_BADGE", "EDIT_ICON_SCALE", "", "editIconColorLight", "Landroidx/compose/ui/graphics/Color;", "J", "editIconColorDark", "editIconBackgroundColorLight", "editIconBackgroundColorDark", "SavedPaymentMethodsTopContentPadding", "Landroidx/compose/ui/unit/Dp;", "getSavedPaymentMethodsTopContentPadding", "()F", "F", "SavedPaymentMethodTab", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewWidth", "isSelected", "", "shouldShowModifyBadge", "shouldShowDefaultBadge", "isEnabled", "isClickable", "iconRes", "", "iconTint", "labelIcon", "shouldTintLabelIcon", "labelText", "description", "onModifyListener", "Lkotlin/Function0;", "onModifyAccessibilityDescription", "onItemSelectedListener", "SavedPaymentMethodTab-RYabdnw", "(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "SavedPaymentMethodBadge", "(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "SavedPaymentMethodCard", "SavedPaymentMethodCard-drOMvmE", "(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ModifyBadge", "onPressed", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SavedPaymentMethodTabUISelected", "(Landroidx/compose/runtime/Composer;I)V", "SavedPaymentMethodTabUIModifiable", "DefaultSavedPaymentMethodTabUIModifiable", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedPaymentMethodTabKt {
    private static final float EDIT_ICON_SCALE = 0.9f;
    public static final String SAVED_PAYMENT_METHOD_CARD_TEST_TAG = "SAVED_PAYMENT_METHOD_CARD_TEST_TAG";
    public static final String TEST_TAG_MODIFY_BADGE = "modify_badge";
    private static final long editIconColorLight = ColorKt.Color(2566914048L);
    private static final long editIconColorDark = Color.INSTANCE.m3694getWhite0d7_KjU();
    private static final long editIconBackgroundColorLight = ColorKt.Color(4293256682L);
    private static final long editIconBackgroundColorDark = ColorKt.Color(4283585106L);
    private static final float SavedPaymentMethodsTopContentPadding = Dp.m6117constructorimpl(12);

    /* compiled from: SavedPaymentMethodTab.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconStyle.values().length];
            try {
                iArr[IconStyle.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconStyle.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultSavedPaymentMethodTabUIModifiable$lambda$8(int i, Composer composer, int i2) {
        DefaultSavedPaymentMethodTabUIModifiable(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModifyBadge$lambda$5(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ModifyBadge(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodBadge$lambda$3(boolean z, boolean z2, Function0 function0, String str, int i, int i2, Composer composer, int i3) {
        SavedPaymentMethodBadge(z, z2, function0, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodCard_drOMvmE$lambda$4(boolean z, int i, Color color, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m8534SavedPaymentMethodCarddrOMvmE(z, i, color, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabUIModifiable$lambda$7(int i, Composer composer, int i2) {
        SavedPaymentMethodTabUIModifiable(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTabUISelected$lambda$6(int i, Composer composer, int i2) {
        SavedPaymentMethodTabUISelected(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodTab_RYabdnw$lambda$0(Modifier modifier, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Color color, Integer num, boolean z6, String str, String str2, Function0 function0, String str3, Function0 function02, int i2, int i3, int i4, Composer composer, int i5) {
        m8535SavedPaymentMethodTabRYabdnw(modifier, f, z, z2, z3, z4, z5, i, color, num, z6, str, str2, function0, str3, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSAVED_PAYMENT_METHOD_CARD_TEST_TAG$annotations() {
    }

    public static final float getSavedPaymentMethodsTopContentPadding() {
        return SavedPaymentMethodsTopContentPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /* renamed from: SavedPaymentMethodTab-RYabdnw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8535SavedPaymentMethodTabRYabdnw(Modifier modifier, final float f, final boolean z, final boolean z2, final boolean z3, final boolean z4, boolean z5, final int i, Color color, Integer num, boolean z6, String str, final String description, Function0<Unit> function0, String str2, final Function0<Unit> onItemSelectedListener, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        boolean z7;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final Function0<Unit> function02;
        Modifier modifier3;
        Color color2;
        int i19;
        Integer num2;
        boolean z8;
        String str3;
        final String str4;
        Composer composer2;
        final boolean z9;
        final Color color3;
        final Integer num3;
        final Function0<Unit> function03;
        final String str5;
        final boolean z10;
        final Modifier modifier4;
        final String str6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1381105515);
        int i20 = i4 & 1;
        if (i20 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else {
            if ((i2 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
            }
            if ((i2 & 1572864) != 0) {
                z7 = z5;
                i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(z7)) ? 1048576 : 524288;
            } else {
                z7 = z5;
            }
            if ((i4 & 128) == 0) {
                i5 |= 12582912;
            } else {
                if ((12582912 & i2) == 0) {
                    i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                }
                i6 = i4 & 256;
                if (i6 != 0) {
                    i5 |= 100663296;
                } else {
                    if ((i2 & 100663296) == 0) {
                        i7 = i6;
                        i5 |= composerStartRestartGroup.changed(color) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i4 & 512;
                    if (i8 == 0) {
                        i5 |= 805306368;
                    } else {
                        if ((i2 & 805306368) == 0) {
                            i9 = i8;
                            i5 |= composerStartRestartGroup.changed(num) ? 536870912 : 268435456;
                        }
                        i10 = i4 & 1024;
                        if (i10 != 0) {
                            i12 = i3 | 6;
                            i11 = i10;
                        } else if ((i3 & 6) == 0) {
                            i11 = i10;
                            i12 = i3 | (composerStartRestartGroup.changed(z6) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i3;
                        }
                        i13 = i4 & 2048;
                        if (i13 != 0) {
                            i12 |= 48;
                            i14 = i13;
                        } else if ((i3 & 48) == 0) {
                            i14 = i13;
                            i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
                        } else {
                            i14 = i13;
                        }
                        int i21 = i12;
                        if ((i4 & 4096) != 0) {
                            i21 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                            i21 |= composerStartRestartGroup.changed(description) ? 256 : 128;
                        }
                        i15 = i4 & 8192;
                        if (i15 != 0) {
                            i16 = i21 | 3072;
                        } else {
                            int i22 = i21;
                            if ((i3 & 3072) == 0) {
                                i16 = i22 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
                            } else {
                                i16 = i22;
                            }
                        }
                        i17 = i4 & 16384;
                        if (i17 == 0) {
                            i18 = i16;
                            if ((i3 & 24576) == 0) {
                                i18 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                            }
                            if ((i4 & 32768) == 0) {
                                i18 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i18 |= composerStartRestartGroup.changedInstance(onItemSelectedListener) ? 131072 : 65536;
                            }
                            int i23 = i18;
                            if ((i5 & 306783379) == 306783378 || (74899 & i23) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i20 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                        z7 = z4;
                                    }
                                    Color color4 = i7 == 0 ? null : color;
                                    Integer num4 = i9 == 0 ? null : num;
                                    boolean z11 = i11 == 0 ? true : z6;
                                    String str7 = i14 == 0 ? "" : str;
                                    function02 = i15 == 0 ? function0 : null;
                                    if (i17 == 0) {
                                        modifier3 = companion;
                                        color2 = color4;
                                        i19 = i5;
                                        str4 = "";
                                        num2 = num4;
                                        z8 = z11;
                                        str3 = str7;
                                        composerStartRestartGroup.endDefaults();
                                        String str8 = str3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1381105515, i19, i23, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTab.kt:85)");
                                        }
                                        Modifier modifierAlpha = AlphaKt.alpha(SizeKt.m1062requiredWidth3ABfNKs(PaddingKt.m1024paddingqDBjuR0$default(modifier3, 0.0f, SavedPaymentMethodsTopContentPadding, 0.0f, 0.0f, 13, null), f), !z4 ? 1.0f : 0.6f);
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(396151053, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodTab$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num5) {
                                                invoke(boxScope, composer3, num5.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(BoxScope BadgedBox, Composer composer3, int i24) {
                                                Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                                                if ((i24 & 17) != 16 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(396151053, i24, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:88)");
                                                    }
                                                    SavedPaymentMethodTabKt.SavedPaymentMethodBadge(z, z2, function02, str4, composer3, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54);
                                        Function0<Unit> function04 = function02;
                                        String str9 = str4;
                                        composer2 = composerStartRestartGroup;
                                        boolean z12 = z7;
                                        SavedPaymentMethodTabKt$SavedPaymentMethodTab$2 savedPaymentMethodTabKt$SavedPaymentMethodTab$2 = new SavedPaymentMethodTabKt$SavedPaymentMethodTab$2(str8, z, z12, onItemSelectedListener, i, color2, description, num2, z4, z8, z3);
                                        Color color5 = color2;
                                        boolean z13 = z8;
                                        Integer num5 = num2;
                                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda, modifierAlpha, ComposableLambdaKt.rememberComposableLambda(427788175, true, savedPaymentMethodTabKt$SavedPaymentMethodTab$2, composer2, 54), composer2, 390, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z9 = z12;
                                        color3 = color5;
                                        num3 = num5;
                                        function03 = function04;
                                        str5 = str9;
                                        z10 = z13;
                                        modifier4 = modifier3;
                                        str6 = str8;
                                    } else {
                                        modifier3 = companion;
                                        color2 = color4;
                                        i19 = i5;
                                        num2 = num4;
                                        z8 = z11;
                                        str3 = str7;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    color2 = color;
                                    z8 = z6;
                                    str3 = str;
                                    function02 = function0;
                                    modifier3 = modifier2;
                                    i19 = i5;
                                    num2 = num;
                                }
                                str4 = str2;
                                composerStartRestartGroup.endDefaults();
                                String str82 = str3;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifierAlpha2 = AlphaKt.alpha(SizeKt.m1062requiredWidth3ABfNKs(PaddingKt.m1024paddingqDBjuR0$default(modifier3, 0.0f, SavedPaymentMethodsTopContentPadding, 0.0f, 0.0f, 13, null), f), !z4 ? 1.0f : 0.6f);
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(396151053, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodTab$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num52) {
                                        invoke(boxScope, composer3, num52.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BadgedBox, Composer composer3, int i24) {
                                        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
                                        if ((i24 & 17) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(396151053, i24, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab.<anonymous> (SavedPaymentMethodTab.kt:88)");
                                            }
                                            SavedPaymentMethodTabKt.SavedPaymentMethodBadge(z, z2, function02, str4, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                Function0<Unit> function042 = function02;
                                String str92 = str4;
                                composer2 = composerStartRestartGroup;
                                boolean z122 = z7;
                                SavedPaymentMethodTabKt$SavedPaymentMethodTab$2 savedPaymentMethodTabKt$SavedPaymentMethodTab$22 = new SavedPaymentMethodTabKt$SavedPaymentMethodTab$2(str82, z, z122, onItemSelectedListener, i, color2, description, num2, z4, z8, z3);
                                Color color52 = color2;
                                boolean z132 = z8;
                                Integer num52 = num2;
                                BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, modifierAlpha2, ComposableLambdaKt.rememberComposableLambda(427788175, true, savedPaymentMethodTabKt$SavedPaymentMethodTab$22, composer2, 54), composer2, 390, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z9 = z122;
                                color3 = color52;
                                num3 = num52;
                                function03 = function042;
                                str5 = str92;
                                z10 = z132;
                                modifier4 = modifier3;
                                str6 = str82;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                color3 = color;
                                str6 = str;
                                function03 = function0;
                                str5 = str2;
                                composer2 = composerStartRestartGroup;
                                z9 = z7;
                                modifier4 = modifier2;
                                num3 = num;
                                z10 = z6;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return SavedPaymentMethodTabKt.SavedPaymentMethodTab_RYabdnw$lambda$0(modifier4, f, z, z2, z3, z4, z9, i, color3, num3, z10, str6, description, function03, str5, onItemSelectedListener, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i18 = i16 | 24576;
                        if ((i4 & 32768) == 0) {
                        }
                        int i232 = i18;
                        if ((i5 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i20 == 0) {
                                }
                                if ((i4 & 64) != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i4 & 1024;
                    if (i10 != 0) {
                    }
                    i13 = i4 & 2048;
                    if (i13 != 0) {
                    }
                    int i212 = i12;
                    if ((i4 & 4096) != 0) {
                    }
                    i15 = i4 & 8192;
                    if (i15 != 0) {
                    }
                    i17 = i4 & 16384;
                    if (i17 == 0) {
                    }
                    if ((i4 & 32768) == 0) {
                    }
                    int i2322 = i18;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i6;
                i8 = i4 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i4 & 1024;
                if (i10 != 0) {
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                }
                int i2122 = i12;
                if ((i4 & 4096) != 0) {
                }
                i15 = i4 & 8192;
                if (i15 != 0) {
                }
                i17 = i4 & 16384;
                if (i17 == 0) {
                }
                if ((i4 & 32768) == 0) {
                }
                int i23222 = i18;
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i4 & 256;
            if (i6 != 0) {
            }
            i7 = i6;
            i8 = i4 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i21222 = i12;
            if ((i4 & 4096) != 0) {
            }
            i15 = i4 & 8192;
            if (i15 != 0) {
            }
            i17 = i4 & 16384;
            if (i17 == 0) {
            }
            if ((i4 & 32768) == 0) {
            }
            int i232222 = i18;
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if ((i4 & 128) == 0) {
        }
        i6 = i4 & 256;
        if (i6 != 0) {
        }
        i7 = i6;
        i8 = i4 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i212222 = i12;
        if ((i4 & 4096) != 0) {
        }
        i15 = i4 & 8192;
        if (i15 != 0) {
        }
        i17 = i4 & 16384;
        if (i17 == 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        int i2322222 = i18;
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavedPaymentMethodBadge(final boolean z, final boolean z2, final Function0<Unit> function0, String str, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-472339459);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function0 = null;
            }
            String str3 = i5 != 0 ? "" : str;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-472339459, i3, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodBadge (SavedPaymentMethodTab.kt:153)");
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(6331196);
                composerStartRestartGroup.startReplaceGroup(2078418089);
                boolean z3 = (i3 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedPaymentMethodTabKt.SavedPaymentMethodBadge$lambda$2$lambda$1(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ModifyBadge(str3, (Function0) objRememberedValue, FocusableKt.focusable$default(OffsetKt.m980offsetVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(-14), Dp.m6117constructorimpl(1)), false, null, 3, null), composerStartRestartGroup, ((i3 >> 9) & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z) {
                composerStartRestartGroup.startReplaceGroup(6597486);
                SelectedBadgeKt.SelectedBadge(OffsetKt.m980offsetVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(-18), Dp.m6117constructorimpl(58)), composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(6698391);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str2 = str3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabKt.SavedPaymentMethodBadge$lambda$3(z, z2, function02, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodBadge$lambda$2$lambda$1(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: SavedPaymentMethodCard-drOMvmE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8534SavedPaymentMethodCarddrOMvmE(final boolean z, final int i, final Color color, Modifier modifier, Composer composer, final int i2, final int i3) {
        boolean z2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1151648376);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z2 = z;
        } else if ((i2 & 6) == 0) {
            z2 = z;
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(color) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1151648376, i4, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard (SavedPaymentMethodTab.kt:173)");
                }
                Modifier modifier4 = companion;
                SectionUIKt.m8829SectionCardfWhpE4E(SizeKt.fillMaxWidth$default(PaddingKt.m1022paddingVpY3zN4$default(SizeKt.m1051height3ABfNKs(companion, Dp.m6117constructorimpl(64)), Dp.m6117constructorimpl(6), 0.0f, 2, null), 0.0f, 1, null), null, z2, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1156966771, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodCard$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1156966771, i6, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard.<anonymous> (SavedPaymentMethodTab.kt:181)");
                            }
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            ColorFilter colorFilterM3698tintxETnrds$default = null;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            int i7 = i;
                            Color color2 = color;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(i7, composer2, 0);
                            if (color2 != null) {
                                colorFilterM3698tintxETnrds$default = ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, color2.m3667unboximpl(), 0, 2, null);
                            }
                            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(40)), Dp.m6117constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM3698tintxETnrds$default, composer2, 432, 56);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 6) & 896) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SavedPaymentMethodTabKt.SavedPaymentMethodCard_drOMvmE$lambda$4(z, i, color, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier42 = companion;
            SectionUIKt.m8829SectionCardfWhpE4E(SizeKt.fillMaxWidth$default(PaddingKt.m1022paddingVpY3zN4$default(SizeKt.m1051height3ABfNKs(companion, Dp.m6117constructorimpl(64)), Dp.m6117constructorimpl(6), 0.0f, 2, null), 0.0f, 1, null), null, z2, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1156966771, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$SavedPaymentMethodCard$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1156966771, i6, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard.<anonymous> (SavedPaymentMethodTab.kt:181)");
                        }
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ColorFilter colorFilterM3698tintxETnrds$default = null;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        int i7 = i;
                        Color color2 = color;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(i7, composer2, 0);
                        if (color2 != null) {
                            colorFilterM3698tintxETnrds$default = ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, color2.m3667unboximpl(), 0, 2, null);
                        }
                        ImageKt.Image(painterPainterResource, (String) null, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(40)), Dp.m6117constructorimpl(56)), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM3698tintxETnrds$default, composer2, 432, 56);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 6) & 896) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ModifyBadge(final String str, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        boolean zM8745shouldUseDarkDynamicColor8_81llA;
        long j;
        long j2;
        int i5;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1366455638);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1366455638, i3, -1, "com.stripe.android.paymentsheet.ui.ModifyBadge (SavedPaymentMethodTab.kt:204)");
                    }
                    zM8745shouldUseDarkDynamicColor8_81llA = StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1826getBackground0d7_KjU());
                    if (!zM8745shouldUseDarkDynamicColor8_81llA) {
                        j = editIconBackgroundColorLight;
                    } else {
                        j = editIconBackgroundColorDark;
                    }
                    long j3 = j;
                    if (!zM8745shouldUseDarkDynamicColor8_81llA) {
                        j2 = editIconColorLight;
                    } else {
                        j2 = editIconColorDark;
                    }
                    long j4 = j2;
                    ProvidableCompositionLocal<IconStyle> localIconStyle = StripeThemeKt.getLocalIconStyle();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localIconStyle);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    i5 = WhenMappings.$EnumSwitchMapping$0[((IconStyle) objConsume).ordinal()];
                    if (i5 != 1) {
                        i6 = R.drawable.stripe_ic_edit_symbol;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i6 = R.drawable.stripe_ic_edit_outlined_symbol;
                    }
                    Modifier modifier4 = companion;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i6, composerStartRestartGroup, 0), str2, TestTagKt.testTag(ClickableKt.m608clickableXHw0xAI$default(BackgroundKt.m575backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1065size3ABfNKs(companion, Dp.m6117constructorimpl(20)), RoundedCornerShapeKt.getCircleShape()), j3, null, 2, null), false, null, null, function02, 7, null), TEST_TAG_MODIFY_BADGE), (Alignment) null, new FixedScale(EDIT_ICON_SCALE), 0.0f, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, j4, 0, 2, null), composerStartRestartGroup, ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24576, 40);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SavedPaymentMethodTabKt.ModifyBadge$lambda$5(str, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            modifier2 = modifier;
            if ((i3 & 147) != 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                zM8745shouldUseDarkDynamicColor8_81llA = StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1826getBackground0d7_KjU());
                if (!zM8745shouldUseDarkDynamicColor8_81llA) {
                }
                long j32 = j;
                if (!zM8745shouldUseDarkDynamicColor8_81llA) {
                }
                long j42 = j2;
                ProvidableCompositionLocal<IconStyle> localIconStyle2 = StripeThemeKt.getLocalIconStyle();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localIconStyle2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i5 = WhenMappings.$EnumSwitchMapping$0[((IconStyle) objConsume2).ordinal()];
                if (i5 != 1) {
                }
                Modifier modifier42 = companion;
                ImageKt.Image(PainterResources_androidKt.painterResource(i6, composerStartRestartGroup, 0), str2, TestTagKt.testTag(ClickableKt.m608clickableXHw0xAI$default(BackgroundKt.m575backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1065size3ABfNKs(companion, Dp.m6117constructorimpl(20)), RoundedCornerShapeKt.getCircleShape()), j32, null, 2, null), false, null, null, function02, 7, null), TEST_TAG_MODIFY_BADGE), (Alignment) null, new FixedScale(EDIT_ICON_SCALE), 0.0f, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, j42, 0, 2, null), composerStartRestartGroup, ((i3 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 24576, 40);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void SavedPaymentMethodTabUISelected(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(976182575);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(976182575, i, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabUISelected (SavedPaymentMethodTab.kt:241)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$SavedPaymentMethodTabKt.INSTANCE.m8440getLambda1$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabKt.SavedPaymentMethodTabUISelected$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SavedPaymentMethodTabUIModifiable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-655041050);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655041050, i, -1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabUIModifiable (SavedPaymentMethodTab.kt:259)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$SavedPaymentMethodTabKt.INSTANCE.m8441getLambda2$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabKt.SavedPaymentMethodTabUIModifiable$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DefaultSavedPaymentMethodTabUIModifiable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(803336107);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(803336107, i, -1, "com.stripe.android.paymentsheet.ui.DefaultSavedPaymentMethodTabUIModifiable (SavedPaymentMethodTab.kt:277)");
            }
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableSingletons$SavedPaymentMethodTabKt.INSTANCE.m8442getLambda3$paymentsheet_release(), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodTabKt.DefaultSavedPaymentMethodTabUIModifiable$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
