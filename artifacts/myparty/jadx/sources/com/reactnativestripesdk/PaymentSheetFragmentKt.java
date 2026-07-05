package com.reactnativestripesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import com.caverock.androidsvg.SVGParser;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u001a\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u001a\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u001a\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\n¨\u0006\""}, d2 = {"getBitmapFromVectorDrawable", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "drawableId", "", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "getBase64FromBitmap", "", "bitmap", "mapToCollectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;", "str", "mapToPaymentMethodLayout", "Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "mapToAddressCollectionMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "mapToSetupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "type", "mapToCaptureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "mapToPaymentMethodOptions", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Landroid/os/Bundle;", "mapToCardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", NativeProtocol.WEB_DIALOG_PARAMS, "mapToCardBrandCategory", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "brand", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentSheetFragmentKt {
    public static final Bitmap getBitmapFromVectorDrawable(Context context, int i) {
        Intrinsics.checkNotNull(context);
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        return getBitmapFromDrawable(drawable);
    }

    public static final Bitmap getBitmapFromDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        if (drawableMutate.getIntrinsicWidth() <= 0 || drawableMutate.getIntrinsicHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.eraseColor(-1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final String getBase64FromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return Base64.encodeToString(byteArray, 0);
    }

    public static final PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode mapToCollectionMode(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1414557169) {
                if (iHashCode != 104712844) {
                    if (iHashCode == 1673671211 && str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC)) {
                        return PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Automatic;
                    }
                } else if (str.equals("never")) {
                    return PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Never;
                }
            } else if (str.equals("always")) {
                return PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Always;
            }
        }
        return PaymentSheet.BillingDetailsCollectionConfiguration.CollectionMode.Automatic;
    }

    public static final PaymentSheet.PaymentMethodLayout mapToPaymentMethodLayout(String str) {
        return Intrinsics.areEqual(str, "Horizontal") ? PaymentSheet.PaymentMethodLayout.Horizontal : Intrinsics.areEqual(str, "Vertical") ? PaymentSheet.PaymentMethodLayout.Vertical : PaymentSheet.PaymentMethodLayout.Automatic;
    }

    public static final PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode mapToAddressCollectionMode(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3154575) {
                if (iHashCode != 104712844) {
                    if (iHashCode == 1673671211 && str.equals(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC)) {
                        return PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic;
                    }
                } else if (str.equals("never")) {
                    return PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never;
                }
            } else if (str.equals("full")) {
                return PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full;
            }
        }
        return PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic;
    }

    public static final PaymentSheet.IntentConfiguration.SetupFutureUse mapToSetupFutureUse(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1288757689) {
            if (str.equals("OffSession")) {
                return PaymentSheet.IntentConfiguration.SetupFutureUse.OffSession;
            }
            return null;
        }
        if (iHashCode == 2433880) {
            if (str.equals("None")) {
                return PaymentSheet.IntentConfiguration.SetupFutureUse.None;
            }
            return null;
        }
        if (iHashCode == 1030267799 && str.equals("OnSession")) {
            return PaymentSheet.IntentConfiguration.SetupFutureUse.OnSession;
        }
        return null;
    }

    public static final PaymentSheet.IntentConfiguration.CaptureMethod mapToCaptureMethod(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1997548570) {
                if (iHashCode != -617328117) {
                    if (iHashCode == 155078449 && str.equals("AutomaticAsync")) {
                        return PaymentSheet.IntentConfiguration.CaptureMethod.AutomaticAsync;
                    }
                } else if (str.equals("Automatic")) {
                    return PaymentSheet.IntentConfiguration.CaptureMethod.Automatic;
                }
            } else if (str.equals("Manual")) {
                return PaymentSheet.IntentConfiguration.CaptureMethod.Manual;
            }
        }
        return PaymentSheet.IntentConfiguration.CaptureMethod.Automatic;
    }

    public static final PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions mapToPaymentMethodOptions(Bundle bundle) {
        Set<String> setKeySet;
        Bundle bundle2 = bundle != null ? bundle.getBundle("setupFutureUsageValues") : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
            for (String str : setKeySet) {
                PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUseMapToSetupFutureUse = mapToSetupFutureUse(bundle2 != null ? bundle2.getString(str) : null);
                PaymentMethod.Type typeFromCode = PaymentMethod.Type.INSTANCE.fromCode(str);
                if (typeFromCode != null && setupFutureUseMapToSetupFutureUse != null) {
                    linkedHashMap.put(typeFromCode, setupFutureUseMapToSetupFutureUse);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions(linkedHashMap);
    }

    public static final PaymentSheet.CardBrandAcceptance mapToCardBrandAcceptance(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("cardBrandAcceptance")) == null) {
            return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
        }
        String string = bundle2.getString(ViewProps.FILTER);
        if (string == null) {
            return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
        }
        int iHashCode = string.hashCode();
        if (iHashCode != -1332289190) {
            if (iHashCode != -911343192) {
                if (iHashCode == 96673 && string.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL)) {
                    return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
                }
            } else if (string.equals("allowed")) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("brands");
                if (stringArrayList == null) {
                    return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
                }
                ArrayList arrayList = new ArrayList();
                for (String str : stringArrayList) {
                    Intrinsics.checkNotNull(str);
                    PaymentSheet.CardBrandAcceptance.BrandCategory brandCategoryMapToCardBrandCategory = mapToCardBrandCategory(str);
                    if (brandCategoryMapToCardBrandCategory != null) {
                        arrayList.add(brandCategoryMapToCardBrandCategory);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
                }
                return PaymentSheet.CardBrandAcceptance.INSTANCE.allowed(arrayList2);
            }
        } else if (string.equals("disallowed")) {
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("brands");
            if (stringArrayList2 == null) {
                return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : stringArrayList2) {
                Intrinsics.checkNotNull(str2);
                PaymentSheet.CardBrandAcceptance.BrandCategory brandCategoryMapToCardBrandCategory2 = mapToCardBrandCategory(str2);
                if (brandCategoryMapToCardBrandCategory2 != null) {
                    arrayList3.add(brandCategoryMapToCardBrandCategory2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList4.isEmpty()) {
                return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
            }
            return PaymentSheet.CardBrandAcceptance.INSTANCE.disallowed(arrayList4);
        }
        return PaymentSheet.CardBrandAcceptance.INSTANCE.all();
    }

    public static final PaymentSheet.CardBrandAcceptance.BrandCategory mapToCardBrandCategory(String brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        switch (brand.hashCode()) {
            case -2038717326:
                if (brand.equals("mastercard")) {
                    return PaymentSheet.CardBrandAcceptance.BrandCategory.Mastercard;
                }
                return null;
            case 2997727:
                if (brand.equals("amex")) {
                    return PaymentSheet.CardBrandAcceptance.BrandCategory.Amex;
                }
                return null;
            case 3619905:
                if (brand.equals("visa")) {
                    return PaymentSheet.CardBrandAcceptance.BrandCategory.Visa;
                }
                return null;
            case 273184745:
                if (brand.equals("discover")) {
                    return PaymentSheet.CardBrandAcceptance.BrandCategory.Discover;
                }
                return null;
            default:
                return null;
        }
    }
}
