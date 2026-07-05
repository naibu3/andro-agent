.class public interface abstract Lcom/stripe/android/stripe3ds2/init/ui/Customization;
.super Ljava/lang/Object;
.source "Customization.java"


# virtual methods
.method public abstract getTextColor()Ljava/lang/String;
.end method

.method public abstract getTextFontName()Ljava/lang/String;
.end method

.method public abstract getTextFontSize()I
.end method

.method public abstract setTextColor(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation
.end method

.method public abstract setTextFontName(Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation
.end method

.method public abstract setTextFontSize(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation
.end method
