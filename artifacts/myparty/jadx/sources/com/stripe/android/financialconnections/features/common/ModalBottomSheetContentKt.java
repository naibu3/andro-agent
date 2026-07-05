package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.common.util.UriUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.features.generic.GenericScreenKt;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.ConnectedAccessNotice;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.StringAnnotation;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ModalBottomSheetContent.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a7\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a)\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001b\u001ai\u0010\u001c\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010 \u001a\u00020!2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0003¢\u0006\u0002\u0010&\u001a)\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u001f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010)\u001aA\u0010*\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"DataAccessBottomSheetContent", "", "dataDialog", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "onClickableTextClick", "Lkotlin/Function1;", "", "onConfirmModalClick", "Lkotlin/Function0;", "(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LegalDetailsBottomSheetContent", "legalDetails", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GenericBottomSheetContent", "screen", "LFinancialConnectionsGenericInfoScreen;", "onPrimaryButtonClick", "onSecondaryButtonClick", "(LFinancialConnectionsGenericInfoScreen;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Links", "links", "", "Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Title", "title", "(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ModalBottomSheetContent", SDKConstants.PARAM_GAME_REQUESTS_CTA, "disclaimer", "Lcom/stripe/android/financialconnections/ui/TextResource;", "modifier", "Landroidx/compose/ui/Modifier;", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Subtitle", "text", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ModalBottomSheetFooter", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModalBottomSheetContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataAccessBottomSheetContent$lambda$4(DataAccessNotice dataAccessNotice, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        DataAccessBottomSheetContent(dataAccessNotice, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericBottomSheetContent$lambda$10(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        GenericBottomSheetContent(financialConnectionsGenericInfoScreen, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegalDetailsBottomSheetContent$lambda$9(LegalDetailsNotice legalDetailsNotice, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        LegalDetailsBottomSheetContent(legalDetailsNotice, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Links$lambda$13(List list, Function1 function1, int i, Composer composer, int i2) {
        Links(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetContent$lambda$15(Function1 function1, String str, TextResource textResource, Function0 function0, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        ModalBottomSheetContent(function1, str, textResource, function0, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetFooter$lambda$21(Function1 function1, TextResource textResource, Function0 function0, String str, int i, Composer composer, int i2) {
        ModalBottomSheetFooter(function1, textResource, function0, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subtitle$lambda$16(TextResource textResource, Function1 function1, int i, Composer composer, int i2) {
        Subtitle(textResource, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$14(TextResource.Text text, Function1 function1, int i, Composer composer, int i2) {
        Title(text, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DataAccessBottomSheetContent(final DataAccessNotice dataDialog, final Function1<? super String, Unit> onClickableTextClick, final Function0<Unit> onConfirmModalClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(dataDialog, "dataDialog");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onConfirmModalClick, "onConfirmModalClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1941374581);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dataDialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConfirmModalClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1941374581, i3, -1, "com.stripe.android.financialconnections.features.common.DataAccessBottomSheetContent (ModalBottomSheetContent.kt:37)");
            }
            final TextResource.Text textRememberHtml = ServerDrivenUiKt.rememberHtml(dataDialog.getTitle(), composerStartRestartGroup, 0);
            String subtitle = dataDialog.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(1450647244);
            final TextResource.Text textRememberHtml2 = subtitle == null ? null : ServerDrivenUiKt.rememberHtml(subtitle, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            String disclaimer = dataDialog.getDisclaimer();
            composerStartRestartGroup.startReplaceGroup(1450649452);
            TextResource.Text textRememberHtml3 = disclaimer != null ? ServerDrivenUiKt.rememberHtml(disclaimer, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            List<Bullet> bullets = dataDialog.getBody().getBullets();
            composerStartRestartGroup.startReplaceGroup(1450650903);
            boolean zChanged = composerStartRestartGroup.changed(bullets);
            ArrayList arrayListRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
                List<Bullet> bullets2 = dataDialog.getBody().getBullets();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bullets2, 10));
                Iterator<T> it = bullets2.iterator();
                while (it.hasNext()) {
                    arrayList.add(BulletUI.INSTANCE.from((Bullet) it.next()));
                }
                arrayListRememberedValue = arrayList;
                composerStartRestartGroup.updateRememberedValue(arrayListRememberedValue);
            }
            final List list = (List) arrayListRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            ModalBottomSheetContent(onClickableTextClick, dataDialog.getCta(), textRememberHtml3, onConfirmModalClick, null, ComposableLambdaKt.rememberComposableLambda(-293161351, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.DataAccessBottomSheetContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope ModalBottomSheetContent, Composer composer3, int i4) {
                    Composer composer4;
                    Intrinsics.checkNotNullParameter(ModalBottomSheetContent, "$this$ModalBottomSheetContent");
                    if ((i4 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-293161351, i4, -1, "com.stripe.android.financialconnections.features.common.DataAccessBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:50)");
                        }
                        Image icon = dataDialog.getIcon();
                        String str = icon != null ? icon.getDefault() : null;
                        composer3.startReplaceGroup(-1400304256);
                        if (str == null) {
                            composer4 = composer3;
                        } else {
                            composer4 = composer3;
                            ShapedIconKt.ShapedIcon(str, null, null, null, "Icon", null, false, composer4, 24576, 110);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer4, 6);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        ModalBottomSheetContentKt.Title(textRememberHtml, onClickableTextClick, composer4, 0);
                        ConnectedAccessNotice connectedAccountNotice = dataDialog.getConnectedAccountNotice();
                        composer4.startReplaceGroup(-1400292246);
                        if (connectedAccountNotice != null) {
                            Function1<String, Unit> function1 = onClickableTextClick;
                            float f = 16;
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer4, 6);
                            ModalBottomSheetContentKt.Subtitle(ServerDrivenUiKt.rememberHtml(connectedAccountNotice.getSubtitle(), composer4, 0), function1, composer4, 0);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer4, 6);
                            composer4.startReplaceGroup(-1400282588);
                            Iterator<T> it2 = connectedAccountNotice.getBody().getBullets().iterator();
                            while (it2.hasNext()) {
                                ListItemKt.ListItem(BulletUI.INSTANCE.from((Bullet) it2.next()), function1, composer4, 0);
                                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer4, 6);
                            }
                            composer4.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        TextResource.Text text = textRememberHtml2;
                        composer4.startReplaceGroup(-1400270255);
                        if (text != null) {
                            Function1<String, Unit> function12 = onClickableTextClick;
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer4, 6);
                            ModalBottomSheetContentKt.Subtitle(text, function12, composer4, 0);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer4, 6);
                        List<BulletUI> list2 = list;
                        Function1<String, Unit> function13 = onClickableTextClick;
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ListItemKt.ListItem((BulletUI) it3.next(), function13, composer4, 0);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer4, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 << 3) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.DataAccessBottomSheetContent$lambda$4(dataDialog, onClickableTextClick, onConfirmModalClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LegalDetailsBottomSheetContent(final LegalDetailsNotice legalDetails, final Function1<? super String, Unit> onClickableTextClick, final Function0<Unit> onConfirmModalClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(legalDetails, "legalDetails");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onConfirmModalClick, "onConfirmModalClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(12288811);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(legalDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConfirmModalClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(12288811, i3, -1, "com.stripe.android.financialconnections.features.common.LegalDetailsBottomSheetContent (ModalBottomSheetContent.kt:93)");
            }
            final TextResource.Text textRememberHtml = ServerDrivenUiKt.rememberHtml(legalDetails.getTitle(), composerStartRestartGroup, 0);
            String subtitle = legalDetails.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(954043431);
            final TextResource.Text textRememberHtml2 = subtitle == null ? null : ServerDrivenUiKt.rememberHtml(subtitle, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            String disclaimer = legalDetails.getDisclaimer();
            composerStartRestartGroup.startReplaceGroup(954045671);
            TextResource.Text textRememberHtml3 = disclaimer != null ? ServerDrivenUiKt.rememberHtml(disclaimer, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            List<ServerLink> links = legalDetails.getBody().getLinks();
            composerStartRestartGroup.startReplaceGroup(954047078);
            boolean zChanged = composerStartRestartGroup.changed(links);
            ArrayList arrayListRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
                List<ServerLink> links2 = legalDetails.getBody().getLinks();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(links2, 10));
                Iterator<T> it = links2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TextResource.Text(ServerDrivenUiKt.fromHtml(((ServerLink) it.next()).getTitle())));
                }
                arrayListRememberedValue = arrayList;
                composerStartRestartGroup.updateRememberedValue(arrayListRememberedValue);
            }
            final List list = (List) arrayListRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            ModalBottomSheetContent(onClickableTextClick, legalDetails.getCta(), textRememberHtml3, onConfirmModalClick, null, ComposableLambdaKt.rememberComposableLambda(1658132761, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.LegalDetailsBottomSheetContent.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope ModalBottomSheetContent, Composer composer3, int i4) {
                    Composer composer4;
                    Intrinsics.checkNotNullParameter(ModalBottomSheetContent, "$this$ModalBottomSheetContent");
                    if ((i4 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1658132761, i4, -1, "com.stripe.android.financialconnections.features.common.LegalDetailsBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:106)");
                        }
                        Image icon = legalDetails.getIcon();
                        String str = icon != null ? icon.getDefault() : null;
                        composer3.startReplaceGroup(-1532917001);
                        if (str == null) {
                            composer4 = composer3;
                        } else {
                            composer4 = composer3;
                            ShapedIconKt.ShapedIcon(str, null, null, null, "legal details icon", null, false, composer4, 24576, 110);
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer4, 6);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        ModalBottomSheetContentKt.Title(textRememberHtml, onClickableTextClick, composer4, 0);
                        TextResource.Text text = textRememberHtml2;
                        composer4.startReplaceGroup(-1532909570);
                        if (text != null) {
                            Function1<String, Unit> function1 = onClickableTextClick;
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer4, 6);
                            ModalBottomSheetContentKt.Subtitle(text, function1, composer4, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), composer4, 6);
                        ModalBottomSheetContentKt.Links(list, onClickableTextClick, composer4, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 << 3) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.LegalDetailsBottomSheetContent$lambda$9(legalDetails, onClickableTextClick, onConfirmModalClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericBottomSheetContent(final FinancialConnectionsGenericInfoScreen screen, Function1<? super String, Unit> onClickableTextClick, Function0<Unit> onPrimaryButtonClick, Function0<Unit> onSecondaryButtonClick, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        final Function0<Unit> function02;
        final Function1<? super String, Unit> function1;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1870638783);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870638783, i2, -1, "com.stripe.android.financialconnections.features.common.GenericBottomSheetContent (ModalBottomSheetContent.kt:130)");
            }
            GenericScreenKt.GenericScreen(new GenericScreenState(screen, true), onPrimaryButtonClick, onSecondaryButtonClick, onClickableTextClick, composerStartRestartGroup, ((i2 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i2 << 6) & 7168));
            function0 = onPrimaryButtonClick;
            function02 = onSecondaryButtonClick;
            function1 = onClickableTextClick;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = onSecondaryButtonClick;
            function0 = onPrimaryButtonClick;
            function1 = onClickableTextClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.GenericBottomSheetContent$lambda$10(screen, function1, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Links(final List<TextResource.Text> list, Function1<? super String, Unit> function1, Composer composer, final int i) {
        final Function1<? super String, Unit> function12;
        Function1<? super String, Unit> function13 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(385623561);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385623561, i3, -1, "com.stripe.android.financialconnections.features.common.Links (ModalBottomSheetContent.kt:143)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = 6;
            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLargeEmphasized(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7643getTextAction0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composerStartRestartGroup.startReplaceGroup(1740696950);
            for (Object obj : list) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                float f = (float) 0.5d;
                int i7 = i4;
                DividerKt.m1877DivideroMI9zvI(null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, i5).m7634getBorderNeutral0d7_KjU(), Dp.m6117constructorimpl(f), 0.0f, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 9);
                TextStyle textStyle = textStyleM5615copyp1EtxEg$default;
                TextKt.m7586AnnotatedTextrm0N8CA((TextResource.Text) obj, function13, textStyle, PaddingKt.m1022paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(16), 1, null), MapsKt.mapOf(TuplesKt.to(StringAnnotation.CLICKABLE, textStyleM5615copyp1EtxEg$default.toSpanStyle())), 0, 0, composerStartRestartGroup, (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, 96);
                Function1<? super String, Unit> function14 = function13;
                composerStartRestartGroup.startReplaceGroup(1740713742);
                if (CollectionsKt.getLastIndex(list) == i7) {
                    i5 = 6;
                    Composer composer2 = composerStartRestartGroup;
                    DividerKt.m1877DivideroMI9zvI(null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU(), Dp.m6117constructorimpl(f), 0.0f, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 9);
                    composerStartRestartGroup = composer2;
                } else {
                    i5 = 6;
                }
                composerStartRestartGroup.endReplaceGroup();
                function13 = function14;
                textStyleM5615copyp1EtxEg$default = textStyle;
                i4 = i6;
            }
            function12 = function13;
            composerStartRestartGroup.endReplaceGroup();
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
            function12 = function13;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ModalBottomSheetContentKt.Links$lambda$13(list, function12, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(final TextResource.Text text, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1695488327);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1695488327, i2, -1, "com.stripe.android.financialconnections.features.common.Title (ModalBottomSheetContent.kt:170)");
            }
            TextKt.m7586AnnotatedTextrm0N8CA(text, function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getHeadingLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.Title$lambda$14(text, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ModalBottomSheetContent(final Function1<? super String, Unit> function1, final String str, final TextResource textResource, final Function0<Unit> function0, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(518833689);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(518833689, i3, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent (ModalBottomSheetContent.kt:188)");
                }
                int i5 = ((i3 >> 12) & 14) | 905970048;
                Modifier modifier4 = companion;
                composer2 = composerStartRestartGroup;
                LayoutKt.Layout(modifier4, null, true, false, false, null, false, null, ComposableLambdaKt.rememberComposableLambda(-557003752, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.ModalBottomSheetContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-557003752, i6, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:194)");
                            }
                            ModalBottomSheetContentKt.ModalBottomSheetFooter(function1, textResource, function0, str, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1704918551, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.ModalBottomSheetContent.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Layout, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(Layout) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1704918551, i6, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:192)");
                        }
                        function3.invoke(Layout, composer3, Integer.valueOf(i6 & 14));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i5, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ModalBottomSheetContentKt.ModalBottomSheetContent$lambda$15(function1, str, textResource, function0, modifier3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = ((i3 >> 12) & 14) | 905970048;
            Modifier modifier42 = companion;
            composer2 = composerStartRestartGroup;
            LayoutKt.Layout(modifier42, null, true, false, false, null, false, null, ComposableLambdaKt.rememberComposableLambda(-557003752, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.ModalBottomSheetContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-557003752, i6, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:194)");
                        }
                        ModalBottomSheetContentKt.ModalBottomSheetFooter(function1, textResource, function0, str, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1704918551, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt.ModalBottomSheetContent.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Layout, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    if ((i6 & 6) == 0) {
                        i6 |= composer3.changed(Layout) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1704918551, i6, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetContent.<anonymous> (ModalBottomSheetContent.kt:192)");
                    }
                    function3.invoke(Layout, composer3, Integer.valueOf(i6 & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i52, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Subtitle(final TextResource textResource, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1914060505);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914060505, i2, -1, "com.stripe.android.financialconnections.features.common.Subtitle (ModalBottomSheetContent.kt:208)");
            }
            TextKt.m7586AnnotatedTextrm0N8CA(textResource, function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.Subtitle$lambda$16(textResource, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalBottomSheetFooter(final Function1<? super String, Unit> function1, final TextResource textResource, final Function0<Unit> function0, final String str, Composer composer, final int i) {
        int i2;
        boolean z;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1581226918);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textResource) : composerStartRestartGroup.changedInstance(textResource) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1581226918, i4, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetFooter (ModalBottomSheetContent.kt:224)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2116819618);
            if (textResource == null) {
                i3 = 6;
                z = false;
            } else {
                z = false;
                i3 = 6;
                TextKt.m7586AnnotatedTextrm0N8CA(textResource, function1, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), null, 0, 0, composerStartRestartGroup, (i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, i3);
            composerStartRestartGroup.startReplaceGroup(2116833595);
            if ((i4 & 896) == 256) {
                z = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModalBottomSheetContentKt.ModalBottomSheetFooter$lambda$20$lambda$19$lambda$18(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonKt.FinancialConnectionsButton((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, false, ComposableLambdaKt.rememberComposableLambda(997284405, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$ModalBottomSheetFooter$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(997284405, i5, -1, "com.stripe.android.financialconnections.features.common.ModalBottomSheetFooter.<anonymous>.<anonymous> (ModalBottomSheetContent.kt:241)");
                    }
                    androidx.compose.material.TextKt.m2076Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 60);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetContentKt.ModalBottomSheetFooter$lambda$21(function1, textResource, function0, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetFooter$lambda$20$lambda$19$lambda$18(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
