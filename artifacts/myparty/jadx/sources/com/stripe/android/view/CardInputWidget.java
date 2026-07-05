package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import androidx.core.os.BundleKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.Cvc;
import com.stripe.android.databinding.StripeCardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.ui.core.elements.CardNumberConfig;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardInputWidget.kt */
@Metadata(d1 = {"\u0000«\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001a*\u00011\b\u0007\u0018\u0000 ÷\u00012\u00020\u00012\u00020\u0002:\u001cê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\t\u0010\u0098\u0001\u001a\u000209H\u0002J\n\u0010\u009b\u0001\u001a\u00030\u0097\u0001H\u0014J\n\u0010\u009c\u0001\u001a\u00030\u0097\u0001H\u0014J\n\u0010\u009d\u0001\u001a\u00030\u0097\u0001H\u0014J\u0015\u0010\u009e\u0001\u001a\u00030\u0097\u00012\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010/H\u0016J\u0015\u0010 \u0001\u001a\u00030\u0097\u00012\t\u0010¡\u0001\u001a\u0004\u0018\u00010-H\u0016J\u0015\u0010¢\u0001\u001a\u00030\u0097\u00012\t\u0010£\u0001\u001a\u0004\u0018\u00010\fH\u0016J\u0013\u0010¤\u0001\u001a\u00030\u0097\u00012\u0007\u0010¥\u0001\u001a\u00020\fH\u0016J \u0010¦\u0001\u001a\u00030\u0097\u00012\t\b\u0001\u0010§\u0001\u001a\u00020\b2\t\b\u0001\u0010¨\u0001\u001a\u00020\bH\u0016J\u0015\u0010©\u0001\u001a\u00030\u0097\u00012\t\u0010ª\u0001\u001a\u0004\u0018\u00010\fH\u0016J\u001b\u0010«\u0001\u001a\u00030\u0097\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0003\b\u00ad\u0001J\u0017\u0010®\u0001\u001a\u00030\u0097\u00012\r\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020W0aJ\n\u0010°\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010±\u0001\u001a\u00030\u0097\u00012\u0007\u0010²\u0001\u001a\u000209H\u0016J\u0016\u0010³\u0001\u001a\u00030\u0097\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0016J\u0016\u0010¶\u0001\u001a\u00030\u0097\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0016J\u0016\u0010¸\u0001\u001a\u00030\u0097\u00012\n\u0010¹\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0016J\u0016\u0010º\u0001\u001a\u00030\u0097\u00012\n\u0010»\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0016J\t\u0010²\u0001\u001a\u000209H\u0016J\u0013\u0010¼\u0001\u001a\u0002092\b\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\n\u0010¿\u0001\u001a\u00030À\u0001H\u0014J\u0014\u0010Á\u0001\u001a\u00030\u0097\u00012\b\u0010Â\u0001\u001a\u00030À\u0001H\u0014J\u001e\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u00012\u0007\u0010Å\u0001\u001a\u00020\b2\u0007\u0010\u0099\u0001\u001a\u00020\bH\u0002J-\u0010Æ\u0001\u001a\u00030\u0097\u00012\u0006\u0010A\u001a\u0002092\b\b\u0002\u0010{\u001a\u00020\b2\t\b\u0002\u0010\u0099\u0001\u001a\u00020\bH\u0001¢\u0006\u0003\bÇ\u0001J&\u0010È\u0001\u001a\u00030\u0097\u00012\b\u0010É\u0001\u001a\u00030Ê\u00012\u0007\u0010Ë\u0001\u001a\u00020\b2\u0007\u0010Ì\u0001\u001a\u00020\bH\u0002J\u001b\u0010Í\u0001\u001a\u00020\b2\u0007\u0010Î\u0001\u001a\u00020\f2\u0007\u0010Ï\u0001\u001a\u00020\\H\u0002J\u0014\u0010Ð\u0001\u001a\u00030\u0097\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0013\u0010Ñ\u0001\u001a\u00030\u0097\u00012\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010Ó\u0001\u001a\u00030\u0097\u00012\u0006\u0010V\u001a\u00020WH\u0002J\u0019\u0010Ô\u0001\u001a\u00030\u0097\u00012\r\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020W0aH\u0002J\u0018\u0010Ö\u0001\u001a\u00020\f2\u0007\u0010×\u0001\u001a\u00020\bH\u0001¢\u0006\u0003\bØ\u0001J\u0014\u0010Ù\u0001\u001a\u00030\u0097\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010Ú\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010Û\u0001\u001a\u00030\u0097\u0001H\u0002J\u001a\u0010Ü\u0001\u001a\u00030\u0097\u00012\u000e\u0010Ý\u0001\u001a\t\u0012\u0005\u0012\u00030Þ\u00010aH\u0002J7\u0010ß\u0001\u001a\u00030\u0097\u00012\u0007\u0010à\u0001\u001a\u0002092\u0007\u0010á\u0001\u001a\u00020\b2\u0007\u0010â\u0001\u001a\u00020\b2\u0007\u0010ã\u0001\u001a\u00020\b2\u0007\u0010ä\u0001\u001a\u00020\bH\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000205048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R,\u0010:\u001a\u0002092\u0006\u00108\u001a\u0002098\u0000@BX\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u000e\u0010D\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020FX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020LX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u0004\u0018\u00010S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010V\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010<\u001a\u0004\b^\u00107R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020\\04X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010`\u001a\b\u0012\u0004\u0012\u00020\\0a8@X\u0081\u0004¢\u0006\f\u0012\u0004\bb\u0010<\u001a\u0004\bc\u0010dR\u001c\u0010e\u001a\u0004\u0018\u00010fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010k\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0016\u0010o\u001a\u0004\u0018\u00010p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010s\u001a\u0004\u0018\u00010t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010w\u001a\u0004\u0018\u00010x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010{\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R$\u0010~\u001a\b\u0012\u0004\u0012\u00020\b0\u007fX\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R1\u0010\u0085\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0005\b\u0086\u0001\u0010>\"\u0005\b\u0087\u0001\u0010@R1\u0010\u008a\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u008d\u0001\u0010\u0089\u0001\u001a\u0005\b\u008b\u0001\u0010>\"\u0005\b\u008c\u0001\u0010@R1\u0010\u008e\u0001\u001a\u0002092\u0007\u0010\u0084\u0001\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b\u0091\u0001\u0010\u0089\u0001\u001a\u0005\b\u008f\u0001\u0010>\"\u0005\b\u0090\u0001\u0010@R,\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\b\u00108\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0093\u0001\u0010Q\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010}R\u000f\u0010å\u0001\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010æ\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bç\u0001\u0010QR\u0016\u0010è\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bé\u0001\u0010Q¨\u0006ø\u0001"}, d2 = {"Lcom/stripe/android/view/CardInputWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "customCvcLabel", "", "viewBinding", "Lcom/stripe/android/databinding/StripeCardInputWidgetBinding;", "containerLayout", "Landroid/widget/FrameLayout;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "expiryDateTextInputLayout", "cvcNumberTextInputLayout", "postalCodeTextInputLayout", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText$payments_core_release", "()Lcom/stripe/android/view/CardNumberEditText;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText$payments_core_release", "()Lcom/stripe/android/view/ExpiryDateEditText;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText$payments_core_release", "()Lcom/stripe/android/view/CvcEditText;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "lifecycleDelegate", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1", "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields", "()Ljava/util/Set;", "value", "", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "()V", "getShouldShowErrorIcon$payments_core_release", "()Z", "setShouldShowErrorIcon", "(Z)V", "isShowingFullCard", "isShowingFullCard$payments_core_release", "setShowingFullCard$payments_core_release", "isViewInitialized", "layoutWidthCalculator", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "getLayoutWidthCalculator$payments_core_release", "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "setLayoutWidthCalculator$payments_core_release", "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V", "placement", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "getPlacement$payments_core_release", "()Lcom/stripe/android/view/CardInputWidgetPlacement;", "postalCodeValue", "getPostalCodeValue", "()Ljava/lang/String;", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc", "()Lcom/stripe/android/cards/Cvc$Validated;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "requiredFields", "", "Lcom/stripe/android/view/StripeEditText;", "getRequiredFields$payments_core_release$annotations", "getRequiredFields$payments_core_release", "allFields", "currentFields", "", "getCurrentFields$payments_core_release$annotations", "getCurrentFields$payments_core_release", "()Ljava/util/List;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "frameWidth", "getFrameWidth", "()I", "frameWidthSupplier", "Lkotlin/Function0;", "getFrameWidthSupplier$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setFrameWidthSupplier$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "postalCodeEnabled", "getPostalCodeEnabled", "setPostalCodeEnabled", "postalCodeEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "postalCodeRequired", "getPostalCodeRequired", "setPostalCodeRequired", "postalCodeRequired$delegate", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "onBehalfOf", "getOnBehalfOf", "setOnBehalfOf", "(Ljava/lang/String;)V", "updatePostalRequired", "", "isPostalRequired", "frameStart", "getFrameStart", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "setCardValidCallback", "callback", "setCardInputListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCardNumber", "cardNumber", "setCardHint", "cardHint", "setExpiryDate", "month", "year", "setCvcCode", "cvcCode", "setPostalCode", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "setPostalCode$payments_core_release", "setPreferredNetworks", "preferredNetworks", "clear", "setEnabled", "isEnabled", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "getFocusField", "Lcom/stripe/android/view/CardInputWidget$Field;", "touchX", "updateSpaceSizes", "updateSpaceSizes$payments_core_release", "updateFieldLayout", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "newWidth", "newMarginStart", "getDesiredWidthInPixels", "text", "editText", "initView", "setCvcLabel", "cvcLabel", "updateCvc", "handlePossibleCardBrandsChanged", "brands", "createHiddenCardText", "panLength", "createHiddenCardText$payments_core_release", "applyCardElementAttributes", "scrollStart", "scrollEnd", "startSlideAnimation", "animations", "Landroid/view/animation/Animation;", "onLayout", "changed", "l", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "b", "hiddenCardText", "cvcPlaceHolder", "getCvcPlaceHolder", "peekCardText", "getPeekCardText", "CardFieldAnimation", "CardNumberSlideStartAnimation", "ExpiryDateSlideStartAnimation", "CvcSlideStartAnimation", "PostalCodeSlideStartAnimation", "CardNumberSlideEndAnimation", "ExpiryDateSlideEndAnimation", "CvcSlideEndAnimation", "PostalCodeSlideEndAnimation", "AnimationEndListener", "LayoutWidthCalculator", "DefaultLayoutWidthCalculator", "Field", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardInputWidget extends LinearLayout implements CardWidget {
    private static final String CVC_PLACEHOLDER_AMEX = "2345";
    private static final String CVC_PLACEHOLDER_COMMON = "CVC";
    private static final String FULL_SIZING_CARD_TEXT = "4242 4242 4242 4242 424";
    private static final String FULL_SIZING_DATE_TEXT = "MM/MM";
    private static final String FULL_SIZING_POSTAL_CODE_TEXT = "1234567890";
    public static final String LOGGING_TOKEN = "CardInputView";
    private static final String STATE_CARD_VIEWED = "state_card_viewed";
    private static final String STATE_ON_BEHALF_OF = "state_on_behalf_of";
    private static final String STATE_POSTAL_CODE_ENABLED = "state_postal_code_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final Set<StripeEditText> allFields;
    private final /* synthetic */ CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final /* synthetic */ CardNumberEditText cardNumberEditText;
    private final TextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardInputWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private final FrameLayout containerLayout;
    private String customCvcLabel;
    private final /* synthetic */ CvcEditText cvcEditText;
    private final TextInputLayout cvcNumberTextInputLayout;
    private final /* synthetic */ ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryDateTextInputLayout;
    private /* synthetic */ Function0<Integer> frameWidthSupplier;
    private String hiddenCardText;
    private /* synthetic */ boolean isShowingFullCard;
    private boolean isViewInitialized;
    private /* synthetic */ LayoutWidthCalculator layoutWidthCalculator;
    private final LifecycleOwnerDelegate lifecycleDelegate;
    private String onBehalfOf;
    private final CardInputWidgetPlacement placement;
    private final /* synthetic */ PostalCodeEditText postalCodeEditText;

    /* renamed from: postalCodeEnabled$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty postalCodeEnabled;

    /* renamed from: postalCodeRequired$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty postalCodeRequired;
    private final TextInputLayout postalCodeTextInputLayout;
    private final /* synthetic */ Set<StripeEditText> requiredFields;
    private boolean shouldShowErrorIcon;

    /* renamed from: usZipCodeRequired$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty usZipCodeRequired;
    private final StripeCardInputWidgetBinding viewBinding;
    private ViewModelStoreOwner viewModelStoreOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeEnabled", "getPostalCodeEnabled()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "postalCodeRequired", "getPostalCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardInputWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_READER_ID = R.id.stripe_default_reader_id;

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;", "Landroid/view/animation/Animation$AnimationListener;", "<init>", "()V", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class AnimationEndListener implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LayoutWidthCalculator {
        int calculate(String text, TextPaint paint);
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Field.values().length];
            try {
                iArr[Field.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Field.Expiry.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Field.Cvc.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Field.PostalCode.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardInputWidget(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardInputWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCurrentFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getRequiredFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    public /* synthetic */ CardInputWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1] */
    public CardInputWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeCardInputWidgetBinding stripeCardInputWidgetBindingInflate = StripeCardInputWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardInputWidgetBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardInputWidgetBindingInflate;
        FrameLayout container = stripeCardInputWidgetBindingInflate.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        this.containerLayout = container;
        CardBrandView cardBrandView = stripeCardInputWidgetBindingInflate.cardBrandView;
        Intrinsics.checkNotNullExpressionValue(cardBrandView, "cardBrandView");
        this.cardBrandView = cardBrandView;
        TextInputLayout cardNumberTextInputLayout = stripeCardInputWidgetBindingInflate.cardNumberTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(cardNumberTextInputLayout, "cardNumberTextInputLayout");
        this.cardNumberTextInputLayout = cardNumberTextInputLayout;
        TextInputLayout expiryDateTextInputLayout = stripeCardInputWidgetBindingInflate.expiryDateTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(expiryDateTextInputLayout, "expiryDateTextInputLayout");
        this.expiryDateTextInputLayout = expiryDateTextInputLayout;
        TextInputLayout cvcTextInputLayout = stripeCardInputWidgetBindingInflate.cvcTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(cvcTextInputLayout, "cvcTextInputLayout");
        this.cvcNumberTextInputLayout = cvcTextInputLayout;
        TextInputLayout postalCodeTextInputLayout = stripeCardInputWidgetBindingInflate.postalCodeTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(postalCodeTextInputLayout, "postalCodeTextInputLayout");
        this.postalCodeTextInputLayout = postalCodeTextInputLayout;
        CardNumberEditText cardNumberEditText = stripeCardInputWidgetBindingInflate.cardNumberEditText;
        Intrinsics.checkNotNullExpressionValue(cardNumberEditText, "cardNumberEditText");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = stripeCardInputWidgetBindingInflate.expiryDateEditText;
        Intrinsics.checkNotNullExpressionValue(expiryDateEditText, "expiryDateEditText");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = stripeCardInputWidgetBindingInflate.cvcEditText;
        Intrinsics.checkNotNullExpressionValue(cvcEditText, "cvcEditText");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = stripeCardInputWidgetBindingInflate.postalCodeEditText;
        Intrinsics.checkNotNullExpressionValue(postalCodeEditText, "postalCodeEditText");
        this.postalCodeEditText = postalCodeEditText;
        this.lifecycleDelegate = new LifecycleOwnerDelegate();
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                CardValidCallback cardValidCallback = this.this$0.cardValidCallback;
                if (cardValidCallback != null) {
                    cardValidCallback.onInputChanged(this.this$0.getInvalidFields().isEmpty(), this.this$0.getInvalidFields());
                }
            }
        };
        this.isShowingFullCard = true;
        this.layoutWidthCalculator = new DefaultLayoutWidthCalculator();
        this.placement = new CardInputWidgetPlacement(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        Delegates delegates = Delegates.INSTANCE;
        final boolean z = true;
        this.postalCodeEnabled = new ObservableProperty<Boolean>(z) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                if (zBooleanValue) {
                    this.getPostalCodeEditText().setEnabled(true);
                    this.postalCodeTextInputLayout.setVisibility(0);
                    this.getCvcEditText().setImeOptions(5);
                    this.getPostalCodeEditText().removeTextChangedListener(this.cardValidTextWatcher);
                    this.getPostalCodeEditText().addTextChangedListener(this.cardValidTextWatcher);
                } else {
                    this.getPostalCodeEditText().setEnabled(false);
                    this.postalCodeTextInputLayout.setVisibility(8);
                    this.getCvcEditText().setImeOptions(6);
                    this.getPostalCodeEditText().removeTextChangedListener(this.cardValidTextWatcher);
                }
                this.updatePostalRequired();
            }
        };
        Delegates delegates2 = Delegates.INSTANCE;
        final boolean z2 = false;
        this.postalCodeRequired = new ObservableProperty<Boolean>(z2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.booleanValue();
                oldValue.booleanValue();
                this.updatePostalRequired();
            }
        };
        Delegates delegates3 = Delegates.INSTANCE;
        this.usZipCodeRequired = new ObservableProperty<Boolean>(z2) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                if (zBooleanValue) {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.US);
                } else {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
                this.updatePostalRequired();
            }
        };
        if (getId() == -1) {
            setId(DEFAULT_READER_ID);
        }
        setOrientation(0);
        setMinimumWidth(getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_min_width));
        this.frameWidthSupplier = new Function0() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CardInputWidget._init_$lambda$16(this.f$0));
            }
        };
        Set<StripeEditText> setMutableSetOf = SetsKt.mutableSetOf(cardNumberEditText, cvcEditText, expiryDateEditText);
        this.requiredFields = setMutableSetOf;
        this.allFields = SetsKt.plus(setMutableSetOf, postalCodeEditText);
        initView(attributeSet);
        this.hiddenCardText = createHiddenCardText$payments_core_release(cardNumberEditText.getPanLength$payments_core_release());
    }

    /* renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    /* renamed from: getCardNumberEditText$payments_core_release, reason: from getter */
    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    /* renamed from: getExpiryDateEditText$payments_core_release, reason: from getter */
    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    /* renamed from: getCvcEditText$payments_core_release, reason: from getter */
    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    /* renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
        String postalCode$payments_core_release;
        CardValidCallback.Fields[] fieldsArr = new CardValidCallback.Fields[4];
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardValidCallback.Fields fields2 = null;
        if (this.cardNumberEditText.getValidatedCardNumber$payments_core_release() != null) {
            fields = null;
        }
        fieldsArr[0] = fields;
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (this.expiryDateEditText.getValidatedDate() != null) {
            fields3 = null;
        }
        fieldsArr[1] = fields3;
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (getCvc() != null) {
            fields4 = null;
        }
        fieldsArr[2] = fields4;
        CardValidCallback.Fields fields5 = CardValidCallback.Fields.Postal;
        if (isPostalRequired() && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release))) {
            fields2 = fields5;
        }
        fieldsArr[3] = fields2;
        return CollectionsKt.toSet(CollectionsKt.listOfNotNull((Object[]) fieldsArr));
    }

    /* renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShouldShowErrorIcon(boolean z) {
        this.cardBrandView.setShouldShowErrorIcon(z);
        this.shouldShowErrorIcon = z;
    }

    /* renamed from: isShowingFullCard$payments_core_release, reason: from getter */
    public final boolean getIsShowingFullCard() {
        return this.isShowingFullCard;
    }

    public final void setShowingFullCard$payments_core_release(boolean z) {
        this.isShowingFullCard = z;
    }

    /* renamed from: getLayoutWidthCalculator$payments_core_release, reason: from getter */
    public final LayoutWidthCalculator getLayoutWidthCalculator() {
        return this.layoutWidthCalculator;
    }

    public final void setLayoutWidthCalculator$payments_core_release(LayoutWidthCalculator layoutWidthCalculator) {
        Intrinsics.checkNotNullParameter(layoutWidthCalculator, "<set-?>");
        this.layoutWidthCalculator = layoutWidthCalculator;
    }

    /* renamed from: getPlacement$payments_core_release, reason: from getter */
    public final CardInputWidgetPlacement getPlacement() {
        return this.placement;
    }

    private final String getPostalCodeValue() {
        if (getPostalCodeEnabled()) {
            return this.postalCodeEditText.getPostalCode$payments_core_release();
        }
        return null;
    }

    private final Cvc.Validated getCvc() {
        return this.cvcEditText.getCvc$payments_core_release();
    }

    public final CardBrand getBrand() {
        return this.cardNumberEditText.getCardBrand();
    }

    public final Set<StripeEditText> getRequiredFields$payments_core_release() {
        return this.requiredFields;
    }

    public final /* synthetic */ List getCurrentFields$payments_core_release() {
        Set<StripeEditText> set = this.requiredFields;
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        if (!getPostalCodeEnabled()) {
            postalCodeEditText = null;
        }
        return CollectionsKt.filterNotNull(SetsKt.plus(set, postalCodeEditText));
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number = cardParams.getNumber();
        String cvc = cardParams.getCvc();
        int expMonth = cardParams.getExpMonth();
        int expYear = cardParams.getExpYear();
        return new PaymentMethodCreateParams.Card(number, Integer.valueOf(expMonth), Integer.valueOf(expYear), cvc, null, cardParams.getAttribution(), this.cardBrandView.paymentMethodCreateParamsNetworks(), 16, null);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        String postalCodeValue = getPostalCodeValue();
        if (postalCodeValue != null) {
            return new PaymentMethod.BillingDetails(new Address(null, null, null, null, postalCodeValue, null, 47, null), null, null, null, 14, null);
        }
        return null;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, getBillingDetails(), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
        }
        return null;
    }

    @Override // com.stripe.android.view.CardWidget
    public CardParams getCardParams() {
        String postalCode$payments_core_release;
        CardNumber.Validated validatedCardNumber$payments_core_release = this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        Cvc.Validated cvc = getCvc();
        this.cardNumberEditText.setShouldShowError(validatedCardNumber$payments_core_release == null);
        this.expiryDateEditText.setShouldShowError(validatedDate == null);
        this.cvcEditText.setShouldShowError(cvc == null);
        this.postalCodeEditText.setShouldShowError((getPostalCodeRequired() || getUsZipCodeRequired()) && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release)));
        List currentFields$payments_core_release = getCurrentFields$payments_core_release();
        ArrayList<StripeEditText> arrayList = new ArrayList();
        for (Object obj : currentFields$payments_core_release) {
            if (((StripeEditText) obj).getShouldShowError()) {
                arrayList.add(obj);
            }
        }
        for (StripeEditText stripeEditText : arrayList) {
            String errorMessage = stripeEditText.getErrorMessage();
            if (errorMessage != null) {
                stripeEditText.announceForAccessibility(errorMessage);
            }
        }
        String str = null;
        if (validatedCardNumber$payments_core_release == null) {
            this.cardNumberEditText.requestFocus();
        } else if (validatedDate == null) {
            this.expiryDateEditText.requestFocus();
        } else if (cvc == null) {
            this.cvcEditText.requestFocus();
        } else if (this.postalCodeEditText.getShouldShowError()) {
            this.postalCodeEditText.requestFocus();
        } else {
            setShouldShowErrorIcon(false);
            CardBrand brand = getBrand();
            Set of = SetsKt.setOf(LOGGING_TOKEN);
            String value = validatedCardNumber$payments_core_release.getValue();
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            String value$payments_core_release = cvc.getValue$payments_core_release();
            Address.Builder builder = new Address.Builder();
            String postalCodeValue = getPostalCodeValue();
            String str2 = postalCodeValue;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                str = postalCodeValue;
            }
            return new CardParams(brand, of, value, month, year, value$payments_core_release, null, builder.setPostalCode(str).build(), null, this.cardBrandView.cardParamsNetworks(), null, 1344, null);
        }
        setShouldShowErrorIcon(true);
        return null;
    }

    private final int getFrameWidth() {
        return this.frameWidthSupplier.invoke().intValue();
    }

    public final Function0<Integer> getFrameWidthSupplier$payments_core_release() {
        return this.frameWidthSupplier;
    }

    public final void setFrameWidthSupplier$payments_core_release(Function0<Integer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.frameWidthSupplier = function0;
    }

    public final boolean getPostalCodeEnabled() {
        return ((Boolean) this.postalCodeEnabled.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setPostalCodeEnabled(boolean z) {
        this.postalCodeEnabled.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final boolean getPostalCodeRequired() {
        return ((Boolean) this.postalCodeRequired.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final void setOnBehalfOf(final String str) {
        if (Intrinsics.areEqual(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            CardWidgetViewModelKt.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardInputWidget._set_onBehalfOf_$lambda$15(str, (LifecycleOwner) obj, (CardWidgetViewModel) obj2);
                }
            });
        }
        this.onBehalfOf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_onBehalfOf_$lambda$15(String str, LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        viewModel.setOnBehalfOf(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePostalRequired() {
        if (isPostalRequired()) {
            this.requiredFields.add(this.postalCodeEditText);
        } else {
            this.requiredFields.remove(this.postalCodeEditText);
        }
    }

    private final boolean isPostalRequired() {
        return (getPostalCodeRequired() || getUsZipCodeRequired()) && getPostalCodeEnabled();
    }

    private final int getFrameStart() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            return this.containerLayout.getLeft();
        }
        return this.containerLayout.getRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _init_$lambda$16(CardInputWidget cardInputWidget) {
        return cardInputWidget.containerLayout.getWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        CardInputWidget cardInputWidget = this;
        this.lifecycleDelegate.initLifecycle(cardInputWidget);
        CardWidgetViewModelKt.doWithCardWidgetViewModel(cardInputWidget, this.viewModelStoreOwner, new Function2() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardInputWidget.onAttachedToWindow$lambda$18(this.f$0, (LifecycleOwner) obj, (CardWidgetViewModel) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$18(CardInputWidget cardInputWidget, LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (cardInputWidget.onBehalfOf != null && !Intrinsics.areEqual(viewModel.get_onBehalfOf(), cardInputWidget.onBehalfOf)) {
            viewModel.setOnBehalfOf(cardInputWidget.onBehalfOf);
        }
        StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardInputWidget$onAttachedToWindow$lambda$18$$inlined$launchAndCollect$default$1(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardInputWidget), 3, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleDelegate.destroyLifecycle(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback callback) {
        this.cardValidCallback = callback;
        Iterator<T> it = this.requiredFields.iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (callback != null) {
            Iterator<T> it2 = this.requiredFields.iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback = this.cardValidCallback;
        if (cardValidCallback != null) {
            cardValidCallback.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener listener) {
        this.cardInputListener = listener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
        this.isShowingFullCard = !this.cardNumberEditText.getIsCardNumberValid();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberEditText.setHint(cardHint);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int month, int year) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(month, year).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public final /* synthetic */ void setPostalCode$payments_core_release(String postalCode) {
        this.postalCodeEditText.setText(postalCode);
    }

    public final void setPreferredNetworks(List<? extends CardBrand> preferredNetworks) {
        Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[EDGE_INSN: B:23:0x0031->B:15:0x0031 BREAK  A[LOOP:1: B:8:0x0018->B:24:?]] */
    @Override // com.stripe.android.view.CardWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void clear() {
        List currentFields$payments_core_release = getCurrentFields$payments_core_release();
        if (!(currentFields$payments_core_release instanceof Collection) || !currentFields$payments_core_release.isEmpty()) {
            Iterator it = currentFields$payments_core_release.iterator();
            while (it.hasNext()) {
                if (((StripeEditText) it.next()).hasFocus()) {
                    break;
                }
            }
            if (hasFocus()) {
                this.cardNumberEditText.requestFocus();
            }
        } else if (hasFocus()) {
        }
        Iterator it2 = getCurrentFields$payments_core_release().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).setText("");
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean isEnabled) {
        Iterator it = getCurrentFields$payments_core_release().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).setEnabled(isEnabled);
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher) {
        this.cardNumberEditText.addTextChangedListener(cardNumberTextWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher) {
        this.expiryDateEditText.addTextChangedListener(expiryDateTextWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher) {
        this.cvcEditText.addTextChangedListener(cvcNumberTextWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher) {
        this.postalCodeEditText.addTextChangedListener(postalCodeTextWatcher);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        Set<StripeEditText> set = this.requiredFields;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (!((StripeEditText) it.next()).isEnabled()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        CardNumberEditText cardNumberEditText;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() != 0) {
            return super.onInterceptTouchEvent(ev);
        }
        Field focusField = getFocusField((int) ev.getX(), getFrameStart());
        if (focusField != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[focusField.ordinal()];
            if (i == 1) {
                cardNumberEditText = this.cardNumberEditText;
            } else if (i == 2) {
                cardNumberEditText = this.expiryDateEditText;
            } else if (i == 3) {
                cardNumberEditText = this.cvcEditText;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                cardNumberEditText = this.postalCodeEditText;
            }
            cardNumberEditText.requestFocus();
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(TuplesKt.to(STATE_SUPER_STATE, super.onSaveInstanceState()), TuplesKt.to(STATE_CARD_VIEWED, Boolean.valueOf(this.isShowingFullCard)), TuplesKt.to(STATE_POSTAL_CODE_ENABLED, Boolean.valueOf(getPostalCodeEnabled())), TuplesKt.to(STATE_ON_BEHALF_OF, this.onBehalfOf));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setPostalCodeEnabled(bundle.getBoolean(STATE_POSTAL_CODE_ENABLED, true));
            this.isShowingFullCard = bundle.getBoolean(STATE_CARD_VIEWED, true);
            setOnBehalfOf(bundle.getString(STATE_ON_BEHALF_OF));
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    private final Field getFocusField(int touchX, int frameStart) {
        return this.placement.getFocusField$payments_core_release(touchX, frameStart, this.isShowingFullCard, getPostalCodeEnabled());
    }

    public static /* synthetic */ void updateSpaceSizes$payments_core_release$default(CardInputWidget cardInputWidget, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = cardInputWidget.getFrameWidth();
        }
        if ((i3 & 4) != 0) {
            i2 = cardInputWidget.getFrameStart();
        }
        cardInputWidget.updateSpaceSizes$payments_core_release(z, i, i2);
    }

    public final void updateSpaceSizes$payments_core_release(boolean isShowingFullCard, int frameWidth, int frameStart) {
        if (frameWidth == 0) {
            return;
        }
        this.placement.setCardWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_CARD_TEXT, this.cardNumberEditText));
        this.placement.setDateWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_DATE_TEXT, this.expiryDateEditText));
        this.placement.setHiddenCardWidth$payments_core_release(getDesiredWidthInPixels(this.hiddenCardText, this.cardNumberEditText));
        this.placement.setCvcWidth$payments_core_release(getDesiredWidthInPixels(getCvcPlaceHolder(), this.cvcEditText));
        this.placement.setPostalCodeWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_POSTAL_CODE_TEXT, this.postalCodeEditText));
        this.placement.setPeekCardWidth$payments_core_release(getDesiredWidthInPixels(getPeekCardText(), this.cardNumberEditText));
        this.placement.updateSpacing$payments_core_release(isShowingFullCard, getPostalCodeEnabled(), frameStart, frameWidth);
    }

    private final int getDesiredWidthInPixels(String text, StripeEditText editText) {
        LayoutWidthCalculator layoutWidthCalculator = this.layoutWidthCalculator;
        TextPaint paint = editText.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        return layoutWidthCalculator.calculate(text, paint);
    }

    private final void initView(AttributeSet attrs) {
        applyCardElementAttributes(attrs);
        ViewCompat.setAccessibilityDelegate(this.cardNumberEditText, new AccessibilityDelegateCompat() { // from class: com.stripe.android.view.CardInputWidget.initView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setHintText(null);
            }
        });
        this.isShowingFullCard = true;
        int defaultErrorColorInt = this.cardNumberEditText.getDefaultErrorColorInt();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardInputView = R.styleable.CardInputView;
        Intrinsics.checkNotNullExpressionValue(CardInputView, "CardInputView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardInputView, 0, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.CardInputView_cardTextErrorColor, defaultErrorColorInt);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CardInputView_cardHintText);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardInputView_android_focusedByDefault, true);
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            this.cardNumberEditText.setHint(string);
        }
        Iterator it = getCurrentFields$payments_core_release().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).setErrorColor(color);
        }
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$31(this.f$0, view, z2);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$32(this.f$0, view, z2);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda12
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$33(this.f$0, view, z2);
            }
        });
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                CardInputWidget.initView$lambda$34(this.f$0, view, z2);
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda14
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardInputWidget.initView$lambda$35(this.f$0, str);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda15
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardInputWidget.initView$lambda$36(this.f$0, str);
            }
        });
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new Function0() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardInputWidget.initView$lambda$37(this.f$0);
            }
        });
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardInputWidget.initView$lambda$38(this.f$0, (CardBrand) obj);
            }
        });
        this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardInputWidget.initView$lambda$39(this.f$0, (CardBrand) obj);
            }
        });
        this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new AnonymousClass14(this));
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new Function0() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardInputWidget.initView$lambda$41(this.f$0);
            }
        });
        this.cvcEditText.setCompletionCallback$payments_core_release(new Function0() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardInputWidget.initView$lambda$43(this.f$0);
            }
        });
        Iterator<T> it2 = this.allFields.iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardInputWidget$initView$lambda$45$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    this.this$0.setShouldShowErrorIcon(false);
                }
            });
        }
        if (z) {
            this.cardNumberEditText.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$31(CardInputWidget cardInputWidget, View view, boolean z) {
        if (z) {
            cardInputWidget.scrollStart();
            CardInputListener cardInputListener = cardInputWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$32(CardInputWidget cardInputWidget, View view, boolean z) {
        if (z) {
            cardInputWidget.scrollEnd();
            CardInputListener cardInputListener = cardInputWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$33(CardInputWidget cardInputWidget, View view, boolean z) {
        if (z) {
            cardInputWidget.scrollEnd();
            CardInputListener cardInputListener = cardInputWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$34(CardInputWidget cardInputWidget, View view, boolean z) {
        cardInputWidget.cardBrandView.setShouldShowCvc(z);
        if (z) {
            cardInputWidget.scrollEnd();
            CardInputListener cardInputListener = cardInputWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$35(CardInputWidget cardInputWidget, String text) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(text, "text");
        if (!cardInputWidget.getBrand().isMaxCvc(text) || (cardInputListener = cardInputWidget.cardInputListener) == null) {
            return;
        }
        cardInputListener.onCvcComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$36(CardInputWidget cardInputWidget, String it) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(it, "it");
        if (cardInputWidget.postalCodeEditText.isEnabled() && cardInputWidget.postalCodeEditText.hasValidPostal$payments_core_release() && (cardInputListener = cardInputWidget.cardInputListener) != null) {
            cardInputListener.onPostalCodeComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$37(CardInputWidget cardInputWidget) {
        cardInputWidget.scrollEnd();
        CardInputListener cardInputListener = cardInputWidget.cardInputListener;
        if (cardInputListener != null) {
            cardInputListener.onCardComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$38(CardInputWidget cardInputWidget, CardBrand brand) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brand, "brand");
        cardInputWidget.cardBrandView.setBrand(brand);
        cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.cardNumberEditText.getPanLength$payments_core_release());
        cardInputWidget.updateCvc(brand);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$39(CardInputWidget cardInputWidget, CardBrand brand) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brand, "brand");
        cardInputWidget.hiddenCardText = cardInputWidget.createHiddenCardText$payments_core_release(cardInputWidget.cardNumberEditText.getPanLength$payments_core_release());
        cardInputWidget.updateCvc(brand);
        return Unit.INSTANCE;
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.view.CardInputWidget$initView$14, reason: invalid class name */
    /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements Function1<List<? extends CardBrand>, Unit> {
        AnonymousClass14(Object obj) {
            super(1, obj, CardInputWidget.class, "handlePossibleCardBrandsChanged", "handlePossibleCardBrandsChanged(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CardBrand> list) throws Resources.NotFoundException {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends CardBrand> p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardInputWidget) this.receiver).handlePossibleCardBrandsChanged(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$41(final CardInputWidget cardInputWidget) {
        cardInputWidget.post(new Runnable() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CardInputWidget.initView$lambda$41$lambda$40(this.f$0);
            }
        });
        CardInputListener cardInputListener = cardInputWidget.cardInputListener;
        if (cardInputListener != null) {
            cardInputListener.onExpirationComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$41$lambda$40(CardInputWidget cardInputWidget) {
        cardInputWidget.cvcEditText.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$43(final CardInputWidget cardInputWidget) {
        if (cardInputWidget.getPostalCodeEnabled()) {
            cardInputWidget.post(new Runnable() { // from class: com.stripe.android.view.CardInputWidget$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    CardInputWidget.initView$lambda$43$lambda$42(this.f$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$43$lambda$42(CardInputWidget cardInputWidget) {
        cardInputWidget.postalCodeEditText.requestFocus();
    }

    public final void setCvcLabel(String cvcLabel) throws Resources.NotFoundException {
        this.customCvcLabel = cvcLabel;
        updateCvc(this.cardBrandView.getBrand());
    }

    private final void updateCvc(CardBrand brand) throws Resources.NotFoundException {
        CvcEditText.updateBrand$payments_core_release$default(this.cvcEditText, brand, this.customCvcLabel, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePossibleCardBrandsChanged(List<? extends CardBrand> brands) throws Resources.NotFoundException {
        CardBrand brand = this.cardBrandView.getBrand();
        this.cardBrandView.setPossibleBrands(brands);
        if (!brands.contains(brand)) {
            this.cardBrandView.setBrand(CardBrand.Unknown);
        }
        this.hiddenCardText = createHiddenCardText$payments_core_release(this.cardNumberEditText.getPanLength$payments_core_release());
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) brands);
        if (cardBrand == null) {
            cardBrand = CardBrand.Unknown;
        }
        updateCvc(cardBrand);
    }

    public final String createHiddenCardText$payments_core_release(int panLength) {
        String formatted = new CardNumber.Unvalidated(StringsKt.repeat(AppEventsConstants.EVENT_PARAM_VALUE_NO, panLength)).getFormatted(panLength);
        return StringsKt.take(formatted, StringsKt.lastIndexOf$default((CharSequence) formatted, CardNumberConfig.SEPARATOR, 0, false, 6, (Object) null) + 1);
    }

    private final void applyCardElementAttributes(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardElement = R.styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardElement, 0, 0);
        setPostalCodeEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldShowPostalCode, getPostalCodeEnabled()));
        setPostalCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequirePostalCode, getPostalCodeRequired()));
        setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void scrollStart() {
        if (this.isShowingFullCard || !this.isViewInitialized) {
            return;
        }
        int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
        int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
        int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
        updateSpaceSizes$payments_core_release$default(this, true, 0, 0, 6, null);
        CardNumberSlideStartAnimation cardNumberSlideStartAnimation = new CardNumberSlideStartAnimation(this.cardNumberTextInputLayout);
        int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(true);
        ExpiryDateSlideStartAnimation expiryDateSlideStartAnimation = new ExpiryDateSlideStartAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
        int i = (dateStartMargin$payments_core_release2 - dateStartMargin$payments_core_release) + cvcStartMargin$payments_core_release;
        startSlideAnimation(CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideStartAnimation, expiryDateSlideStartAnimation, new CvcSlideStartAnimation(this.cvcNumberTextInputLayout, cvcStartMargin$payments_core_release, i, this.placement.getCvcWidth$payments_core_release()), getPostalCodeEnabled() ? new PostalCodeSlideStartAnimation(this.postalCodeTextInputLayout, postalCodeStartMargin$payments_core_release, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null}));
        this.isShowingFullCard = true;
    }

    private final void scrollEnd() {
        if (this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(true);
            updateSpaceSizes$payments_core_release$default(this, false, 0, 0, 6, null);
            CardNumberSlideEndAnimation cardNumberSlideEndAnimation = new CardNumberSlideEndAnimation(this.cardNumberTextInputLayout, this.placement.getHiddenCardWidth$payments_core_release(), this.expiryDateEditText);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(false);
            ExpiryDateSlideEndAnimation expiryDateSlideEndAnimation = new ExpiryDateSlideEndAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int i = (dateStartMargin$payments_core_release - dateStartMargin$payments_core_release2) + cvcStartMargin$payments_core_release;
            CvcSlideEndAnimation cvcSlideEndAnimation = new CvcSlideEndAnimation(this.cvcNumberTextInputLayout, i, cvcStartMargin$payments_core_release, this.placement.getCvcWidth$payments_core_release());
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            startSlideAnimation(CollectionsKt.listOfNotNull((Object[]) new CardFieldAnimation[]{cardNumberSlideEndAnimation, expiryDateSlideEndAnimation, cvcSlideEndAnimation, getPostalCodeEnabled() ? new PostalCodeSlideEndAnimation(this.postalCodeTextInputLayout, (i - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null}));
            this.isShowingFullCard = false;
        }
    }

    private final void startSlideAnimation(List<? extends Animation> animations) {
        AnimationSet animationSet = new AnimationSet(true);
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            animationSet.addAnimation((Animation) it.next());
        }
        this.containerLayout.startAnimation(animationSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (this.isViewInitialized || getWidth() == 0) {
            return;
        }
        this.isViewInitialized = true;
        this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
        updateSpaceSizes$payments_core_release$default(this, this.isShowingFullCard, 0, 0, 6, null);
        updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth$payments_core_release(), this.isShowingFullCard ? 0 : this.placement.getHiddenCardWidth$payments_core_release() * (-1));
        updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), this.placement.getDateStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), this.placement.getCvcStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), this.placement.getPostalCodeStartMargin$payments_core_release(this.isShowingFullCard));
    }

    private final String getCvcPlaceHolder() {
        if (CardBrand.AmericanExpress == getBrand()) {
            return CVC_PLACEHOLDER_AMEX;
        }
        return CVC_PLACEHOLDER_COMMON;
    }

    private final String getPeekCardText() {
        int panLength$payments_core_release = this.cardNumberEditText.getPanLength$payments_core_release();
        return StringsKt.repeat(AppEventsConstants.EVENT_PARAM_VALUE_NO, panLength$payments_core_release != 14 ? panLength$payments_core_release != 15 ? panLength$payments_core_release != 19 ? 4 : 3 : 5 : 2);
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "Landroid/view/animation/Animation;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class CardFieldAnimation extends Animation {
        private static final long ANIMATION_LENGTH = 150;
        private static final Companion Companion = new Companion(null);

        public CardFieldAnimation() {
            setDuration(150L);
        }

        /* compiled from: CardInputWidget.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;", "", "<init>", "()V", "ANIMATION_LENGTH", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CardNumberSlideStartAnimation extends CardFieldAnimation {
        private final View view;

        public CardNumberSlideStartAnimation(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideStartAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideStartAnimation.this.view.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (r1.getMarginStart() * (1 - interpolatedTime)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startPosition", "", ShareConstants.DESTINATION, "<init>", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ExpiryDateSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startPosition;
        private final View view;

        public ExpiryDateSlideStartAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startPosition", "", ShareConstants.DESTINATION, "newWidth", "<init>", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CvcSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public CvcSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
            layoutParams3.setMarginEnd(0);
            layoutParams3.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startPosition", "", ShareConstants.DESTINATION, "newWidth", "<init>", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class PostalCodeSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public PostalCodeSlideStartAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startPosition = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startPosition)));
            layoutParams3.setMarginEnd(0);
            layoutParams3.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "hiddenCardWidth", "", "focusOnEndView", "<init>", "(Landroid/view/View;ILandroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CardNumberSlideEndAnimation extends CardFieldAnimation {
        private final View focusOnEndView;
        private final int hiddenCardWidth;
        private final View view;

        public CardNumberSlideEndAnimation(View view, int i, View focusOnEndView) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(focusOnEndView, "focusOnEndView");
            this.view = view;
            this.hiddenCardWidth = i;
            this.focusOnEndView = focusOnEndView;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideEndAnimation.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CardNumberSlideEndAnimation.this.focusOnEndView.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) (this.hiddenCardWidth * (-1.0f) * interpolatedTime));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startMargin", "", ShareConstants.DESTINATION, "<init>", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ExpiryDateSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startMargin;
        private final View view;

        public ExpiryDateSlideEndAnimation(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startMargin", "", ShareConstants.DESTINATION, "newWidth", "<init>", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class CvcSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public CvcSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
            layoutParams3.setMarginEnd(0);
            layoutParams3.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startMargin", "", ShareConstants.DESTINATION, "newWidth", "<init>", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Landroid/view/animation/Transformation;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class PostalCodeSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public PostalCodeSlideEndAnimation(View view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.startMargin = i;
            this.destination = i2;
            this.newWidth = i3;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            Intrinsics.checkNotNullParameter(t, "t");
            super.applyTransformation(interpolatedTime, t);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.setMarginStart((int) ((this.destination * interpolatedTime) + ((1 - interpolatedTime) * this.startMargin)));
            layoutParams3.setMarginEnd(0);
            layoutParams3.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "<init>", "()V", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultLayoutWidthCalculator implements LayoutWidthCalculator {
        public static final int $stable = 0;

        @Override // com.stripe.android.view.CardInputWidget.LayoutWidthCalculator
        public int calculate(String text, TextPaint paint) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            return (int) Layout.getDesiredWidth(text, paint);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Field;", "", "<init>", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "PostalCode", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Field {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final Field Number = new Field("Number", 0);
        public static final Field Expiry = new Field("Expiry", 1);
        public static final Field Cvc = new Field("Cvc", 2);
        public static final Field PostalCode = new Field("PostalCode", 3);

        private static final /* synthetic */ Field[] $values() {
            return new Field[]{Number, Expiry, Cvc, PostalCode};
        }

        public static EnumEntries<Field> getEntries() {
            return $ENTRIES;
        }

        private Field(String str, int i) {
        }

        static {
            Field[] fieldArr$values = $values();
            $VALUES = fieldArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(fieldArr$values);
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }
    }

    /* compiled from: CardInputWidget.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Companion;", "", "<init>", "()V", "LOGGING_TOKEN", "", "CVC_PLACEHOLDER_COMMON", "CVC_PLACEHOLDER_AMEX", "FULL_SIZING_CARD_TEXT", "FULL_SIZING_DATE_TEXT", "FULL_SIZING_POSTAL_CODE_TEXT", "STATE_CARD_VIEWED", "STATE_SUPER_STATE", "STATE_POSTAL_CODE_ENABLED", "STATE_ON_BEHALF_OF", "DEFAULT_READER_ID", "", "shouldIconShowBrand", "", "brand", "Lcom/stripe/android/model/CardBrand;", "cvcHasFocus", "cvcText", "shouldIconShowBrand$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean shouldIconShowBrand$payments_core_release(CardBrand brand, boolean cvcHasFocus, String cvcText) {
            Intrinsics.checkNotNullParameter(brand, "brand");
            return !cvcHasFocus || brand.isMaxCvc(cvcText);
        }
    }

    private final void updateFieldLayout(final View view, final int newWidth, final int newMarginStart) {
        OneShotPreDrawListener.add(view, new Runnable() { // from class: com.stripe.android.view.CardInputWidget$updateFieldLayout$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                layoutParams3.width = newWidth;
                layoutParams3.setMarginStart(newMarginStart);
                view2.setLayoutParams(layoutParams2);
            }
        });
    }
}
