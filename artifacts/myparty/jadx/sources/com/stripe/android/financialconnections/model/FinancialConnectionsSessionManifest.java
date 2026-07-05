package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.parsers.TokenJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FinancialConnectionsSessionManifest.kt */
@Metadata(d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u009f\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 ú\u00012\u00020\u0001:\u000eô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001B\u0093\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>¢\u0006\u0004\b?\u0010@B\u0081\u0004\b\u0010\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010$\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\u0014\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010D\u001a\u0004\u0018\u00010E¢\u0006\u0004\b?\u0010FJ\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0013HÆ\u0003J\u0010\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0018HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0018\u0010Ð\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\u0018\u0010Ò\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010Ù\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\u0018\u0010Ú\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\u0011\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010yJ\f\u0010ß\u0001\u001a\u0004\u0018\u00010>HÆ\u0003JÀ\u0004\u0010à\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010$2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+2\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>HÆ\u0001¢\u0006\u0003\u0010á\u0001J\u0007\u0010â\u0001\u001a\u00020BJ\u0016\u0010ã\u0001\u001a\u00020\u00032\n\u0010ä\u0001\u001a\u0005\u0018\u00010å\u0001HÖ\u0003J\n\u0010æ\u0001\u001a\u00020BHÖ\u0001J\n\u0010ç\u0001\u001a\u00020\u0006HÖ\u0001J\u001b\u0010è\u0001\u001a\u00030é\u00012\b\u0010ê\u0001\u001a\u00030ë\u00012\u0007\u0010ì\u0001\u001a\u00020BJ-\u0010í\u0001\u001a\u00030é\u00012\u0007\u0010î\u0001\u001a\u00020\u00002\b\u0010ï\u0001\u001a\u00030ð\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0001¢\u0006\u0003\bó\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010H\u001a\u0004\bQ\u0010JR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010H\u001a\u0004\bS\u0010JR\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010H\u001a\u0004\bU\u0010OR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010H\u001a\u0004\bW\u0010JR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010H\u001a\u0004\bY\u0010JR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010H\u001a\u0004\b[\u0010JR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010H\u001a\u0004\b]\u0010JR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010H\u001a\u0004\b_\u0010JR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010H\u001a\u0004\ba\u0010JR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010H\u001a\u0004\bc\u0010dR\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u0010H\u001a\u0004\bf\u0010gR\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010H\u001a\u0004\bi\u0010jR\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u0010H\u001a\u0004\bl\u0010mR\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u0010H\u001a\u0004\bo\u0010JR\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u0010H\u001a\u0004\bq\u0010JR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010H\u001a\u0004\bs\u0010tR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010H\u001a\u0004\bv\u0010OR \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010z\u0012\u0004\bw\u0010H\u001a\u0004\bx\u0010yR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010H\u001a\u0004\b|\u0010OR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010H\u001a\u0004\b~\u0010OR \u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0004\b\u007f\u0010H\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0082\u0001\u0010H\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0085\u0001\u0010H\u001a\u0005\b\u0086\u0001\u0010OR \u0010&\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0087\u0001\u0010H\u001a\u0005\b\u0088\u0001\u0010OR \u0010'\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0089\u0001\u0010H\u001a\u0005\b\u008a\u0001\u0010OR \u0010(\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008b\u0001\u0010H\u001a\u0005\b\u008c\u0001\u0010OR \u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u008d\u0001\u0010H\u001a\u0005\b\u008e\u0001\u0010OR-\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008f\u0001\u0010H\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R!\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0092\u0001\u0010H\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R-\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0095\u0001\u0010H\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001R \u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0097\u0001\u0010H\u001a\u0005\b\u0098\u0001\u0010OR!\u00100\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0099\u0001\u0010H\u001a\u0006\b\u009a\u0001\u0010\u0084\u0001R!\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0002\u0010z\u0012\u0005\b\u009b\u0001\u0010H\u001a\u0004\b1\u0010yR!\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0002\u0010z\u0012\u0005\b\u009c\u0001\u0010H\u001a\u0004\b2\u0010yR!\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0002\u0010z\u0012\u0005\b\u009d\u0001\u0010H\u001a\u0004\b3\u0010yR!\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0002\u0010z\u0012\u0005\b\u009e\u0001\u0010H\u001a\u0004\b4\u0010yR!\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009f\u0001\u0010H\u001a\u0006\b \u0001\u0010¡\u0001R-\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¢\u0001\u0010H\u001a\u0006\b£\u0001\u0010\u0091\u0001R!\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¤\u0001\u0010H\u001a\u0006\b¥\u0001\u0010¦\u0001R\"\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010z\u0012\u0005\b§\u0001\u0010H\u001a\u0005\b¨\u0001\u0010yR \u0010;\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b©\u0001\u0010H\u001a\u0005\bª\u0001\u0010OR\"\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0002\u0010z\u0012\u0005\b«\u0001\u0010H\u001a\u0005\b¬\u0001\u0010yR!\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u00ad\u0001\u0010H\u001a\u0006\b®\u0001\u0010¯\u0001R\u0013\u0010°\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010J¨\u0006û\u0001"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Landroid/os/Parcelable;", "allowManualEntry", "", "consentRequired", "consentAcquiredAt", "", "customManualEntryHandling", "disableLinkMoreAccounts", "id", "instantVerificationDisabled", "institutionSearchDisabled", "appVerificationEnabled", TokenJsonParser.FIELD_LIVEMODE, "manualEntryUsesMicrodeposits", "mobileHandoffEnabled", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "manualEntryMode", "Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "permissions", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;", "product", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "singleAccount", "useSingleSortSearch", "accountDisconnectionMethod", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "accountholderCustomerEmailAddress", "accountholderIsLinkConsumer", "accountholderPhoneNumber", "accountholderToken", "activeAuthSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "activeInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "assignmentEventId", "businessName", "cancelUrl", "connectPlatformName", "connectedAccountName", "experimentAssignments", "", "displayText", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "features", "hostedAuthUrl", "initialInstitution", "isEndUserFacing", "isLinkWithStripe", "isNetworkingUserFlow", "isStripeDirect", "linkAccountSessionCancellationBehavior", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "modalCustomization", "paymentMethodType", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "stepUpAuthenticationRequired", "successUrl", "skipSuccessPane", "theme", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "<init>", "(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAllowManualEntry$annotations", "()V", "getAllowManualEntry", "()Z", "getConsentRequired$annotations", "getConsentRequired", "getConsentAcquiredAt$annotations", "getConsentAcquiredAt", "()Ljava/lang/String;", "getCustomManualEntryHandling$annotations", "getCustomManualEntryHandling", "getDisableLinkMoreAccounts$annotations", "getDisableLinkMoreAccounts", "getId$annotations", "getId", "getInstantVerificationDisabled$annotations", "getInstantVerificationDisabled", "getInstitutionSearchDisabled$annotations", "getInstitutionSearchDisabled", "getAppVerificationEnabled$annotations", "getAppVerificationEnabled", "getLivemode$annotations", "getLivemode", "getManualEntryUsesMicrodeposits$annotations", "getManualEntryUsesMicrodeposits", "getMobileHandoffEnabled$annotations", "getMobileHandoffEnabled", "getNextPane$annotations", "getNextPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getManualEntryMode$annotations", "getManualEntryMode", "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;", "getPermissions$annotations", "getPermissions", "()Ljava/util/List;", "getProduct$annotations", "getProduct", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "getSingleAccount$annotations", "getSingleAccount", "getUseSingleSortSearch$annotations", "getUseSingleSortSearch", "getAccountDisconnectionMethod$annotations", "getAccountDisconnectionMethod", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "getAccountholderCustomerEmailAddress$annotations", "getAccountholderCustomerEmailAddress", "getAccountholderIsLinkConsumer$annotations", "getAccountholderIsLinkConsumer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccountholderPhoneNumber$annotations", "getAccountholderPhoneNumber", "getAccountholderToken$annotations", "getAccountholderToken", "getActiveAuthSession$annotations", "getActiveAuthSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "getActiveInstitution$annotations", "getActiveInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getAssignmentEventId$annotations", "getAssignmentEventId", "getBusinessName$annotations", "getBusinessName", "getCancelUrl$annotations", "getCancelUrl", "getConnectPlatformName$annotations", "getConnectPlatformName", "getConnectedAccountName$annotations", "getConnectedAccountName", "getExperimentAssignments$annotations", "getExperimentAssignments", "()Ljava/util/Map;", "getDisplayText$annotations", "getDisplayText", "()Lcom/stripe/android/financialconnections/model/TextUpdate;", "getFeatures$annotations", "getFeatures", "getHostedAuthUrl$annotations", "getHostedAuthUrl", "getInitialInstitution$annotations", "getInitialInstitution", "isEndUserFacing$annotations", "isLinkWithStripe$annotations", "isNetworkingUserFlow$annotations", "isStripeDirect$annotations", "getLinkAccountSessionCancellationBehavior$annotations", "getLinkAccountSessionCancellationBehavior", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "getModalCustomization$annotations", "getModalCustomization", "getPaymentMethodType$annotations", "getPaymentMethodType", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "getStepUpAuthenticationRequired$annotations", "getStepUpAuthenticationRequired", "getSuccessUrl$annotations", "getSuccessUrl", "getSkipSuccessPane$annotations", "getSkipSuccessPane", "getTheme$annotations", "getTheme", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "consentAcquired", "getConsentAcquired", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "copy", "(ZZLjava/lang/String;ZZLjava/lang/String;ZZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/TextUpdate;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "Pane", "Product", "AccountDisconnectionMethod", "LinkAccountSessionCancellationBehavior", "Theme", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSessionManifest implements Parcelable {
    private final AccountDisconnectionMethod accountDisconnectionMethod;
    private final String accountholderCustomerEmailAddress;
    private final Boolean accountholderIsLinkConsumer;
    private final String accountholderPhoneNumber;
    private final String accountholderToken;
    private final FinancialConnectionsAuthorizationSession activeAuthSession;
    private final FinancialConnectionsInstitution activeInstitution;
    private final boolean allowManualEntry;
    private final boolean appVerificationEnabled;
    private final String assignmentEventId;
    private final String businessName;
    private final String cancelUrl;
    private final String connectPlatformName;
    private final String connectedAccountName;
    private final String consentAcquiredAt;
    private final boolean consentRequired;
    private final boolean customManualEntryHandling;
    private final boolean disableLinkMoreAccounts;
    private final TextUpdate displayText;
    private final Map<String, String> experimentAssignments;
    private final Map<String, Boolean> features;
    private final String hostedAuthUrl;
    private final String id;
    private final FinancialConnectionsInstitution initialInstitution;
    private final boolean instantVerificationDisabled;
    private final boolean institutionSearchDisabled;
    private final Boolean isEndUserFacing;
    private final Boolean isLinkWithStripe;
    private final Boolean isNetworkingUserFlow;
    private final Boolean isStripeDirect;
    private final LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior;
    private final boolean livemode;
    private final ManualEntryMode manualEntryMode;
    private final boolean manualEntryUsesMicrodeposits;
    private final boolean mobileHandoffEnabled;
    private final Map<String, Boolean> modalCustomization;
    private final Pane nextPane;
    private final FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType;
    private final List<FinancialConnectionsAccount.Permissions> permissions;
    private final Product product;
    private final boolean singleAccount;
    private final Boolean skipSuccessPane;
    private final Boolean stepUpAuthenticationRequired;
    private final String successUrl;
    private final Theme theme;
    private final boolean useSingleSortSearch;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsSessionManifest> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), null, null, null, null, null};

    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSessionManifest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            TextUpdate textUpdate;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            Pane paneValueOf = Pane.valueOf(parcel.readString());
            ManualEntryMode manualEntryModeValueOf = ManualEntryMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FinancialConnectionsAccount.Permissions.valueOf(parcel.readString()));
            }
            ArrayList arrayList2 = arrayList;
            Product productValueOf = Product.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            AccountDisconnectionMethod accountDisconnectionMethodValueOf = parcel.readInt() == 0 ? null : AccountDisconnectionMethod.valueOf(parcel.readString());
            String string3 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSessionCreateFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsAuthorizationSession.CREATOR.createFromParcel(parcel);
            FinancialConnectionsInstitution financialConnectionsInstitutionCreateFromParcel = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                int i4 = 0;
                while (i4 != i3) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i4++;
                    i3 = i3;
                }
            }
            LinkedHashMap linkedHashMap6 = linkedHashMap;
            TextUpdate textUpdateCreateFromParcel = parcel.readInt() == 0 ? null : TextUpdate.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap2 = linkedHashMap6;
                textUpdate = textUpdateCreateFromParcel;
                linkedHashMap3 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap2 = linkedHashMap6;
                linkedHashMap3 = new LinkedHashMap(i5);
                textUpdate = textUpdateCreateFromParcel;
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = i6;
                    linkedHashMap3.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i6 = i7 + 1;
                    i5 = i5;
                }
            }
            LinkedHashMap linkedHashMap7 = linkedHashMap3;
            TextUpdate textUpdate2 = textUpdate;
            String string11 = parcel.readString();
            FinancialConnectionsInstitution financialConnectionsInstitutionCreateFromParcel2 = parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehaviorValueOf = parcel.readInt() == 0 ? null : LinkAccountSessionCancellationBehavior.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap5 = linkedHashMap7;
                linkedHashMap4 = null;
            } else {
                int i8 = parcel.readInt();
                linkedHashMap4 = new LinkedHashMap(i8);
                linkedHashMap5 = linkedHashMap7;
                int i9 = 0;
                while (i9 != i8) {
                    int i10 = i9;
                    linkedHashMap4.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                    i9 = i10 + 1;
                    textUpdate2 = textUpdate2;
                }
            }
            return new FinancialConnectionsSessionManifest(z, z2, string, z3, z4, string2, z5, z6, z7, z8, z9, z10, paneValueOf, manualEntryModeValueOf, arrayList2, productValueOf, z11, z12, accountDisconnectionMethodValueOf, string3, boolValueOf, string4, string5, financialConnectionsAuthorizationSessionCreateFromParcel, financialConnectionsInstitutionCreateFromParcel, string6, string7, string8, string9, string10, linkedHashMap2, textUpdate2, linkedHashMap5, string11, financialConnectionsInstitutionCreateFromParcel2, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, linkAccountSessionCancellationBehaviorValueOf, linkedHashMap4, parcel.readInt() == 0 ? null : FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest[] newArray(int i) {
            return new FinancialConnectionsSessionManifest[i];
        }
    }

    public static /* synthetic */ FinancialConnectionsSessionManifest copy$default(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str3, Boolean bool, String str4, String str5, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str6, String str7, String str8, String str9, String str10, Map map, TextUpdate textUpdate, Map map2, String str11, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str12, Boolean bool7, Theme theme, int i, int i2, Object obj) {
        boolean z13 = (i & 1) != 0 ? financialConnectionsSessionManifest.allowManualEntry : z;
        return financialConnectionsSessionManifest.copy(z13, (i & 2) != 0 ? financialConnectionsSessionManifest.consentRequired : z2, (i & 4) != 0 ? financialConnectionsSessionManifest.consentAcquiredAt : str, (i & 8) != 0 ? financialConnectionsSessionManifest.customManualEntryHandling : z3, (i & 16) != 0 ? financialConnectionsSessionManifest.disableLinkMoreAccounts : z4, (i & 32) != 0 ? financialConnectionsSessionManifest.id : str2, (i & 64) != 0 ? financialConnectionsSessionManifest.instantVerificationDisabled : z5, (i & 128) != 0 ? financialConnectionsSessionManifest.institutionSearchDisabled : z6, (i & 256) != 0 ? financialConnectionsSessionManifest.appVerificationEnabled : z7, (i & 512) != 0 ? financialConnectionsSessionManifest.livemode : z8, (i & 1024) != 0 ? financialConnectionsSessionManifest.manualEntryUsesMicrodeposits : z9, (i & 2048) != 0 ? financialConnectionsSessionManifest.mobileHandoffEnabled : z10, (i & 4096) != 0 ? financialConnectionsSessionManifest.nextPane : pane, (i & 8192) != 0 ? financialConnectionsSessionManifest.manualEntryMode : manualEntryMode, (i & 16384) != 0 ? financialConnectionsSessionManifest.permissions : list, (i & 32768) != 0 ? financialConnectionsSessionManifest.product : product, (i & 65536) != 0 ? financialConnectionsSessionManifest.singleAccount : z11, (i & 131072) != 0 ? financialConnectionsSessionManifest.useSingleSortSearch : z12, (i & 262144) != 0 ? financialConnectionsSessionManifest.accountDisconnectionMethod : accountDisconnectionMethod, (i & 524288) != 0 ? financialConnectionsSessionManifest.accountholderCustomerEmailAddress : str3, (i & 1048576) != 0 ? financialConnectionsSessionManifest.accountholderIsLinkConsumer : bool, (i & 2097152) != 0 ? financialConnectionsSessionManifest.accountholderPhoneNumber : str4, (i & 4194304) != 0 ? financialConnectionsSessionManifest.accountholderToken : str5, (i & 8388608) != 0 ? financialConnectionsSessionManifest.activeAuthSession : financialConnectionsAuthorizationSession, (i & 16777216) != 0 ? financialConnectionsSessionManifest.activeInstitution : financialConnectionsInstitution, (i & 33554432) != 0 ? financialConnectionsSessionManifest.assignmentEventId : str6, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? financialConnectionsSessionManifest.businessName : str7, (i & 134217728) != 0 ? financialConnectionsSessionManifest.cancelUrl : str8, (i & 268435456) != 0 ? financialConnectionsSessionManifest.connectPlatformName : str9, (i & 536870912) != 0 ? financialConnectionsSessionManifest.connectedAccountName : str10, (i & BasicMeasure.EXACTLY) != 0 ? financialConnectionsSessionManifest.experimentAssignments : map, (i & Integer.MIN_VALUE) != 0 ? financialConnectionsSessionManifest.displayText : textUpdate, (i2 & 1) != 0 ? financialConnectionsSessionManifest.features : map2, (i2 & 2) != 0 ? financialConnectionsSessionManifest.hostedAuthUrl : str11, (i2 & 4) != 0 ? financialConnectionsSessionManifest.initialInstitution : financialConnectionsInstitution2, (i2 & 8) != 0 ? financialConnectionsSessionManifest.isEndUserFacing : bool2, (i2 & 16) != 0 ? financialConnectionsSessionManifest.isLinkWithStripe : bool3, (i2 & 32) != 0 ? financialConnectionsSessionManifest.isNetworkingUserFlow : bool4, (i2 & 64) != 0 ? financialConnectionsSessionManifest.isStripeDirect : bool5, (i2 & 128) != 0 ? financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior : linkAccountSessionCancellationBehavior, (i2 & 256) != 0 ? financialConnectionsSessionManifest.modalCustomization : map3, (i2 & 512) != 0 ? financialConnectionsSessionManifest.paymentMethodType : supportedPaymentMethodTypes, (i2 & 1024) != 0 ? financialConnectionsSessionManifest.stepUpAuthenticationRequired : bool6, (i2 & 2048) != 0 ? financialConnectionsSessionManifest.successUrl : str12, (i2 & 4096) != 0 ? financialConnectionsSessionManifest.skipSuccessPane : bool7, (i2 & 8192) != 0 ? financialConnectionsSessionManifest.theme : theme);
    }

    @SerialName("account_disconnection_method")
    public static /* synthetic */ void getAccountDisconnectionMethod$annotations() {
    }

    @SerialName("accountholder_customer_email_address")
    public static /* synthetic */ void getAccountholderCustomerEmailAddress$annotations() {
    }

    @SerialName("accountholder_is_link_consumer")
    public static /* synthetic */ void getAccountholderIsLinkConsumer$annotations() {
    }

    @SerialName("accountholder_phone_number")
    public static /* synthetic */ void getAccountholderPhoneNumber$annotations() {
    }

    @SerialName("accountholder_token")
    public static /* synthetic */ void getAccountholderToken$annotations() {
    }

    @SerialName("active_auth_session")
    public static /* synthetic */ void getActiveAuthSession$annotations() {
    }

    @SerialName("active_institution")
    public static /* synthetic */ void getActiveInstitution$annotations() {
    }

    @SerialName("allow_manual_entry")
    public static /* synthetic */ void getAllowManualEntry$annotations() {
    }

    @SerialName("app_verification_enabled")
    public static /* synthetic */ void getAppVerificationEnabled$annotations() {
    }

    @SerialName("assignment_event_id")
    public static /* synthetic */ void getAssignmentEventId$annotations() {
    }

    @SerialName("business_name")
    public static /* synthetic */ void getBusinessName$annotations() {
    }

    @SerialName("cancel_url")
    public static /* synthetic */ void getCancelUrl$annotations() {
    }

    @SerialName("connect_platform_name")
    public static /* synthetic */ void getConnectPlatformName$annotations() {
    }

    @SerialName("connected_account_name")
    public static /* synthetic */ void getConnectedAccountName$annotations() {
    }

    @SerialName("consent_acquired_at")
    public static /* synthetic */ void getConsentAcquiredAt$annotations() {
    }

    @SerialName("consent_required")
    public static /* synthetic */ void getConsentRequired$annotations() {
    }

    @SerialName("custom_manual_entry_handling")
    public static /* synthetic */ void getCustomManualEntryHandling$annotations() {
    }

    @SerialName("disable_link_more_accounts")
    public static /* synthetic */ void getDisableLinkMoreAccounts$annotations() {
    }

    @SerialName("display_text")
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @SerialName("experiment_assignments")
    public static /* synthetic */ void getExperimentAssignments$annotations() {
    }

    @SerialName("features")
    public static /* synthetic */ void getFeatures$annotations() {
    }

    @SerialName("hosted_auth_url")
    public static /* synthetic */ void getHostedAuthUrl$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_INITIAL_INSTITUTION)
    public static /* synthetic */ void getInitialInstitution$annotations() {
    }

    @SerialName("instant_verification_disabled")
    public static /* synthetic */ void getInstantVerificationDisabled$annotations() {
    }

    @SerialName("institution_search_disabled")
    public static /* synthetic */ void getInstitutionSearchDisabled$annotations() {
    }

    @SerialName("link_account_session_cancellation_behavior")
    public static /* synthetic */ void getLinkAccountSessionCancellationBehavior$annotations() {
    }

    @SerialName(TokenJsonParser.FIELD_LIVEMODE)
    public static /* synthetic */ void getLivemode$annotations() {
    }

    @SerialName("manual_entry_mode")
    public static /* synthetic */ void getManualEntryMode$annotations() {
    }

    @SerialName("manual_entry_uses_microdeposits")
    public static /* synthetic */ void getManualEntryUsesMicrodeposits$annotations() {
    }

    @SerialName("mobile_handoff_enabled")
    public static /* synthetic */ void getMobileHandoffEnabled$annotations() {
    }

    @SerialName("modal_customization")
    public static /* synthetic */ void getModalCustomization$annotations() {
    }

    @SerialName("next_pane")
    public static /* synthetic */ void getNextPane$annotations() {
    }

    @SerialName("payment_method_type")
    public static /* synthetic */ void getPaymentMethodType$annotations() {
    }

    @SerialName("permissions")
    public static /* synthetic */ void getPermissions$annotations() {
    }

    @SerialName("product")
    public static /* synthetic */ void getProduct$annotations() {
    }

    @SerialName("single_account")
    public static /* synthetic */ void getSingleAccount$annotations() {
    }

    @SerialName("skip_success_pane")
    public static /* synthetic */ void getSkipSuccessPane$annotations() {
    }

    @SerialName("step_up_authentication_required")
    public static /* synthetic */ void getStepUpAuthenticationRequired$annotations() {
    }

    @SerialName("success_url")
    public static /* synthetic */ void getSuccessUrl$annotations() {
    }

    @SerialName("theme")
    public static /* synthetic */ void getTheme$annotations() {
    }

    @SerialName("use_single_sort_search")
    public static /* synthetic */ void getUseSingleSortSearch$annotations() {
    }

    @SerialName("is_end_user_facing")
    public static /* synthetic */ void isEndUserFacing$annotations() {
    }

    @SerialName("is_link_with_stripe")
    public static /* synthetic */ void isLinkWithStripe$annotations() {
    }

    @SerialName("is_networking_user_flow")
    public static /* synthetic */ void isNetworkingUserFlow$annotations() {
    }

    @SerialName("is_stripe_direct")
    public static /* synthetic */ void isStripeDirect$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getMobileHandoffEnabled() {
        return this.mobileHandoffEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final Pane getNextPane() {
        return this.nextPane;
    }

    /* renamed from: component14, reason: from getter */
    public final ManualEntryMode getManualEntryMode() {
        return this.manualEntryMode;
    }

    public final List<FinancialConnectionsAccount.Permissions> component15() {
        return this.permissions;
    }

    /* renamed from: component16, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getSingleAccount() {
        return this.singleAccount;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getUseSingleSortSearch() {
        return this.useSingleSortSearch;
    }

    /* renamed from: component19, reason: from getter */
    public final AccountDisconnectionMethod getAccountDisconnectionMethod() {
        return this.accountDisconnectionMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getConsentRequired() {
        return this.consentRequired;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAccountholderCustomerEmailAddress() {
        return this.accountholderCustomerEmailAddress;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getAccountholderIsLinkConsumer() {
        return this.accountholderIsLinkConsumer;
    }

    /* renamed from: component22, reason: from getter */
    public final String getAccountholderPhoneNumber() {
        return this.accountholderPhoneNumber;
    }

    /* renamed from: component23, reason: from getter */
    public final String getAccountholderToken() {
        return this.accountholderToken;
    }

    /* renamed from: component24, reason: from getter */
    public final FinancialConnectionsAuthorizationSession getActiveAuthSession() {
        return this.activeAuthSession;
    }

    /* renamed from: component25, reason: from getter */
    public final FinancialConnectionsInstitution getActiveInstitution() {
        return this.activeInstitution;
    }

    /* renamed from: component26, reason: from getter */
    public final String getAssignmentEventId() {
        return this.assignmentEventId;
    }

    /* renamed from: component27, reason: from getter */
    public final String getBusinessName() {
        return this.businessName;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* renamed from: component29, reason: from getter */
    public final String getConnectPlatformName() {
        return this.connectPlatformName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConsentAcquiredAt() {
        return this.consentAcquiredAt;
    }

    /* renamed from: component30, reason: from getter */
    public final String getConnectedAccountName() {
        return this.connectedAccountName;
    }

    public final Map<String, String> component31() {
        return this.experimentAssignments;
    }

    /* renamed from: component32, reason: from getter */
    public final TextUpdate getDisplayText() {
        return this.displayText;
    }

    public final Map<String, Boolean> component33() {
        return this.features;
    }

    /* renamed from: component34, reason: from getter */
    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    /* renamed from: component35, reason: from getter */
    public final FinancialConnectionsInstitution getInitialInstitution() {
        return this.initialInstitution;
    }

    /* renamed from: component36, reason: from getter */
    public final Boolean getIsEndUserFacing() {
        return this.isEndUserFacing;
    }

    /* renamed from: component37, reason: from getter */
    public final Boolean getIsLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getIsNetworkingUserFlow() {
        return this.isNetworkingUserFlow;
    }

    /* renamed from: component39, reason: from getter */
    public final Boolean getIsStripeDirect() {
        return this.isStripeDirect;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCustomManualEntryHandling() {
        return this.customManualEntryHandling;
    }

    /* renamed from: component40, reason: from getter */
    public final LinkAccountSessionCancellationBehavior getLinkAccountSessionCancellationBehavior() {
        return this.linkAccountSessionCancellationBehavior;
    }

    public final Map<String, Boolean> component41() {
        return this.modalCustomization;
    }

    /* renamed from: component42, reason: from getter */
    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* renamed from: component43, reason: from getter */
    public final Boolean getStepUpAuthenticationRequired() {
        return this.stepUpAuthenticationRequired;
    }

    /* renamed from: component44, reason: from getter */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    /* renamed from: component45, reason: from getter */
    public final Boolean getSkipSuccessPane() {
        return this.skipSuccessPane;
    }

    /* renamed from: component46, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDisableLinkMoreAccounts() {
        return this.disableLinkMoreAccounts;
    }

    /* renamed from: component6, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInstantVerificationDisabled() {
        return this.instantVerificationDisabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getInstitutionSearchDisabled() {
        return this.institutionSearchDisabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAppVerificationEnabled() {
        return this.appVerificationEnabled;
    }

    public final FinancialConnectionsSessionManifest copy(boolean allowManualEntry, boolean consentRequired, String consentAcquiredAt, boolean customManualEntryHandling, boolean disableLinkMoreAccounts, String id, boolean instantVerificationDisabled, boolean institutionSearchDisabled, boolean appVerificationEnabled, boolean livemode, boolean manualEntryUsesMicrodeposits, boolean mobileHandoffEnabled, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean singleAccount, boolean useSingleSortSearch, AccountDisconnectionMethod accountDisconnectionMethod, String accountholderCustomerEmailAddress, Boolean accountholderIsLinkConsumer, String accountholderPhoneNumber, String accountholderToken, FinancialConnectionsAuthorizationSession activeAuthSession, FinancialConnectionsInstitution activeInstitution, String assignmentEventId, String businessName, String cancelUrl, String connectPlatformName, String connectedAccountName, Map<String, String> experimentAssignments, TextUpdate displayText, Map<String, Boolean> features, String hostedAuthUrl, FinancialConnectionsInstitution initialInstitution, Boolean isEndUserFacing, Boolean isLinkWithStripe, Boolean isNetworkingUserFlow, Boolean isStripeDirect, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> modalCustomization, FinancialConnectionsAccount.SupportedPaymentMethodTypes paymentMethodType, Boolean stepUpAuthenticationRequired, String successUrl, Boolean skipSuccessPane, Theme theme) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(manualEntryMode, "manualEntryMode");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(product, "product");
        return new FinancialConnectionsSessionManifest(allowManualEntry, consentRequired, consentAcquiredAt, customManualEntryHandling, disableLinkMoreAccounts, id, instantVerificationDisabled, institutionSearchDisabled, appVerificationEnabled, livemode, manualEntryUsesMicrodeposits, mobileHandoffEnabled, nextPane, manualEntryMode, permissions, product, singleAccount, useSingleSortSearch, accountDisconnectionMethod, accountholderCustomerEmailAddress, accountholderIsLinkConsumer, accountholderPhoneNumber, accountholderToken, activeAuthSession, activeInstitution, assignmentEventId, businessName, cancelUrl, connectPlatformName, connectedAccountName, experimentAssignments, displayText, features, hostedAuthUrl, initialInstitution, isEndUserFacing, isLinkWithStripe, isNetworkingUserFlow, isStripeDirect, linkAccountSessionCancellationBehavior, modalCustomization, paymentMethodType, stepUpAuthenticationRequired, successUrl, skipSuccessPane, theme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) other;
        return this.allowManualEntry == financialConnectionsSessionManifest.allowManualEntry && this.consentRequired == financialConnectionsSessionManifest.consentRequired && Intrinsics.areEqual(this.consentAcquiredAt, financialConnectionsSessionManifest.consentAcquiredAt) && this.customManualEntryHandling == financialConnectionsSessionManifest.customManualEntryHandling && this.disableLinkMoreAccounts == financialConnectionsSessionManifest.disableLinkMoreAccounts && Intrinsics.areEqual(this.id, financialConnectionsSessionManifest.id) && this.instantVerificationDisabled == financialConnectionsSessionManifest.instantVerificationDisabled && this.institutionSearchDisabled == financialConnectionsSessionManifest.institutionSearchDisabled && this.appVerificationEnabled == financialConnectionsSessionManifest.appVerificationEnabled && this.livemode == financialConnectionsSessionManifest.livemode && this.manualEntryUsesMicrodeposits == financialConnectionsSessionManifest.manualEntryUsesMicrodeposits && this.mobileHandoffEnabled == financialConnectionsSessionManifest.mobileHandoffEnabled && this.nextPane == financialConnectionsSessionManifest.nextPane && this.manualEntryMode == financialConnectionsSessionManifest.manualEntryMode && Intrinsics.areEqual(this.permissions, financialConnectionsSessionManifest.permissions) && this.product == financialConnectionsSessionManifest.product && this.singleAccount == financialConnectionsSessionManifest.singleAccount && this.useSingleSortSearch == financialConnectionsSessionManifest.useSingleSortSearch && this.accountDisconnectionMethod == financialConnectionsSessionManifest.accountDisconnectionMethod && Intrinsics.areEqual(this.accountholderCustomerEmailAddress, financialConnectionsSessionManifest.accountholderCustomerEmailAddress) && Intrinsics.areEqual(this.accountholderIsLinkConsumer, financialConnectionsSessionManifest.accountholderIsLinkConsumer) && Intrinsics.areEqual(this.accountholderPhoneNumber, financialConnectionsSessionManifest.accountholderPhoneNumber) && Intrinsics.areEqual(this.accountholderToken, financialConnectionsSessionManifest.accountholderToken) && Intrinsics.areEqual(this.activeAuthSession, financialConnectionsSessionManifest.activeAuthSession) && Intrinsics.areEqual(this.activeInstitution, financialConnectionsSessionManifest.activeInstitution) && Intrinsics.areEqual(this.assignmentEventId, financialConnectionsSessionManifest.assignmentEventId) && Intrinsics.areEqual(this.businessName, financialConnectionsSessionManifest.businessName) && Intrinsics.areEqual(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && Intrinsics.areEqual(this.connectPlatformName, financialConnectionsSessionManifest.connectPlatformName) && Intrinsics.areEqual(this.connectedAccountName, financialConnectionsSessionManifest.connectedAccountName) && Intrinsics.areEqual(this.experimentAssignments, financialConnectionsSessionManifest.experimentAssignments) && Intrinsics.areEqual(this.displayText, financialConnectionsSessionManifest.displayText) && Intrinsics.areEqual(this.features, financialConnectionsSessionManifest.features) && Intrinsics.areEqual(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && Intrinsics.areEqual(this.initialInstitution, financialConnectionsSessionManifest.initialInstitution) && Intrinsics.areEqual(this.isEndUserFacing, financialConnectionsSessionManifest.isEndUserFacing) && Intrinsics.areEqual(this.isLinkWithStripe, financialConnectionsSessionManifest.isLinkWithStripe) && Intrinsics.areEqual(this.isNetworkingUserFlow, financialConnectionsSessionManifest.isNetworkingUserFlow) && Intrinsics.areEqual(this.isStripeDirect, financialConnectionsSessionManifest.isStripeDirect) && this.linkAccountSessionCancellationBehavior == financialConnectionsSessionManifest.linkAccountSessionCancellationBehavior && Intrinsics.areEqual(this.modalCustomization, financialConnectionsSessionManifest.modalCustomization) && this.paymentMethodType == financialConnectionsSessionManifest.paymentMethodType && Intrinsics.areEqual(this.stepUpAuthenticationRequired, financialConnectionsSessionManifest.stepUpAuthenticationRequired) && Intrinsics.areEqual(this.successUrl, financialConnectionsSessionManifest.successUrl) && Intrinsics.areEqual(this.skipSuccessPane, financialConnectionsSessionManifest.skipSuccessPane) && this.theme == financialConnectionsSessionManifest.theme;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.allowManualEntry) * 31) + Boolean.hashCode(this.consentRequired)) * 31;
        String str = this.consentAcquiredAt;
        int iHashCode2 = (((((((((((((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.customManualEntryHandling)) * 31) + Boolean.hashCode(this.disableLinkMoreAccounts)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.instantVerificationDisabled)) * 31) + Boolean.hashCode(this.institutionSearchDisabled)) * 31) + Boolean.hashCode(this.appVerificationEnabled)) * 31) + Boolean.hashCode(this.livemode)) * 31) + Boolean.hashCode(this.manualEntryUsesMicrodeposits)) * 31) + Boolean.hashCode(this.mobileHandoffEnabled)) * 31) + this.nextPane.hashCode()) * 31) + this.manualEntryMode.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.product.hashCode()) * 31) + Boolean.hashCode(this.singleAccount)) * 31) + Boolean.hashCode(this.useSingleSortSearch)) * 31;
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        int iHashCode3 = (iHashCode2 + (accountDisconnectionMethod == null ? 0 : accountDisconnectionMethod.hashCode())) * 31;
        String str2 = this.accountholderCustomerEmailAddress;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.accountholderIsLinkConsumer;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.accountholderPhoneNumber;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountholderToken;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        int iHashCode8 = (iHashCode7 + (financialConnectionsAuthorizationSession == null ? 0 : financialConnectionsAuthorizationSession.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        int iHashCode9 = (iHashCode8 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str5 = this.assignmentEventId;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.businessName;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cancelUrl;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.connectPlatformName;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.connectedAccountName;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map = this.experimentAssignments;
        int iHashCode15 = (iHashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        TextUpdate textUpdate = this.displayText;
        int iHashCode16 = (iHashCode15 + (textUpdate == null ? 0 : textUpdate.hashCode())) * 31;
        Map<String, Boolean> map2 = this.features;
        int iHashCode17 = (iHashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str10 = this.hostedAuthUrl;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        int iHashCode19 = (iHashCode18 + (financialConnectionsInstitution2 == null ? 0 : financialConnectionsInstitution2.hashCode())) * 31;
        Boolean bool2 = this.isEndUserFacing;
        int iHashCode20 = (iHashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLinkWithStripe;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNetworkingUserFlow;
        int iHashCode22 = (iHashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isStripeDirect;
        int iHashCode23 = (iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        int iHashCode24 = (iHashCode23 + (linkAccountSessionCancellationBehavior == null ? 0 : linkAccountSessionCancellationBehavior.hashCode())) * 31;
        Map<String, Boolean> map3 = this.modalCustomization;
        int iHashCode25 = (iHashCode24 + (map3 == null ? 0 : map3.hashCode())) * 31;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        int iHashCode26 = (iHashCode25 + (supportedPaymentMethodTypes == null ? 0 : supportedPaymentMethodTypes.hashCode())) * 31;
        Boolean bool6 = this.stepUpAuthenticationRequired;
        int iHashCode27 = (iHashCode26 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str11 = this.successUrl;
        int iHashCode28 = (iHashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool7 = this.skipSuccessPane;
        int iHashCode29 = (iHashCode28 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Theme theme = this.theme;
        return iHashCode29 + (theme != null ? theme.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSessionManifest(allowManualEntry=" + this.allowManualEntry + ", consentRequired=" + this.consentRequired + ", consentAcquiredAt=" + this.consentAcquiredAt + ", customManualEntryHandling=" + this.customManualEntryHandling + ", disableLinkMoreAccounts=" + this.disableLinkMoreAccounts + ", id=" + this.id + ", instantVerificationDisabled=" + this.instantVerificationDisabled + ", institutionSearchDisabled=" + this.institutionSearchDisabled + ", appVerificationEnabled=" + this.appVerificationEnabled + ", livemode=" + this.livemode + ", manualEntryUsesMicrodeposits=" + this.manualEntryUsesMicrodeposits + ", mobileHandoffEnabled=" + this.mobileHandoffEnabled + ", nextPane=" + this.nextPane + ", manualEntryMode=" + this.manualEntryMode + ", permissions=" + this.permissions + ", product=" + this.product + ", singleAccount=" + this.singleAccount + ", useSingleSortSearch=" + this.useSingleSortSearch + ", accountDisconnectionMethod=" + this.accountDisconnectionMethod + ", accountholderCustomerEmailAddress=" + this.accountholderCustomerEmailAddress + ", accountholderIsLinkConsumer=" + this.accountholderIsLinkConsumer + ", accountholderPhoneNumber=" + this.accountholderPhoneNumber + ", accountholderToken=" + this.accountholderToken + ", activeAuthSession=" + this.activeAuthSession + ", activeInstitution=" + this.activeInstitution + ", assignmentEventId=" + this.assignmentEventId + ", businessName=" + this.businessName + ", cancelUrl=" + this.cancelUrl + ", connectPlatformName=" + this.connectPlatformName + ", connectedAccountName=" + this.connectedAccountName + ", experimentAssignments=" + this.experimentAssignments + ", displayText=" + this.displayText + ", features=" + this.features + ", hostedAuthUrl=" + this.hostedAuthUrl + ", initialInstitution=" + this.initialInstitution + ", isEndUserFacing=" + this.isEndUserFacing + ", isLinkWithStripe=" + this.isLinkWithStripe + ", isNetworkingUserFlow=" + this.isNetworkingUserFlow + ", isStripeDirect=" + this.isStripeDirect + ", linkAccountSessionCancellationBehavior=" + this.linkAccountSessionCancellationBehavior + ", modalCustomization=" + this.modalCustomization + ", paymentMethodType=" + this.paymentMethodType + ", stepUpAuthenticationRequired=" + this.stepUpAuthenticationRequired + ", successUrl=" + this.successUrl + ", skipSuccessPane=" + this.skipSuccessPane + ", theme=" + this.theme + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.allowManualEntry ? 1 : 0);
        dest.writeInt(this.consentRequired ? 1 : 0);
        dest.writeString(this.consentAcquiredAt);
        dest.writeInt(this.customManualEntryHandling ? 1 : 0);
        dest.writeInt(this.disableLinkMoreAccounts ? 1 : 0);
        dest.writeString(this.id);
        dest.writeInt(this.instantVerificationDisabled ? 1 : 0);
        dest.writeInt(this.institutionSearchDisabled ? 1 : 0);
        dest.writeInt(this.appVerificationEnabled ? 1 : 0);
        dest.writeInt(this.livemode ? 1 : 0);
        dest.writeInt(this.manualEntryUsesMicrodeposits ? 1 : 0);
        dest.writeInt(this.mobileHandoffEnabled ? 1 : 0);
        dest.writeString(this.nextPane.name());
        dest.writeString(this.manualEntryMode.name());
        List<FinancialConnectionsAccount.Permissions> list = this.permissions;
        dest.writeInt(list.size());
        Iterator<FinancialConnectionsAccount.Permissions> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeString(this.product.name());
        dest.writeInt(this.singleAccount ? 1 : 0);
        dest.writeInt(this.useSingleSortSearch ? 1 : 0);
        AccountDisconnectionMethod accountDisconnectionMethod = this.accountDisconnectionMethod;
        if (accountDisconnectionMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(accountDisconnectionMethod.name());
        }
        dest.writeString(this.accountholderCustomerEmailAddress);
        Boolean bool = this.accountholderIsLinkConsumer;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.accountholderPhoneNumber);
        dest.writeString(this.accountholderToken);
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = this.activeAuthSession;
        if (financialConnectionsAuthorizationSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsAuthorizationSession.writeToParcel(dest, flags);
        }
        FinancialConnectionsInstitution financialConnectionsInstitution = this.activeInstitution;
        if (financialConnectionsInstitution == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsInstitution.writeToParcel(dest, flags);
        }
        dest.writeString(this.assignmentEventId);
        dest.writeString(this.businessName);
        dest.writeString(this.cancelUrl);
        dest.writeString(this.connectPlatformName);
        dest.writeString(this.connectedAccountName);
        Map<String, String> map = this.experimentAssignments;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        TextUpdate textUpdate = this.displayText;
        if (textUpdate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textUpdate.writeToParcel(dest, flags);
        }
        Map<String, Boolean> map2 = this.features;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map2.size());
            for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
                dest.writeString(entry2.getKey());
                dest.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
            }
        }
        dest.writeString(this.hostedAuthUrl);
        FinancialConnectionsInstitution financialConnectionsInstitution2 = this.initialInstitution;
        if (financialConnectionsInstitution2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsInstitution2.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.isEndUserFacing;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isLinkWithStripe;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isNetworkingUserFlow;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isStripeDirect;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = this.linkAccountSessionCancellationBehavior;
        if (linkAccountSessionCancellationBehavior == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(linkAccountSessionCancellationBehavior.name());
        }
        Map<String, Boolean> map3 = this.modalCustomization;
        if (map3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map3.size());
            for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
                dest.writeString(entry3.getKey());
                dest.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
            }
        }
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = this.paymentMethodType;
        if (supportedPaymentMethodTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(supportedPaymentMethodTypes.name());
        }
        Boolean bool6 = this.stepUpAuthenticationRequired;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.successUrl);
        Boolean bool7 = this.skipSuccessPane;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Theme theme = this.theme;
        if (theme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(theme.name());
        }
    }

    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsSessionManifest> serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(int i, int i2, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str3, Boolean bool, String str4, String str5, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str6, String str7, String str8, String str9, String str10, Map map, TextUpdate textUpdate, Map map2, String str11, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str12, Boolean bool7, Theme theme, SerializationConstructorMarker serializationConstructorMarker) {
        if (262143 != (i & 262143)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{262143, 0}, FinancialConnectionsSessionManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.consentAcquiredAt = str;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.id = str2;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.appVerificationEnabled = z7;
        this.livemode = z8;
        this.manualEntryUsesMicrodeposits = z9;
        this.mobileHandoffEnabled = z10;
        this.nextPane = pane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = list;
        this.product = product;
        this.singleAccount = z11;
        this.useSingleSortSearch = z12;
        if ((262144 & i) == 0) {
            this.accountDisconnectionMethod = null;
        } else {
            this.accountDisconnectionMethod = accountDisconnectionMethod;
        }
        if ((524288 & i) == 0) {
            this.accountholderCustomerEmailAddress = null;
        } else {
            this.accountholderCustomerEmailAddress = str3;
        }
        if ((1048576 & i) == 0) {
            this.accountholderIsLinkConsumer = null;
        } else {
            this.accountholderIsLinkConsumer = bool;
        }
        if ((2097152 & i) == 0) {
            this.accountholderPhoneNumber = null;
        } else {
            this.accountholderPhoneNumber = str4;
        }
        if ((4194304 & i) == 0) {
            this.accountholderToken = null;
        } else {
            this.accountholderToken = str5;
        }
        if ((8388608 & i) == 0) {
            this.activeAuthSession = null;
        } else {
            this.activeAuthSession = financialConnectionsAuthorizationSession;
        }
        if ((16777216 & i) == 0) {
            this.activeInstitution = null;
        } else {
            this.activeInstitution = financialConnectionsInstitution;
        }
        if ((33554432 & i) == 0) {
            this.assignmentEventId = null;
        } else {
            this.assignmentEventId = str6;
        }
        if ((67108864 & i) == 0) {
            this.businessName = null;
        } else {
            this.businessName = str7;
        }
        if ((134217728 & i) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str8;
        }
        if ((268435456 & i) == 0) {
            this.connectPlatformName = null;
        } else {
            this.connectPlatformName = str9;
        }
        if ((536870912 & i) == 0) {
            this.connectedAccountName = null;
        } else {
            this.connectedAccountName = str10;
        }
        if ((1073741824 & i) == 0) {
            this.experimentAssignments = null;
        } else {
            this.experimentAssignments = map;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.displayText = null;
        } else {
            this.displayText = textUpdate;
        }
        if ((i2 & 1) == 0) {
            this.features = null;
        } else {
            this.features = map2;
        }
        if ((i2 & 2) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str11;
        }
        if ((i2 & 4) == 0) {
            this.initialInstitution = null;
        } else {
            this.initialInstitution = financialConnectionsInstitution2;
        }
        if ((i2 & 8) == 0) {
            this.isEndUserFacing = null;
        } else {
            this.isEndUserFacing = bool2;
        }
        if ((i2 & 16) == 0) {
            this.isLinkWithStripe = null;
        } else {
            this.isLinkWithStripe = bool3;
        }
        if ((i2 & 32) == 0) {
            this.isNetworkingUserFlow = null;
        } else {
            this.isNetworkingUserFlow = bool4;
        }
        if ((i2 & 64) == 0) {
            this.isStripeDirect = null;
        } else {
            this.isStripeDirect = bool5;
        }
        if ((i2 & 128) == 0) {
            this.linkAccountSessionCancellationBehavior = null;
        } else {
            this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        }
        if ((i2 & 256) == 0) {
            this.modalCustomization = null;
        } else {
            this.modalCustomization = map3;
        }
        if ((i2 & 512) == 0) {
            this.paymentMethodType = null;
        } else {
            this.paymentMethodType = supportedPaymentMethodTypes;
        }
        if ((i2 & 1024) == 0) {
            this.stepUpAuthenticationRequired = null;
        } else {
            this.stepUpAuthenticationRequired = bool6;
        }
        if ((i2 & 2048) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str12;
        }
        if ((i2 & 4096) == 0) {
            this.skipSuccessPane = null;
        } else {
            this.skipSuccessPane = bool7;
        }
        if ((i2 & 8192) == 0) {
            this.theme = null;
        } else {
            this.theme = theme;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(FinancialConnectionsSessionManifest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.allowManualEntry);
        output.encodeBooleanElement(serialDesc, 1, self.consentRequired);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.consentAcquiredAt);
        output.encodeBooleanElement(serialDesc, 3, self.customManualEntryHandling);
        output.encodeBooleanElement(serialDesc, 4, self.disableLinkMoreAccounts);
        output.encodeStringElement(serialDesc, 5, self.id);
        output.encodeBooleanElement(serialDesc, 6, self.instantVerificationDisabled);
        output.encodeBooleanElement(serialDesc, 7, self.institutionSearchDisabled);
        output.encodeBooleanElement(serialDesc, 8, self.appVerificationEnabled);
        output.encodeBooleanElement(serialDesc, 9, self.livemode);
        output.encodeBooleanElement(serialDesc, 10, self.manualEntryUsesMicrodeposits);
        output.encodeBooleanElement(serialDesc, 11, self.mobileHandoffEnabled);
        output.encodeSerializableElement(serialDesc, 12, Pane.Serializer.INSTANCE, self.nextPane);
        output.encodeSerializableElement(serialDesc, 13, ManualEntryMode.Serializer.INSTANCE, self.manualEntryMode);
        output.encodeSerializableElement(serialDesc, 14, kSerializerArr[14], self.permissions);
        output.encodeSerializableElement(serialDesc, 15, Product.Serializer.INSTANCE, self.product);
        output.encodeBooleanElement(serialDesc, 16, self.singleAccount);
        output.encodeBooleanElement(serialDesc, 17, self.useSingleSortSearch);
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.accountDisconnectionMethod != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, AccountDisconnectionMethod.Serializer.INSTANCE, self.accountDisconnectionMethod);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.accountholderCustomerEmailAddress != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.accountholderCustomerEmailAddress);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.accountholderIsLinkConsumer != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, BooleanSerializer.INSTANCE, self.accountholderIsLinkConsumer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.accountholderPhoneNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, self.accountholderPhoneNumber);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.accountholderToken != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.accountholderToken);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.activeAuthSession != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE, self.activeAuthSession);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.activeInstitution != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, FinancialConnectionsInstitution$$serializer.INSTANCE, self.activeInstitution);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.assignmentEventId != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, StringSerializer.INSTANCE, self.assignmentEventId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || self.businessName != null) {
            output.encodeNullableSerializableElement(serialDesc, 26, StringSerializer.INSTANCE, self.businessName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || self.cancelUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 27, StringSerializer.INSTANCE, self.cancelUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 28) || self.connectPlatformName != null) {
            output.encodeNullableSerializableElement(serialDesc, 28, StringSerializer.INSTANCE, self.connectPlatformName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 29) || self.connectedAccountName != null) {
            output.encodeNullableSerializableElement(serialDesc, 29, StringSerializer.INSTANCE, self.connectedAccountName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 30) || self.experimentAssignments != null) {
            output.encodeNullableSerializableElement(serialDesc, 30, kSerializerArr[30], self.experimentAssignments);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 31) || self.displayText != null) {
            output.encodeNullableSerializableElement(serialDesc, 31, TextUpdate$$serializer.INSTANCE, self.displayText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 32) || self.features != null) {
            output.encodeNullableSerializableElement(serialDesc, 32, kSerializerArr[32], self.features);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 33) || self.hostedAuthUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 33, StringSerializer.INSTANCE, self.hostedAuthUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 34) || self.initialInstitution != null) {
            output.encodeNullableSerializableElement(serialDesc, 34, FinancialConnectionsInstitution$$serializer.INSTANCE, self.initialInstitution);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 35) || self.isEndUserFacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 35, BooleanSerializer.INSTANCE, self.isEndUserFacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 36) || self.isLinkWithStripe != null) {
            output.encodeNullableSerializableElement(serialDesc, 36, BooleanSerializer.INSTANCE, self.isLinkWithStripe);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 37) || self.isNetworkingUserFlow != null) {
            output.encodeNullableSerializableElement(serialDesc, 37, BooleanSerializer.INSTANCE, self.isNetworkingUserFlow);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 38) || self.isStripeDirect != null) {
            output.encodeNullableSerializableElement(serialDesc, 38, BooleanSerializer.INSTANCE, self.isStripeDirect);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 39) || self.linkAccountSessionCancellationBehavior != null) {
            output.encodeNullableSerializableElement(serialDesc, 39, LinkAccountSessionCancellationBehavior.Serializer.INSTANCE, self.linkAccountSessionCancellationBehavior);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 40) || self.modalCustomization != null) {
            output.encodeNullableSerializableElement(serialDesc, 40, kSerializerArr[40], self.modalCustomization);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 41) || self.paymentMethodType != null) {
            output.encodeNullableSerializableElement(serialDesc, 41, FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, self.paymentMethodType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 42) || self.stepUpAuthenticationRequired != null) {
            output.encodeNullableSerializableElement(serialDesc, 42, BooleanSerializer.INSTANCE, self.stepUpAuthenticationRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 43) || self.successUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 43, StringSerializer.INSTANCE, self.successUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 44) || self.skipSuccessPane != null) {
            output.encodeNullableSerializableElement(serialDesc, 44, BooleanSerializer.INSTANCE, self.skipSuccessPane);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 45) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 45, Theme.Serializer.INSTANCE, self.theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsSessionManifest(boolean z, boolean z2, String str, boolean z3, boolean z4, String id, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane nextPane, ManualEntryMode manualEntryMode, List<? extends FinancialConnectionsAccount.Permissions> permissions, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str2, Boolean bool, String str3, String str4, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, TextUpdate textUpdate, Map<String, Boolean> map2, String str10, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map<String, Boolean> map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str11, Boolean bool7, Theme theme) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nextPane, "nextPane");
        Intrinsics.checkNotNullParameter(manualEntryMode, "manualEntryMode");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(product, "product");
        this.allowManualEntry = z;
        this.consentRequired = z2;
        this.consentAcquiredAt = str;
        this.customManualEntryHandling = z3;
        this.disableLinkMoreAccounts = z4;
        this.id = id;
        this.instantVerificationDisabled = z5;
        this.institutionSearchDisabled = z6;
        this.appVerificationEnabled = z7;
        this.livemode = z8;
        this.manualEntryUsesMicrodeposits = z9;
        this.mobileHandoffEnabled = z10;
        this.nextPane = nextPane;
        this.manualEntryMode = manualEntryMode;
        this.permissions = permissions;
        this.product = product;
        this.singleAccount = z11;
        this.useSingleSortSearch = z12;
        this.accountDisconnectionMethod = accountDisconnectionMethod;
        this.accountholderCustomerEmailAddress = str2;
        this.accountholderIsLinkConsumer = bool;
        this.accountholderPhoneNumber = str3;
        this.accountholderToken = str4;
        this.activeAuthSession = financialConnectionsAuthorizationSession;
        this.activeInstitution = financialConnectionsInstitution;
        this.assignmentEventId = str5;
        this.businessName = str6;
        this.cancelUrl = str7;
        this.connectPlatformName = str8;
        this.connectedAccountName = str9;
        this.experimentAssignments = map;
        this.displayText = textUpdate;
        this.features = map2;
        this.hostedAuthUrl = str10;
        this.initialInstitution = financialConnectionsInstitution2;
        this.isEndUserFacing = bool2;
        this.isLinkWithStripe = bool3;
        this.isNetworkingUserFlow = bool4;
        this.isStripeDirect = bool5;
        this.linkAccountSessionCancellationBehavior = linkAccountSessionCancellationBehavior;
        this.modalCustomization = map3;
        this.paymentMethodType = supportedPaymentMethodTypes;
        this.stepUpAuthenticationRequired = bool6;
        this.successUrl = str11;
        this.skipSuccessPane = bool7;
        this.theme = theme;
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Pane pane, ManualEntryMode manualEntryMode, List list, Product product, boolean z11, boolean z12, AccountDisconnectionMethod accountDisconnectionMethod, String str3, Boolean bool, String str4, String str5, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsInstitution financialConnectionsInstitution, String str6, String str7, String str8, String str9, String str10, Map map, TextUpdate textUpdate, Map map2, String str11, FinancialConnectionsInstitution financialConnectionsInstitution2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior, Map map3, FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes, Boolean bool6, String str12, Boolean bool7, Theme theme, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, str, z3, z4, str2, z5, z6, z7, z8, z9, z10, pane, manualEntryMode, list, product, z11, z12, (i & 262144) != 0 ? null : accountDisconnectionMethod, (i & 524288) != 0 ? null : str3, (i & 1048576) != 0 ? null : bool, (i & 2097152) != 0 ? null : str4, (i & 4194304) != 0 ? null : str5, (i & 8388608) != 0 ? null : financialConnectionsAuthorizationSession, (i & 16777216) != 0 ? null : financialConnectionsInstitution, (i & 33554432) != 0 ? null : str6, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str7, (i & 134217728) != 0 ? null : str8, (i & 268435456) != 0 ? null : str9, (i & 536870912) != 0 ? null : str10, (i & BasicMeasure.EXACTLY) != 0 ? null : map, (i & Integer.MIN_VALUE) != 0 ? null : textUpdate, (i2 & 1) != 0 ? null : map2, (i2 & 2) != 0 ? null : str11, (i2 & 4) != 0 ? null : financialConnectionsInstitution2, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : bool3, (i2 & 32) != 0 ? null : bool4, (i2 & 64) != 0 ? null : bool5, (i2 & 128) != 0 ? null : linkAccountSessionCancellationBehavior, (i2 & 256) != 0 ? null : map3, (i2 & 512) != 0 ? null : supportedPaymentMethodTypes, (i2 & 1024) != 0 ? null : bool6, (i2 & 2048) != 0 ? null : str12, (i2 & 4096) != 0 ? null : bool7, (i2 & 8192) != 0 ? null : theme);
    }

    public final boolean getAllowManualEntry() {
        return this.allowManualEntry;
    }

    public final boolean getConsentRequired() {
        return this.consentRequired;
    }

    public final String getConsentAcquiredAt() {
        return this.consentAcquiredAt;
    }

    public final boolean getCustomManualEntryHandling() {
        return this.customManualEntryHandling;
    }

    public final boolean getDisableLinkMoreAccounts() {
        return this.disableLinkMoreAccounts;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInstantVerificationDisabled() {
        return this.instantVerificationDisabled;
    }

    public final boolean getInstitutionSearchDisabled() {
        return this.institutionSearchDisabled;
    }

    public final boolean getAppVerificationEnabled() {
        return this.appVerificationEnabled;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    public final boolean getMobileHandoffEnabled() {
        return this.mobileHandoffEnabled;
    }

    public final Pane getNextPane() {
        return this.nextPane;
    }

    public final ManualEntryMode getManualEntryMode() {
        return this.manualEntryMode;
    }

    public final List<FinancialConnectionsAccount.Permissions> getPermissions() {
        return this.permissions;
    }

    public final Product getProduct() {
        return this.product;
    }

    public final boolean getSingleAccount() {
        return this.singleAccount;
    }

    public final boolean getUseSingleSortSearch() {
        return this.useSingleSortSearch;
    }

    public final AccountDisconnectionMethod getAccountDisconnectionMethod() {
        return this.accountDisconnectionMethod;
    }

    public final String getAccountholderCustomerEmailAddress() {
        return this.accountholderCustomerEmailAddress;
    }

    public final Boolean getAccountholderIsLinkConsumer() {
        return this.accountholderIsLinkConsumer;
    }

    public final String getAccountholderPhoneNumber() {
        return this.accountholderPhoneNumber;
    }

    public final String getAccountholderToken() {
        return this.accountholderToken;
    }

    public final FinancialConnectionsAuthorizationSession getActiveAuthSession() {
        return this.activeAuthSession;
    }

    public final FinancialConnectionsInstitution getActiveInstitution() {
        return this.activeInstitution;
    }

    public final String getAssignmentEventId() {
        return this.assignmentEventId;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getConnectPlatformName() {
        return this.connectPlatformName;
    }

    public final String getConnectedAccountName() {
        return this.connectedAccountName;
    }

    public final Map<String, String> getExperimentAssignments() {
        return this.experimentAssignments;
    }

    public final TextUpdate getDisplayText() {
        return this.displayText;
    }

    public final Map<String, Boolean> getFeatures() {
        return this.features;
    }

    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    public final FinancialConnectionsInstitution getInitialInstitution() {
        return this.initialInstitution;
    }

    public final Boolean isEndUserFacing() {
        return this.isEndUserFacing;
    }

    public final Boolean isLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    public final Boolean isNetworkingUserFlow() {
        return this.isNetworkingUserFlow;
    }

    public final Boolean isStripeDirect() {
        return this.isStripeDirect;
    }

    public final LinkAccountSessionCancellationBehavior getLinkAccountSessionCancellationBehavior() {
        return this.linkAccountSessionCancellationBehavior;
    }

    public final Map<String, Boolean> getModalCustomization() {
        return this.modalCustomization;
    }

    public final FinancialConnectionsAccount.SupportedPaymentMethodTypes getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final Boolean getStepUpAuthenticationRequired() {
        return this.stepUpAuthenticationRequired;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public final Boolean getSkipSuccessPane() {
        return this.skipSuccessPane;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final boolean getConsentAcquired() {
        return (this.consentRequired && this.consentAcquiredAt == null) ? false : true;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002!\"B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006#"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT_PICKER", "ATTACH_LINKED_PAYMENT_ACCOUNT", "AUTH_OPTIONS", "CONSENT", "BANK_AUTH_REPAIR", "ID_CONSENT_CONTENT", "INSTITUTION_PICKER", "LINK_CONSENT", "LINK_LOGIN", "MANUAL_ENTRY", "MANUAL_ENTRY_SUCCESS", "NETWORKING_LINK_LOGIN_WARMUP", "NETWORKING_LINK_SIGNUP_PANE", "NETWORKING_LINK_VERIFICATION", "LINK_STEP_UP_VERIFICATION", "PARTNER_AUTH", "SUCCESS", "UNEXPECTED_ERROR", "LINK_ACCOUNT_PICKER", "PARTNER_AUTH_DRAWER", "NETWORKING_SAVE_TO_LINK_VERIFICATION", "NOTICE", "RESET", "ACCOUNT_UPDATE_REQUIRED", "EXIT", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class Pane {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Pane[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("account_picker")
        public static final Pane ACCOUNT_PICKER = new Pane("ACCOUNT_PICKER", 0, "account_picker");

        @SerialName("attach_linked_payment_account")
        public static final Pane ATTACH_LINKED_PAYMENT_ACCOUNT = new Pane("ATTACH_LINKED_PAYMENT_ACCOUNT", 1, "attach_linked_payment_account");

        @SerialName("auth_options")
        public static final Pane AUTH_OPTIONS = new Pane("AUTH_OPTIONS", 2, "auth_options");

        @SerialName("consent")
        public static final Pane CONSENT = new Pane("CONSENT", 3, "consent");

        @SerialName("bank_auth_repair")
        public static final Pane BANK_AUTH_REPAIR = new Pane("BANK_AUTH_REPAIR", 4, "bank_auth_repair");

        @SerialName("id_consent_content")
        public static final Pane ID_CONSENT_CONTENT = new Pane("ID_CONSENT_CONTENT", 5, "id_consent_content");

        @SerialName("institution_picker")
        public static final Pane INSTITUTION_PICKER = new Pane("INSTITUTION_PICKER", 6, "institution_picker");

        @SerialName("link_consent")
        public static final Pane LINK_CONSENT = new Pane("LINK_CONSENT", 7, "link_consent");

        @SerialName("link_login")
        public static final Pane LINK_LOGIN = new Pane("LINK_LOGIN", 8, "link_login");

        @SerialName("manual_entry")
        public static final Pane MANUAL_ENTRY = new Pane("MANUAL_ENTRY", 9, "manual_entry");

        @SerialName("manual_entry_success")
        public static final Pane MANUAL_ENTRY_SUCCESS = new Pane("MANUAL_ENTRY_SUCCESS", 10, "manual_entry_success");

        @SerialName("networking_link_login_warmup")
        public static final Pane NETWORKING_LINK_LOGIN_WARMUP = new Pane("NETWORKING_LINK_LOGIN_WARMUP", 11, "networking_link_login_warmup");

        @SerialName("networking_link_signup_pane")
        public static final Pane NETWORKING_LINK_SIGNUP_PANE = new Pane("NETWORKING_LINK_SIGNUP_PANE", 12, "networking_link_signup_pane");

        @SerialName("networking_link_verification")
        public static final Pane NETWORKING_LINK_VERIFICATION = new Pane("NETWORKING_LINK_VERIFICATION", 13, "networking_link_verification");

        @SerialName("networking_link_step_up_verification")
        public static final Pane LINK_STEP_UP_VERIFICATION = new Pane("LINK_STEP_UP_VERIFICATION", 14, "networking_link_step_up_verification");

        @SerialName("partner_auth")
        public static final Pane PARTNER_AUTH = new Pane("PARTNER_AUTH", 15, "partner_auth");

        @SerialName(GraphResponse.SUCCESS_KEY)
        public static final Pane SUCCESS = new Pane("SUCCESS", 16, GraphResponse.SUCCESS_KEY);

        @SerialName("unexpected_error")
        public static final Pane UNEXPECTED_ERROR = new Pane("UNEXPECTED_ERROR", 17, "unexpected_error");

        @SerialName("link_account_picker")
        public static final Pane LINK_ACCOUNT_PICKER = new Pane("LINK_ACCOUNT_PICKER", 18, "link_account_picker");

        @SerialName("partner_auth_drawer")
        public static final Pane PARTNER_AUTH_DRAWER = new Pane("PARTNER_AUTH_DRAWER", 19, "partner_auth_drawer");

        @SerialName("networking_save_to_link_verification")
        public static final Pane NETWORKING_SAVE_TO_LINK_VERIFICATION = new Pane("NETWORKING_SAVE_TO_LINK_VERIFICATION", 20, "networking_save_to_link_verification");

        @SerialName("notice")
        public static final Pane NOTICE = new Pane("NOTICE", 21, "notice");

        @SerialName("reset")
        public static final Pane RESET = new Pane("RESET", 22, "reset");

        @SerialName("account_update_required")
        public static final Pane ACCOUNT_UPDATE_REQUIRED = new Pane("ACCOUNT_UPDATE_REQUIRED", 23, "account_update_required");

        @SerialName("exit")
        public static final Pane EXIT = new Pane("EXIT", 24, "exit");

        private static final /* synthetic */ Pane[] $values() {
            return new Pane[]{ACCOUNT_PICKER, ATTACH_LINKED_PAYMENT_ACCOUNT, AUTH_OPTIONS, CONSENT, BANK_AUTH_REPAIR, ID_CONSENT_CONTENT, INSTITUTION_PICKER, LINK_CONSENT, LINK_LOGIN, MANUAL_ENTRY, MANUAL_ENTRY_SUCCESS, NETWORKING_LINK_LOGIN_WARMUP, NETWORKING_LINK_SIGNUP_PANE, NETWORKING_LINK_VERIFICATION, LINK_STEP_UP_VERIFICATION, PARTNER_AUTH, SUCCESS, UNEXPECTED_ERROR, LINK_ACCOUNT_PICKER, PARTNER_AUTH_DRAWER, NETWORKING_SAVE_TO_LINK_VERIFICATION, NOTICE, RESET, ACCOUNT_UPDATE_REQUIRED, EXIT};
        }

        public static EnumEntries<Pane> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Pane> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private Pane(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Pane[] paneArr$values = $values();
            $VALUES = paneArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(paneArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Pane> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) Pane.getEntries().toArray(new Pane[0]), Pane.UNEXPECTED_ERROR);
            }
        }

        public static Pane valueOf(String str) {
            return (Pane) Enum.valueOf(Pane.class, str);
        }

        public static Pane[] values() {
            return (Pane[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001d\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BILLPAY", "CANARY", "CAPITAL", "CAPITAL_HOSTED", "DASHBOARD", "DIRECT_ONBOARDING", "DIRECT_SETTINGS", "EMERALD", "EXPRESS_ONBOARDING", "EXTERNAL_API", "INSTANT_DEBITS", "ISSUING", "LCPM", "LINK_WITH_NETWORKING", "OPAL", "PAYMENT_FLOWS", "RESERVE_APPEALS", "STANDARD_ONBOARDING", "STRIPE_CARD", "SUPPORT_SITE", "UNKNOWN", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class Product {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Product[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("billpay")
        public static final Product BILLPAY = new Product("BILLPAY", 0, "billpay");

        @SerialName("canary")
        public static final Product CANARY = new Product("CANARY", 1, "canary");

        @SerialName("capital")
        public static final Product CAPITAL = new Product("CAPITAL", 2, "capital");

        @SerialName("capital_hosted")
        public static final Product CAPITAL_HOSTED = new Product("CAPITAL_HOSTED", 3, "capital_hosted");

        @SerialName("dashboard")
        public static final Product DASHBOARD = new Product("DASHBOARD", 4, "dashboard");

        @SerialName("direct_onboarding")
        public static final Product DIRECT_ONBOARDING = new Product("DIRECT_ONBOARDING", 5, "direct_onboarding");

        @SerialName("direct_settings")
        public static final Product DIRECT_SETTINGS = new Product("DIRECT_SETTINGS", 6, "direct_settings");

        @SerialName("emerald")
        public static final Product EMERALD = new Product("EMERALD", 7, "emerald");

        @SerialName("express_onboarding")
        public static final Product EXPRESS_ONBOARDING = new Product("EXPRESS_ONBOARDING", 8, "express_onboarding");

        @SerialName("external_api")
        public static final Product EXTERNAL_API = new Product("EXTERNAL_API", 9, "external_api");

        @SerialName("instant_debits")
        public static final Product INSTANT_DEBITS = new Product("INSTANT_DEBITS", 10, "instant_debits");

        @SerialName("issuing")
        public static final Product ISSUING = new Product("ISSUING", 11, "issuing");

        @SerialName("lcpm")
        public static final Product LCPM = new Product("LCPM", 12, "lcpm");

        @SerialName("link_with_networking")
        public static final Product LINK_WITH_NETWORKING = new Product("LINK_WITH_NETWORKING", 13, "link_with_networking");

        @SerialName("opal")
        public static final Product OPAL = new Product("OPAL", 14, "opal");

        @SerialName("payment_flows")
        public static final Product PAYMENT_FLOWS = new Product("PAYMENT_FLOWS", 15, "payment_flows");

        @SerialName("reserve_appeals")
        public static final Product RESERVE_APPEALS = new Product("RESERVE_APPEALS", 16, "reserve_appeals");

        @SerialName("standard_onboarding")
        public static final Product STANDARD_ONBOARDING = new Product("STANDARD_ONBOARDING", 17, "standard_onboarding");

        @SerialName("stripe_card")
        public static final Product STRIPE_CARD = new Product("STRIPE_CARD", 18, "stripe_card");

        @SerialName("support_site")
        public static final Product SUPPORT_SITE = new Product("SUPPORT_SITE", 19, "support_site");

        @SerialName("unknown")
        public static final Product UNKNOWN = new Product("UNKNOWN", 20, "unknown");

        private static final /* synthetic */ Product[] $values() {
            return new Product[]{BILLPAY, CANARY, CAPITAL, CAPITAL_HOSTED, DASHBOARD, DIRECT_ONBOARDING, DIRECT_SETTINGS, EMERALD, EXPRESS_ONBOARDING, EXTERNAL_API, INSTANT_DEBITS, ISSUING, LCPM, LINK_WITH_NETWORKING, OPAL, PAYMENT_FLOWS, RESERVE_APPEALS, STANDARD_ONBOARDING, STRIPE_CARD, SUPPORT_SITE, UNKNOWN};
        }

        public static EnumEntries<Product> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Product> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private Product(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Product[] productArr$values = $values();
            $VALUES = productArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(productArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Product> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) Product.getEntries().toArray(new Product[0]), Product.UNKNOWN);
            }
        }

        public static Product valueOf(String str) {
            return (Product) Enum.valueOf(Product.class, str);
        }

        public static Product[] values() {
            return (Product[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DASHBOARD", "EMAIL", "SUPPORT", ShareConstants.CONTENT_URL, "UNKNOWN", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class AccountDisconnectionMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AccountDisconnectionMethod[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("dashboard")
        public static final AccountDisconnectionMethod DASHBOARD = new AccountDisconnectionMethod("DASHBOARD", 0, "dashboard");

        @SerialName("email")
        public static final AccountDisconnectionMethod EMAIL = new AccountDisconnectionMethod("EMAIL", 1, "email");

        @SerialName("support")
        public static final AccountDisconnectionMethod SUPPORT = new AccountDisconnectionMethod("SUPPORT", 2, "support");

        @SerialName("link")
        public static final AccountDisconnectionMethod LINK = new AccountDisconnectionMethod(ShareConstants.CONTENT_URL, 3, "link");

        @SerialName("unknown")
        public static final AccountDisconnectionMethod UNKNOWN = new AccountDisconnectionMethod("UNKNOWN", 4, "unknown");

        private static final /* synthetic */ AccountDisconnectionMethod[] $values() {
            return new AccountDisconnectionMethod[]{DASHBOARD, EMAIL, SUPPORT, LINK, UNKNOWN};
        }

        public static EnumEntries<AccountDisconnectionMethod> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AccountDisconnectionMethod> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private AccountDisconnectionMethod(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            AccountDisconnectionMethod[] accountDisconnectionMethodArr$values = $values();
            $VALUES = accountDisconnectionMethodArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(accountDisconnectionMethodArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<AccountDisconnectionMethod> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) AccountDisconnectionMethod.getEntries().toArray(new AccountDisconnectionMethod[0]), AccountDisconnectionMethod.UNKNOWN);
            }
        }

        public static AccountDisconnectionMethod valueOf(String str) {
            return (AccountDisconnectionMethod) Enum.valueOf(AccountDisconnectionMethod.class, str);
        }

        public static AccountDisconnectionMethod[] values() {
            return (AccountDisconnectionMethod[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SILENT_SUCCESS", "USER_ERROR", "UNKNOWN", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class LinkAccountSessionCancellationBehavior {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LinkAccountSessionCancellationBehavior[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("treat_as_silent_success")
        public static final LinkAccountSessionCancellationBehavior SILENT_SUCCESS = new LinkAccountSessionCancellationBehavior("SILENT_SUCCESS", 0, "treat_as_silent_success");

        @SerialName("treat_as_user_error")
        public static final LinkAccountSessionCancellationBehavior USER_ERROR = new LinkAccountSessionCancellationBehavior("USER_ERROR", 1, "treat_as_user_error");

        @SerialName("unknown")
        public static final LinkAccountSessionCancellationBehavior UNKNOWN = new LinkAccountSessionCancellationBehavior("UNKNOWN", 2, "unknown");

        private static final /* synthetic */ LinkAccountSessionCancellationBehavior[] $values() {
            return new LinkAccountSessionCancellationBehavior[]{SILENT_SUCCESS, USER_ERROR, UNKNOWN};
        }

        public static EnumEntries<LinkAccountSessionCancellationBehavior> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<LinkAccountSessionCancellationBehavior> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private LinkAccountSessionCancellationBehavior(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            LinkAccountSessionCancellationBehavior[] linkAccountSessionCancellationBehaviorArr$values = $values();
            $VALUES = linkAccountSessionCancellationBehaviorArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(linkAccountSessionCancellationBehaviorArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<LinkAccountSessionCancellationBehavior> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) LinkAccountSessionCancellationBehavior.getEntries().toArray(new LinkAccountSessionCancellationBehavior[0]), LinkAccountSessionCancellationBehavior.UNKNOWN);
            }
        }

        public static LinkAccountSessionCancellationBehavior valueOf(String str) {
            return (LinkAccountSessionCancellationBehavior) Enum.valueOf(LinkAccountSessionCancellationBehavior.class, str);
        }

        public static LinkAccountSessionCancellationBehavior[] values() {
            return (LinkAccountSessionCancellationBehavior[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsSessionManifest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DASHBOARD_LIGHT", "LINK_LIGHT", "Serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public static final class Theme {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName(PaymentSheetAppearanceKeys.LIGHT)
        public static final Theme LIGHT = new Theme("LIGHT", 0);

        @SerialName("dashboard_light")
        public static final Theme DASHBOARD_LIGHT = new Theme("DASHBOARD_LIGHT", 1);

        @SerialName("link_light")
        public static final Theme LINK_LIGHT = new Theme("LINK_LIGHT", 2);

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{LIGHT, DASHBOARD_LIGHT, LINK_LIGHT};
        }

        public static EnumEntries<Theme> getEntries() {
            return $ENTRIES;
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Theme> serializer() {
                return Serializer.INSTANCE;
            }
        }

        private Theme(String str, int i) {
        }

        static {
            Theme[] themeArr$values = $values();
            $VALUES = themeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(themeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: FinancialConnectionsSessionManifest.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme$Serializer;", "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Serializer extends EnumIgnoreUnknownSerializer<Theme> {
            public static final int $stable = 0;
            public static final Serializer INSTANCE = new Serializer();

            private Serializer() {
                super((Enum[]) Theme.getEntries().toArray(new Theme[0]), Theme.LIGHT);
            }
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }
}
