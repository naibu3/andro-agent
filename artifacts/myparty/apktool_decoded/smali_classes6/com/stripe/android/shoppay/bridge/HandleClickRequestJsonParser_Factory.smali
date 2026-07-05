.class public final Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory;
.super Ljava/lang/Object;
.source "HandleClickRequestJsonParser_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory;
    .locals 1

    .line 32
    sget-object v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory$InstanceHolder;->INSTANCE:Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory;

    return-object v0
.end method

.method public static newInstance()Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;
    .locals 1

    .line 36
    new-instance v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;
    .locals 1

    .line 28
    invoke-static {}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory;->newInstance()Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser_Factory;->get()Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;

    move-result-object v0

    return-object v0
.end method
