.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;
.super Ljava/lang/Object;
.source "ScreenContract.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic close$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V
    .locals 1

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 19
    new-instance p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object p2, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Close:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0, p3, v0}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: close"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic closeAll$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V
    .locals 1

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 21
    new-instance p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    sget-object p2, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Close:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0, p3, v0}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->closeAll(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: closeAll"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic onError$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/dto/QonversionError;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 23
    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onError"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
