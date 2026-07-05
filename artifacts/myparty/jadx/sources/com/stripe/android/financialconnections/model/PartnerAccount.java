package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Required;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PartnerAccountsList.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0004\u0082\u0001\u0083\u0001Bå\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 Bß\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010$J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0016HÂ\u0003¢\u0006\u0002\u0010gJ\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u001eHÆ\u0003Jò\u0001\u0010n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010oJ\u0006\u0010p\u001a\u00020\u000eJ\u0013\u0010q\u001a\u00020\u00162\b\u0010r\u001a\u0004\u0018\u00010sHÖ\u0003J\t\u0010t\u001a\u00020\u000eHÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001J\u0016\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u000eJ'\u0010{\u001a\u00020w2\u0006\u0010|\u001a\u00020\u00002\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0001¢\u0006\u0003\b\u0081\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010+R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010&\u001a\u0004\b1\u00102R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010&\u001a\u0004\b4\u00105R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00109\u0012\u0004\b6\u0010&\u001a\u0004\b7\u00108R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010&\u001a\u0004\b;\u0010(R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010&\u001a\u0004\b=\u0010>R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010&\u001a\u0004\b@\u0010(R \u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00109\u0012\u0004\bA\u0010&\u001a\u0004\bB\u00108R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010&\u001a\u0004\bD\u0010(R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010F\u0012\u0004\bE\u0010&R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010&\u001a\u0004\bH\u0010(R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010&\u001a\u0004\bJ\u0010KR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010&\u001a\u0004\bM\u0010(R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010&\u001a\u0004\bO\u0010(R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010&\u001a\u0004\bQ\u0010(R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010&\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010(¨\u0006\u0084\u0001"}, d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccount;", "Landroid/os/Parcelable;", "authorization", "", "category", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "id", "name", "subcategory", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "supportedPaymentMethodTypes", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;", "balanceAmount", "", "currency", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "displayableAccountNumbers", "initialBalanceAmount", "institutionName", "_allowSelection", "", "allowSelectionMessage", "nextPaneOnSelection", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "institutionUrl", "linkedAccountId", "routingNumber", "status", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAuthorization$annotations", "()V", "getAuthorization", "()Ljava/lang/String;", "getCategory$annotations", "getCategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;", "getId$annotations", "getId", "getName$annotations", "getName", "getSubcategory$annotations", "getSubcategory", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;", "getSupportedPaymentMethodTypes$annotations", "getSupportedPaymentMethodTypes", "()Ljava/util/List;", "getBalanceAmount$annotations", "getBalanceAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency$annotations", "getCurrency", "getInstitution$annotations", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getDisplayableAccountNumbers$annotations", "getDisplayableAccountNumbers", "getInitialBalanceAmount$annotations", "getInitialBalanceAmount", "getInstitutionName$annotations", "getInstitutionName", "get_allowSelection$annotations", "Ljava/lang/Boolean;", "getAllowSelectionMessage$annotations", "getAllowSelectionMessage", "getNextPaneOnSelection$annotations", "getNextPaneOnSelection", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getInstitutionUrl$annotations", "getInstitutionUrl", "getLinkedAccountId$annotations", "getLinkedAccountId", "getRoutingNumber$annotations", "getRoutingNumber", "getStatus$annotations", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;", "allowSelection", "getAllowSelection$financial_connections_release", "()Z", "redactedAccountNumbers", "getRedactedAccountNumbers$financial_connections_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Boolean;", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;)Lcom/stripe/android/financialconnections/model/PartnerAccount;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class PartnerAccount implements Parcelable {
    private final Boolean _allowSelection;
    private final String allowSelectionMessage;
    private final String authorization;
    private final Integer balanceAmount;
    private final FinancialConnectionsAccount.Category category;
    private final String currency;
    private final String displayableAccountNumbers;
    private final String id;
    private final Integer initialBalanceAmount;
    private final FinancialConnectionsInstitution institution;
    private final String institutionName;
    private final String institutionUrl;
    private final String linkedAccountId;
    private final String name;
    private final FinancialConnectionsSessionManifest.Pane nextPaneOnSelection;
    private final String routingNumber;
    private final FinancialConnectionsAccount.Status status;
    private final FinancialConnectionsAccount.Subcategory subcategory;
    private final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PartnerAccount> CREATOR = new Creator();
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* compiled from: PartnerAccountsList.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartnerAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            FinancialConnectionsAccount.Category categoryValueOf = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Category.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            FinancialConnectionsAccount.Subcategory subcategoryValueOf = parcel.readInt() == 0 ? null : FinancialConnectionsAccount.Subcategory.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FinancialConnectionsAccount.SupportedPaymentMethodTypes.valueOf(parcel.readString()));
            }
            return new PartnerAccount(string, categoryValueOf, string2, string3, subcategoryValueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FinancialConnectionsAccount.Status.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerAccount[] newArray(int i) {
            return new PartnerAccount[i];
        }
    }

    /* renamed from: component13, reason: from getter */
    private final Boolean get_allowSelection() {
        return this._allowSelection;
    }

    public static /* synthetic */ PartnerAccount copy$default(PartnerAccount partnerAccount, String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, List list, Integer num, String str4, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, Integer num2, String str6, Boolean bool, String str7, FinancialConnectionsSessionManifest.Pane pane, String str8, String str9, String str10, FinancialConnectionsAccount.Status status, int i, Object obj) {
        FinancialConnectionsAccount.Status status2;
        String str11;
        String str12 = (i & 1) != 0 ? partnerAccount.authorization : str;
        FinancialConnectionsAccount.Category category2 = (i & 2) != 0 ? partnerAccount.category : category;
        String str13 = (i & 4) != 0 ? partnerAccount.id : str2;
        String str14 = (i & 8) != 0 ? partnerAccount.name : str3;
        FinancialConnectionsAccount.Subcategory subcategory2 = (i & 16) != 0 ? partnerAccount.subcategory : subcategory;
        List list2 = (i & 32) != 0 ? partnerAccount.supportedPaymentMethodTypes : list;
        Integer num3 = (i & 64) != 0 ? partnerAccount.balanceAmount : num;
        String str15 = (i & 128) != 0 ? partnerAccount.currency : str4;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = (i & 256) != 0 ? partnerAccount.institution : financialConnectionsInstitution;
        String str16 = (i & 512) != 0 ? partnerAccount.displayableAccountNumbers : str5;
        Integer num4 = (i & 1024) != 0 ? partnerAccount.initialBalanceAmount : num2;
        String str17 = (i & 2048) != 0 ? partnerAccount.institutionName : str6;
        Boolean bool2 = (i & 4096) != 0 ? partnerAccount._allowSelection : bool;
        String str18 = (i & 8192) != 0 ? partnerAccount.allowSelectionMessage : str7;
        String str19 = str12;
        FinancialConnectionsSessionManifest.Pane pane2 = (i & 16384) != 0 ? partnerAccount.nextPaneOnSelection : pane;
        String str20 = (i & 32768) != 0 ? partnerAccount.institutionUrl : str8;
        String str21 = (i & 65536) != 0 ? partnerAccount.linkedAccountId : str9;
        String str22 = (i & 131072) != 0 ? partnerAccount.routingNumber : str10;
        if ((i & 262144) != 0) {
            str11 = str22;
            status2 = partnerAccount.status;
        } else {
            status2 = status;
            str11 = str22;
        }
        return partnerAccount.copy(str19, category2, str13, str14, subcategory2, list2, num3, str15, financialConnectionsInstitution2, str16, num4, str17, bool2, str18, pane2, str20, str21, str11, status2);
    }

    @SerialName("allow_selection_message")
    public static /* synthetic */ void getAllowSelectionMessage$annotations() {
    }

    @SerialName("authorization")
    @Required
    public static /* synthetic */ void getAuthorization$annotations() {
    }

    @SerialName("balance_amount")
    public static /* synthetic */ void getBalanceAmount$annotations() {
    }

    @SerialName("category")
    @Required
    public static /* synthetic */ void getCategory$annotations() {
    }

    @SerialName("currency")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @SerialName("displayable_account_numbers")
    public static /* synthetic */ void getDisplayableAccountNumbers$annotations() {
    }

    @SerialName("id")
    @Required
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("initial_balance_amount")
    public static /* synthetic */ void getInitialBalanceAmount$annotations() {
    }

    @SerialName("institution")
    public static /* synthetic */ void getInstitution$annotations() {
    }

    @SerialName("institution_name")
    public static /* synthetic */ void getInstitutionName$annotations() {
    }

    @SerialName("institution_url")
    public static /* synthetic */ void getInstitutionUrl$annotations() {
    }

    @SerialName("linked_account_id")
    public static /* synthetic */ void getLinkedAccountId$annotations() {
    }

    @SerialName("name")
    @Required
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("next_pane_on_selection")
    public static /* synthetic */ void getNextPaneOnSelection$annotations() {
    }

    @SerialName(BankAccountJsonParser.FIELD_ROUTING_NUMBER)
    public static /* synthetic */ void getRoutingNumber$annotations() {
    }

    @SerialName("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @SerialName("subcategory")
    @Required
    public static /* synthetic */ void getSubcategory$annotations() {
    }

    @SerialName("supported_payment_method_types")
    @Required
    public static /* synthetic */ void getSupportedPaymentMethodTypes$annotations() {
    }

    @SerialName("allow_selection")
    private static /* synthetic */ void get_allowSelection$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDisplayableAccountNumbers() {
        return this.displayableAccountNumbers;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getInitialBalanceAmount() {
        return this.initialBalanceAmount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAllowSelectionMessage() {
        return this.allowSelectionMessage;
    }

    /* renamed from: component15, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnSelection() {
        return this.nextPaneOnSelection;
    }

    /* renamed from: component16, reason: from getter */
    public final String getInstitutionUrl() {
        return this.institutionUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component19, reason: from getter */
    public final FinancialConnectionsAccount.Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final FinancialConnectionsAccount.Category getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final FinancialConnectionsAccount.Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> component6() {
        return this.supportedPaymentMethodTypes;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getBalanceAmount() {
        return this.balanceAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final PartnerAccount copy(String authorization, FinancialConnectionsAccount.Category category, String id, String name, FinancialConnectionsAccount.Subcategory subcategory, List<? extends FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Integer balanceAmount, String currency, FinancialConnectionsInstitution institution, String displayableAccountNumbers, Integer initialBalanceAmount, String institutionName, Boolean _allowSelection, String allowSelectionMessage, FinancialConnectionsSessionManifest.Pane nextPaneOnSelection, String institutionUrl, String linkedAccountId, String routingNumber, FinancialConnectionsAccount.Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        return new PartnerAccount(authorization, category, id, name, subcategory, supportedPaymentMethodTypes, balanceAmount, currency, institution, displayableAccountNumbers, initialBalanceAmount, institutionName, _allowSelection, allowSelectionMessage, nextPaneOnSelection, institutionUrl, linkedAccountId, routingNumber, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerAccount)) {
            return false;
        }
        PartnerAccount partnerAccount = (PartnerAccount) other;
        return Intrinsics.areEqual(this.authorization, partnerAccount.authorization) && this.category == partnerAccount.category && Intrinsics.areEqual(this.id, partnerAccount.id) && Intrinsics.areEqual(this.name, partnerAccount.name) && this.subcategory == partnerAccount.subcategory && Intrinsics.areEqual(this.supportedPaymentMethodTypes, partnerAccount.supportedPaymentMethodTypes) && Intrinsics.areEqual(this.balanceAmount, partnerAccount.balanceAmount) && Intrinsics.areEqual(this.currency, partnerAccount.currency) && Intrinsics.areEqual(this.institution, partnerAccount.institution) && Intrinsics.areEqual(this.displayableAccountNumbers, partnerAccount.displayableAccountNumbers) && Intrinsics.areEqual(this.initialBalanceAmount, partnerAccount.initialBalanceAmount) && Intrinsics.areEqual(this.institutionName, partnerAccount.institutionName) && Intrinsics.areEqual(this._allowSelection, partnerAccount._allowSelection) && Intrinsics.areEqual(this.allowSelectionMessage, partnerAccount.allowSelectionMessage) && this.nextPaneOnSelection == partnerAccount.nextPaneOnSelection && Intrinsics.areEqual(this.institutionUrl, partnerAccount.institutionUrl) && Intrinsics.areEqual(this.linkedAccountId, partnerAccount.linkedAccountId) && Intrinsics.areEqual(this.routingNumber, partnerAccount.routingNumber) && this.status == partnerAccount.status;
    }

    public int hashCode() {
        String str = this.authorization;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FinancialConnectionsAccount.Category category = this.category;
        int iHashCode2 = (((((iHashCode + (category == null ? 0 : category.hashCode())) * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31;
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        int iHashCode3 = (((iHashCode2 + (subcategory == null ? 0 : subcategory.hashCode())) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Integer num = this.balanceAmount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        int iHashCode6 = (iHashCode5 + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode())) * 31;
        String str3 = this.displayableAccountNumbers;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.initialBalanceAmount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.institutionName;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this._allowSelection;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.allowSelectionMessage;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        int iHashCode12 = (iHashCode11 + (pane == null ? 0 : pane.hashCode())) * 31;
        String str6 = this.institutionUrl;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.linkedAccountId;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.routingNumber;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        FinancialConnectionsAccount.Status status = this.status;
        return iHashCode15 + (status != null ? status.hashCode() : 0);
    }

    public String toString() {
        return "PartnerAccount(authorization=" + this.authorization + ", category=" + this.category + ", id=" + this.id + ", name=" + this.name + ", subcategory=" + this.subcategory + ", supportedPaymentMethodTypes=" + this.supportedPaymentMethodTypes + ", balanceAmount=" + this.balanceAmount + ", currency=" + this.currency + ", institution=" + this.institution + ", displayableAccountNumbers=" + this.displayableAccountNumbers + ", initialBalanceAmount=" + this.initialBalanceAmount + ", institutionName=" + this.institutionName + ", _allowSelection=" + this._allowSelection + ", allowSelectionMessage=" + this.allowSelectionMessage + ", nextPaneOnSelection=" + this.nextPaneOnSelection + ", institutionUrl=" + this.institutionUrl + ", linkedAccountId=" + this.linkedAccountId + ", routingNumber=" + this.routingNumber + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.authorization);
        FinancialConnectionsAccount.Category category = this.category;
        if (category == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(category.name());
        }
        dest.writeString(this.id);
        dest.writeString(this.name);
        FinancialConnectionsAccount.Subcategory subcategory = this.subcategory;
        if (subcategory == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(subcategory.name());
        }
        List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        dest.writeInt(list.size());
        Iterator<FinancialConnectionsAccount.SupportedPaymentMethodTypes> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        Integer num = this.balanceAmount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.currency);
        FinancialConnectionsInstitution financialConnectionsInstitution = this.institution;
        if (financialConnectionsInstitution == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsInstitution.writeToParcel(dest, flags);
        }
        dest.writeString(this.displayableAccountNumbers);
        Integer num2 = this.initialBalanceAmount;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.institutionName);
        Boolean bool = this._allowSelection;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.allowSelectionMessage);
        FinancialConnectionsSessionManifest.Pane pane = this.nextPaneOnSelection;
        if (pane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(pane.name());
        }
        dest.writeString(this.institutionUrl);
        dest.writeString(this.linkedAccountId);
        dest.writeString(this.routingNumber);
        FinancialConnectionsAccount.Status status = this.status;
        if (status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(status.name());
        }
    }

    /* compiled from: PartnerAccountsList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/PartnerAccount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartnerAccount> serializer() {
            return PartnerAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartnerAccount(int i, String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, List list, Integer num, String str4, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, Integer num2, String str6, Boolean bool, String str7, FinancialConnectionsSessionManifest.Pane pane, String str8, String str9, String str10, FinancialConnectionsAccount.Status status, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, PartnerAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.authorization = str;
        this.category = category;
        this.id = str2;
        this.name = str3;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i & 64) == 0) {
            this.balanceAmount = null;
        } else {
            this.balanceAmount = num;
        }
        if ((i & 128) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
        if ((i & 256) == 0) {
            this.institution = null;
        } else {
            this.institution = financialConnectionsInstitution;
        }
        if ((i & 512) == 0) {
            this.displayableAccountNumbers = null;
        } else {
            this.displayableAccountNumbers = str5;
        }
        if ((i & 1024) == 0) {
            this.initialBalanceAmount = null;
        } else {
            this.initialBalanceAmount = num2;
        }
        if ((i & 2048) == 0) {
            this.institutionName = null;
        } else {
            this.institutionName = str6;
        }
        if ((i & 4096) == 0) {
            this._allowSelection = null;
        } else {
            this._allowSelection = bool;
        }
        if ((i & 8192) == 0) {
            this.allowSelectionMessage = null;
        } else {
            this.allowSelectionMessage = str7;
        }
        if ((i & 16384) == 0) {
            this.nextPaneOnSelection = null;
        } else {
            this.nextPaneOnSelection = pane;
        }
        if ((32768 & i) == 0) {
            this.institutionUrl = null;
        } else {
            this.institutionUrl = str8;
        }
        if ((65536 & i) == 0) {
            this.linkedAccountId = null;
        } else {
            this.linkedAccountId = str9;
        }
        if ((131072 & i) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str10;
        }
        if ((i & 262144) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(PartnerAccount self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.authorization);
        output.encodeNullableSerializableElement(serialDesc, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, self.category);
        output.encodeStringElement(serialDesc, 2, self.id);
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeNullableSerializableElement(serialDesc, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, self.subcategory);
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.supportedPaymentMethodTypes);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.balanceAmount != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.balanceAmount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.currency != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.currency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.institution != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, FinancialConnectionsInstitution$$serializer.INSTANCE, self.institution);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.displayableAccountNumbers != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.displayableAccountNumbers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.initialBalanceAmount != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.initialBalanceAmount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.institutionName != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.institutionName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self._allowSelection != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, self._allowSelection);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.allowSelectionMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.allowSelectionMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.nextPaneOnSelection != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, self.nextPaneOnSelection);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.institutionUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.institutionUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.linkedAccountId != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.linkedAccountId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.routingNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.routingNumber);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && self.status == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 18, FinancialConnectionsAccount.Status.Serializer.INSTANCE, self.status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartnerAccount(String str, FinancialConnectionsAccount.Category category, String id, String name, FinancialConnectionsAccount.Subcategory subcategory, List<? extends FinancialConnectionsAccount.SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Integer num, String str2, FinancialConnectionsInstitution financialConnectionsInstitution, String str3, Integer num2, String str4, Boolean bool, String str5, FinancialConnectionsSessionManifest.Pane pane, String str6, String str7, String str8, FinancialConnectionsAccount.Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.authorization = str;
        this.category = category;
        this.id = id;
        this.name = name;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balanceAmount = num;
        this.currency = str2;
        this.institution = financialConnectionsInstitution;
        this.displayableAccountNumbers = str3;
        this.initialBalanceAmount = num2;
        this.institutionName = str4;
        this._allowSelection = bool;
        this.allowSelectionMessage = str5;
        this.nextPaneOnSelection = pane;
        this.institutionUrl = str6;
        this.linkedAccountId = str7;
        this.routingNumber = str8;
        this.status = status;
    }

    public /* synthetic */ PartnerAccount(String str, FinancialConnectionsAccount.Category category, String str2, String str3, FinancialConnectionsAccount.Subcategory subcategory, List list, Integer num, String str4, FinancialConnectionsInstitution financialConnectionsInstitution, String str5, Integer num2, String str6, Boolean bool, String str7, FinancialConnectionsSessionManifest.Pane pane, String str8, String str9, String str10, FinancialConnectionsAccount.Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : category, str2, str3, (i & 16) != 0 ? null : subcategory, list, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : financialConnectionsInstitution, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : pane, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? null : str9, (131072 & i) != 0 ? null : str10, (i & 262144) != 0 ? null : status);
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final FinancialConnectionsAccount.Category getCategory() {
        return this.category;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final FinancialConnectionsAccount.Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<FinancialConnectionsAccount.SupportedPaymentMethodTypes> getSupportedPaymentMethodTypes() {
        return this.supportedPaymentMethodTypes;
    }

    public final Integer getBalanceAmount() {
        return this.balanceAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final String getDisplayableAccountNumbers() {
        return this.displayableAccountNumbers;
    }

    public final Integer getInitialBalanceAmount() {
        return this.initialBalanceAmount;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getAllowSelectionMessage() {
        return this.allowSelectionMessage;
    }

    public final FinancialConnectionsSessionManifest.Pane getNextPaneOnSelection() {
        return this.nextPaneOnSelection;
    }

    public final String getInstitutionUrl() {
        return this.institutionUrl;
    }

    public final String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final FinancialConnectionsAccount.Status getStatus() {
        return this.status;
    }

    public final boolean getAllowSelection$financial_connections_release() {
        Boolean bool = this._allowSelection;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getRedactedAccountNumbers$financial_connections_release() {
        String str = this.displayableAccountNumbers;
        if (str == null) {
            str = "";
        }
        return "••••" + str;
    }
}
