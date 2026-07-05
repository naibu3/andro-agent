package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.databinding.StripeCardMultilineWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* compiled from: CardMultilineWidget.kt */
@Metadata(d1 = {"\u0000\u008d\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0015*\u0001;\b\u0007\u0018\u0000 á\u00012\u00020\u00012\u00020\u0002:\u0002á\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010U\u001a\u00020\nH\u0002J\u001d\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0003\u0010\u008c\u0001J\u0014\u0010\u0099\u0001\u001a\u00030\u008f\u00012\b\u0010\u009a\u0001\u001a\u00030\u0092\u0001H\u0007J\u0014\u0010\u009f\u0001\u001a\u00030\u008f\u00012\b\u0010\u009a\u0001\u001a\u00030\u0092\u0001H\u0007J\u0014\u0010¤\u0001\u001a\u00030\u008f\u00012\b\u0010\u009a\u0001\u001a\u00030\u0092\u0001H\u0007J\u0016\u0010©\u0001\u001a\u00030\u008f\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0007J\u0017\u0010ª\u0001\u001a\u00030\u008f\u00012\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020G05J\n\u0010¬\u0001\u001a\u00030\u008f\u0001H\u0014J\n\u0010\u00ad\u0001\u001a\u00030\u008f\u0001H\u0014J\n\u0010®\u0001\u001a\u00030\u008f\u0001H\u0016J\u0015\u0010¯\u0001\u001a\u00030\u008f\u00012\t\u0010\u009a\u0001\u001a\u0004\u0018\u000107H\u0016J\u0015\u0010°\u0001\u001a\u00030\u008f\u00012\t\u0010±\u0001\u001a\u0004\u0018\u000109H\u0016J\u0013\u0010²\u0001\u001a\u00030\u008f\u00012\u0007\u0010³\u0001\u001a\u00020DH\u0016J\u0015\u0010´\u0001\u001a\u00030\u008f\u00012\t\u0010µ\u0001\u001a\u0004\u0018\u00010]H\u0007J\u0007\u0010¶\u0001\u001a\u00020\nJ\n\u0010·\u0001\u001a\u00030¸\u0001H\u0014J\u0014\u0010¹\u0001\u001a\u00030\u008f\u00012\b\u0010º\u0001\u001a\u00030¸\u0001H\u0014J\u0013\u0010»\u0001\u001a\u00030\u008f\u00012\u0007\u0010¼\u0001\u001a\u00020\nH\u0016J\u0015\u0010½\u0001\u001a\u00030\u008f\u00012\t\u0010¾\u0001\u001a\u0004\u0018\u00010DH\u0007J\u0013\u0010¿\u0001\u001a\u00030\u008f\u00012\t\u0010À\u0001\u001a\u0004\u0018\u00010DJ\u001b\u0010Á\u0001\u001a\u00030\u008f\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0003\u0010\u008c\u0001J\u0010\u0010Â\u0001\u001a\u00030\u008f\u00012\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010Ã\u0001\u001a\u00030\u008f\u00012\t\u0010Ä\u0001\u001a\u0004\u0018\u00010DH\u0016J \u0010Å\u0001\u001a\u00030\u008f\u00012\t\b\u0001\u0010Æ\u0001\u001a\u00020\b2\t\b\u0001\u0010Ç\u0001\u001a\u00020\bH\u0016J\u0015\u0010È\u0001\u001a\u00030\u008f\u00012\t\u0010É\u0001\u001a\u0004\u0018\u00010DH\u0016J\u0007\u0010Ê\u0001\u001a\u00020\nJ\u0016\u0010Ë\u0001\u001a\u00030\u008f\u00012\n\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001H\u0016J\u0016\u0010Î\u0001\u001a\u00030\u008f\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Í\u0001H\u0016J\u0016\u0010Ð\u0001\u001a\u00030\u008f\u00012\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Í\u0001H\u0016J\u0016\u0010Ò\u0001\u001a\u00030\u008f\u00012\n\u0010Ó\u0001\u001a\u0005\u0018\u00010Í\u0001H\u0016J\b\u0010B\u001a\u00020\nH\u0016J\u0013\u0010Ô\u0001\u001a\u00030\u008f\u00012\u0007\u0010Õ\u0001\u001a\u00020\nH\u0016J\u0012\u0010Ö\u0001\u001a\u00030\u008f\u00012\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010×\u0001\u001a\u00030\u008f\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010Ø\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010Ù\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010Ú\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010Û\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010Ü\u0001\u001a\u00030\u008f\u0001H\u0002J\u0014\u0010Ý\u0001\u001a\u00030\u008f\u00012\b\b\u0002\u0010F\u001a\u00020GH\u0002J\u001f\u0010Þ\u0001\u001a\u00030\u008f\u00012\b\u0010ß\u0001\u001a\u00030\u0080\u00012\t\b\u0001\u0010à\u0001\u001a\u00020\bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0014\u00100\u001a\u00020+X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020+05X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0004\n\u0002\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010F\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR+\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u0004\u0018\u00010]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010`\u001a\u0004\u0018\u00010a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010d\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010h\u001a\u0004\u0018\u00010i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR(\u0010m\u001a\u0004\u0018\u00010D2\b\u0010l\u001a\u0004\u0018\u00010D@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0016\u0010r\u001a\u0004\u0018\u00010s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010v\u001a\u0004\u0018\u00010w8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0016\u0010z\u001a\u0004\u0018\u00010{8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u001d\u0010~\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n8\u0000@@X\u0081\u000e¢\u0006\u0018\n\u0000\u0012\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010L\"\u0005\b\u0087\u0001\u0010NR5\u0010\u0088\u0001\u001a\u0004\u0018\u00010\b2\b\u0010O\u001a\u0004\u0018\u00010\b8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u008d\u0001\u0010T\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u000f\u0010\u0091\u0001\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R3\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010O\u001a\u00030\u0092\u00018@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u0098\u0001\u0010T\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R3\u0010\u009b\u0001\u001a\u00030\u0092\u00012\u0007\u0010O\u001a\u00030\u0092\u00018@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u009e\u0001\u0010T\u001a\u0006\b\u009c\u0001\u0010\u0095\u0001\"\u0006\b\u009d\u0001\u0010\u0097\u0001R3\u0010 \u0001\u001a\u00030\u0092\u00012\u0007\u0010O\u001a\u00030\u0092\u00018@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b£\u0001\u0010T\u001a\u0006\b¡\u0001\u0010\u0095\u0001\"\u0006\b¢\u0001\u0010\u0097\u0001R7\u0010¥\u0001\u001a\u0005\u0018\u00010\u0092\u00012\t\u0010O\u001a\u0005\u0018\u00010\u0092\u00018@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b¨\u0001\u0010T\u001a\u0006\b¦\u0001\u0010\u0095\u0001\"\u0006\b§\u0001\u0010\u0097\u0001¨\u0006â\u0001"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "shouldShowPostalCode", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "viewBinding", "Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "secondRowLayout", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "cardNumberTextInputLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "expiryTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getExpiryTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "cvcInputLayout", "getCvcInputLayout", "postalInputLayout", "getPostalInputLayout$payments_core_release", "lifecycleDelegate", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "textInputLayouts", "", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "com/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1", "Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields$payments_core_release", "()Ljava/util/Set;", "isEnabled", "customCvcLabel", "", "customCvcPlaceholderText", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "postalCodeRequired", "getPostalCodeRequired", "()Z", "setPostalCodeRequired", "(Z)V", "<set-?>", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "Lkotlin/properties/ReadWriteProperty;", "isPostalRequired", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getPaymentMethodBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentMethodBillingDetailsBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "getPaymentMethodBillingDetailsBuilder", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "value", "onBehalfOf", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "(Ljava/lang/String;)V", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "expirationDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getExpirationDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "allFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllFields", "()Ljava/util/Collection;", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release$annotations", "()V", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon$payments_core_release", "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_release", "(Ljava/lang/Integer;)V", "expirationDatePlaceholderRes$delegate", "setExpirationDatePlaceholderRes", "", "resId", "showCvcIconInCvcField", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release", "()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "setCardNumberErrorListener$payments_core_release", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "cardNumberErrorListener$delegate", "setCardNumberErrorListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release", "setExpirationDateErrorListener$payments_core_release", "expirationDateErrorListener$delegate", "setExpirationDateErrorListener", "cvcErrorListener", "getCvcErrorListener$payments_core_release", "setCvcErrorListener$payments_core_release", "cvcErrorListener$delegate", "setCvcErrorListener", "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release", "setPostalCodeErrorListener$payments_core_release", "postalCodeErrorListener$delegate", "setPostalCodeErrorListener", "setPreferredNetworks", "preferredNetworks", "onAttachedToWindow", "onDetachedFromWindow", "clear", "setCardInputListener", "setCardValidCallback", "callback", "setCardHint", "cardHint", "populate", "card", "validateAllFields", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "onWindowFocusChanged", "hasWindowFocus", "setCvcPlaceholderText", "cvcPlaceholderText", "setCvcLabel", "cvcLabel", "setCvcIcon", "setShouldShowPostalCode", "setCardNumber", "cardNumber", "setExpiryDate", "month", "year", "setCvcCode", "cvcCode", "validateCardNumber", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "setEnabled", ViewProps.ENABLED, "adjustViewForPostalCodeAttribute", "checkAttributeSet", "flipToCvcIconIfNotFinished", "initDeleteEmptyListeners", "initFocusChangeListeners", "initTextInputLayoutErrorHandlers", "updateBrandUi", "updateCvc", "updateEndIcon", "editText", "iconResourceId", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardMultilineWidget extends LinearLayout implements CardWidget {
    private static final String CARD_MULTILINE_TOKEN = "CardMultilineView";
    private static final String STATE_ON_BEHALF_OF = "state_on_behalf_of";
    private static final String STATE_REMAINING_STATE = "state_remaining_state";
    private final CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final CardNumberEditText cardNumberEditText;

    /* renamed from: cardNumberErrorListener$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty cardNumberErrorListener;
    private final CardNumberTextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardMultilineWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private String customCvcLabel;
    private String customCvcPlaceholderText;
    private final CvcEditText cvcEditText;

    /* renamed from: cvcErrorListener$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty cvcErrorListener;
    private final TextInputLayout cvcInputLayout;

    /* renamed from: expirationDateErrorListener$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty expirationDateErrorListener;

    /* renamed from: expirationDatePlaceholderRes$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty expirationDatePlaceholderRes;
    private final ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryTextInputLayout;
    private boolean isEnabled;
    private final LifecycleOwnerDelegate lifecycleDelegate;
    private String onBehalfOf;
    private final PostalCodeEditText postalCodeEditText;

    /* renamed from: postalCodeErrorListener$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty postalCodeErrorListener;
    private boolean postalCodeRequired;
    private final TextInputLayout postalInputLayout;
    private final LinearLayout secondRowLayout;
    private boolean shouldShowErrorIcon;
    private boolean shouldShowPostalCode;
    private boolean showCvcIconInCvcField;
    private final List<TextInputLayout> textInputLayouts;

    /* renamed from: usZipCodeRequired$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty usZipCodeRequired;
    private final StripeCardMultilineWidgetBinding viewBinding;
    private ViewModelStoreOwner viewModelStoreOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1] */
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shouldShowPostalCode = z;
        StripeCardMultilineWidgetBinding stripeCardMultilineWidgetBindingInflate = StripeCardMultilineWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardMultilineWidgetBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardMultilineWidgetBindingInflate;
        CardNumberEditText etCardNumber = stripeCardMultilineWidgetBindingInflate.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
        this.cardNumberEditText = etCardNumber;
        CardBrandView cardBrandView = stripeCardMultilineWidgetBindingInflate.cardBrandView;
        Intrinsics.checkNotNullExpressionValue(cardBrandView, "cardBrandView");
        this.cardBrandView = cardBrandView;
        ExpiryDateEditText etExpiry = stripeCardMultilineWidgetBindingInflate.etExpiry;
        Intrinsics.checkNotNullExpressionValue(etExpiry, "etExpiry");
        this.expiryDateEditText = etExpiry;
        CvcEditText etCvc = stripeCardMultilineWidgetBindingInflate.etCvc;
        Intrinsics.checkNotNullExpressionValue(etCvc, "etCvc");
        this.cvcEditText = etCvc;
        PostalCodeEditText etPostalCode = stripeCardMultilineWidgetBindingInflate.etPostalCode;
        Intrinsics.checkNotNullExpressionValue(etPostalCode, "etPostalCode");
        this.postalCodeEditText = etPostalCode;
        LinearLayout secondRowLayout = stripeCardMultilineWidgetBindingInflate.secondRowLayout;
        Intrinsics.checkNotNullExpressionValue(secondRowLayout, "secondRowLayout");
        this.secondRowLayout = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = stripeCardMultilineWidgetBindingInflate.tlCardNumber;
        Intrinsics.checkNotNullExpressionValue(tlCardNumber, "tlCardNumber");
        this.cardNumberTextInputLayout = tlCardNumber;
        TextInputLayout tlExpiry = stripeCardMultilineWidgetBindingInflate.tlExpiry;
        Intrinsics.checkNotNullExpressionValue(tlExpiry, "tlExpiry");
        this.expiryTextInputLayout = tlExpiry;
        TextInputLayout tlCvc = stripeCardMultilineWidgetBindingInflate.tlCvc;
        Intrinsics.checkNotNullExpressionValue(tlCvc, "tlCvc");
        this.cvcInputLayout = tlCvc;
        TextInputLayout tlPostalCode = stripeCardMultilineWidgetBindingInflate.tlPostalCode;
        Intrinsics.checkNotNullExpressionValue(tlPostalCode, "tlPostalCode");
        this.postalInputLayout = tlPostalCode;
        this.lifecycleDelegate = new LifecycleOwnerDelegate();
        List<TextInputLayout> listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{tlCardNumber, tlExpiry, tlCvc, tlPostalCode});
        this.textInputLayouts = listListOf;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                CardValidCallback cardValidCallback = this.this$0.cardValidCallback;
                if (cardValidCallback != null) {
                    cardValidCallback.onInputChanged(this.this$0.getInvalidFields$payments_core_release().isEmpty(), this.this$0.getInvalidFields$payments_core_release());
                }
            }
        };
        Delegates delegates = Delegates.INSTANCE;
        final boolean z2 = false;
        this.usZipCodeRequired = new ObservableProperty<Boolean>(z2) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$1
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
            }
        };
        Delegates delegates2 = Delegates.INSTANCE;
        final Integer numValueOf = Integer.valueOf(R.string.stripe_expiry_date_hint);
        this.expirationDatePlaceholderRes = new ObservableProperty<Integer>(numValueOf) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) throws Resources.NotFoundException {
                String string;
                Intrinsics.checkNotNullParameter(property, "property");
                Integer num = newValue;
                TextInputLayout expiryTextInputLayout = this.getExpiryTextInputLayout();
                if (num != null) {
                    string = this.getResources().getString(num.intValue());
                } else {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                expiryTextInputLayout.setPlaceholderText(string);
            }
        };
        Delegates delegates3 = Delegates.INSTANCE;
        final ErrorListener errorListener = new ErrorListener(tlCardNumber);
        this.cardNumberErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCardNumberEditText().setErrorMessageListener(newValue);
            }
        };
        Delegates delegates4 = Delegates.INSTANCE;
        final ErrorListener errorListener2 = new ErrorListener(tlExpiry);
        this.expirationDateErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener2) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getExpiryDateEditText().setErrorMessageListener(newValue);
            }
        };
        Delegates delegates5 = Delegates.INSTANCE;
        final ErrorListener errorListener3 = new ErrorListener(tlCvc);
        this.cvcErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener3) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCvcEditText().setErrorMessageListener(newValue);
            }
        };
        Delegates delegates6 = Delegates.INSTANCE;
        final ErrorListener errorListener4 = new ErrorListener(tlPostalCode);
        this.postalCodeErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener4) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getPostalCodeEditText().setErrorMessageListener(newValue);
            }
        };
        setOrientation(1);
        Iterator<T> it = listListOf.iterator();
        while (true) {
            ColorStateList hintTextColors = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                hintTextColors = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(hintTextColors);
        }
        checkAttributeSet(attributeSet);
        initTextInputLayoutErrorHandlers();
        initFocusChangeListeners();
        initDeleteEmptyListeners();
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new Function0() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardMultilineWidget._init_$lambda$18(this.f$0);
            }
        });
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardMultilineWidget._init_$lambda$19(this.f$0, (CardBrand) obj);
            }
        });
        this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardMultilineWidget._init_$lambda$20(this.f$0, (CardBrand) obj);
            }
        });
        this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardMultilineWidget._init_$lambda$21(this.f$0, (List) obj);
            }
        });
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new Function0() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardMultilineWidget._init_$lambda$23(this.f$0);
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda15
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) throws Resources.NotFoundException {
                CardMultilineWidget._init_$lambda$26(this.f$0, str);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda16
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardMultilineWidget._init_$lambda$27(this.f$0, str);
            }
        });
        adjustViewForPostalCodeAttribute(this.shouldShowPostalCode);
        CardNumberEditText.updateLengthFilter$payments_core_release$default(this.cardNumberEditText, 0, 1, null);
        updateBrandUi();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$_init_$lambda$29$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) throws Resources.NotFoundException {
                    this.this$0.setShouldShowErrorIcon$payments_core_release(false);
                }
            });
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new Function1() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardMultilineWidget._init_$lambda$30(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.isEnabled = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_input_layout_padding_horizontal);
        this.cardBrandView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CardMultilineWidget._init_$lambda$31(dimensionPixelSize, this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    /* renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    /* renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    /* renamed from: getPostalInputLayout$payments_core_release, reason: from getter */
    public final TextInputLayout getPostalInputLayout() {
        return this.postalInputLayout;
    }

    public final Set<CardValidCallback.Fields> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        CardValidCallback.Fields[] fieldsArr = new CardValidCallback.Fields[4];
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardValidCallback.Fields fields2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            fields = null;
        }
        fieldsArr[0] = fields;
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (getExpirationDate() != null) {
            fields3 = null;
        }
        fieldsArr[1] = fields3;
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (this.cvcEditText.getCvc$payments_core_release() != null) {
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

    public final /* synthetic */ CardBrand getBrand() {
        return this.cardBrandView.getBrand();
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired = z;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final boolean isPostalRequired() {
        return (this.postalCodeRequired || getUsZipCodeRequired()) && this.shouldShowPostalCode;
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams.Card getPaymentMethodCard() throws Resources.NotFoundException {
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

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams getPaymentMethodCreateParams() throws Resources.NotFoundException {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, getPaymentMethodBillingDetails(), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
        }
        return null;
    }

    public final PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        PaymentMethod.BillingDetails.Builder paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.build();
        }
        return null;
    }

    public final PaymentMethod.BillingDetails.Builder getPaymentMethodBillingDetailsBuilder() {
        if (this.shouldShowPostalCode && validateAllFields()) {
            return new PaymentMethod.BillingDetails.Builder().setAddress(new Address.Builder().setPostalCode(this.postalCodeEditText.getPostalCode$payments_core_release()).build());
        }
        return null;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final void setOnBehalfOf(final String str) {
        if (Intrinsics.areEqual(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            CardWidgetViewModelKt.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardMultilineWidget._set_onBehalfOf_$lambda$7(str, (LifecycleOwner) obj, (CardWidgetViewModel) obj2);
                }
            });
        }
        this.onBehalfOf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_onBehalfOf_$lambda$7(String str, LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        viewModel.setOnBehalfOf(str);
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.view.CardWidget
    public CardParams getCardParams() throws Resources.NotFoundException {
        String str = null;
        if (!validateAllFields()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Editable text = this.cvcEditText.getText();
        String string = text != null ? text.toString() : null;
        Editable text2 = this.postalCodeEditText.getText();
        String string2 = text2 != null ? text2.toString() : null;
        if (!this.shouldShowPostalCode) {
            string2 = null;
        }
        CardBrand brand = getBrand();
        Set of = SetsKt.setOf(CARD_MULTILINE_TOKEN);
        CardNumber.Validated validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
        String value = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.getValue() : null;
        if (value == null) {
            value = "";
        }
        String str2 = value;
        int month = validatedDate.getMonth();
        int year = validatedDate.getYear();
        Address.Builder builder = new Address.Builder();
        String str3 = string2;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            str = string2;
        }
        return new CardParams(brand, of, str2, month, year, string, null, builder.setPostalCode(str).build(), null, this.cardBrandView.cardParamsNetworks(), null, 1344, null);
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    private final ExpirationDate.Validated getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    private final Collection<StripeEditText> getAllFields() {
        return SetsKt.setOf((Object[]) new StripeEditText[]{this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText});
    }

    /* renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z) throws Resources.NotFoundException {
        boolean z2 = this.shouldShowErrorIcon != z;
        this.shouldShowErrorIcon = z;
        if (z2) {
            updateBrandUi();
        }
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.expirationDatePlaceholderRes.getValue(this, $$delegatedProperties[1]);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.expirationDatePlaceholderRes.setValue(this, $$delegatedProperties[1], num);
    }

    public final void setExpirationDatePlaceholderRes(Integer resId) {
        setExpirationDatePlaceholderRes$payments_core_release(resId);
    }

    public final StripeEditText.ErrorMessageListener getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cardNumberErrorListener.getValue(this, $$delegatedProperties[2]);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cardNumberErrorListener.setValue(this, $$delegatedProperties[2], errorMessageListener);
    }

    public final void setCardNumberErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.expirationDateErrorListener.getValue(this, $$delegatedProperties[3]);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.expirationDateErrorListener.setValue(this, $$delegatedProperties[3], errorMessageListener);
    }

    public final void setExpirationDateErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getCvcErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cvcErrorListener.getValue(this, $$delegatedProperties[4]);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cvcErrorListener.setValue(this, $$delegatedProperties[4], errorMessageListener);
    }

    public final void setCvcErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.postalCodeErrorListener.getValue(this, $$delegatedProperties[5]);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        this.postalCodeErrorListener.setValue(this, $$delegatedProperties[5], errorMessageListener);
    }

    public final void setPostalCodeErrorListener(StripeEditText.ErrorMessageListener listener) {
        setPostalCodeErrorListener$payments_core_release(listener);
    }

    public final void setPreferredNetworks(List<? extends CardBrand> preferredNetworks) {
        Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$18(final CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.post(new Runnable() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.expiryDateEditText.requestFocus();
            }
        });
        CardInputListener cardInputListener = cardMultilineWidget.cardInputListener;
        if (cardInputListener != null) {
            cardInputListener.onCardComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$19(CardMultilineWidget cardMultilineWidget, CardBrand brand) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brand, "brand");
        cardMultilineWidget.cardBrandView.setBrand(brand);
        cardMultilineWidget.updateBrandUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$20(CardMultilineWidget cardMultilineWidget, CardBrand brand) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brand, "brand");
        cardMultilineWidget.updateCvc(brand);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$21(CardMultilineWidget cardMultilineWidget, List brands) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brands, "brands");
        CardBrand brand = cardMultilineWidget.cardBrandView.getBrand();
        cardMultilineWidget.cardBrandView.setPossibleBrands(brands);
        if (!brands.contains(brand)) {
            cardMultilineWidget.cardBrandView.setBrand(CardBrand.Unknown);
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull(brands);
        if (cardBrand == null) {
            cardBrand = CardBrand.Unknown;
        }
        cardMultilineWidget.updateCvc(cardBrand);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$23(final CardMultilineWidget cardMultilineWidget) {
        cardMultilineWidget.post(new Runnable() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.cvcEditText.requestFocus();
            }
        });
        CardInputListener cardInputListener = cardMultilineWidget.cardInputListener;
        if (cardInputListener != null) {
            cardInputListener.onExpirationComplete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$26(final CardMultilineWidget cardMultilineWidget, String text) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(text, "text");
        CardBrand implicitCardBrandForCbc = cardMultilineWidget.cardNumberEditText.getImplicitCardBrandForCbc();
        if (implicitCardBrandForCbc == CardBrand.Unknown) {
            implicitCardBrandForCbc = null;
        }
        if (implicitCardBrandForCbc == null) {
            implicitCardBrandForCbc = cardMultilineWidget.cardNumberEditText.getCardBrand();
        }
        if (implicitCardBrandForCbc.isMaxCvc(text)) {
            cardMultilineWidget.updateBrandUi();
            if (cardMultilineWidget.shouldShowPostalCode) {
                cardMultilineWidget.post(new Runnable() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.postalCodeEditText.requestFocus();
                    }
                });
            }
            CardInputListener cardInputListener = cardMultilineWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onCvcComplete();
            }
        } else if (!cardMultilineWidget.showCvcIconInCvcField) {
            cardMultilineWidget.flipToCvcIconIfNotFinished();
        }
        cardMultilineWidget.cvcEditText.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$27(CardMultilineWidget cardMultilineWidget, String it) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(it, "it");
        if (cardMultilineWidget.isPostalRequired() && cardMultilineWidget.postalCodeEditText.hasValidPostal$payments_core_release() && (cardInputListener = cardMultilineWidget.cardInputListener) != null) {
            cardInputListener.onPostalCodeComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$30(CardMultilineWidget cardMultilineWidget, boolean z) {
        cardMultilineWidget.cardNumberTextInputLayout.setLoading$payments_core_release(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$31(int i, CardMultilineWidget cardMultilineWidget, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int width = view.getWidth() + i;
        CardNumberEditText cardNumberEditText = cardMultilineWidget.cardNumberEditText;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
        CardMultilineWidget cardMultilineWidget = this;
        this.lifecycleDelegate.initLifecycle(cardMultilineWidget);
        CardWidgetViewModelKt.doWithCardWidgetViewModel(cardMultilineWidget, this.viewModelStoreOwner, new Function2() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardMultilineWidget.onAttachedToWindow$lambda$33(this.f$0, (LifecycleOwner) obj, (CardWidgetViewModel) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$33(CardMultilineWidget cardMultilineWidget, LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (cardMultilineWidget.onBehalfOf != null && !Intrinsics.areEqual(viewModel.get_onBehalfOf(), cardMultilineWidget.onBehalfOf)) {
            viewModel.setOnBehalfOf(cardMultilineWidget.onBehalfOf);
        }
        StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardMultilineWidget$onAttachedToWindow$lambda$33$$inlined$launchAndCollect$default$1(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardMultilineWidget), 3, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleDelegate.destroyLifecycle(this);
    }

    @Override // com.stripe.android.view.CardWidget
    public void clear() throws Resources.NotFoundException {
        this.cardNumberEditText.setText("");
        this.expiryDateEditText.setText("");
        this.cvcEditText.setText("");
        this.postalCodeEditText.setText("");
        this.cardNumberEditText.setShouldShowError(false);
        this.expiryDateEditText.setShouldShowError(false);
        this.cvcEditText.setShouldShowError(false);
        this.postalCodeEditText.setShouldShowError(false);
        this.cardBrandView.setShouldShowErrorIcon(false);
        updateBrandUi();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener listener) {
        this.cardInputListener = listener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback callback) {
        this.cardValidCallback = callback;
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (callback != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback = this.cardValidCallback;
        if (cardValidCallback != null) {
            cardValidCallback.onInputChanged(getInvalidFields$payments_core_release().isEmpty(), getInvalidFields$payments_core_release());
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    public final void populate(PaymentMethodCreateParams.Card card) {
        if (card != null) {
            View viewFindFocus = findFocus();
            this.cardNumberEditText.setText(card.getNumber$payments_core_release());
            this.cvcEditText.setText(card.getCvc$payments_core_release());
            this.expiryDateEditText.setText$payments_core_release(card.getExpiryMonth$payments_core_release(), card.getExpiryYear$payments_core_release());
            if (viewFindFocus != null) {
                viewFindFocus.requestFocus();
                return;
            }
            View viewFindFocus2 = findFocus();
            if (viewFindFocus2 != null) {
                viewFindFocus2.clearFocus();
            }
        }
    }

    public final boolean validateAllFields() {
        String postalCode$payments_core_release;
        Object next;
        boolean z = getValidatedCardNumber$payments_core_release() != null;
        boolean z2 = getExpirationDate() != null;
        boolean z3 = this.cvcEditText.getCvc$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z);
        this.expiryDateEditText.setShouldShowError(!z2);
        this.cvcEditText.setShouldShowError(!z3);
        this.postalCodeEditText.setShouldShowError((this.postalCodeRequired || getUsZipCodeRequired()) && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release)));
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((StripeEditText) next).getShouldShowError()) {
                break;
            }
        }
        StripeEditText stripeEditText = (StripeEditText) next;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        return z && z2 && z3 && !this.postalCodeEditText.getShouldShowError();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return BundleKt.bundleOf(TuplesKt.to(STATE_REMAINING_STATE, super.onSaveInstanceState()), TuplesKt.to(STATE_ON_BEHALF_OF, this.onBehalfOf));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setOnBehalfOf(bundle.getString(STATE_ON_BEHALF_OF));
            super.onRestoreInstanceState(bundle.getParcelable(STATE_REMAINING_STATE));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) throws Resources.NotFoundException {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            updateBrandUi();
        }
    }

    public final void setCvcPlaceholderText(String cvcPlaceholderText) throws Resources.NotFoundException {
        this.customCvcPlaceholderText = cvcPlaceholderText;
        updateCvc$default(this, null, 1, null);
    }

    public final void setCvcLabel(String cvcLabel) throws Resources.NotFoundException {
        this.customCvcLabel = cvcLabel;
        updateCvc$default(this, null, 1, null);
    }

    public final /* synthetic */ void setCvcIcon(Integer resId) {
        if (resId != null) {
            updateEndIcon(this.cvcEditText, resId.intValue());
        }
        this.showCvcIconInCvcField = resId != null;
    }

    public final void setShouldShowPostalCode(boolean shouldShowPostalCode) {
        this.shouldShowPostalCode = shouldShowPostalCode;
        adjustViewForPostalCodeAttribute(shouldShowPostalCode);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int month, int year) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(month, year).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public final boolean validateCardNumber() {
        boolean z = getValidatedCardNumber$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z);
        return z;
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
        return this.isEnabled;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<T> it = this.textInputLayouts.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(enabled);
        }
        this.isEnabled = enabled;
    }

    private final void adjustViewForPostalCodeAttribute(boolean shouldShowPostalCode) {
        int i;
        if (shouldShowPostalCode) {
            i = R.string.stripe_expiry_label_short;
        } else {
            i = R.string.stripe_acc_label_expiry_date;
        }
        this.expiryTextInputLayout.setHint(getResources().getString(i));
        int i2 = shouldShowPostalCode ? R.id.et_postal_code : -1;
        this.cvcEditText.setNextFocusForwardId(i2);
        this.cvcEditText.setNextFocusDownId(i2);
        int i3 = shouldShowPostalCode ? 0 : 8;
        this.postalInputLayout.setVisibility(i3);
        this.cvcEditText.setImeOptions(i3 == 8 ? 6 : 5);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(shouldShowPostalCode ? getResources().getDimensionPixelSize(R.dimen.stripe_add_card_expiry_middle_margin) : 0);
            textInputLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final void checkAttributeSet(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardElement = R.styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardElement, 0, 0);
        this.shouldShowPostalCode = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldShowPostalCode, this.shouldShowPostalCode);
        this.postalCodeRequired = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequirePostalCode, this.postalCodeRequired);
        setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void flipToCvcIconIfNotFinished() {
        if (getBrand().isMaxCvc(this.cvcEditText.getFieldText$payments_core_release())) {
            return;
        }
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    private final void initDeleteEmptyListeners() {
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
    }

    private final void initFocusChangeListeners() {
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$41(this.f$0, view, z);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$42(this.f$0, view, z);
            }
        });
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$43(this.f$0, view, z);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$44(this.f$0, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$41(CardMultilineWidget cardMultilineWidget, View view, boolean z) {
        CardInputListener cardInputListener;
        if (!z || (cardInputListener = cardMultilineWidget.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$42(CardMultilineWidget cardMultilineWidget, View view, boolean z) {
        CardInputListener cardInputListener;
        if (!z || (cardInputListener = cardMultilineWidget.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$43(CardMultilineWidget cardMultilineWidget, View view, boolean z) {
        if (z) {
            if (!cardMultilineWidget.showCvcIconInCvcField) {
                cardMultilineWidget.flipToCvcIconIfNotFinished();
            }
            CardInputListener cardInputListener = cardMultilineWidget.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
                return;
            }
            return;
        }
        cardMultilineWidget.cardBrandView.setShouldShowErrorIcon(cardMultilineWidget.shouldShowErrorIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$44(CardMultilineWidget cardMultilineWidget, View view, boolean z) {
        CardInputListener cardInputListener;
        if (cardMultilineWidget.shouldShowPostalCode && z && (cardInputListener = cardMultilineWidget.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
        }
    }

    private final void initTextInputLayoutErrorHandlers() {
        this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    private final void updateBrandUi() throws Resources.NotFoundException {
        updateCvc$default(this, null, 1, null);
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    static /* synthetic */ void updateCvc$default(CardMultilineWidget cardMultilineWidget, CardBrand cardBrand, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 1) != 0) {
            cardBrand = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.updateCvc(cardBrand);
    }

    private final void updateCvc(CardBrand brand) throws Resources.NotFoundException {
        this.cvcEditText.updateBrand$payments_core_release(brand, this.customCvcLabel, this.customCvcPlaceholderText, this.cvcInputLayout);
    }

    private final void updateEndIcon(StripeEditText editText, int iconResourceId) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), iconResourceId);
        if (drawable != null) {
            editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* compiled from: CardMultilineWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget$Companion;", "", "<init>", "()V", "CARD_MULTILINE_TOKEN", "", "STATE_REMAINING_STATE", "STATE_ON_BEHALF_OF", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
