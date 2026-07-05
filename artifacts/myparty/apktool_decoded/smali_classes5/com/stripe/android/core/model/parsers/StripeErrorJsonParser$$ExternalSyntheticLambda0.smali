.class public final synthetic Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser$$ExternalSyntheticLambda0;->f$0:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser$$ExternalSyntheticLambda0;->f$0:Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;->$r8$lambda$E3mamUUtOFXhaRIPkmrrtVC55WY(Lorg/json/JSONObject;Ljava/lang/String;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
