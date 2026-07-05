.class public final Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;
.super Ljava/lang/Object;
.source "QonversionMappingAdapters.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;",
        "type",
        "",
        "toJson",
        "enum",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toJson(Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)Ljava/lang/String;
    .locals 0
    .annotation runtime Lcom/squareup/moshi/ToJson;
    .end annotation

    .line 65
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;->getType()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .locals 1
    .annotation runtime Lcom/squareup/moshi/FromJson;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;->Companion:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment$Companion;

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment$Companion;->fromType$sdk_release(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    move-result-object p1

    return-object p1
.end method
