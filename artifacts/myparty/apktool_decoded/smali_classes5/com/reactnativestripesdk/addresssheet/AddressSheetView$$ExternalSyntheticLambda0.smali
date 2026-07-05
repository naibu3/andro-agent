.class public final synthetic Lcom/reactnativestripesdk/addresssheet/AddressSheetView$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/reactnativestripesdk/addresssheet/AddressSheetView;


# direct methods
.method public synthetic constructor <init>(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetView$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/reactnativestripesdk/addresssheet/AddressSheetView$$ExternalSyntheticLambda0;->f$0:Lcom/reactnativestripesdk/addresssheet/AddressSheetView;

    check-cast p1, Lcom/facebook/react/bridge/WritableMap;

    check-cast p2, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {v0, p1, p2}, Lcom/reactnativestripesdk/addresssheet/AddressSheetView;->$r8$lambda$w2JBPVZB58VqYZdiigXX2Fbbuls(Lcom/reactnativestripesdk/addresssheet/AddressSheetView;Lcom/facebook/react/bridge/WritableMap;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
