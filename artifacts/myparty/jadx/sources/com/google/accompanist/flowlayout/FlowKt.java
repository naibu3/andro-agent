package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001as\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\b\u0002\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001as\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\b\u0002\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\b\u0002\u0010\u0010\u001a\u00060\tj\u0002`\n2\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018*\u001a\b\u0007\u0010\u001b\"\u00020\t2\u00020\tB\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Flow", "", "modifier", "Landroidx/compose/ui/Modifier;", "orientation", "Lcom/google/accompanist/flowlayout/LayoutOrientation;", "mainAxisSize", "Lcom/google/accompanist/flowlayout/SizeMode;", "mainAxisAlignment", "Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "Lcom/google/accompanist/flowlayout/FlowMainAxisAlignment;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;", "crossAxisSpacing", "lastLineMainAxisAlignment", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Flow-F4y8cZ0", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/LayoutOrientation;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FlowColumn", "FlowColumn-07r0xoM", "(Landroidx/compose/ui/Modifier;Lcom/google/accompanist/flowlayout/SizeMode;Lcom/google/accompanist/flowlayout/MainAxisAlignment;FLcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;FLcom/google/accompanist/flowlayout/MainAxisAlignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "FlowRow-07r0xoM", "FlowMainAxisAlignment", "Lkotlin/Deprecated;", "message", "\naccompanist/FlowMainAxisAlignment is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n", "flowlayout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlowKt {
    @Deprecated(message = "\naccompanist/FlowMainAxisAlignment is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n")
    public static /* synthetic */ void FlowMainAxisAlignment$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    @Deprecated(message = "\naccompanist/FlowRow is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n", replaceWith = @ReplaceWith(expression = "FlowRow", imports = {"androidx.compose.foundation.layout.FlowRow", "androidx.compose.ui.Modifier"}))
    /* renamed from: FlowRow-07r0xoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6990FlowRow07r0xoM(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        SizeMode sizeMode2;
        int i4;
        final MainAxisAlignment mainAxisAlignment3;
        int i5;
        float fM6117constructorimpl;
        int i6;
        int i7;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        int i8;
        Modifier.Companion companion;
        final float f3;
        int i9;
        final SizeMode sizeMode3;
        final MainAxisAlignment mainAxisAlignment4;
        final float f4;
        final FlowCrossAxisAlignment flowCrossAxisAlignment3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-137566119);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                sizeMode2 = sizeMode;
                i3 |= composerStartRestartGroup.changed(sizeMode2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    mainAxisAlignment3 = mainAxisAlignment;
                    i3 |= composerStartRestartGroup.changed(mainAxisAlignment3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        fM6117constructorimpl = f;
                        i3 |= composerStartRestartGroup.changed(fM6117constructorimpl) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                        i7 = 57344;
                        flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                    } else {
                        i7 = 57344;
                        flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                        if ((i & 57344) == 0) {
                            i3 |= composerStartRestartGroup.changed(flowCrossAxisAlignment2) ? 16384 : 8192;
                        }
                    }
                    i8 = i2 & 32;
                    if (i8 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(mainAxisAlignment2)) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        i10 = (i & 29360128) == 0 ? composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    sizeMode2 = SizeMode.Wrap;
                                }
                                if (i4 != 0) {
                                    mainAxisAlignment3 = MainAxisAlignment.Start;
                                }
                                if (i5 != 0) {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                }
                                if (i6 != 0) {
                                    flowCrossAxisAlignment2 = FlowCrossAxisAlignment.Start;
                                }
                                float fM6117constructorimpl2 = i8 == 0 ? Dp.m6117constructorimpl(0) : f2;
                                if ((i2 & 64) == 0) {
                                    f3 = fM6117constructorimpl2;
                                    i9 = i3 & (-3670017);
                                    sizeMode3 = sizeMode2;
                                    mainAxisAlignment4 = mainAxisAlignment3;
                                    f4 = fM6117constructorimpl;
                                    flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-137566119, i9, -1, "com.google.accompanist.flowlayout.FlowRow (Flow.kt:68)");
                                    }
                                    int i13 = i9;
                                    int i14 = (i13 & 14) | 48;
                                    int i15 = i13 << 3;
                                    m6988FlowF4y8cZ0(companion, LayoutOrientation.Horizontal, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composerStartRestartGroup, (i15 & 234881024) | i14 | (i15 & 896) | (i15 & 7168) | (i15 & i7) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = companion;
                                } else {
                                    f3 = fM6117constructorimpl2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                f3 = f2;
                                companion = modifier2;
                            }
                            i9 = i3;
                            sizeMode3 = sizeMode2;
                            mainAxisAlignment4 = mainAxisAlignment3;
                            f4 = fM6117constructorimpl;
                            flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                            mainAxisAlignment3 = mainAxisAlignment2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i132 = i9;
                            int i142 = (i132 & 14) | 48;
                            int i152 = i132 << 3;
                            m6988FlowF4y8cZ0(companion, LayoutOrientation.Horizontal, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composerStartRestartGroup, (i152 & 234881024) | i142 | (i152 & 896) | (i152 & 7168) | (i152 & i7) | (i152 & 458752) | (i152 & 3670016) | (i152 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = companion;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            sizeMode3 = sizeMode2;
                            mainAxisAlignment4 = mainAxisAlignment3;
                            f4 = fM6117constructorimpl;
                            flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                            mainAxisAlignment3 = mainAxisAlignment2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.flowlayout.FlowKt$FlowRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    FlowKt.m6990FlowRow07r0xoM(modifier3, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i10;
                    if ((23967451 & i3) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fM6117constructorimpl = f;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i8 = i2 & 32;
                if (i8 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i10;
                if ((23967451 & i3) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            mainAxisAlignment3 = mainAxisAlignment;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            fM6117constructorimpl = f;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i8 = i2 & 32;
            if (i8 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i10;
            if ((23967451 & i3) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        sizeMode2 = sizeMode;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mainAxisAlignment3 = mainAxisAlignment;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        fM6117constructorimpl = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i10;
        if ((23967451 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011f  */
    @Deprecated(message = "\naccompanist/FlowColumn is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n", replaceWith = @ReplaceWith(expression = "FlowColumn", imports = {"androidx.compose.foundation.layout.FlowColumn", "androidx.compose.ui.Modifier"}))
    /* renamed from: FlowColumn-07r0xoM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6989FlowColumn07r0xoM(Modifier modifier, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        SizeMode sizeMode2;
        int i4;
        final MainAxisAlignment mainAxisAlignment3;
        int i5;
        float fM6117constructorimpl;
        int i6;
        int i7;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        int i8;
        Modifier.Companion companion;
        final float f3;
        int i9;
        final SizeMode sizeMode3;
        final MainAxisAlignment mainAxisAlignment4;
        final float f4;
        final FlowCrossAxisAlignment flowCrossAxisAlignment3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(203669733);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                sizeMode2 = sizeMode;
                i3 |= composerStartRestartGroup.changed(sizeMode2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & 896) == 0) {
                    mainAxisAlignment3 = mainAxisAlignment;
                    i3 |= composerStartRestartGroup.changed(mainAxisAlignment3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        fM6117constructorimpl = f;
                        i3 |= composerStartRestartGroup.changed(fM6117constructorimpl) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                        i7 = 57344;
                        flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                    } else {
                        i7 = 57344;
                        flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                        if ((i & 57344) == 0) {
                            i3 |= composerStartRestartGroup.changed(flowCrossAxisAlignment2) ? 16384 : 8192;
                        }
                    }
                    i8 = i2 & 32;
                    if (i8 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(mainAxisAlignment2)) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) != 0) {
                        i10 = (i & 29360128) == 0 ? composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i12 != 0) {
                                    sizeMode2 = SizeMode.Wrap;
                                }
                                if (i4 != 0) {
                                    mainAxisAlignment3 = MainAxisAlignment.Start;
                                }
                                if (i5 != 0) {
                                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                }
                                if (i6 != 0) {
                                    flowCrossAxisAlignment2 = FlowCrossAxisAlignment.Start;
                                }
                                float fM6117constructorimpl2 = i8 == 0 ? Dp.m6117constructorimpl(0) : f2;
                                if ((i2 & 64) == 0) {
                                    f3 = fM6117constructorimpl2;
                                    i9 = i3 & (-3670017);
                                    sizeMode3 = sizeMode2;
                                    mainAxisAlignment4 = mainAxisAlignment3;
                                    f4 = fM6117constructorimpl;
                                    flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(203669733, i9, -1, "com.google.accompanist.flowlayout.FlowColumn (Flow.kt:117)");
                                    }
                                    int i13 = i9;
                                    int i14 = (i13 & 14) | 48;
                                    int i15 = i13 << 3;
                                    m6988FlowF4y8cZ0(companion, LayoutOrientation.Vertical, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composerStartRestartGroup, (i15 & 234881024) | i14 | (i15 & 896) | (i15 & 7168) | (i15 & i7) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = companion;
                                } else {
                                    f3 = fM6117constructorimpl2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                f3 = f2;
                                companion = modifier2;
                            }
                            i9 = i3;
                            sizeMode3 = sizeMode2;
                            mainAxisAlignment4 = mainAxisAlignment3;
                            f4 = fM6117constructorimpl;
                            flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                            mainAxisAlignment3 = mainAxisAlignment2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i132 = i9;
                            int i142 = (i132 & 14) | 48;
                            int i152 = i132 << 3;
                            m6988FlowF4y8cZ0(companion, LayoutOrientation.Vertical, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composerStartRestartGroup, (i152 & 234881024) | i142 | (i152 & 896) | (i152 & 7168) | (i152 & i7) | (i152 & 458752) | (i152 & 3670016) | (i152 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = companion;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f3 = f2;
                            modifier3 = modifier2;
                            sizeMode3 = sizeMode2;
                            mainAxisAlignment4 = mainAxisAlignment3;
                            f4 = fM6117constructorimpl;
                            flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                            mainAxisAlignment3 = mainAxisAlignment2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.flowlayout.FlowKt$FlowColumn$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    FlowKt.m6989FlowColumn07r0xoM(modifier3, sizeMode3, mainAxisAlignment4, f4, flowCrossAxisAlignment3, f3, mainAxisAlignment3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i10;
                    if ((23967451 & i3) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                fM6117constructorimpl = f;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i8 = i2 & 32;
                if (i8 == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i3 |= i10;
                if ((23967451 & i3) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            mainAxisAlignment3 = mainAxisAlignment;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            fM6117constructorimpl = f;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i8 = i2 & 32;
            if (i8 == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i3 |= i10;
            if ((23967451 & i3) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        sizeMode2 = sizeMode;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mainAxisAlignment3 = mainAxisAlignment;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        fM6117constructorimpl = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i10;
        if ((23967451 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated(message = "\naccompanist/Flow is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n")
    /* renamed from: Flow-F4y8cZ0, reason: not valid java name */
    public static final void m6988FlowF4y8cZ0(final Modifier modifier, final LayoutOrientation layoutOrientation, final SizeMode sizeMode, final MainAxisAlignment mainAxisAlignment, final float f, final FlowCrossAxisAlignment flowCrossAxisAlignment, final float f2, final MainAxisAlignment mainAxisAlignment2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        MainAxisAlignment mainAxisAlignment3;
        int i3;
        FlowCrossAxisAlignment flowCrossAxisAlignment2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1567419051);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i2 |= composerStartRestartGroup.changed(layoutOrientation) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(sizeMode) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            mainAxisAlignment3 = mainAxisAlignment;
            i2 |= composerStartRestartGroup.changed(mainAxisAlignment3) ? 2048 : 1024;
        } else {
            mainAxisAlignment3 = mainAxisAlignment;
        }
        if ((i & 57344) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 = 458752;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment;
            i2 |= composerStartRestartGroup.changed(flowCrossAxisAlignment2) ? 131072 : 65536;
        } else {
            i3 = 458752;
            flowCrossAxisAlignment2 = flowCrossAxisAlignment;
        }
        if ((i & 3670016) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i2 |= composerStartRestartGroup.changed(mainAxisAlignment2) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 191739611) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1567419051, i2, -1, "com.google.accompanist.flowlayout.Flow (Flow.kt:183)");
            }
            composerStartRestartGroup.startReplaceableGroup(1107217839);
            boolean z = ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | ((i2 & 57344) == 16384) | ((i2 & 3670016) == 1048576) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 29360128) == 8388608) | ((i2 & i3) == 131072);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || measurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                final MainAxisAlignment mainAxisAlignment4 = mainAxisAlignment3;
                i4 = 0;
                final FlowCrossAxisAlignment flowCrossAxisAlignment3 = flowCrossAxisAlignment2;
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: com.google.accompanist.flowlayout.FlowKt$Flow$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo377measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> measurables, long j) {
                        long jConstraints$default;
                        int iMax;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        ArrayList arrayList3;
                        ArrayList arrayList4;
                        Ref.IntRef intRef;
                        Placeable placeable;
                        Ref.IntRef intRef2;
                        Ref.IntRef intRef3;
                        MeasureScope Layout = measureScope;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        Ref.IntRef intRef5 = new Ref.IntRef();
                        ArrayList arrayList8 = new ArrayList();
                        Ref.IntRef intRef6 = new Ref.IntRef();
                        Ref.IntRef intRef7 = new Ref.IntRef();
                        ArrayList arrayList9 = arrayList8;
                        OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, layoutOrientation, null);
                        if (layoutOrientation == LayoutOrientation.Horizontal) {
                            jConstraints$default = ConstraintsKt.Constraints$default(0, orientationIndependentConstraints.getMainAxisMax(), 0, 0, 13, null);
                        } else {
                            jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, orientationIndependentConstraints.getMainAxisMax(), 7, null);
                        }
                        long j2 = jConstraints$default;
                        Iterator<? extends Measurable> it = measurables.iterator();
                        while (it.hasNext()) {
                            Placeable placeableMo4993measureBRTryo0 = it.next().mo4993measureBRTryo0(j2);
                            OrientationIndependentConstraints orientationIndependentConstraints2 = orientationIndependentConstraints;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList9, intRef6, Layout, f, orientationIndependentConstraints, layoutOrientation, placeableMo4993measureBRTryo0)) {
                                Layout = measureScope;
                                arrayList = arrayList9;
                                arrayList2 = arrayList5;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList7;
                                intRef = intRef6;
                                placeable = placeableMo4993measureBRTryo0;
                                intRef2 = intRef5;
                                intRef3 = intRef7;
                            } else {
                                Layout = measureScope;
                                arrayList = arrayList9;
                                arrayList2 = arrayList5;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList7;
                                intRef = intRef6;
                                placeable = placeableMo4993measureBRTryo0;
                                intRef2 = intRef5;
                                intRef3 = intRef7;
                                measure_3p2s80s$startNewSequence(arrayList2, intRef2, Layout, f2, arrayList, arrayList3, intRef3, arrayList4, intRef4, intRef);
                            }
                            if (!arrayList.isEmpty()) {
                                intRef.element += Layout.mo706roundToPx0680j_4(f);
                            }
                            arrayList.add(placeable);
                            intRef.element += FlowKt.Flow_F4y8cZ0$mainAxisSize(placeable, layoutOrientation);
                            intRef3.element = Math.max(intRef3.element, FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable, layoutOrientation));
                            intRef5 = intRef2;
                            intRef7 = intRef3;
                            arrayList7 = arrayList4;
                            intRef6 = intRef;
                            arrayList5 = arrayList2;
                            arrayList9 = arrayList;
                            arrayList6 = arrayList3;
                            orientationIndependentConstraints = orientationIndependentConstraints2;
                        }
                        OrientationIndependentConstraints orientationIndependentConstraints3 = orientationIndependentConstraints;
                        final ArrayList arrayList10 = arrayList6;
                        Ref.IntRef intRef8 = intRef7;
                        ArrayList arrayList11 = arrayList9;
                        Ref.IntRef intRef9 = intRef6;
                        final ArrayList arrayList12 = arrayList5;
                        final ArrayList arrayList13 = arrayList7;
                        Ref.IntRef intRef10 = intRef5;
                        if (!arrayList11.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList12, intRef10, Layout, f2, arrayList11, arrayList10, intRef8, arrayList13, intRef4, intRef9);
                        }
                        if (orientationIndependentConstraints3.getMainAxisMax() != Integer.MAX_VALUE && sizeMode == SizeMode.Expand) {
                            iMax = orientationIndependentConstraints3.getMainAxisMax();
                        } else {
                            iMax = Math.max(intRef4.element, orientationIndependentConstraints3.getMainAxisMin());
                        }
                        int iMax2 = Math.max(intRef10.element, orientationIndependentConstraints3.getCrossAxisMin());
                        int i5 = layoutOrientation == LayoutOrientation.Horizontal ? iMax : iMax2;
                        int i6 = layoutOrientation == LayoutOrientation.Horizontal ? iMax2 : iMax;
                        final float f3 = f;
                        final MainAxisAlignment mainAxisAlignment5 = mainAxisAlignment4;
                        final MainAxisAlignment mainAxisAlignment6 = mainAxisAlignment2;
                        final LayoutOrientation layoutOrientation2 = layoutOrientation;
                        final FlowCrossAxisAlignment flowCrossAxisAlignment4 = flowCrossAxisAlignment3;
                        final int i7 = iMax;
                        return MeasureScope.layout$default(measureScope, i5, i6, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.google.accompanist.flowlayout.FlowKt$Flow$1$1.1

                            /* compiled from: Flow.kt */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            /* renamed from: com.google.accompanist.flowlayout.FlowKt$Flow$1$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[FlowCrossAxisAlignment.values().length];
                                    try {
                                        iArr[FlowCrossAxisAlignment.Start.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[FlowCrossAxisAlignment.End.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[FlowCrossAxisAlignment.Center.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope layout) {
                                Arrangement.Vertical arrangement;
                                int iIntValue;
                                Iterator it2;
                                int[] iArr;
                                List<Integer> list;
                                List<Integer> list2;
                                int i8;
                                int i9;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<List<Placeable>> list3 = arrayList12;
                                MeasureScope measureScope2 = measureScope;
                                float f4 = f3;
                                MainAxisAlignment mainAxisAlignment7 = mainAxisAlignment5;
                                MainAxisAlignment mainAxisAlignment8 = mainAxisAlignment6;
                                LayoutOrientation layoutOrientation3 = layoutOrientation2;
                                int i10 = i7;
                                FlowCrossAxisAlignment flowCrossAxisAlignment5 = flowCrossAxisAlignment4;
                                List<Integer> list4 = arrayList10;
                                List<Integer> list5 = arrayList13;
                                int i11 = 0;
                                for (Object obj : list3) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    List list6 = (List) obj;
                                    int size = list6.size();
                                    int i13 = 0;
                                    int[] iArr2 = new int[size];
                                    int i14 = 0;
                                    while (i14 < size) {
                                        List<List<Placeable>> list7 = list3;
                                        iArr2[i14] = FlowKt.Flow_F4y8cZ0$mainAxisSize((Placeable) list6.get(i14), layoutOrientation3) + (i14 < CollectionsKt.getLastIndex(list6) ? measureScope2.mo706roundToPx0680j_4(f4) : 0);
                                        i14++;
                                        list3 = list7;
                                    }
                                    List<List<Placeable>> list8 = list3;
                                    if (i11 < CollectionsKt.getLastIndex(list8)) {
                                        arrangement = mainAxisAlignment7.getArrangement();
                                    } else {
                                        arrangement = mainAxisAlignment8.getArrangement();
                                    }
                                    int[] iArr3 = new int[size];
                                    for (int i15 = 0; i15 < size; i15++) {
                                        iArr3[i15] = 0;
                                    }
                                    arrangement.arrange(measureScope2, i10, iArr2, iArr3);
                                    Iterator it3 = list6.iterator();
                                    int i16 = 0;
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        int i17 = i16 + 1;
                                        if (i16 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        Placeable placeable2 = (Placeable) next;
                                        int i18 = WhenMappings.$EnumSwitchMapping$0[flowCrossAxisAlignment5.ordinal()];
                                        if (i18 == 1) {
                                            iIntValue = i13;
                                        } else if (i18 == 2) {
                                            iIntValue = list4.get(i11).intValue() - FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable2, layoutOrientation3);
                                        } else {
                                            if (i18 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            iIntValue = IntOffset.m6246getYimpl(Alignment.INSTANCE.getCenter().mo3262alignKFBX0sM(IntSize.INSTANCE.m6292getZeroYbymL2g(), IntSizeKt.IntSize(i13, list4.get(i11).intValue() - FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable2, layoutOrientation3)), LayoutDirection.Ltr));
                                        }
                                        if (layoutOrientation3 == LayoutOrientation.Horizontal) {
                                            list = list4;
                                            iArr = iArr3;
                                            i8 = i11;
                                            it2 = it3;
                                            list2 = list5;
                                            i9 = 0;
                                            Placeable.PlacementScope.place$default(layout, placeable2, iArr3[i16], list5.get(i11).intValue() + iIntValue, 0.0f, 4, null);
                                        } else {
                                            it2 = it3;
                                            iArr = iArr3;
                                            list = list4;
                                            list2 = list5;
                                            i8 = i11;
                                            i9 = 0;
                                            Placeable.PlacementScope.place$default(layout, placeable2, list2.get(i8).intValue() + iIntValue, iArr[i16], 0.0f, 4, null);
                                        }
                                        list5 = list2;
                                        i11 = i8;
                                        it3 = it2;
                                        i16 = i17;
                                        list4 = list;
                                        iArr3 = iArr;
                                        i13 = i9;
                                    }
                                    i11 = i12;
                                    list3 = list8;
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, OrientationIndependentConstraints orientationIndependentConstraints, LayoutOrientation layoutOrientation2, Placeable placeable) {
                        return list.isEmpty() || (intRef.element + measureScope.mo706roundToPx0680j_4(f3)) + FlowKt.Flow_F4y8cZ0$mainAxisSize(placeable, layoutOrientation2) <= orientationIndependentConstraints.getMainAxisMax();
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        List<List<Placeable>> list5 = list;
                        if (!list5.isEmpty()) {
                            intRef.element += measureScope.mo706roundToPx0680j_4(f3);
                        }
                        list5.add(CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            } else {
                i4 = 0;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int i5 = ((i2 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i2 >> 24) & 14);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.flowlayout.FlowKt$Flow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    FlowKt.m6988FlowF4y8cZ0(modifier, layoutOrientation, sizeMode, mainAxisAlignment, f, flowCrossAxisAlignment, f2, mainAxisAlignment2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Flow_F4y8cZ0$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }
}
