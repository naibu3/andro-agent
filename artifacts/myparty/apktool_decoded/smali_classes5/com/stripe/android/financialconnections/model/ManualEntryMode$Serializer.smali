.class public final Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;
.super Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;
.source "ManualEntry.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/ManualEntryMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer<",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nManualEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntry.kt\ncom/stripe/android/financialconnections/model/ManualEntryMode$Serializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,32:1\n37#2:33\n36#2,3:34\n*S KotlinDebug\n*F\n+ 1 ManualEntry.kt\ncom/stripe/android/financialconnections/model/ManualEntryMode$Serializer\n*L\n28#1:33\n28#1:34,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;",
        "Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "<init>",
        "()V",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 28
    invoke-static {}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 36
    new-array v1, v1, [Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    .line 29
    sget-object v1, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->UNKNOWN:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    check-cast v1, Ljava/lang/Enum;

    .line 27
    invoke-direct {p0, v0, v1}, Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;-><init>([Ljava/lang/Enum;Ljava/lang/Enum;)V

    return-void
.end method
