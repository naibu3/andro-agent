package com.qonversion.android.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.eligibility.QIntroEligibilityStatus;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementSource;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.dto.products.QProductType;
import com.qonversion.android.sdk.internal.AdvertisingProvider;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.billing.BillingError;
import com.qonversion.android.sdk.internal.billing.BillingService;
import com.qonversion.android.sdk.internal.billing.QonversionBillingService;
import com.qonversion.android.sdk.internal.converter.GooglePurchaseConverter;
import com.qonversion.android.sdk.internal.converter.PurchaseConverter;
import com.qonversion.android.sdk.internal.dto.QLaunchResult;
import com.qonversion.android.sdk.internal.dto.QPermission;
import com.qonversion.android.sdk.internal.dto.QProductRenewState;
import com.qonversion.android.sdk.internal.dto.QStoreProductType;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternal;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternalEnriched;
import com.qonversion.android.sdk.internal.dto.request.data.InitRequestData;
import com.qonversion.android.sdk.internal.logger.Logger;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.provider.UserStateProvider;
import com.qonversion.android.sdk.internal.purchase.PurchaseHistory;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionLaunchCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionPurchaseCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: QProductCenterManager.kt */
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u001a\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\b\u0010J\u001a\u0004\u0018\u000103H\u0002J\"\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020@2\b\u0010M\u001a\u0004\u0018\u00010D2\u0006\u0010N\u001a\u000200H\u0002J\u001e\u0010O\u001a\u00020H2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0?2\u0006\u0010R\u001a\u000200H\u0002J\u000e\u0010S\u001a\u00020H2\u0006\u0010J\u001a\u00020'J\u001c\u0010T\u001a\u00020H2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0?2\u0006\u0010J\u001a\u00020VJ\u001a\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010Z\u001a\u00020XH\u0002J\u0018\u0010[\u001a\u00020H2\u0006\u0010J\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002J\"\u0010_\u001a\u0004\u0018\u00010X2\u0006\u0010`\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020cH\u0002J\u0014\u0010d\u001a\u00020H2\n\b\u0002\u0010e\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010f\u001a\u00020H2\u0006\u0010J\u001a\u00020gH\u0002J\u0014\u0010h\u001a\u00020H2\n\b\u0002\u0010i\u001a\u0004\u0018\u000100H\u0002J\u0010\u0010j\u001a\u00020H2\u0006\u0010k\u001a\u000200H\u0002J\u001c\u0010l\u001a\u00020H2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020o0nH\u0002J\u001a\u0010p\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010D2\u0006\u0010k\u001a\u000200H\u0002J\u0010\u0010q\u001a\u00020H2\u0006\u0010k\u001a\u000200H\u0002J\u0018\u0010r\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\u0006\u0010k\u001a\u000200H\u0002J\u0010\u0010s\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001bH\u0002J\u001e\u0010t\u001a\u00020H2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020B0?2\u0006\u0010k\u001a\u000200H\u0002J\u0012\u0010v\u001a\u00020\\2\b\u0010J\u001a\u0004\u0018\u00010\\H\u0002J\n\u0010w\u001a\u0004\u0018\u00010xH\u0002J(\u0010y\u001a\u0004\u0018\u00010c2\b\u0010z\u001a\u0004\u0018\u00010\u001b2\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0nH\u0002J\u000e\u0010|\u001a\u00020H2\u0006\u0010J\u001a\u000203J\u001e\u0010}\u001a\u00020\\2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010\u007f\u001a\u00020\\H\u0002J@\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\u0006\u0010L\u001a\u00020@2\u0006\u0010b\u001a\u00020c2\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0?0nH\u0002JN\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020Q0?2\r\u0010{\u001a\t\u0012\u0004\u0012\u00020c0\u0084\u00012\u0019\u0010\u0081\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0?0nH\u0002J\t\u0010\u0085\u0001\u001a\u00020HH\u0002J\t\u0010\u0086\u0001\u001a\u00020HH\u0002J\t\u0010\u0087\u0001\u001a\u00020HH\u0002J\u0016\u0010\u0088\u0001\u001a\u00020H2\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u000100H\u0002J\u0018\u0010\u008a\u0001\u001a\u00020H2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\u001b\u0010\u008c\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001b2\n\b\u0002\u0010J\u001a\u0004\u0018\u000103J\u001b\u0010\u008d\u0001\u001a\u00020H2\u0006\u0010]\u001a\u00020^2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\\J\u000f\u0010\u008e\u0001\u001a\u00020H2\u0006\u0010J\u001a\u00020BJ\t\u0010\u008f\u0001\u001a\u00020HH\u0002J\u0007\u0010\u0090\u0001\u001a\u00020HJ$\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020X0?H\u0002J\u000f\u0010\u0093\u0001\u001a\u00020H2\u0006\u0010J\u001a\u00020gJ\u0007\u0010\u0094\u0001\u001a\u00020HJ\u0018\u0010\u0095\u0001\u001a\u00020H2\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016J!\u0010\u0096\u0001\u001a\u00020H2\u0007\u0010k\u001a\u00030\u0097\u00012\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020@0?H\u0016J]\u0010\u0098\u0001\u001a\u00020H22\u0010\u0099\u0001\u001a-\u0012\"\u0012 \u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020X0n¢\u0006\u000f\b\u009b\u0001\u0012\n\b\u009c\u0001\u0012\u0005\b\b(\u009d\u0001\u0012\u0004\u0012\u00020H0\u009a\u00012\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020H0\u009a\u00012\b\u0010k\u001a\u0004\u0018\u000100H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001bH\u0002J\u0012\u0010 \u0001\u001a\u00020H2\u0007\u0010¡\u0001\u001a\u000205H\u0002J\t\u0010¢\u0001\u001a\u00020HH\u0002J$\u0010£\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u00012\u0006\u0010J\u001a\u00020DH\u0002J\"\u0010§\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¨\u00012\u0006\u0010J\u001a\u00020DJ\u0013\u0010©\u0001\u001a\u00020H2\b\u0010z\u001a\u0004\u0018\u00010\u001bH\u0002J\u001b\u0010ª\u0001\u001a\u00020H2\u0006\u0010]\u001a\u00020^2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010'J>\u0010«\u0001\u001a\u00020H2\u0015\u0010\u0099\u0001\u001a\u0010\u0012\u0005\u0012\u00030¬\u0001\u0012\u0004\u0012\u00020H0\u009a\u00012\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020H0\u009a\u00012\u0006\u0010]\u001a\u00020^H\u0002J\u0011\u0010\u00ad\u0001\u001a\u00020H2\b\u0010®\u0001\u001a\u00030¯\u0001J\u0011\u0010°\u0001\u001a\u00020+2\u0006\u0010k\u001a\u000200H\u0002J&\u0010±\u0001\u001a\u00020H2\u0006\u0010L\u001a\u00020@2\b\u0010²\u0001\u001a\u00030³\u00012\t\u0010´\u0001\u001a\u0004\u0018\u00010cH\u0002J\u0007\u0010µ\u0001\u001a\u00020HJ$\u0010¶\u0001\u001a\u00020H2\u0007\u0010\u0003\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¨\u00012\u0006\u0010J\u001a\u00020DH\u0002J\u0013\u0010·\u0001\u001a\u00020H2\b\u0010¸\u0001\u001a\u00030¬\u0001H\u0002J\u001f\u0010¹\u0001\u001a\u00020H2\t\u0010º\u0001\u001a\u0004\u0018\u0001092\t\u0010»\u0001\u001a\u0004\u0018\u00010\u001bH\u0002R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,R\u000e\u0010-\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u00101\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030&02X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R'\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u000209028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020B0&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020D02X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¼\u0001"}, d2 = {"Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;", "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;", "context", "Landroid/app/Application;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "logger", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "purchasesCache", "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;", "handledPurchasesCache", "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;", "launchResultCache", "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "identityManager", "Lcom/qonversion/android/sdk/internal/QIdentityManager;", "internalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V", "advertisingID", "", "<set-?>", "Lcom/qonversion/android/sdk/internal/billing/BillingService;", "billingService", "getBillingService", "()Lcom/qonversion/android/sdk/internal/billing/BillingService;", "setBillingService", "(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V", "converter", "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;", "entitlementCallbacks", "", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "installDate", "", "isLaunchingFinished", "", "()Z", "isRestoreInProgress", "isUserStable", "launchError", "Lcom/qonversion/android/sdk/dto/QonversionError;", "pendingIdentityCallbacks", "", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "pendingInitRequestData", "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;", "pendingPartnersIdentityId", "processingPartnersIdentityId", "processingPurchaseOptions", "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "getProcessingPurchaseOptions", "()Ljava/util/Map;", "processingPurchaseOptions$delegate", "Lkotlin/Lazy;", "processingPurchases", "", "Lcom/android/billingclient/api/Purchase;", "productsCallbacks", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "purchasingCallbacks", "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "restoreCallbacks", "unhandledLogoutAvailable", "addIdentityCallback", "", "identityId", "callback", "calculatePurchasePermissionsLocally", "purchase", "purchaseCallback", "purchaseError", "calculateRestorePermissionsLocally", "purchaseHistoryRecords", "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;", "restoreError", "checkEntitlements", "checkTrialIntroEligibilityForProductIds", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "choosePermissionToSave", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "existingPermission", "localCreatedPermission", "continueLaunchWithPurchasesInfo", "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;", "requestTrigger", "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;", "createPermission", "id", "purchaseTime", "purchasedProduct", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "executeEntitlementsBlock", "actualError", "executeOfferingCallback", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "executeProductsBlocks", "loadStoreProductsError", "executeRestoreBlocksOnError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "executeRestoreBlocksOnSuccess", "entitlements", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "failLocallyGrantingPurchasePermissionsWithError", "failLocallyGrantingRestorePermissionsWithError", "fireIdentityError", "fireIdentitySuccess", "fireProductsFailure", "callbacks", "getLaunchCallback", "getOfferings", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "getProductForPurchase", "productId", "products", "getUserInfo", "getWrappedPurchasesCallback", "trackingPurchases", "outerCallback", "grantPermissionsAfterFailedPurchaseTracking", "productPermissions", "grantPermissionsAfterFailedRestore", "historyRecords", "", "handleCachedPurchases", "handleLogout", "handlePendingPurchases", "handlePendingRequests", "lastError", "handlePurchases", "purchases", "identify", "launch", "loadProducts", "loadStoreProductsIfPossible", "logout", "mergeManuallyCreatedPermissions", "newPermissions", "offerings", "onAppForeground", "onPurchasesCompleted", "onPurchasesFailed", "Lcom/qonversion/android/sdk/internal/billing/BillingError;", "preparePermissionsResult", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "permissions", "onError", "processIdentity", "processInit", "initRequestData", "processPendingInitIfAvailable", "processPurchase", "Landroid/app/Activity;", "purchaseModel", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;", "purchaseProduct", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;", "removePurchaseOptions", "restore", "retryLaunch", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "setEntitlementsUpdateListener", "entitlementsUpdateListener", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "shouldCalculatePermissionsLocally", "storeFailedPurchaseIfNecessary", "purchaseInfo", "Lcom/qonversion/android/sdk/internal/purchase/Purchase;", "product", "syncPurchases", "tryToPurchase", "updateLaunchResult", "launchResult", "updatePurchaseOptions", "options", "storeProductId", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QProductCenterManager implements QonversionBillingService.PurchasesListener, UserStateProvider {
    private String advertisingID;
    private final AppStateProvider appStateProvider;
    public volatile BillingService billingService;
    private final Application context;
    private PurchaseConverter converter;
    private List<QonversionEntitlementsCallback> entitlementCallbacks;
    private final QHandledPurchasesCache handledPurchasesCache;
    private final QIdentityManager identityManager;
    private long installDate;
    private final InternalConfig internalConfig;
    private boolean isRestoreInProgress;
    private QonversionError launchError;
    private final LaunchResultCacheWrapper launchResultCache;
    private final Logger logger;
    private Map<String, List<QonversionUserCallback>> pendingIdentityCallbacks;
    private InitRequestData pendingInitRequestData;
    private String pendingPartnersIdentityId;
    private String processingPartnersIdentityId;

    /* renamed from: processingPurchaseOptions$delegate, reason: from kotlin metadata */
    private final Lazy processingPurchaseOptions;
    private List<? extends Purchase> processingPurchases;
    private List<QonversionProductsCallback> productsCallbacks;
    private final PurchasesCache purchasesCache;
    private Map<String, QonversionPurchaseCallback> purchasingCallbacks;
    private final QRemoteConfigManager remoteConfigManager;
    private final QRepository repository;
    private List<QonversionEntitlementsCallback> restoreCallbacks;
    private boolean unhandledLogoutAvailable;
    private final QUserInfoService userInfoService;

    public QProductCenterManager(Application context, QRepository repository, Logger logger, PurchasesCache purchasesCache, QHandledPurchasesCache handledPurchasesCache, LaunchResultCacheWrapper launchResultCache, QUserInfoService userInfoService, QIdentityManager identityManager, InternalConfig internalConfig, AppStateProvider appStateProvider, QRemoteConfigManager remoteConfigManager) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(purchasesCache, "purchasesCache");
        Intrinsics.checkNotNullParameter(handledPurchasesCache, "handledPurchasesCache");
        Intrinsics.checkNotNullParameter(launchResultCache, "launchResultCache");
        Intrinsics.checkNotNullParameter(userInfoService, "userInfoService");
        Intrinsics.checkNotNullParameter(identityManager, "identityManager");
        Intrinsics.checkNotNullParameter(internalConfig, "internalConfig");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        Intrinsics.checkNotNullParameter(remoteConfigManager, "remoteConfigManager");
        this.context = context;
        this.repository = repository;
        this.logger = logger;
        this.purchasesCache = purchasesCache;
        this.handledPurchasesCache = handledPurchasesCache;
        this.launchResultCache = launchResultCache;
        this.userInfoService = userInfoService;
        this.identityManager = identityManager;
        this.internalConfig = internalConfig;
        this.appStateProvider = appStateProvider;
        this.remoteConfigManager = remoteConfigManager;
        this.productsCallbacks = new ArrayList();
        this.entitlementCallbacks = new ArrayList();
        this.purchasingCallbacks = new LinkedHashMap();
        this.restoreCallbacks = new ArrayList();
        this.pendingIdentityCallbacks = new LinkedHashMap();
        this.processingPurchases = CollectionsKt.emptyList();
        this.converter = new GooglePurchaseConverter();
        this.processingPurchaseOptions = LazyKt.lazy(new Function0<Map<String, QPurchaseOptions>>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$processingPurchaseOptions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, QPurchaseOptions> invoke() {
                return MapsKt.toMutableMap(this.this$0.purchasesCache.loadProcessingPurchasesOptions());
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(128L));
        } else {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        }
        this.installDate = ExtensionsKt.milliSecondsToSeconds(packageInfo.firstInstallTime);
    }

    @Override // com.qonversion.android.sdk.internal.provider.UserStateProvider
    public boolean isUserStable() {
        String str;
        return isLaunchingFinished() && this.processingPartnersIdentityId == null && ((str = this.pendingPartnersIdentityId) == null || str.length() == 0) && !this.unhandledLogoutAvailable;
    }

    private final boolean isLaunchingFinished() {
        return (this.launchError == null && this.launchResultCache.getSessionLaunchResult() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, QPurchaseOptions> getProcessingPurchaseOptions() {
        return (Map) this.processingPurchaseOptions.getValue();
    }

    public final synchronized void setBillingService(BillingService billingService) {
        Intrinsics.checkNotNullParameter(billingService, "<set-?>");
        this.billingService = billingService;
    }

    public final synchronized BillingService getBillingService() {
        BillingService billingService = this.billingService;
        if (billingService != null) {
            return billingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingService");
        return null;
    }

    public final void onAppForeground() {
        handlePendingPurchases();
        processPendingInitIfAvailable();
    }

    public static /* synthetic */ void launch$default(QProductCenterManager qProductCenterManager, RequestTrigger requestTrigger, QonversionLaunchCallback qonversionLaunchCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            qonversionLaunchCallback = null;
        }
        qProductCenterManager.launch(requestTrigger, qonversionLaunchCallback);
    }

    public final void launch(final RequestTrigger requestTrigger, QonversionLaunchCallback callback) {
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        final QonversionLaunchCallback launchCallback = getLaunchCallback(callback);
        this.launchError = null;
        this.launchResultCache.resetSessionCache();
        if (!this.internalConfig.getPrimaryConfig().isKidsMode()) {
            new AdvertisingProvider().init(this.context, new AdvertisingProvider.Callback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.launch.1
                @Override // com.qonversion.android.sdk.internal.AdvertisingProvider.Callback
                public void onSuccess(String advertisingId) {
                    Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
                    QProductCenterManager.this.advertisingID = advertisingId;
                    QProductCenterManager.this.continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
                }

                @Override // com.qonversion.android.sdk.internal.AdvertisingProvider.Callback
                public void onFailure(Throwable t) {
                    Intrinsics.checkNotNullParameter(t, "t");
                    QProductCenterManager.this.continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
                }
            });
        } else {
            continueLaunchWithPurchasesInfo(launchCallback, requestTrigger);
        }
    }

    public final void loadProducts(QonversionProductsCallback callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.productsCallbacks.add(callback);
        if (isLaunchingFinished()) {
            if (this.launchResultCache.getSessionLaunchResult() != null) {
                loadStoreProductsIfPossible();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                launch$default(this, RequestTrigger.Products, null, 2, null);
            }
        }
    }

    public final void offerings(final QonversionOfferingsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.offerings.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(Map<String, QProduct> products) {
                Intrinsics.checkNotNullParameter(products, "products");
                QProductCenterManager.this.executeOfferingCallback(callback);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(error);
            }
        });
    }

    public static /* synthetic */ void identify$default(QProductCenterManager qProductCenterManager, String str, QonversionUserCallback qonversionUserCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            qonversionUserCallback = null;
        }
        qProductCenterManager.identify(str, qonversionUserCallback);
    }

    public final void identify(final String identityId, QonversionUserCallback callback) {
        Intrinsics.checkNotNullParameter(identityId, "identityId");
        if (Intrinsics.areEqual(this.identityManager.getCurrentPartnersIdentityId(), identityId)) {
            if (callback != null) {
                getUserInfo(callback);
                return;
            }
            return;
        }
        addIdentityCallback(identityId, callback);
        if (Intrinsics.areEqual(this.processingPartnersIdentityId, identityId)) {
            return;
        }
        this.unhandledLogoutAvailable = false;
        this.pendingPartnersIdentityId = identityId;
        if (!isLaunchingFinished() || this.isRestoreInProgress) {
            return;
        }
        this.processingPartnersIdentityId = identityId;
        if (this.launchError != null) {
            this.repository.init(new InitRequestData(this.installDate, this.advertisingID, null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$identify$launchCallback$1
                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onSuccess(QLaunchResult launchResult) {
                    Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                    this.this$0.processIdentity(identityId);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.this$0.processingPartnersIdentityId = null;
                    this.this$0.remoteConfigManager.userChangingRequestFailedWithError(error);
                    this.this$0.executeEntitlementsBlock(error);
                }
            }, RequestTrigger.Identify));
            return;
        }
        processIdentity(identityId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processIdentity(final String identityId) {
        final String strObtainUserID = this.userInfoService.obtainUserID();
        this.identityManager.identify(identityId, new IdentityManagerCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.processIdentity.1
            @Override // com.qonversion.android.sdk.internal.IdentityManagerCallback
            public void onSuccess(String qonversionUid) {
                Intrinsics.checkNotNullParameter(qonversionUid, "qonversionUid");
                QProductCenterManager.this.pendingPartnersIdentityId = null;
                QProductCenterManager.this.processingPartnersIdentityId = null;
                if (!Intrinsics.areEqual(strObtainUserID, qonversionUid)) {
                    QProductCenterManager.this.internalConfig.setUid(qonversionUid);
                    QProductCenterManager.this.remoteConfigManager.onUserUpdate();
                    QProductCenterManager.this.launchResultCache.clearPermissionsCache();
                    QProductCenterManager qProductCenterManager = QProductCenterManager.this;
                    RequestTrigger requestTrigger = RequestTrigger.Identify;
                    final QProductCenterManager qProductCenterManager2 = QProductCenterManager.this;
                    final String str = identityId;
                    qProductCenterManager.launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$processIdentity$1$onSuccess$1
                        @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                        public void onSuccess(QLaunchResult launchResult) {
                            Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                            qProductCenterManager2.fireIdentitySuccess(str);
                        }

                        @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                        public void onError(QonversionError error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            qProductCenterManager2.fireIdentityError(str, error);
                        }
                    });
                    return;
                }
                QProductCenterManager.handlePendingRequests$default(QProductCenterManager.this, null, 1, null);
                QProductCenterManager.this.fireIdentitySuccess(identityId);
            }

            @Override // com.qonversion.android.sdk.internal.IdentityManagerCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QProductCenterManager.this.processingPartnersIdentityId = null;
                QProductCenterManager.this.executeEntitlementsBlock(error);
                QProductCenterManager.this.remoteConfigManager.userChangingRequestFailedWithError(error);
                QProductCenterManager.this.fireIdentityError(identityId, error);
            }
        });
    }

    public final void checkTrialIntroEligibilityForProductIds(final List<String> productIds, final QonversionEligibilityCallback callback) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(callback, "callback");
        loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.checkTrialIntroEligibilityForProductIds.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(Map<String, QProduct> products) {
                QEligibility qEligibility;
                Intrinsics.checkNotNullParameter(products, "products");
                List<String> list = productIds;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, QProduct> entry : products.entrySet()) {
                    if (list.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    QProduct qProduct = (QProduct) entry2.getValue();
                    QProductStoreDetails storeDetails = qProduct.getStoreDetails();
                    if (storeDetails != null && storeDetails.getIsPrepaid()) {
                        qEligibility = new QEligibility(QIntroEligibilityStatus.NonIntroOrTrialProduct);
                    } else {
                        qEligibility = new QEligibility(QIntroEligibilityStatus.INSTANCE.fromProductType(qProduct.getType()));
                    }
                    linkedHashMap2.put(key, qEligibility);
                }
                callback.onSuccess(linkedHashMap2);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                callback.onError(error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeOfferingCallback(QonversionOfferingsCallback callback) {
        QOfferings offerings = getOfferings();
        if (offerings == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.OfferingsNotFound, null, null, 6, null);
            }
            callback.onError(qonversionError);
            return;
        }
        Iterator<T> it = offerings.getAvailableOfferings().iterator();
        while (it.hasNext()) {
            getBillingService().enrichStoreData(((QOffering) it.next()).getProducts());
        }
        callback.onSuccess(offerings);
    }

    private final QOfferings getOfferings() {
        return this.launchResultCache.getActualOfferings();
    }

    public final void purchaseProduct(final Activity context, final PurchaseModelInternal purchaseModel, final QonversionPurchaseCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseModel, "purchaseModel");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.internalConfig.isAnalyticsMode()) {
            this.logger.warn("Making purchases via Qonversion in the Analytics mode can lead to an inconsistent state in the store. Consider switching to the Subscription management mode.");
        }
        if (this.launchError == null) {
            tryToPurchase(context, purchaseModel, callback);
        } else {
            retryLaunch(new Function1<QLaunchResult, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.purchaseProduct.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QLaunchResult qLaunchResult) {
                    invoke2(qLaunchResult);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QLaunchResult it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    QProductCenterManager.purchaseProduct$tryToPurchase(QProductCenterManager.this, context, purchaseModel, callback);
                }
            }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.purchaseProduct.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                    invoke2(qonversionError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QonversionError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    QProductCenterManager.purchaseProduct$tryToPurchase(QProductCenterManager.this, context, purchaseModel, callback);
                }
            }, RequestTrigger.Purchase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void purchaseProduct$tryToPurchase(QProductCenterManager qProductCenterManager, Activity activity, PurchaseModelInternal purchaseModelInternal, QonversionPurchaseCallback qonversionPurchaseCallback) {
        qProductCenterManager.tryToPurchase(activity, purchaseModelInternal, qonversionPurchaseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToPurchase(Activity context, PurchaseModelInternal purchaseModel, QonversionPurchaseCallback callback) {
        QProduct productForPurchase;
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            callback.onError(qonversionError);
            return;
        }
        QProduct productForPurchase2 = getProductForPurchase(purchaseModel.getProductId(), actualProducts);
        if (productForPurchase2 == null) {
            callback.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
            return;
        }
        QPurchaseOptions options = purchaseModel.getOptions();
        if (options == null || (productForPurchase = options.getOldProduct()) == null) {
            productForPurchase = getProductForPurchase(purchaseModel.getOldProductId(), actualProducts);
        }
        processPurchase(context, purchaseModel.enrich(productForPurchase2, productForPurchase), callback);
    }

    private final void processPurchase(Activity context, PurchaseModelInternalEnriched purchaseModel, QonversionPurchaseCallback callback) {
        if (purchaseModel.getProduct().getStoreID() == null) {
            callback.onError(new QonversionError(QonversionErrorCode.ProductNotFound, null, null, 6, null));
            return;
        }
        if (this.purchasingCallbacks.get(purchaseModel.getProduct().getStoreID()) != null) {
            this.logger.release("purchaseProduct() -> Purchase of the product " + purchaseModel.getProduct().getQonversionID() + " is already in progress. This call will be ignored");
        } else {
            this.purchasingCallbacks.put(purchaseModel.getProduct().getStoreID(), callback);
            updatePurchaseOptions(purchaseModel.getOptions(), purchaseModel.getProduct().getStoreID());
            getBillingService().purchase(context, purchaseModel);
        }
    }

    private final void updatePurchaseOptions(QPurchaseOptions options, String storeProductId) {
        if (storeProductId != null) {
            if (options != null) {
                getProcessingPurchaseOptions().put(storeProductId, options);
            } else {
                getProcessingPurchaseOptions().remove(storeProductId);
            }
            this.purchasesCache.saveProcessingPurchasesOptions(getProcessingPurchaseOptions());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePurchaseOptions(String productId) {
        updatePurchaseOptions(null, productId);
    }

    private final QProduct getProductForPurchase(String productId, Map<String, QProduct> products) {
        if (productId == null) {
            return null;
        }
        return products.get(productId);
    }

    public final void checkEntitlements(QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.entitlementCallbacks.add(callback);
        handlePendingRequests$default(this, null, 1, null);
    }

    public static /* synthetic */ void restore$default(QProductCenterManager qProductCenterManager, RequestTrigger requestTrigger, QonversionEntitlementsCallback qonversionEntitlementsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            qonversionEntitlementsCallback = null;
        }
        qProductCenterManager.restore(requestTrigger, qonversionEntitlementsCallback);
    }

    public final void restore(final RequestTrigger requestTrigger, QonversionEntitlementsCallback callback) {
        Intrinsics.checkNotNullParameter(requestTrigger, "requestTrigger");
        if (callback != null) {
            this.restoreCallbacks.add(callback);
        }
        if (this.isRestoreInProgress) {
            return;
        }
        this.isRestoreInProgress = true;
        getBillingService().queryPurchasesHistory(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.restore.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                QProductCenterManager.this.executeRestoreBlocksOnError(ErrorsKt.toQonversionError(it));
            }
        }, new Function1<List<? extends PurchaseHistory>, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.restore.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends PurchaseHistory> list) {
                invoke2((List<PurchaseHistory>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<PurchaseHistory> historyRecords) {
                Intrinsics.checkNotNullParameter(historyRecords, "historyRecords");
                QProductCenterManager.this.getBillingService().consumeHistoryRecords(historyRecords);
                QRepository qRepository = QProductCenterManager.this.repository;
                long j = QProductCenterManager.this.installDate;
                final QProductCenterManager qProductCenterManager = QProductCenterManager.this;
                qRepository.restore(j, historyRecords, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.restore.3.1
                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onSuccess(QLaunchResult launchResult) {
                        Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                        qProductCenterManager.updateLaunchResult(launchResult);
                        qProductCenterManager.executeRestoreBlocksOnSuccess(ExtensionsKt.toEntitlementsMap(launchResult.getPermissions$sdk_release()));
                    }

                    @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                    public void onError(QonversionError error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (qProductCenterManager.shouldCalculatePermissionsLocally(error)) {
                            qProductCenterManager.calculateRestorePermissionsLocally(historyRecords, error);
                        } else {
                            qProductCenterManager.executeRestoreBlocksOnError(error);
                        }
                    }
                }, requestTrigger);
            }
        });
    }

    public final void syncPurchases() {
        restore$default(this, RequestTrigger.SyncPurchases, null, 2, null);
    }

    @Override // com.qonversion.android.sdk.internal.billing.QonversionBillingService.PurchasesListener
    public void onPurchasesCompleted(List<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        handlePurchases(purchases);
    }

    @Override // com.qonversion.android.sdk.internal.billing.QonversionBillingService.PurchasesListener
    public void onPurchasesFailed(BillingError error, List<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        if (!purchases.isEmpty()) {
            for (Purchase purchase : purchases) {
                QonversionPurchaseCallback qonversionPurchaseCallback = this.purchasingCallbacks.get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
                Map<String, QonversionPurchaseCallback> map = this.purchasingCallbacks;
                TypeIntrinsics.asMutableMap(map).remove(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
                if (qonversionPurchaseCallback != null) {
                    qonversionPurchaseCallback.onError(ErrorsKt.toQonversionError(error));
                }
            }
            return;
        }
        for (QonversionPurchaseCallback qonversionPurchaseCallback2 : this.purchasingCallbacks.values()) {
            if (qonversionPurchaseCallback2 != null) {
                qonversionPurchaseCallback2.onError(ErrorsKt.toQonversionError(error));
            }
        }
        this.purchasingCallbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateRestorePermissionsLocally(List<PurchaseHistory> purchaseHistoryRecords, QonversionError restoreError) {
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            failLocallyGrantingRestorePermissionsWithError(qonversionError);
            return;
        }
        Map<String, List<String>> productPermissions = this.launchResultCache.getProductPermissions();
        if (productPermissions == null) {
            failLocallyGrantingRestorePermissionsWithError(restoreError);
        } else {
            executeRestoreBlocksOnSuccess(ExtensionsKt.toEntitlementsMap(grantPermissionsAfterFailedRestore(purchaseHistoryRecords, actualProducts.values(), productPermissions)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculatePurchasePermissionsLocally(Purchase purchase, QonversionPurchaseCallback purchaseCallback, QonversionError purchaseError) {
        Object next;
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, qonversionError);
            return;
        }
        Map<String, List<String>> productPermissions = this.launchResultCache.getProductPermissions();
        if (productPermissions == null) {
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, purchaseError);
            return;
        }
        Iterator<T> it = actualProducts.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((QProduct) next).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase))) {
                    break;
                }
            }
        }
        QProduct qProduct = (QProduct) next;
        if (qProduct == null) {
            failLocallyGrantingPurchasePermissionsWithError(purchaseCallback, purchaseError);
            return;
        }
        Map<String, QPermission> mapGrantPermissionsAfterFailedPurchaseTracking = grantPermissionsAfterFailedPurchaseTracking(purchase, qProduct, productPermissions);
        if (purchaseCallback != null) {
            purchaseCallback.onSuccess(ExtensionsKt.toEntitlementsMap(mapGrantPermissionsAfterFailedPurchaseTracking), purchase);
        }
    }

    private final void failLocallyGrantingPurchasePermissionsWithError(QonversionPurchaseCallback callback, QonversionError error) {
        this.launchResultCache.clearPermissionsCache();
        if (callback != null) {
            callback.onError(error);
        }
    }

    private final void failLocallyGrantingRestorePermissionsWithError(QonversionError error) {
        this.launchResultCache.clearPermissionsCache();
        executeRestoreBlocksOnError(error);
    }

    private final Map<String, QPermission> grantPermissionsAfterFailedPurchaseTracking(Purchase purchase, QProduct purchasedProduct, Map<String, ? extends List<String>> productPermissions) {
        ArrayList arrayListEmptyList;
        List<String> list = productPermissions.get(purchasedProduct.getQonversionID());
        if (list == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                QPermission qPermissionCreatePermission = createPermission((String) it.next(), purchase.getPurchaseTime(), purchasedProduct);
                if (qPermissionCreatePermission != null) {
                    arrayList.add(qPermissionCreatePermission);
                }
            }
            arrayListEmptyList = arrayList;
        }
        return mergeManuallyCreatedPermissions(arrayListEmptyList);
    }

    private final Map<String, QPermission> grantPermissionsAfterFailedRestore(List<PurchaseHistory> historyRecords, final Collection<QProduct> products, final Map<String, ? extends List<String>> productPermissions) {
        Sequence sequenceFilterNotNull = SequencesKt.filterNotNull(SequencesKt.flatMapIterable(CollectionsKt.asSequence(historyRecords), new Function1<PurchaseHistory, List<? extends QPermission>>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<QPermission> invoke(PurchaseHistory record) {
                Intrinsics.checkNotNullParameter(record, "record");
                Collection<QProduct> collection = products;
                ArrayList<QProduct> arrayList = new ArrayList();
                for (Object obj : collection) {
                    if (Intrinsics.areEqual(((QProduct) obj).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(record.getHistoryRecord()))) {
                        arrayList.add(obj);
                    }
                }
                Map<String, List<String>> map = productPermissions;
                QProductCenterManager qProductCenterManager = this;
                ArrayList arrayList2 = new ArrayList();
                for (QProduct qProduct : arrayList) {
                    List<String> listEmptyList = map.get(qProduct.getQonversionID());
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List<String> list = listEmptyList;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(qProductCenterManager.createPermission((String) it.next(), record.getHistoryRecord().getPurchaseTime(), qProduct));
                    }
                    CollectionsKt.addAll(arrayList2, arrayList3);
                }
                return arrayList2;
            }
        }));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceFilterNotNull) {
            String permissionID = ((QPermission) obj).getPermissionID();
            Object obj2 = linkedHashMap.get(permissionID);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(permissionID, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((QPermission) CollectionsKt.first((List) ((Map.Entry) it.next()).getValue()));
        }
        return mergeManuallyCreatedPermissions(CollectionsKt.toList(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QPermission createPermission(String id, long purchaseTime, QProduct purchasedProduct) {
        Integer numValueOf = purchasedProduct.getType() == QProductType.InApp ? null : Integer.valueOf(Math.min(this.internalConfig.getCacheConfig().getEntitlementsCacheLifetime().getDays(), QEntitlementsCacheLifetime.Year.getDays()));
        Date date = numValueOf != null ? new Date(UtilsKt.getDaysToMs(numValueOf.intValue()) + purchaseTime) : null;
        if (date == null || new Date().compareTo(date) < 0) {
            return new QPermission(id, purchasedProduct.getQonversionID(), QProductRenewState.Unknown, new Date(purchaseTime), date, QEntitlementSource.PlayStore, 1, 0, null, null, null, null, QEntitlementGrantType.Purchase, null, null, 16384, null);
        }
        return null;
    }

    private final Map<String, QPermission> mergeManuallyCreatedPermissions(List<QPermission> newPermissions) {
        Map<String, QPermission> actualPermissions = this.launchResultCache.getActualPermissions();
        if (actualPermissions == null) {
            actualPermissions = MapsKt.emptyMap();
        }
        Map<String, QPermission> mutableMap = MapsKt.toMutableMap(actualPermissions);
        for (QPermission qPermission : newPermissions) {
            String permissionID = qPermission.getPermissionID();
            mutableMap.put(permissionID, choosePermissionToSave(mutableMap.get(permissionID), qPermission));
        }
        this.launchResultCache.updatePermissions(mutableMap);
        return mutableMap;
    }

    private final QPermission choosePermissionToSave(QPermission existingPermission, QPermission localCreatedPermission) {
        if (existingPermission == null) {
            return localCreatedPermission;
        }
        Date expirationDate = localCreatedPermission.getExpirationDate();
        long time = expirationDate != null ? expirationDate.getTime() : Long.MAX_VALUE;
        Date expirationDate2 = existingPermission.getExpirationDate();
        return (!existingPermission.isActive() || ((time > (expirationDate2 != null ? expirationDate2.getTime() : Long.MAX_VALUE) ? 1 : (time == (expirationDate2 != null ? expirationDate2.getTime() : Long.MAX_VALUE) ? 0 : -1)) > 0)) ? localCreatedPermission : existingPermission;
    }

    private final void processPendingInitIfAvailable() {
        InitRequestData initRequestData = this.pendingInitRequestData;
        if (initRequestData != null) {
            processInit(initRequestData);
            this.pendingInitRequestData = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInit(InitRequestData initRequestData) {
        if (this.appStateProvider.getAppState().isBackground()) {
            this.pendingInitRequestData = initRequestData;
        } else {
            this.repository.init(initRequestData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager qProductCenterManager, QonversionLaunchCallback qonversionLaunchCallback, RequestTrigger requestTrigger) {
        qProductCenterManager.processInit(new InitRequestData(qProductCenterManager.installDate, qProductCenterManager.advertisingID, null, qonversionLaunchCallback, requestTrigger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void continueLaunchWithPurchasesInfo(final QonversionLaunchCallback callback, final RequestTrigger requestTrigger) {
        getBillingService().queryPurchases(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.continueLaunchWithPurchasesInfo.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                QProductCenterManager.continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager.this, callback, requestTrigger);
            }
        }, new Function1<List<? extends Purchase>, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.continueLaunchWithPurchasesInfo.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Purchase> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends Purchase> purchases) {
                Intrinsics.checkNotNullParameter(purchases, "purchases");
                if (purchases.isEmpty()) {
                    QProductCenterManager.continueLaunchWithPurchasesInfo$processInitDefault(QProductCenterManager.this, callback, requestTrigger);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : purchases) {
                    if (((Purchase) obj).getPurchaseState() == 1) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                QProductCenterManager.this.processingPurchases = arrayList2;
                QProductCenterManager.this.processInit(new InitRequestData(QProductCenterManager.this.installDate, QProductCenterManager.this.advertisingID, QProductCenterManager.this.converter.convertPurchases(arrayList2, QProductCenterManager.this.getProcessingPurchaseOptions()), QProductCenterManager.this.getWrappedPurchasesCallback(arrayList2, callback), requestTrigger));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QonversionLaunchCallback getWrappedPurchasesCallback(final List<? extends Purchase> trackingPurchases, final QonversionLaunchCallback outerCallback) {
        return new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.getWrappedPurchasesCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(QLaunchResult launchResult) {
                Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                QProductCenterManager.this.handledPurchasesCache.saveHandledPurchases(trackingPurchases);
                List<Purchase> list = trackingPurchases;
                QProductCenterManager qProductCenterManager = QProductCenterManager.this;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    qProductCenterManager.removePurchaseOptions(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId((Purchase) it.next()));
                }
                outerCallback.onSuccess(launchResult);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                outerCallback.onError(error);
            }
        };
    }

    private final QonversionLaunchCallback getLaunchCallback(final QonversionLaunchCallback callback) {
        return new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.getLaunchCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(QLaunchResult launchResult) {
                Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                QProductCenterManager.this.updateLaunchResult(launchResult);
                QProductCenterManager.this.launchError = null;
                QProductCenterManager.handlePendingRequests$default(QProductCenterManager.this, null, 1, null);
                QProductCenterManager.this.loadStoreProductsIfPossible();
                if (!QProductCenterManager.this.processingPurchases.isEmpty()) {
                    QProductCenterManager.this.handledPurchasesCache.saveHandledPurchases(QProductCenterManager.this.processingPurchases);
                    QProductCenterManager.this.getBillingService().consumePurchases(CollectionsKt.toList(QProductCenterManager.this.processingPurchases));
                    QProductCenterManager.this.processingPurchases = CollectionsKt.emptyList();
                }
                QProductCenterManager.this.handleCachedPurchases();
                QonversionLaunchCallback qonversionLaunchCallback = callback;
                if (qonversionLaunchCallback != null) {
                    qonversionLaunchCallback.onSuccess(launchResult);
                }
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QProductCenterManager.this.launchError = error;
                QProductCenterManager.this.handlePendingRequests(error);
                QProductCenterManager.this.loadStoreProductsIfPossible();
                QonversionLaunchCallback qonversionLaunchCallback = callback;
                if (qonversionLaunchCallback != null) {
                    qonversionLaunchCallback.onError(error);
                }
            }
        };
    }

    public final void logout() {
        this.pendingPartnersIdentityId = null;
        if (this.identityManager.logoutIfNeeded()) {
            this.remoteConfigManager.onUserUpdate();
            this.launchResultCache.clearPermissionsCache();
            this.unhandledLogoutAvailable = true;
            this.internalConfig.setUid(this.userInfoService.obtainUserID());
        }
    }

    public final void getUserInfo(QonversionUserCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onSuccess(new QUser(this.internalConfig.getUid(), this.identityManager.getCurrentPartnersIdentityId()));
    }

    public final void setEntitlementsUpdateListener(QEntitlementsUpdateListener entitlementsUpdateListener) {
        Intrinsics.checkNotNullParameter(entitlementsUpdateListener, "entitlementsUpdateListener");
        this.internalConfig.setEntitlementsUpdateListener(entitlementsUpdateListener);
    }

    private final void handleLogout() {
        this.unhandledLogoutAvailable = false;
        launch$default(this, RequestTrigger.Logout, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLaunchResult(QLaunchResult launchResult) {
        this.launchResultCache.save(launchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadStoreProductsIfPossible() {
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            executeProductsBlocks(qonversionError);
            return;
        }
        getBillingService().enrichStoreDataAsync(CollectionsKt.toList(actualProducts.values()), new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.loadStoreProductsIfPossible.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                invoke2(billingError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                QProductCenterManager.this.executeProductsBlocks(ErrorsKt.toQonversionError(error));
            }
        }, new Function1<List<? extends QProduct>, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.loadStoreProductsIfPossible.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends QProduct> list) {
                invoke2((List<QProduct>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<QProduct> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                QProductCenterManager.executeProductsBlocks$default(QProductCenterManager.this, null, 1, null);
            }
        });
    }

    static /* synthetic */ void handlePendingRequests$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i, Object obj) {
        if ((i & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.handlePendingRequests(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePendingRequests(QonversionError lastError) {
        if (isLaunchingFinished() && !this.isRestoreInProgress && this.processingPartnersIdentityId == null) {
            String str = this.pendingPartnersIdentityId;
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                identify$default(this, str, null, 2, null);
            } else if (this.unhandledLogoutAvailable) {
                handleLogout();
            } else {
                executeEntitlementsBlock(lastError);
                this.remoteConfigManager.handlePendingRequests();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCachedPurchases() {
        for (final com.qonversion.android.sdk.internal.purchase.Purchase purchase : this.purchasesCache.loadPurchases()) {
            this.repository.purchase(this.installDate, purchase, null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$handleCachedPurchases$1$1
                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                public void onSuccess(QLaunchResult launchResult) {
                    Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                    this.this$0.updateLaunchResult(launchResult);
                    this.this$0.purchasesCache.clearPurchase(purchase);
                }
            });
        }
    }

    static /* synthetic */ void executeProductsBlocks$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i, Object obj) {
        if ((i & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.executeProductsBlocks(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeProductsBlocks(QonversionError loadStoreProductsError) {
        if (this.productsCallbacks.isEmpty()) {
            return;
        }
        List<? extends QonversionProductsCallback> list = CollectionsKt.toList(this.productsCallbacks);
        this.productsCallbacks.clear();
        if (loadStoreProductsError != null) {
            fireProductsFailure(list, loadStoreProductsError);
            return;
        }
        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
        if (actualProducts == null) {
            QProductCenterManager qProductCenterManager = this;
            QonversionError qonversionError = this.launchError;
            if (qonversionError == null) {
                qonversionError = new QonversionError(QonversionErrorCode.LaunchError, null, null, 6, null);
            }
            fireProductsFailure(list, qonversionError);
            return;
        }
        List<QProduct> list2 = CollectionsKt.toList(actualProducts.values());
        getBillingService().enrichStoreData(list2);
        for (QonversionProductsCallback qonversionProductsCallback : list) {
            if (qonversionProductsCallback != null) {
                List<QProduct> list3 = list2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (Object obj : list3) {
                    linkedHashMap.put(((QProduct) obj).getQonversionID(), obj);
                }
                qonversionProductsCallback.onSuccess(linkedHashMap);
            }
        }
    }

    static /* synthetic */ void executeEntitlementsBlock$default(QProductCenterManager qProductCenterManager, QonversionError qonversionError, int i, Object obj) {
        if ((i & 1) != 0) {
            qonversionError = null;
        }
        qProductCenterManager.executeEntitlementsBlock(qonversionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeEntitlementsBlock(QonversionError actualError) {
        if (this.entitlementCallbacks.isEmpty()) {
            return;
        }
        final List list = CollectionsKt.toList(this.entitlementCallbacks);
        this.entitlementCallbacks.clear();
        preparePermissionsResult(new Function1<Map<String, ? extends QPermission>, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.executeEntitlementsBlock.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends QPermission> map) {
                invoke2((Map<String, QPermission>) map);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, QPermission> permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                for (QonversionEntitlementsCallback qonversionEntitlementsCallback : list) {
                    if (qonversionEntitlementsCallback != null) {
                        qonversionEntitlementsCallback.onSuccess(ExtensionsKt.toEntitlementsMap(permissions));
                    }
                }
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.executeEntitlementsBlock.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                for (QonversionEntitlementsCallback qonversionEntitlementsCallback : list) {
                    if (qonversionEntitlementsCallback != null) {
                        qonversionEntitlementsCallback.onError(error);
                    }
                }
            }
        }, actualError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeRestoreBlocksOnSuccess(Map<String, QEntitlement> entitlements) {
        List<QonversionEntitlementsCallback> list = CollectionsKt.toList(this.restoreCallbacks);
        this.restoreCallbacks.clear();
        this.isRestoreInProgress = false;
        for (QonversionEntitlementsCallback qonversionEntitlementsCallback : list) {
            if (qonversionEntitlementsCallback != null) {
                qonversionEntitlementsCallback.onSuccess(entitlements);
            }
        }
        handlePendingRequests$default(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeRestoreBlocksOnError(QonversionError error) {
        List<QonversionEntitlementsCallback> list = CollectionsKt.toList(this.restoreCallbacks);
        this.restoreCallbacks.clear();
        this.isRestoreInProgress = false;
        for (QonversionEntitlementsCallback qonversionEntitlementsCallback : list) {
            if (qonversionEntitlementsCallback != null) {
                qonversionEntitlementsCallback.onError(error);
            }
        }
        handlePendingRequests(error);
    }

    private final void retryLaunch(final Function1<? super QLaunchResult, Unit> onSuccess, final Function1<? super QonversionError, Unit> onError, RequestTrigger requestTrigger) {
        launch(requestTrigger, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.retryLaunch.1
            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onSuccess(QLaunchResult launchResult) {
                Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                onSuccess.invoke(launchResult);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                onError.invoke(error);
            }
        });
    }

    private final void fireProductsFailure(List<? extends QonversionProductsCallback> callbacks, QonversionError error) {
        for (QonversionProductsCallback qonversionProductsCallback : callbacks) {
            if (qonversionProductsCallback != null) {
                qonversionProductsCallback.onError(error);
            }
        }
    }

    private static final void preparePermissionsResult$actualizePermissions(final QProductCenterManager qProductCenterManager, final Function1<? super Map<String, QPermission>, Unit> function1, final Function1<? super QonversionError, Unit> function12) {
        qProductCenterManager.retryLaunch(new Function1<QLaunchResult, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$preparePermissionsResult$actualizePermissions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QLaunchResult qLaunchResult) {
                invoke2(qLaunchResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QLaunchResult launchResult) {
                Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                function1.invoke(launchResult.getPermissions$sdk_release());
                qProductCenterManager.unhandledLogoutAvailable = false;
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$preparePermissionsResult$actualizePermissions$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError error) {
                Unit unit;
                Intrinsics.checkNotNullParameter(error, "error");
                Map<String, QPermission> actualPermissions = this.this$0.launchResultCache.getActualPermissions();
                if (actualPermissions != null) {
                    function1.invoke(actualPermissions);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    function12.invoke(error);
                }
            }
        }, RequestTrigger.ActualizePermissions);
    }

    private final void preparePermissionsResult(Function1<? super Map<String, QPermission>, Unit> onSuccess, Function1<? super QonversionError, Unit> onError, QonversionError error) {
        Map<String, QPermission> actualPermissions = this.launchResultCache.getActualPermissions();
        if (actualPermissions == null) {
            actualPermissions = MapsKt.emptyMap();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (!actualPermissions.isEmpty()) {
            Iterator<Map.Entry<String, QPermission>> it = actualPermissions.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, QPermission> next = it.next();
                Date expirationDate = next.getValue().getExpirationDate();
                long time = expirationDate != null ? expirationDate.getTime() : Long.MAX_VALUE;
                if (next.getValue().isActive() && time < jCurrentTimeMillis) {
                    z = false;
                    break;
                }
            }
        }
        if ((error == null || UtilsKt.getShouldFireFallback(error)) && z) {
            onSuccess.invoke(actualPermissions);
        } else if (error != null) {
            onError.invoke(error);
        } else {
            preparePermissionsResult$actualizePermissions(this, onSuccess, onError);
        }
    }

    private final void handlePendingPurchases() {
        if (isLaunchingFinished()) {
            getBillingService().queryPurchases(new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.handlePendingPurchases.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                    invoke2(billingError);
                    return Unit.INSTANCE;
                }
            }, new Function1<List<? extends Purchase>, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.handlePendingPurchases.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Purchase> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends Purchase> purchases) {
                    Intrinsics.checkNotNullParameter(purchases, "purchases");
                    QProductCenterManager.this.handlePurchases(purchases);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePurchases(List<? extends Purchase> purchases) {
        final QProduct qProduct;
        Collection<QProduct> collectionValues;
        Object next;
        getBillingService().consumePurchases(purchases);
        for (final Purchase purchase : purchases) {
            final QonversionPurchaseCallback qonversionPurchaseCallback = this.purchasingCallbacks.get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            TypeIntrinsics.asMutableMap(this.purchasingCallbacks).remove(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase));
            int purchaseState = purchase.getPurchaseState();
            if (purchaseState != 0) {
                if (purchaseState != 2) {
                    if (this.handledPurchasesCache.shouldHandlePurchase(purchase)) {
                        Map<String, QProduct> actualProducts = this.launchResultCache.getActualProducts();
                        if (actualProducts == null || (collectionValues = actualProducts.values()) == null) {
                            qProduct = null;
                        } else {
                            Iterator<T> it = collectionValues.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (Intrinsics.areEqual(((QProduct) next).getStoreID(), com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase))) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            qProduct = (QProduct) next;
                        }
                        final com.qonversion.android.sdk.internal.purchase.Purchase purchaseConvertPurchase = this.converter.convertPurchase(purchase, getProcessingPurchaseOptions().get(com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase)));
                        this.repository.purchase(this.installDate, purchaseConvertPurchase, qProduct != null ? qProduct.getQonversionID() : null, new QonversionLaunchCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$handlePurchases$1$1
                            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                            public void onSuccess(QLaunchResult launchResult) {
                                Intrinsics.checkNotNullParameter(launchResult, "launchResult");
                                this.this$0.updateLaunchResult(launchResult);
                                Map<String, QEntitlement> entitlementsMap = ExtensionsKt.toEntitlementsMap(launchResult.getPermissions$sdk_release());
                                QProductCenterManager qProductCenterManager = this.this$0;
                                QProduct qProduct2 = qProduct;
                                qProductCenterManager.removePurchaseOptions(qProduct2 != null ? qProduct2.getStoreID() : null);
                                QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                                if (qonversionPurchaseCallback2 != null) {
                                    qonversionPurchaseCallback2.onSuccess(entitlementsMap, purchase);
                                } else {
                                    QEntitlementsUpdateListener entitlementsUpdateListener = this.this$0.internalConfig.getEntitlementsUpdateListener();
                                    if (entitlementsUpdateListener != null) {
                                        entitlementsUpdateListener.onEntitlementsUpdated(entitlementsMap);
                                    }
                                }
                                this.this$0.handledPurchasesCache.saveHandledPurchase(purchase);
                            }

                            @Override // com.qonversion.android.sdk.listeners.QonversionLaunchCallback
                            public void onError(QonversionError error) {
                                Intrinsics.checkNotNullParameter(error, "error");
                                this.this$0.storeFailedPurchaseIfNecessary(purchase, purchaseConvertPurchase, qProduct);
                                QProductCenterManager qProductCenterManager = this.this$0;
                                QProduct qProduct2 = qProduct;
                                qProductCenterManager.removePurchaseOptions(qProduct2 != null ? qProduct2.getStoreID() : null);
                                if (this.this$0.shouldCalculatePermissionsLocally(error)) {
                                    this.this$0.calculatePurchasePermissionsLocally(purchase, qonversionPurchaseCallback, error);
                                    return;
                                }
                                QonversionPurchaseCallback qonversionPurchaseCallback2 = qonversionPurchaseCallback;
                                if (qonversionPurchaseCallback2 != null) {
                                    qonversionPurchaseCallback2.onError(error);
                                }
                            }
                        });
                    }
                } else if (qonversionPurchaseCallback != null) {
                    qonversionPurchaseCallback.onError(new QonversionError(QonversionErrorCode.PurchasePending, null, null, 6, null));
                }
            } else if (qonversionPurchaseCallback != null) {
                qonversionPurchaseCallback.onError(new QonversionError(QonversionErrorCode.PurchaseUnspecified, null, null, 6, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void storeFailedPurchaseIfNecessary$storePurchase(QProductCenterManager qProductCenterManager, com.qonversion.android.sdk.internal.purchase.Purchase purchase) {
        qProductCenterManager.purchasesCache.savePurchase(purchase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void storeFailedPurchaseIfNecessary(Purchase purchase, final com.qonversion.android.sdk.internal.purchase.Purchase purchaseInfo, QProduct product) {
        Unit unit;
        QProductStoreDetails storeDetails;
        if (product != null && (storeDetails = product.getStoreDetails()) != null && storeDetails.getIsInApp()) {
            storeFailedPurchaseIfNecessary$storePurchase(this, purchaseInfo);
            return;
        }
        String productId = com.qonversion.android.sdk.internal.billing.UtilsKt.getProductId(purchase);
        if (productId != null) {
            getBillingService().getStoreProductType(productId, new Function1<BillingError, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$storeFailedPurchaseIfNecessary$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingError billingError) {
                    invoke2(billingError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    QProductCenterManager.storeFailedPurchaseIfNecessary$storePurchase(this.this$0, purchaseInfo);
                }
            }, new Function1<QStoreProductType, Unit>() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager$storeFailedPurchaseIfNecessary$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QStoreProductType qStoreProductType) {
                    invoke2(qStoreProductType);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QStoreProductType type) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    if (type == QStoreProductType.InApp) {
                        QProductCenterManager.storeFailedPurchaseIfNecessary$storePurchase(this.this$0, purchaseInfo);
                    }
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            storeFailedPurchaseIfNecessary$storePurchase(this, purchaseInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCalculatePermissionsLocally(QonversionError error) {
        if (!this.internalConfig.isAnalyticsMode()) {
            if (error.getCode() == QonversionErrorCode.NetworkConnectionFailed) {
                return true;
            }
            Integer httpCode$sdk_release = error.getHttpCode$sdk_release();
            if (httpCode$sdk_release != null && ExtensionsKt.isInternalServerError(httpCode$sdk_release.intValue())) {
                return true;
            }
        }
        return false;
    }

    private final void addIdentityCallback(String identityId, QonversionUserCallback callback) {
        if (callback == null) {
            return;
        }
        ArrayList arrayList = this.pendingIdentityCallbacks.get(identityId);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(callback);
        this.pendingIdentityCallbacks.put(identityId, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireIdentitySuccess(String identityId) {
        final List<QonversionUserCallback> list = this.pendingIdentityCallbacks.get(identityId);
        if (list == null) {
            return;
        }
        this.pendingIdentityCallbacks.put(identityId, new ArrayList());
        getUserInfo(new QonversionUserCallback() { // from class: com.qonversion.android.sdk.internal.QProductCenterManager.fireIdentitySuccess.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onSuccess(QUser user) {
                Intrinsics.checkNotNullParameter(user, "user");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((QonversionUserCallback) it.next()).onSuccess(user);
                }
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((QonversionUserCallback) it.next()).onError(error);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireIdentityError(String identityId, QonversionError error) {
        List<QonversionUserCallback> list = this.pendingIdentityCallbacks.get(identityId);
        if (list == null) {
            return;
        }
        this.pendingIdentityCallbacks.put(identityId, new ArrayList());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((QonversionUserCallback) it.next()).onError(error);
        }
    }
}
