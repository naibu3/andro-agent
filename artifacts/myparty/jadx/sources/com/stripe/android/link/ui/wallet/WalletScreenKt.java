package com.stripe.android.link.ui.wallet;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.ErrorTextKt;
import com.stripe.android.link.ui.LinkAppBarMenuKt;
import com.stripe.android.link.ui.LinkDividerKt;
import com.stripe.android.link.ui.LinkLoadingScreenKt;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.ScrollableTopLevelColumnKt;
import com.stripe.android.link.ui.SecondaryButtonKt;
import com.stripe.android.link.ui.wallet.AddBankAccountState;
import com.stripe.android.link.ui.wallet.AddPaymentMethodOption;
import com.stripe.android.link.ui.wallet.WalletScreenKt;
import com.stripe.android.link.utils.AnimationsKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailabilityKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.CvcController;
import com.stripe.android.ui.core.elements.CvcElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.text.HtmlKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: WalletScreen.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032,\u0010\u0004\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\t¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a¡\u0002\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2,\u0010\u0004\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\t¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005H\u0001¢\u0006\u0002\u0010#\u001a\u0081\u0002\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2,\u0010\u0004\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\t¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005H\u0003¢\u0006\u0002\u0010)\u001a\u0017\u0010*\u001a\u00020\u00012\b\u0010+\u001a\u0004\u0018\u00010,H\u0003¢\u0006\u0002\u0010-\u001a1\u0010.\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010/\u001aé\u0001\u00100\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2,\u0010\u0004\u001a(\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\t¢\u0006\u0002\b\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00010\u00052\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005H\u0003¢\u0006\u0002\u00101\u001a!\u00102\u001a\u0002032\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020605\"\u000206H\u0003¢\u0006\u0002\u00107\u001a}\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010%\u001a\u00020&2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00072\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\bA\u0010B\u001a=\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u0002062\u0006\u0010;\u001a\u0002032\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0004\bH\u0010I\u001a5\u0010J\u001a\u00020\u00012\u0006\u00109\u001a\u0002062\u0006\u0010F\u001a\u0002062\u0006\u0010;\u001a\u0002032\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0004\bL\u0010M\u001aY\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010S\u001a#\u0010T\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u001a2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010V\u001a#\u0010W\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u001a2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010V\u001a\u0015\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u000206H\u0003¢\u0006\u0002\u0010Z\u001a7\u0010[\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010]\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010^\u001a#\u0010_\u001a\u00020\u00012\u0006\u0010`\u001a\u00020,2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010a\u001a-\u0010b\u001a\u0004\u0018\u00010c2\b\u0010d\u001a\u0004\u0018\u00010e2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010h\u001a\f\u0010i\u001a\u000206*\u000206H\u0002\"\u000e\u0010j\u001a\u00020kX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010l\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010o\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010p\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010q\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010r\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010s\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010t\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010u\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010v\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010w\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010x\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010y\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010z\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010{\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010|\u001a\u000206X\u0080T¢\u0006\u0002\n\u0000¨\u0006}²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"WalletScreen", "", "viewModel", "Lcom/stripe/android/link/ui/wallet/WalletViewModel;", "showBottomSheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Lcom/stripe/android/link/ui/BottomSheetContent;", "hideBottomSheetContent", "Lkotlin/coroutines/Continuation;", "", "onLogoutClicked", "Lkotlin/Function0;", "(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WalletBody", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/wallet/WalletUiState;", "expiryDateController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "cvcController", "Lcom/stripe/android/ui/core/elements/CvcController;", "onItemSelected", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "onExpandedChanged", "", "onAddPaymentMethodOptionClicked", "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;", "onPrimaryButtonClick", "onPayAnotherWayClicked", "onDismissAlert", "onSetDefaultClicked", "onRemoveClicked", "onUpdateClicked", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PaymentDetailsSection", "modifier", "Landroidx/compose/ui/Modifier;", "isExpanded", "onAddNewPaymentMethodClicked", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/wallet/WalletUiState;ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ErrorSection", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)V", "ActionSection", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PaymentMethodSection", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "computeMaxLabelWidth", "Landroidx/compose/ui/unit/Dp;", "labels", "", "", "([Ljava/lang/String;Landroidx/compose/runtime/Composer;I)F", "PaymentMethodPicker", "email", "emailLabel", "labelMaxWidth", "expanded", "selectedItem", "onAccountMenuClicked", "collapsedContent", "expandedContent", "PaymentMethodPicker-dsL6K2w", "(Ljava/lang/String;Ljava/lang/String;FZLcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "CollapsedPaymentDetails", "selectedPaymentMethod", ViewProps.ENABLED, "label", ViewProps.ON_CLICK, "CollapsedPaymentDetails--jt2gSs", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EmailDetails", "onMenuClicked", "EmailDetails-6a0pyJM", "(Ljava/lang/String;Ljava/lang/String;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ExpandedPaymentDetails", "uiState", "onMenuButtonClick", "onAddNewPaymentMethodClick", "onCollapse", "(Lcom/stripe/android/link/ui/wallet/WalletUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ExpandedRowHeader", "isEnabled", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddPaymentMethodRow", "LinkMandate", "text", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CardDetailsRecollectionForm", "paymentDetails", "isCardExpired", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AlertMessage", "alertMessage", "(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "rememberFinancialConnectionsSheetInternal", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "callback", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;", "replaceHyperlinks", "CHEVRON_ICON_ROTATION", "", "WALLET_LOADER_TAG", "COLLAPSED_WALLET_HEADER_TAG", "COLLAPSED_WALLET_CHEVRON_ICON_TAG", "COLLAPSED_WALLET_PAYMENT_DETAILS_TAG", "COLLAPSED_WALLET_ROW", "WALLET_SCREEN_EXPANDED_ROW_HEADER", "WALLET_ADD_PAYMENT_METHOD_ROW", "WALLET_SCREEN_ADD_PAYMENT_METHOD_MENU", "WALLET_SCREEN_PAYMENT_METHODS_LIST", "WALLET_SCREEN_PAY_BUTTON", "WALLET_SCREEN_PAY_ANOTHER_WAY_BUTTON", "WALLET_SCREEN_RECOLLECTION_FORM_ERROR", "WALLET_SCREEN_RECOLLECTION_FORM_FIELDS", "WALLET_SCREEN_MENU_SHEET_TAG", "WALLET_SCREEN_DIALOG_TAG", "WALLET_SCREEN_DIALOG_BUTTON_TAG", "WALLET_SCREEN_ERROR_TAG", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletScreenKt {
    private static final float CHEVRON_ICON_ROTATION = 180.0f;
    public static final String COLLAPSED_WALLET_CHEVRON_ICON_TAG = "collapsed_wallet_chevron_icon_tag";
    public static final String COLLAPSED_WALLET_HEADER_TAG = "collapsed_wallet_header_tag";
    public static final String COLLAPSED_WALLET_PAYMENT_DETAILS_TAG = "collapsed_wallet_payment_details_tag";
    public static final String COLLAPSED_WALLET_ROW = "collapsed_wallet_row_tag";
    public static final String WALLET_ADD_PAYMENT_METHOD_ROW = "wallet_add_payment_method_row";
    public static final String WALLET_LOADER_TAG = "wallet_screen_loader_tag";
    public static final String WALLET_SCREEN_ADD_PAYMENT_METHOD_MENU = "wallet_screen_add_payment_method_sheet";
    public static final String WALLET_SCREEN_DIALOG_BUTTON_TAG = "wallet_screen_dialog_button_tag";
    public static final String WALLET_SCREEN_DIALOG_TAG = "wallet_screen_dialog_tag";
    public static final String WALLET_SCREEN_ERROR_TAG = "wallet_screen_error_tag";
    public static final String WALLET_SCREEN_EXPANDED_ROW_HEADER = "wallet_screen_expanded_row_header";
    public static final String WALLET_SCREEN_MENU_SHEET_TAG = "wallet_screen_menu_sheet_tag";
    public static final String WALLET_SCREEN_PAYMENT_METHODS_LIST = "wallet_screen_payment_methods_list";
    public static final String WALLET_SCREEN_PAY_ANOTHER_WAY_BUTTON = "wallet_screen_pay_another_way_button";
    public static final String WALLET_SCREEN_PAY_BUTTON = "wallet_screen_pay_button";
    public static final String WALLET_SCREEN_RECOLLECTION_FORM_ERROR = "wallet_screen_recollection_form_error";
    public static final String WALLET_SCREEN_RECOLLECTION_FORM_FIELDS = "wallet_screen_recollection_form_fields";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionSection$lambda$21(WalletUiState walletUiState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ActionSection(walletUiState, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethodRow$lambda$45(boolean z, Function0 function0, int i, Composer composer, int i2) {
        AddPaymentMethodRow(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertMessage$lambda$51(ResolvableString resolvableString, Function0 function0, int i, Composer composer, int i2) {
        AlertMessage(resolvableString, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsRecollectionForm$lambda$50(ConsumerPaymentDetails.PaymentDetails paymentDetails, TextFieldController textFieldController, CvcController cvcController, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CardDetailsRecollectionForm(paymentDetails, textFieldController, cvcController, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CollapsedPaymentDetails__jt2gSs$lambda$32(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, String str, float f, Function0 function0, int i, Composer composer, int i2) {
        m7966CollapsedPaymentDetailsjt2gSs(paymentDetails, z, str, f, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailDetails_6a0pyJM$lambda$34(String str, String str2, float f, Function0 function0, int i, Composer composer, int i2) {
        m7967EmailDetails6a0pyJM(str, str2, f, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorSection$lambda$19(ResolvableString resolvableString, int i, Composer composer, int i2) {
        ErrorSection(resolvableString, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedPaymentDetails$lambda$41(WalletUiState walletUiState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ExpandedPaymentDetails(walletUiState, function1, function12, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedRowHeader$lambda$43(boolean z, Function0 function0, int i, Composer composer, int i2) {
        ExpandedRowHeader(z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkMandate$lambda$46(String str, int i, Composer composer, int i2) {
        LinkMandate(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentDetailsSection$lambda$18(Modifier modifier, WalletUiState walletUiState, boolean z, TextFieldController textFieldController, CvcController cvcController, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function1 function15, Function0 function02, Function1 function16, Function1 function17, int i, int i2, Composer composer, int i3) {
        PaymentDetailsSection(modifier, walletUiState, z, textFieldController, cvcController, function1, function12, function0, function13, function14, function15, function02, function16, function17, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodPicker_dsL6K2w$lambda$30(String str, String str2, float f, boolean z, ConsumerPaymentDetails.PaymentDetails paymentDetails, Modifier modifier, Function0 function0, Function3 function3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7968PaymentMethodPickerdsL6K2w(str, str2, f, z, paymentDetails, modifier, function0, function3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodSection$lambda$24(WalletUiState walletUiState, boolean z, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function1 function14, Function1 function15, Function0 function02, Function1 function16, Function1 function17, int i, int i2, Composer composer, int i3) {
        PaymentMethodSection(walletUiState, z, function1, function12, function0, function13, function14, function15, function02, function16, function17, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletBody$lambda$15(WalletUiState walletUiState, TextFieldController textFieldController, CvcController cvcController, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, Function0 function03, Function1 function14, Function1 function15, Function1 function16, Function0 function04, Function1 function17, Function1 function18, int i, int i2, Composer composer, int i3) {
        WalletBody(walletUiState, textFieldController, cvcController, function1, function12, function13, function0, function02, function03, function14, function15, function16, function04, function17, function18, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WalletScreen$lambda$12(WalletViewModel walletViewModel, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        WalletScreen(walletViewModel, function1, function12, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void WalletScreen(final WalletViewModel viewModel, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> showBottomSheetContent, final Function1<? super Continuation<? super Unit>, ? extends Object> hideBottomSheetContent, final Function0<Unit> onLogoutClicked, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        Intrinsics.checkNotNullParameter(hideBottomSheetContent, "hideBottomSheetContent");
        Intrinsics.checkNotNullParameter(onLogoutClicked, "onLogoutClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994426510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(showBottomSheetContent) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(hideBottomSheetContent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onLogoutClicked) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1994426510, i2, -1, "com.stripe.android.link.ui.wallet.WalletScreen (WalletScreen.kt:93)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getUiState(), null, composerStartRestartGroup, 0, 1);
            AddPaymentMethodOption.Bank addBankAccountOption = WalletScreen$lambda$0(stateCollectAsState).getAddBankAccountOption();
            FinancialConnectionsAvailability financialConnectionsAvailability = addBankAccountOption != null ? addBankAccountOption.getFinancialConnectionsAvailability() : null;
            composerStartRestartGroup.startReplaceGroup(720171496);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1 walletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || walletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1RememberedValue = new WalletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FinancialConnectionsSheetForDataLauncher financialConnectionsSheetForDataLauncherRememberFinancialConnectionsSheetInternal = rememberFinancialConnectionsSheetInternal(financialConnectionsAvailability, (Function1) ((KFunction) walletScreenKt$WalletScreen$financialConnectionsSheetLauncher$1$1RememberedValue), composerStartRestartGroup, 0);
            AddBankAccountState addBankAccountState = WalletScreen$lambda$0(stateCollectAsState).getAddBankAccountState();
            AddBankAccountState.Processing processing = addBankAccountState instanceof AddBankAccountState.Processing ? (AddBankAccountState.Processing) addBankAccountState : null;
            FinancialConnectionsSheetConfiguration configToPresent = processing != null ? processing.getConfigToPresent() : null;
            composerStartRestartGroup.startReplaceGroup(720179337);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(configToPresent) | composerStartRestartGroup.changedInstance(financialConnectionsSheetForDataLauncherRememberFinancialConnectionsSheetInternal) | composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$1$1 walletScreenKt$WalletScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || walletScreenKt$WalletScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$1$1RememberedValue = new WalletScreenKt$WalletScreen$1$1(configToPresent, financialConnectionsSheetForDataLauncherRememberFinancialConnectionsSheetInternal, viewModel, null);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(configToPresent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) walletScreenKt$WalletScreen$1$1RememberedValue, composerStartRestartGroup, 0);
            WalletUiState walletUiStateWalletScreen$lambda$0 = WalletScreen$lambda$0(stateCollectAsState);
            SimpleTextFieldController expiryDateController = viewModel.getExpiryDateController();
            CvcController cvcController = viewModel.getCvcController();
            composerStartRestartGroup.startReplaceGroup(720198202);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$2$1 walletScreenKt$WalletScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || walletScreenKt$WalletScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$2$1RememberedValue = new WalletScreenKt$WalletScreen$2$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$2$1RememberedValue);
            }
            KFunction kFunction = (KFunction) walletScreenKt$WalletScreen$2$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720199965);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$3$1 walletScreenKt$WalletScreen$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || walletScreenKt$WalletScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$3$1RememberedValue = new WalletScreenKt$WalletScreen$3$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$3$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) walletScreenKt$WalletScreen$3$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720201922);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$4$1 walletScreenKt$WalletScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || walletScreenKt$WalletScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$4$1RememberedValue = new WalletScreenKt$WalletScreen$4$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$4$1RememberedValue);
            }
            KFunction kFunction3 = (KFunction) walletScreenKt$WalletScreen$4$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720204098);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$5$1 walletScreenKt$WalletScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || walletScreenKt$WalletScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$5$1RememberedValue = new WalletScreenKt$WalletScreen$5$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$5$1RememberedValue);
            }
            KFunction kFunction4 = (KFunction) walletScreenKt$WalletScreen$5$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720206043);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$6$1 walletScreenKt$WalletScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || walletScreenKt$WalletScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$6$1RememberedValue = new WalletScreenKt$WalletScreen$6$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$6$1RememberedValue);
            }
            KFunction kFunction5 = (KFunction) walletScreenKt$WalletScreen$6$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720207771);
            boolean zChangedInstance8 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$7$1 walletScreenKt$WalletScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance8 || walletScreenKt$WalletScreen$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$7$1RememberedValue = new WalletScreenKt$WalletScreen$7$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$7$1RememberedValue);
            }
            KFunction kFunction6 = (KFunction) walletScreenKt$WalletScreen$7$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720211007);
            boolean zChangedInstance9 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$8$1 walletScreenKt$WalletScreen$8$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance9 || walletScreenKt$WalletScreen$8$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$8$1RememberedValue = new WalletScreenKt$WalletScreen$8$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$8$1RememberedValue);
            }
            KFunction kFunction7 = (KFunction) walletScreenKt$WalletScreen$8$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720217035);
            boolean zChangedInstance10 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$9$1 walletScreenKt$WalletScreen$9$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance10 || walletScreenKt$WalletScreen$9$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$9$1RememberedValue = new WalletScreenKt$WalletScreen$9$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$9$1RememberedValue);
            }
            KFunction kFunction8 = (KFunction) walletScreenKt$WalletScreen$9$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(720219226);
            boolean zChangedInstance11 = composerStartRestartGroup.changedInstance(viewModel);
            WalletScreenKt$WalletScreen$10$1 walletScreenKt$WalletScreen$10$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance11 || walletScreenKt$WalletScreen$10$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                walletScreenKt$WalletScreen$10$1RememberedValue = new WalletScreenKt$WalletScreen$10$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(walletScreenKt$WalletScreen$10$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = (i2 >> 3) & 896;
            int i4 = i2 << 6;
            composer2 = composerStartRestartGroup;
            WalletBody(walletUiStateWalletScreen$lambda$0, expiryDateController, cvcController, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction8, (Function0) kFunction3, (Function0) kFunction4, (Function0) ((KFunction) walletScreenKt$WalletScreen$10$1RememberedValue), (Function1) kFunction7, (Function1) kFunction5, (Function1) kFunction6, onLogoutClicked, showBottomSheetContent, hideBottomSheetContent, composer2, (SimpleTextFieldController.$stable << 3) | (CvcController.$stable << 6), i3 | (i4 & 7168) | (i4 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.WalletScreen$lambda$12(viewModel, showBottomSheetContent, hideBottomSheetContent, onLogoutClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void WalletBody(final WalletUiState state, final TextFieldController expiryDateController, final CvcController cvcController, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onItemSelected, final Function1<? super Boolean, Unit> onExpandedChanged, final Function1<? super AddPaymentMethodOption, Unit> onAddPaymentMethodOptionClicked, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onPayAnotherWayClicked, final Function0<Unit> onDismissAlert, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onSetDefaultClicked, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onRemoveClicked, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> onUpdateClicked, final Function0<Unit> onLogoutClicked, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> showBottomSheetContent, final Function1<? super Continuation<? super Unit>, ? extends Object> hideBottomSheetContent, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(expiryDateController, "expiryDateController");
        Intrinsics.checkNotNullParameter(cvcController, "cvcController");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Intrinsics.checkNotNullParameter(onExpandedChanged, "onExpandedChanged");
        Intrinsics.checkNotNullParameter(onAddPaymentMethodOptionClicked, "onAddPaymentMethodOptionClicked");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onPayAnotherWayClicked, "onPayAnotherWayClicked");
        Intrinsics.checkNotNullParameter(onDismissAlert, "onDismissAlert");
        Intrinsics.checkNotNullParameter(onSetDefaultClicked, "onSetDefaultClicked");
        Intrinsics.checkNotNullParameter(onRemoveClicked, "onRemoveClicked");
        Intrinsics.checkNotNullParameter(onUpdateClicked, "onUpdateClicked");
        Intrinsics.checkNotNullParameter(onLogoutClicked, "onLogoutClicked");
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "showBottomSheetContent");
        Intrinsics.checkNotNullParameter(hideBottomSheetContent, "hideBottomSheetContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964757412);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(expiryDateController) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(cvcController) : composerStartRestartGroup.changedInstance(cvcController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onItemSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExpandedChanged) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddPaymentMethodOptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPayAnotherWayClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissAlert) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSetDefaultClicked) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(onRemoveClicked) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onUpdateClicked) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onLogoutClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(showBottomSheetContent) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(hideBottomSheetContent) ? 16384 : 8192;
        }
        int i6 = i4;
        if ((i5 & 306783379) != 306783378 || (i6 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1964757412, i5, i6, "com.stripe.android.link.ui.wallet.WalletBody (WalletScreen.kt:152)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Boolean boolValueOf = Boolean.valueOf(state.getShouldShowLoadingState());
            composerStartRestartGroup.startReplaceGroup(-390116529);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WalletScreenKt.WalletBody$lambda$14$lambda$13((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue2, null, null, null, ComposableLambdaKt.rememberComposableLambda(-479069665, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt.WalletBody.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-479069665, i7, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous> (WalletScreen.kt:158)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(1064606910);
                        LinkLoadingScreenKt.m7860LinkLoadingScreenhXAe_Q4(TestTagKt.testTag(Modifier.INSTANCE, WalletScreenKt.WALLET_LOADER_TAG), null, composer2, 6, 2);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1064767552);
                        composer2.startReplaceGroup(1835460736);
                        if (state.getAlertMessage() != null) {
                            WalletScreenKt.AlertMessage(state.getAlertMessage(), onDismissAlert, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localFocusManager);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        FocusManager focusManager = (FocusManager) objConsume;
                        Boolean boolValueOf2 = Boolean.valueOf(state.isProcessing());
                        composer2.startReplaceGroup(1835470543);
                        boolean zChanged = composer2.changed(state) | composer2.changedInstance(focusManager);
                        WalletUiState walletUiState = state;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function2) new WalletScreenKt$WalletBody$2$1$1(walletUiState, focusManager, null);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                        ScrollableTopLevelColumnKt.ScrollableTopLevelColumn(null, ComposableLambdaKt.rememberComposableLambda(-599610511, true, new C01842(state, expiryDateController, cvcController, onItemSelected, onExpandedChanged, onAddPaymentMethodOptionClicked, showBottomSheetContent, coroutineScope, hideBottomSheetContent, onSetDefaultClicked, onRemoveClicked, onUpdateClicked, onLogoutClicked, onPrimaryButtonClick, onPayAnotherWayClicked), composer2, 54), composer2, 48, 1);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: WalletScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$2$2, reason: invalid class name and collision with other inner class name */
                static final class C01842 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ CoroutineScope $coroutineScope;
                    final /* synthetic */ CvcController $cvcController;
                    final /* synthetic */ TextFieldController $expiryDateController;
                    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
                    final /* synthetic */ Function1<AddPaymentMethodOption, Unit> $onAddPaymentMethodOptionClicked;
                    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChanged;
                    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
                    final /* synthetic */ Function0<Unit> $onLogoutClicked;
                    final /* synthetic */ Function0<Unit> $onPayAnotherWayClicked;
                    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
                    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onRemoveClicked;
                    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefaultClicked;
                    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onUpdateClicked;
                    final /* synthetic */ Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> $showBottomSheetContent;
                    final /* synthetic */ WalletUiState $state;

                    /* JADX WARN: Multi-variable type inference failed */
                    C01842(WalletUiState walletUiState, TextFieldController textFieldController, CvcController cvcController, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super AddPaymentMethodOption, Unit> function13, Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function14, CoroutineScope coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> function15, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function16, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function17, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function18, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
                        this.$state = walletUiState;
                        this.$expiryDateController = textFieldController;
                        this.$cvcController = cvcController;
                        this.$onItemSelected = function1;
                        this.$onExpandedChanged = function12;
                        this.$onAddPaymentMethodOptionClicked = function13;
                        this.$showBottomSheetContent = function14;
                        this.$coroutineScope = coroutineScope;
                        this.$hideBottomSheetContent = function15;
                        this.$onSetDefaultClicked = function16;
                        this.$onRemoveClicked = function17;
                        this.$onUpdateClicked = function18;
                        this.$onLogoutClicked = function0;
                        this.$onPrimaryButtonClick = function02;
                        this.$onPayAnotherWayClicked = function03;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope ScrollableTopLevelColumn, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
                        if ((i & 17) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-599610511, i, -1, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous> (WalletScreen.kt:177)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            boolean zIsExpanded = this.$state.isExpanded();
                            Modifier.Companion companion2 = companion;
                            WalletUiState walletUiState = this.$state;
                            TextFieldController textFieldController = this.$expiryDateController;
                            CvcController cvcController = this.$cvcController;
                            Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function1 = this.$onItemSelected;
                            Function1<Boolean, Unit> function12 = this.$onExpandedChanged;
                            composer.startReplaceGroup(-1694710766);
                            boolean zChanged = composer.changed(this.$state) | composer.changed(this.$onAddPaymentMethodOptionClicked) | composer.changed(this.$showBottomSheetContent) | composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent);
                            final WalletUiState walletUiState2 = this.$state;
                            final Function1<AddPaymentMethodOption, Unit> function13 = this.$onAddPaymentMethodOptionClicked;
                            final Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function14 = this.$showBottomSheetContent;
                            final CoroutineScope coroutineScope = this.$coroutineScope;
                            final Function1<Continuation<? super Unit>, Object> function15 = this.$hideBottomSheetContent;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$2$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WalletScreenKt.C10592.C01842.invoke$lambda$1$lambda$0(walletUiState2, function13, function14, coroutineScope, function15);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            WalletScreenKt.PaymentDetailsSection(companion2, walletUiState, zIsExpanded, textFieldController, cvcController, function1, function12, (Function0) objRememberedValue, this.$onSetDefaultClicked, this.$onRemoveClicked, this.$onUpdateClicked, this.$onLogoutClicked, this.$showBottomSheetContent, this.$hideBottomSheetContent, composer, (CvcController.$stable << 12) | 6, 0);
                            SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composer, 6);
                            WalletScreenKt.ActionSection(this.$state, this.$onPrimaryButtonClick, this.$onPayAnotherWayClicked, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(WalletUiState walletUiState, Function1 function1, Function1 function12, CoroutineScope coroutineScope, Function1 function13) {
                        if (walletUiState.getAddPaymentMethodOptions().size() == 1) {
                            function1.invoke(walletUiState.getAddPaymentMethodOptions().get(0));
                        } else {
                            function12.invoke(ComposableLambdaKt.composableLambdaInstance(1251160851, true, new WalletScreenKt$WalletBody$2$2$1$1$1(walletUiState, function1, coroutineScope, function13)));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.WalletBody$lambda$15(state, expiryDateController, cvcController, onItemSelected, onExpandedChanged, onAddPaymentMethodOptionClicked, onPrimaryButtonClick, onPayAnotherWayClicked, onDismissAlert, onSetDefaultClicked, onRemoveClicked, onUpdateClicked, onLogoutClicked, showBottomSheetContent, hideBottomSheetContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform WalletBody$lambda$14$lambda$13(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimationsKt.getLinkScreenTransition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PaymentDetailsSection(final Modifier modifier, WalletUiState walletUiState, final boolean z, TextFieldController textFieldController, CvcController cvcController, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function15, final Function0<Unit> function02, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function16, final Function1<? super Continuation<? super Unit>, ? extends Object> function17, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Composer composer2;
        int i7;
        final CvcController cvcController2;
        final TextFieldController textFieldController2;
        final WalletUiState walletUiState2 = walletUiState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-616755762);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(walletUiState2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(textFieldController) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(cvcController) : composerStartRestartGroup.changedInstance(cvcController) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function14) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function15) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function16) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function17) ? 2048 : 1024;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616755762, i3, i4, "com.stripe.android.link.ui.wallet.PaymentDetailsSection (WalletScreen.kt:239)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            composerStartRestartGroup.startReplaceGroup(-793977800);
            if (walletUiState.getPaymentSelectionHint() != null) {
                composer2 = composerStartRestartGroup;
                i5 = i3;
                i6 = i4;
                i7 = 0;
                TextKt.m2076Text4IGK_g(walletUiState.getPaymentSelectionHint(), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(16), 7, null), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBody(), composer2, 48, 0, 65528);
            } else {
                i5 = i3;
                i6 = i4;
                composer2 = composerStartRestartGroup;
                i7 = 0;
            }
            composer2.endReplaceGroup();
            int i8 = i5 >> 9;
            int i9 = ((i5 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016);
            int i10 = i6 << 21;
            walletUiState2 = walletUiState;
            Composer composer3 = composer2;
            int i11 = i7;
            cvcController2 = cvcController;
            PaymentMethodSection(walletUiState2, z, function1, function12, function0, function13, function14, function15, function02, function16, function17, composer3, i9 | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), (i6 >> 9) & 14);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, walletUiState2.getMandate() != null ? 1 : i11, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-538688356, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentDetailsSection$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                    invoke(animatedVisibilityScope, composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i12) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-538688356, i12, -1, "com.stripe.android.link.ui.wallet.PaymentDetailsSection.<anonymous>.<anonymous> (WalletScreen.kt:266)");
                    }
                    ResolvableString mandate = walletUiState2.getMandate();
                    if (mandate != null) {
                        WalletScreenKt.LinkMandate(ResolvableStringComposeUtilsKt.resolve(mandate, composer4, 0), composer4, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer3, 54), composer3, 1572870, 30);
            composerStartRestartGroup = composer3;
            ErrorSection(walletUiState2.getErrorMessage(), composerStartRestartGroup, i11);
            final ConsumerPaymentDetails.Card selectedCard = walletUiState2.getSelectedCard();
            composerStartRestartGroup.startReplaceGroup(-793941053);
            if (selectedCard == null) {
                textFieldController2 = textFieldController;
            } else {
                composerStartRestartGroup.startReplaceGroup(-793940009);
                if (selectedCard.getRequiresCardDetailsRecollection()) {
                    SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
                    textFieldController2 = textFieldController;
                    ColorKt.StripeThemeForLink(null, ComposableLambdaKt.rememberComposableLambda(-117849195, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentDetailsSection$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i12) {
                            if ((i12 & 3) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-117849195, i12, -1, "com.stripe.android.link.ui.wallet.PaymentDetailsSection.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:277)");
                                }
                                ConsumerPaymentDetails.Card card = selectedCard;
                                WalletScreenKt.CardDetailsRecollectionForm(card, textFieldController2, cvcController2, card.isExpired(), null, composer4, CvcController.$stable << 6, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                } else {
                    textFieldController2 = textFieldController;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
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
            textFieldController2 = textFieldController;
            cvcController2 = cvcController;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TextFieldController textFieldController3 = textFieldController2;
            final CvcController cvcController3 = cvcController2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.PaymentDetailsSection$lambda$18(modifier, walletUiState2, z, textFieldController3, cvcController3, function1, function12, function0, function13, function14, function15, function02, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorSection(final ResolvableString resolvableString, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2135513954);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(resolvableString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2135513954, i2, -1, "com.stripe.android.link.ui.wallet.ErrorSection (WalletScreen.kt:290)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(resolvableString != null, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(2026889274, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt.ErrorSection.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2026889274, i3, -1, "com.stripe.android.link.ui.wallet.ErrorSection.<anonymous> (WalletScreen.kt:294)");
                    }
                    ResolvableString resolvableString2 = resolvableString;
                    if (resolvableString2 != null) {
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer2.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ErrorTextKt.ErrorText(resolvableString2.resolve((Context) objConsume), PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, WalletScreenKt.WALLET_SCREEN_ERROR_TAG), 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), null, composer2, 48, 4);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.ErrorSection$lambda$19(resolvableString, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActionSection(final WalletUiState walletUiState, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(829163862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(walletUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829163862, i3, -1, "com.stripe.android.link.ui.wallet.ActionSection (WalletScreen.kt:311)");
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
            PrimaryButtonKt.PrimaryButton(PaddingKt.m1024paddingqDBjuR0$default(TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_PAY_BUTTON), 0.0f, Dp.m6117constructorimpl(16), 0.0f, Dp.m6117constructorimpl(8), 5, null), ResolvableStringComposeUtilsKt.resolve(walletUiState.getPrimaryButtonLabel(), composerStartRestartGroup, 0), walletUiState.getPrimaryButtonState(), function0, null, Integer.valueOf(R.drawable.stripe_ic_lock), composerStartRestartGroup, ((i3 << 6) & 7168) | 6, 16);
            function03 = function0;
            function04 = function02;
            SecondaryButtonKt.SecondaryButton(TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_PAY_ANOTHER_WAY_BUTTON), !walletUiState.getPrimaryButtonState().getIsBlocking(), ResolvableStringComposeUtilsKt.resolve(walletUiState.getSecondaryButtonLabel(), composerStartRestartGroup, 0), function04, composerStartRestartGroup, ((i3 << 3) & 7168) | 6, 0);
            composer2 = composerStartRestartGroup;
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
            function03 = function0;
            composer2 = composerStartRestartGroup;
            function04 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.ActionSection$lambda$21(walletUiState, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PaymentMethodSection(final WalletUiState walletUiState, final boolean z, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function15, final Function0<Unit> function02, final Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function16, final Function1<? super Continuation<? super Unit>, ? extends Object> function17, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function18;
        Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function19;
        Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function110;
        Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function111;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(176610207);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(walletUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            function18 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function18) ? 256 : 128;
        } else {
            function18 = function1;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function19 = function13;
            i3 |= composerStartRestartGroup.changedInstance(function19) ? 131072 : 65536;
        } else {
            function19 = function13;
        }
        if ((1572864 & i) == 0) {
            function110 = function14;
            i3 |= composerStartRestartGroup.changedInstance(function110) ? 1048576 : 524288;
        } else {
            function110 = function14;
        }
        if ((12582912 & i) == 0) {
            function111 = function15;
            i3 |= composerStartRestartGroup.changedInstance(function111) ? 8388608 : 4194304;
        } else {
            function111 = function15;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function16) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function17) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176610207, i3, i4, "com.stripe.android.link.ui.wallet.PaymentMethodSection (WalletScreen.kt:346)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.uicore.R.string.stripe_email, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_wallet_collapsed_payment, composerStartRestartGroup, 0);
            float fComputeMaxLabelWidth = computeMaxLabelWidth(new String[]{strStringResource, strStringResource2}, composerStartRestartGroup, 0);
            String email = walletUiState.getEmail();
            ConsumerPaymentDetails.PaymentDetails selectedItem = walletUiState.getSelectedItem();
            composerStartRestartGroup.startReplaceGroup(-1556140280);
            boolean z2 = ((1879048192 & i3) == 536870912) | ((234881024 & i3) == 67108864);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletScreenKt.PaymentMethodSection$lambda$23$lambda$22(function16, function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            m7968PaymentMethodPickerdsL6K2w(email, strStringResource, fComputeMaxLabelWidth, z, selectedItem, null, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-1667587970, true, new C10582(walletUiState, strStringResource2, fComputeMaxLabelWidth, function12), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1818701153, true, new AnonymousClass3(walletUiState, function18, function16, coroutineScope, function17, function19, function110, function111, function0, function12), composerStartRestartGroup, 54), composer2, ((i3 << 6) & 7168) | 113246208, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.PaymentMethodSection$lambda$24(walletUiState, z, function1, function12, function0, function13, function14, function15, function02, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentMethodSection$lambda$23$lambda$22(Function1 function1, final Function0 function0) {
        function1.invoke(ComposableLambdaKt.composableLambdaInstance(1738203598, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                invoke(columnScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope showBottomSheetContent, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(showBottomSheetContent, "$this$showBottomSheetContent");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1738203598, i, -1, "com.stripe.android.link.ui.wallet.PaymentMethodSection.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:362)");
                }
                LinkAppBarMenuKt.LinkAppBarMenu(function0, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* compiled from: WalletScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
        final /* synthetic */ Function0<Unit> $onAddNewPaymentMethodClicked;
        final /* synthetic */ Function1<Boolean, Unit> $onExpandedChanged;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onRemoveClicked;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefaultClicked;
        final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onUpdateClicked;
        final /* synthetic */ Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> $showBottomSheetContent;
        final /* synthetic */ WalletUiState $state;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(WalletUiState walletUiState, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function12, CoroutineScope coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> function13, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function15, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function16, Function0<Unit> function0, Function1<? super Boolean, Unit> function17) {
            this.$state = walletUiState;
            this.$onItemSelected = function1;
            this.$showBottomSheetContent = function12;
            this.$coroutineScope = coroutineScope;
            this.$hideBottomSheetContent = function13;
            this.$onSetDefaultClicked = function14;
            this.$onRemoveClicked = function15;
            this.$onUpdateClicked = function16;
            this.$onAddNewPaymentMethodClicked = function0;
            this.$onExpandedChanged = function17;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1818701153, i, -1, "com.stripe.android.link.ui.wallet.PaymentMethodSection.<anonymous> (WalletScreen.kt:366)");
                }
                WalletUiState walletUiState = this.$state;
                Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function1 = this.$onItemSelected;
                composer.startReplaceGroup(-2036538659);
                boolean zChanged = composer.changed(this.$showBottomSheetContent) | composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent) | composer.changed(this.$onSetDefaultClicked) | composer.changed(this.$onRemoveClicked) | composer.changed(this.$onUpdateClicked);
                final Function1<Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit>, Unit> function12 = this.$showBottomSheetContent;
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final Function1<Continuation<? super Unit>, Object> function13 = this.$hideBottomSheetContent;
                final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function14 = this.$onSetDefaultClicked;
                final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function15 = this.$onRemoveClicked;
                final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function16 = this.$onUpdateClicked;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function17 = new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return WalletScreenKt.AnonymousClass3.invoke$lambda$1$lambda$0(function12, coroutineScope, function13, function14, function15, function16, (ConsumerPaymentDetails.PaymentDetails) obj);
                        }
                    };
                    composer.updateRememberedValue(function17);
                    objRememberedValue = function17;
                }
                Function1 function18 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                Function0<Unit> function0 = this.$onAddNewPaymentMethodClicked;
                composer.startReplaceGroup(-2036499367);
                boolean zChanged2 = composer.changed(this.$onExpandedChanged);
                final Function1<Boolean, Unit> function19 = this.$onExpandedChanged;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletScreenKt.AnonymousClass3.invoke$lambda$3$lambda$2(function19);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                WalletScreenKt.ExpandedPaymentDetails(walletUiState, function1, function18, function0, (Function0) objRememberedValue2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, CoroutineScope coroutineScope, Function1 function12, Function1 function13, Function1 function14, Function1 function15, ConsumerPaymentDetails.PaymentDetails it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(ComposableLambdaKt.composableLambdaInstance(900402308, true, new WalletScreenKt$PaymentMethodSection$3$1$1$1(it, coroutineScope, function12, function13, function14, function15)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1) {
            function1.invoke(false);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: WalletScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$2, reason: invalid class name and case insensitive filesystem */
    static final class C10582 implements Function3<ConsumerPaymentDetails.PaymentDetails, Composer, Integer, Unit> {
        final /* synthetic */ float $labelMaxWidthDp;
        final /* synthetic */ Function1<Boolean, Unit> $onExpandedChanged;
        final /* synthetic */ String $paymentLabel;
        final /* synthetic */ WalletUiState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C10582(WalletUiState walletUiState, String str, float f, Function1<? super Boolean, Unit> function1) {
            this.$state = walletUiState;
            this.$paymentLabel = str;
            this.$labelMaxWidthDp = f;
            this.$onExpandedChanged = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails, Composer composer, Integer num) {
            invoke(paymentDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ConsumerPaymentDetails.PaymentDetails selectedItem, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1667587970, i, -1, "com.stripe.android.link.ui.wallet.PaymentMethodSection.<anonymous> (WalletScreen.kt:402)");
            }
            boolean z = !this.$state.getPrimaryButtonState().getIsBlocking();
            String str = this.$paymentLabel;
            float f = this.$labelMaxWidthDp;
            composer.startReplaceGroup(-2036486472);
            boolean zChanged = composer.changed(this.$onExpandedChanged);
            final Function1<Boolean, Unit> function1 = this.$onExpandedChanged;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletScreenKt.C10582.invoke$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            WalletScreenKt.m7966CollapsedPaymentDetailsjt2gSs(selectedItem, z, str, f, (Function0) objRememberedValue, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(true);
            return Unit.INSTANCE;
        }
    }

    private static final float computeMaxLabelWidth(String[] strArr, Composer composer, int i) {
        Integer num;
        String[] strArr2 = strArr;
        composer.startReplaceGroup(1911386007);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1911386007, i, -1, "com.stripe.android.link.ui.wallet.computeMaxLabelWidth (WalletScreen.kt:416)");
        }
        ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localTextStyle);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextStyle textStyle = (TextStyle) objConsume;
        TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        if (strArr2.length == 0) {
            num = null;
        } else {
            int i2 = 1;
            Integer numValueOf = Integer.valueOf(IntSize.m6287getWidthimpl(TextMeasurer.m5577measurewNUYSr0$default(textMeasurerRememberTextMeasurer, strArr2[0], textStyle, 0, false, 0, 0L, null, null, null, false, PointerIconCompat.TYPE_GRAB, null).getSize()));
            int lastIndex = ArraysKt.getLastIndex(strArr2);
            if (1 <= lastIndex) {
                while (true) {
                    int i3 = lastIndex;
                    Integer num2 = numValueOf;
                    numValueOf = Integer.valueOf(IntSize.m6287getWidthimpl(TextMeasurer.m5577measurewNUYSr0$default(textMeasurerRememberTextMeasurer, strArr2[i2], textStyle, 0, false, 0, 0L, null, null, null, false, PointerIconCompat.TYPE_GRAB, null).getSize()));
                    if (num2.compareTo(numValueOf) >= 0) {
                        numValueOf = num2;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                    strArr2 = strArr;
                    lastIndex = i3;
                }
            }
            num = numValueOf;
        }
        Integer num3 = num;
        int iIntValue = num3 != null ? num3.intValue() : 0;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float fMo709toDpu2uoSUM = ((Density) objConsume2).mo709toDpu2uoSUM(iIntValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fMo709toDpu2uoSUM;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /* renamed from: PaymentMethodPicker-dsL6K2w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m7968PaymentMethodPickerdsL6K2w(final String str, final String str2, final float f, final boolean z, final ConsumerPaymentDetails.PaymentDetails paymentDetails, Modifier modifier, final Function0<Unit> function0, final Function3<? super ConsumerPaymentDetails.PaymentDetails, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        float f2;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273706768);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            f2 = f;
        } else {
            f2 = f;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paymentDetails) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1273706768, i3, -1, "com.stripe.android.link.ui.wallet.PaymentMethodPicker (WalletScreen.kt:442)");
                    }
                    Modifier modifier3 = modifier2;
                    Modifier modifierM574backgroundbw27NRU = BackgroundKt.m574backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), LinkTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getDefault()), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7806getSurfaceSecondary0d7_KjU(), LinkTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getDefault());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM574backgroundbw27NRU);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    m7967EmailDetails6a0pyJM(str3, str4, f2, function0, composerStartRestartGroup, (i3 & 1022) | ((i3 >> 9) & 7168));
                    LinkDividerKt.LinkDivider(null, composerStartRestartGroup, 0, 1);
                    Boolean boolValueOf = Boolean.valueOf(!z || paymentDetails == null);
                    composerStartRestartGroup.startReplaceGroup(1081528741);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WalletScreenKt.PaymentMethodPicker_dsL6K2w$lambda$29$lambda$28$lambda$27((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, null, null, ComposableLambdaKt.rememberComposableLambda(-249824553, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodPicker$1$2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                            invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, boolean z2, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-249824553, i5, -1, "com.stripe.android.link.ui.wallet.PaymentMethodPicker.<anonymous>.<anonymous> (WalletScreen.kt:473)");
                            }
                            if (z2) {
                                composer3.startReplaceGroup(2075179418);
                                function2.invoke(composer3, 0);
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(2075234443);
                                Function3<ConsumerPaymentDetails.PaymentDetails, Composer, Integer, Unit> function32 = function3;
                                ConsumerPaymentDetails.PaymentDetails paymentDetails2 = paymentDetails;
                                Intrinsics.checkNotNull(paymentDetails2);
                                function32.invoke(paymentDetails2, composer3, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
                    composer2 = composerStartRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WalletScreenKt.PaymentMethodPicker_dsL6K2w$lambda$30(str, str2, f, z, paymentDetails, modifier2, function0, function3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier32 = modifier2;
                Modifier modifierM574backgroundbw27NRU2 = BackgroundKt.m574backgroundbw27NRU(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), LinkTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getDefault()), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7806getSurfaceSecondary0d7_KjU(), LinkTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getDefault());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM574backgroundbw27NRU2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    m7967EmailDetails6a0pyJM(str3, str4, f2, function0, composerStartRestartGroup, (i3 & 1022) | ((i3 >> 9) & 7168));
                    LinkDividerKt.LinkDivider(null, composerStartRestartGroup, 0, 1);
                    if (z) {
                        Boolean boolValueOf2 = Boolean.valueOf(!z || paymentDetails == null);
                        composerStartRestartGroup.startReplaceGroup(1081528741);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue, null, null, null, ComposableLambdaKt.rememberComposableLambda(-249824553, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodPicker$1$2
                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer3, Integer num) {
                                invoke(animatedContentScope, bool.booleanValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedContentScope AnimatedContent, boolean z2, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-249824553, i5, -1, "com.stripe.android.link.ui.wallet.PaymentMethodPicker.<anonymous>.<anonymous> (WalletScreen.kt:473)");
                                }
                                if (z2) {
                                    composer3.startReplaceGroup(2075179418);
                                    function2.invoke(composer3, 0);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(2075234443);
                                    Function3<ConsumerPaymentDetails.PaymentDetails, Composer, Integer, Unit> function32 = function3;
                                    ConsumerPaymentDetails.PaymentDetails paymentDetails2 = paymentDetails;
                                    Intrinsics.checkNotNull(paymentDetails2);
                                    function32.invoke(paymentDetails2, composer3, 0);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
                        composer2 = composerStartRestartGroup;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier32;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform PaymentMethodPicker_dsL6K2w$lambda$29$lambda$28$lambda$27(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Boolean) AnimatedContent.getTargetState()).booleanValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CollapsedPaymentDetails--jt2gSs, reason: not valid java name */
    public static final void m7966CollapsedPaymentDetailsjt2gSs(final ConsumerPaymentDetails.PaymentDetails paymentDetails, final boolean z, final String str, final float f, final Function0<Unit> function0, Composer composer, final int i) {
        ConsumerPaymentDetails.PaymentDetails paymentDetails2;
        int i2;
        String str2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1079418717);
        if ((i & 6) == 0) {
            paymentDetails2 = paymentDetails;
            i2 = (composerStartRestartGroup.changedInstance(paymentDetails2) ? 4 : 2) | i;
        } else {
            paymentDetails2 = paymentDetails;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1079418717, i2, -1, "com.stripe.android.link.ui.wallet.CollapsedPaymentDetails (WalletScreen.kt:489)");
            }
            float f2 = 16;
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.m1022paddingVpY3zN4$default(ClickableKt.m608clickableXHw0xAI$default(SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, COLLAPSED_WALLET_ROW), 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(64), 1, null), z, null, null, function0, 6, null), 0.0f, Dp.m6117constructorimpl(f2), 1, null), ThemeKt.getHorizontalPadding(), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default);
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
            TextKt.m2076Text4IGK_g(str2, SizeKt.m1070width3ABfNKs(TestTagKt.testTag(Modifier.INSTANCE, COLLAPSED_WALLET_HEADER_TAG), f), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i2 >> 6) & 14, 0, 131064);
            PaymentDetailsKt.PaymentDetails(rowScopeInstance, TestTagKt.testTag(Modifier.INSTANCE, COLLAPSED_WALLET_PAYMENT_DETAILS_TAG), paymentDetails2, composerStartRestartGroup, 54 | ((i2 << 6) & 896), 0);
            IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(com.stripe.android.paymentsheet.R.drawable.stripe_link_chevron, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_wallet_expand_accessibility, composerStartRestartGroup, 0), TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6117constructorimpl(22), 0.0f, 11, null), COLLAPSED_WALLET_CHEVRON_ICON_TAG), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7802getIconTertiary0d7_KjU(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.CollapsedPaymentDetails__jt2gSs$lambda$32(paymentDetails, z, str, f, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: EmailDetails-6a0pyJM, reason: not valid java name */
    private static final void m7967EmailDetails6a0pyJM(final String str, final String str2, final float f, final Function0<Unit> function0, Composer composer, final int i) {
        String str3;
        int i2;
        String str4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2000947315);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000947315, i2, -1, "com.stripe.android.link.ui.wallet.EmailDetails (WalletScreen.kt:534)");
            }
            float f2 = 16;
            Modifier modifierM1023paddingqDBjuR0 = PaddingKt.m1023paddingqDBjuR0(SizeKt.m1050defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(64), 1, null), Dp.m6117constructorimpl(20), Dp.m6117constructorimpl(f2), Dp.m6117constructorimpl(14), Dp.m6117constructorimpl(f2));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1023paddingqDBjuR0);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(str4, SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, f), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 >> 3) & 14, 0, 131064);
            TextKt.m2076Text4IGK_g(str3, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), LinkTheme.INSTANCE.getColors(composer2, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer2, 6).getBodyEmphasized(), composer2, i2 & 14, 3120, 55288);
            IconKt.m1926Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_show_menu, composer2, 0), PaddingKt.m1020padding3ABfNKs(ClickableKt.m608clickableXHw0xAI$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape()), false, null, null, function0, 7, null), Dp.m6117constructorimpl(4)), LinkTheme.INSTANCE.getColors(composer2, 6).m7801getIconSecondary0d7_KjU(), composer2, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.EmailDetails_6a0pyJM$lambda$34(str, str2, f, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandedPaymentDetails(final WalletUiState walletUiState, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        boolean z;
        WalletUiState walletUiState2 = walletUiState;
        final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13 = function1;
        final Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14 = function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1362172402);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(walletUiState2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362172402, i3, -1, "com.stripe.android.link.ui.wallet.ExpandedPaymentDetails (WalletScreen.kt:582)");
            }
            boolean z2 = !walletUiState2.getPrimaryButtonState().getIsBlocking() && Intrinsics.areEqual(walletUiState2.getAddBankAccountState(), AddBankAccountState.Idle.INSTANCE);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ExpandedRowHeader(z2, function02, composerStartRestartGroup, (i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            composerStartRestartGroup.startReplaceGroup(-1700743766);
            int i4 = 0;
            for (Object obj : walletUiState2.getPaymentDetailsList()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final ConsumerPaymentDetails.PaymentDetails paymentDetails = (ConsumerPaymentDetails.PaymentDetails) obj;
                boolean zIsItemAvailable = walletUiState2.isItemAvailable(paymentDetails);
                Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_PAYMENT_METHODS_LIST);
                if (z2 && zIsItemAvailable) {
                    i2 = i4;
                    z = true;
                } else {
                    i2 = i4;
                    z = false;
                }
                ConsumerPaymentDetails.PaymentDetails selectedItem = walletUiState2.getSelectedItem();
                boolean zAreEqual = Intrinsics.areEqual(selectedItem != null ? selectedItem.getId() : null, paymentDetails.getId());
                boolean z3 = z2;
                boolean zAreEqual2 = Intrinsics.areEqual(walletUiState2.getCardBeingUpdated(), paymentDetails.getId());
                composerStartRestartGroup.startReplaceGroup(-558925721);
                boolean zChangedInstance = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32) | composerStartRestartGroup.changedInstance(paymentDetails);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletScreenKt.ExpandedPaymentDetails$lambda$40$lambda$39$lambda$36$lambda$35(function13, paymentDetails);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function03 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-558923734);
                boolean zChangedInstance2 = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(paymentDetails);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WalletScreenKt.ExpandedPaymentDetails$lambda$40$lambda$39$lambda$38$lambda$37(function14, paymentDetails);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function04 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                int i6 = i3;
                int i7 = i2;
                PaymentDetailsKt.PaymentDetailsListItem(modifierTestTag, paymentDetails, z, z3, zIsItemAvailable, zAreEqual, zAreEqual2, function03, function04, composer2, 6, 0);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.startReplaceGroup(-1700721208);
                if (i7 != CollectionsKt.getLastIndex(walletUiState.getPaymentDetailsList()) || walletUiState.getCanAddNewPaymentMethod()) {
                    LinkDividerKt.LinkDivider(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(20), 0.0f, 2, null), composerStartRestartGroup, 6, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                walletUiState2 = walletUiState;
                function13 = function1;
                function14 = function12;
                i3 = i6;
                z2 = z3;
                i4 = i5;
            }
            boolean z4 = z2;
            int i8 = i3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1700713656);
            if (walletUiState.getCanAddNewPaymentMethod()) {
                AddPaymentMethodRow(z4, function0, composerStartRestartGroup, (i8 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
            }
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WalletScreenKt.ExpandedPaymentDetails$lambda$41(walletUiState, function1, function12, function0, function02, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedPaymentDetails$lambda$40$lambda$39$lambda$36$lambda$35(Function1 function1, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        function1.invoke(paymentDetails);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedPaymentDetails$lambda$40$lambda$39$lambda$38$lambda$37(Function1 function1, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        function1.invoke(paymentDetails);
        return Unit.INSTANCE;
    }

    private static final void ExpandedRowHeader(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1938085773);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1938085773, i2, -1, "com.stripe.android.link.ui.wallet.ExpandedRowHeader (WalletScreen.kt:628)");
            }
            float f = 20;
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.m1024paddingqDBjuR0$default(ClickableKt.m608clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_EXPANDED_ROW_HEADER), 0.0f, 1, null), z, null, null, function0, 6, null), Dp.m6117constructorimpl(f), 0.0f, Dp.m6117constructorimpl(22), 0.0f, 10, null), 0.0f, Dp.m6117constructorimpl(f), 0.0f, Dp.m6117constructorimpl(8), 5, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_wallet_expanded_title, composerStartRestartGroup, 0), (Modifier) null, LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
            IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(com.stripe.android.paymentsheet.R.drawable.stripe_link_chevron, composer2, 0), StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_wallet_expand_accessibility, composer2, 0), RotateKt.rotate(Modifier.INSTANCE, 180.0f), LinkTheme.INSTANCE.getColors(composer2, 6).m7802getIconTertiary0d7_KjU(), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.ExpandedRowHeader$lambda$43(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AddPaymentMethodRow(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-648872493);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648872493, i2, -1, "com.stripe.android.link.ui.wallet.AddPaymentMethodRow (WalletScreen.kt:659)");
            }
            Modifier modifierM608clickableXHw0xAI$default = ClickableKt.m608clickableXHw0xAI$default(SizeKt.m1051height3ABfNKs(SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, WALLET_ADD_PAYMENT_METHOD_ROW), 0.0f, 1, null), Dp.m6117constructorimpl(60)), z, null, null, function0, 6, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM608clickableXHw0xAI$default);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(com.stripe.android.paymentsheet.R.string.stripe_add_payment_method, composerStartRestartGroup, 0), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, ThemeKt.getHorizontalPadding(), 0.0f, 2, null), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7808getTextBrand0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composer2, 48, 0, 65528);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.AddPaymentMethodRow$lambda$45(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkMandate(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(813955034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(813955034, i2, -1, "com.stripe.android.link.ui.wallet.LinkMandate (WalletScreen.kt:678)");
            }
            HtmlKt.m8897Htmlm4MizFo(replaceHyperlinks(str), PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(12), 0.0f, 0.0f, 13, null), null, LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU(), TextStyle.m5615copyp1EtxEg$default(LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getCaption(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), false, new SpanStyle(LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7808getTextBrand0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), 0, null, composerStartRestartGroup, 48, TypedValues.CycleType.TYPE_EASING);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.LinkMandate$lambda$46(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardDetailsRecollectionForm(final ConsumerPaymentDetails.PaymentDetails paymentDetails, final TextFieldController expiryDateController, final CvcController cvcController, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(expiryDateController, "expiryDateController");
        Intrinsics.checkNotNullParameter(cvcController, "cvcController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1025636480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(paymentDetails) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(expiryDateController) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(cvcController) : composerStartRestartGroup.changedInstance(cvcController) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1025636480, i3, -1, "com.stripe.android.link.ui.wallet.CardDetailsRecollectionForm (WalletScreen.kt:701)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context = (Context) objConsume;
                composerStartRestartGroup.startReplaceGroup(-1143426452);
                zChanged = composerStartRestartGroup.changed(paymentDetails);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    if (z) {
                        listCreateListBuilder.add(new SimpleTextElement(IdentifierSpec.INSTANCE.Generic("date"), expiryDateController));
                    }
                    listCreateListBuilder.add(new CvcElement(IdentifierSpec.INSTANCE.getCardCvc(), cvcController));
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    objRememberedValue = new RowElement(IdentifierSpec.INSTANCE.Generic(paymentDetails.getId()), listBuild, new RowController(listBuild));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                RowElement rowElement = (RowElement) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!z) {
                    i4 = com.stripe.android.paymentsheet.R.string.stripe_wallet_update_expired_card_error;
                } else {
                    i4 = com.stripe.android.paymentsheet.R.string.stripe_wallet_recollect_cvc_error;
                }
                ResolvableString resolvableString = ResolvableStringUtilsKt.getResolvableString(i4);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ErrorTextKt.ErrorText(resolvableString.resolve(context), TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WALLET_SCREEN_RECOLLECTION_FORM_ERROR), null, composerStartRestartGroup, 48, 4);
                SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
                SectionElementUIKt.SectionElementUI(true, SectionElement.Companion.wrap$default(SectionElement.INSTANCE, rowElement, (ResolvableString) null, 2, (Object) null), SetsKt.emptySet(), ((SectionSingleFieldElement) CollectionsKt.last((List) rowElement.getFields())).getIdentifier(), TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_RECOLLECTION_FORM_FIELDS), composerStartRestartGroup, (SectionElement.$stable << 3) | 24966 | (IdentifierSpec.$stable << 9), 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WalletScreenKt.CardDetailsRecollectionForm$lambda$50(paymentDetails, expiryDateController, cvcController, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context2 = (Context) objConsume2;
            composerStartRestartGroup.startReplaceGroup(-1143426452);
            zChanged = composerStartRestartGroup.changed(paymentDetails);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                if (z) {
                }
                listCreateListBuilder2.add(new CvcElement(IdentifierSpec.INSTANCE.getCardCvc(), cvcController));
                List listBuild2 = CollectionsKt.build(listCreateListBuilder2);
                objRememberedValue = new RowElement(IdentifierSpec.INSTANCE.Generic(paymentDetails.getId()), listBuild2, new RowController(listBuild2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                RowElement rowElement2 = (RowElement) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (!z) {
                }
                ResolvableString resolvableString2 = ResolvableStringUtilsKt.getResolvableString(i4);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting()) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ErrorTextKt.ErrorText(resolvableString2.resolve(context2), TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WALLET_SCREEN_RECOLLECTION_FORM_ERROR), null, composerStartRestartGroup, 48, 4);
                    SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
                    SectionElementUIKt.SectionElementUI(true, SectionElement.Companion.wrap$default(SectionElement.INSTANCE, rowElement2, (ResolvableString) null, 2, (Object) null), SetsKt.emptySet(), ((SectionSingleFieldElement) CollectionsKt.last((List) rowElement2.getFields())).getIdentifier(), TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_RECOLLECTION_FORM_FIELDS), composerStartRestartGroup, (SectionElement.$stable << 3) | 24966 | (IdentifierSpec.$stable << 9), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AlertMessage(final ResolvableString resolvableString, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(628533920);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(resolvableString) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628533920, i2, -1, "com.stripe.android.link.ui.wallet.AlertMessage (WalletScreen.kt:760)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            AndroidAlertDialog_androidKt.m1753AlertDialog6oU6zVQ(function0, ComposableLambdaKt.rememberComposableLambda(-820649640, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt.AlertMessage.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-820649640, i3, -1, "com.stripe.android.link.ui.wallet.AlertMessage.<anonymous> (WalletScreen.kt:775)");
                        }
                        Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, WalletScreenKt.WALLET_SCREEN_DIALOG_BUTTON_TAG);
                        Function0<Unit> function02 = function0;
                        final Context context2 = context;
                        ButtonKt.TextButton(function02, modifierTestTag, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1375463685, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt.AlertMessage.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope TextButton, Composer composer3, int i4) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i4 & 17) != 16 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1375463685, i4, -1, "com.stripe.android.link.ui.wallet.AlertMessage.<anonymous>.<anonymous> (WalletScreen.kt:780)");
                                    }
                                    TextKt.m2076Text4IGK_g(ResolvableStringUtilsKt.getResolvableString(android.R.string.ok).resolve(context2), (Modifier) null, LinkTheme.INSTANCE.getColors(composer3, 6).m7808getTextBrand0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131066);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), TestTagKt.testTag(Modifier.INSTANCE, WALLET_SCREEN_DIALOG_TAG), null, null, ComposableLambdaKt.rememberComposableLambda(-1679966252, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt.AlertMessage.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1679966252, i3, -1, "com.stripe.android.link.ui.wallet.AlertMessage.<anonymous> (WalletScreen.kt:766)");
                        }
                        TextKt.m2076Text4IGK_g(ResolvableStringComposeUtilsKt.resolve(resolvableString, composer2, 0), (Modifier) null, LinkTheme.INSTANCE.getColors(composer2, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer2, 6).getBody(), composer2, 0, 0, 65530);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), null, LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7805getSurfacePrimary0d7_KjU(), 0L, null, composerStartRestartGroup, ((i2 >> 3) & 14) | 197040, 856);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WalletScreenKt.AlertMessage$lambda$51(resolvableString, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final FinancialConnectionsSheetForDataLauncher rememberFinancialConnectionsSheetInternal(FinancialConnectionsAvailability financialConnectionsAvailability, Function1<? super FinancialConnectionsSheetResult, Unit> function1, Composer composer, int i) {
        composer.startReplaceGroup(965013740);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(965013740, i, -1, "com.stripe.android.link.ui.wallet.rememberFinancialConnectionsSheetInternal (WalletScreen.kt:794)");
        }
        if (financialConnectionsAvailability == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceGroup(1560234453);
        boolean zChanged = composer.changed(context) | ((((i & 14) ^ 6) > 4 && composer.changed(financialConnectionsAvailability)) || (i & 6) == 4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new FinancialConnectionsSheetForDataContract(FinancialConnectionsAvailabilityKt.getIntentBuilder(financialConnectionsAvailability, context));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Object objRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult((FinancialConnectionsSheetForDataContract) objRememberedValue, function1, composer, i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        composer.startReplaceGroup(1560244142);
        boolean zChanged2 = composer.changed(objRememberLauncherForActivityResult);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new FinancialConnectionsSheetForDataLauncher((ActivityResultLauncher) objRememberLauncherForActivityResult);
            composer.updateRememberedValue(objRememberedValue2);
        }
        FinancialConnectionsSheetForDataLauncher financialConnectionsSheetForDataLauncher = (FinancialConnectionsSheetForDataLauncher) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsSheetForDataLauncher;
    }

    private static final String replaceHyperlinks(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "<terms>", "<a href=\"https://link.com/terms/ach-authorization\">", false, 4, (Object) null), "</terms>", "</a>", false, 4, (Object) null);
    }

    private static final WalletUiState WalletScreen$lambda$0(State<WalletUiState> state) {
        return state.getValue();
    }
}
